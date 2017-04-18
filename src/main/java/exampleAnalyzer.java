package com.tourist_mobile.travelguard.server.synch.analyzer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.tourist_mobile.airportspider.model.ASTransportType;
import com.tourist_mobile.airportspider.model.Controller;
import com.tourist_mobile.airportspider.model.db.ASAirportLog;
import com.tourist_mobile.airportspider.model.db.ASCarrier;
import com.tourist_mobile.airportspider.model.db.Flight;
import com.tourist_mobile.airportspider.model.db.Transport;
import com.tourist_mobile.airportspider.model.db.Transport.Target;
import com.tourist_mobile.airportspider.model.json.gru.GRUModel;
import com.tourist_mobile.airportspider.synch.ErrorLog;
import com.tourist_mobile.airportspider.synch.Utils;
import com.tourist_mobile.airportspider.synch.common.AirportDataAnalyzer;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class GRUAnalyzer_New extends AirportDataAnalyzer {

    private static final Logger LOGGER = Logger.getLogger(GRUAnalyzer_New.class);

    private List<Header> generateHeaderList(){
        List<Header> headerList = new ArrayList<Header>();
        headerList.add(new BasicHeader("HOST","appmobile.gru.com.br"));
        return headerList;
    }

    private String generateRequestBody(Transport.Target target){
        String sTarget = null;
        if(target == Target.ARRIVAL){
            sTarget = "arr";
        }else{
            sTarget = "dep";
        }
        String requestBody = "{"+
                "\"tipo\": \""+sTarget+"\"," +
                "\"idioma\": \"en\"," +
                "\"token\": \"\"," +
                "\"android\": \"1\"," +
                "\"deviceToken\": \"\"" +
                "}";
        return requestBody;
    }

    private String getJson(Target target, Controller control, String airportURL){
        try {
            List<Header> headerList = generateHeaderList();
            String requestBody = generateRequestBody(target);
            String json = Utils.postWithRequestBody(control,airportURL,headerList,requestBody);
            return json;
        } catch (Exception e) {
            LOGGER.error("failed to request url", e);
        }

        return null;
    }

    private GRUModel map(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, GRUModel.class);
        } catch (IOException e) {
            LOGGER.error("could not map json", e);
        }
        return null;
    }

    private void setFlightNoAndCarrier(Controller control, String carrierIATA, String flightNo ,Flight aFlight){
        ASCarrier carrier = control.getCarrierDAO().getByIATAOrICAOCode(carrierIATA, ASTransportType.FLIGHT);
        if(carrier != null) {
            aFlight.setCarrierId(carrier.getId());
            aFlight.setTransportNumber(flightNo);
            aFlight.setCarrierCode(carrierIATA);
        } else {
            LOGGER.warn("no carrier was found for iata >" +carrierIATA + "<, the full flightnumber was >" + flightNo + "<");
        }
    }

    public Date convertStringDateToDate(String itemDate, String dateFormat) {
        try {
            DateTimeFormatter fmtitem = DateTimeFormat.forPattern(dateFormat).withLocale(Locale.GERMAN);
            DateTime itemdt = fmtitem.parseDateTime(itemDate);
            return itemdt.toDate();
        } catch (Exception e) {
            LOGGER.warn("Parsing of date failed", e);
        }
        return null;
    }

    private Flight initializeFlightFromModel(GRUModel.Flight flight, Controller control){
        Flight aFlight = new Flight();
        aFlight.setAirportId(airport.getId());
        aFlight.setLocationName(airport.getNameDE());
        setFlightNoAndCarrier(control,flight.airlineIATA,flight.flightNumber,aFlight);
        aFlight.setTerminal(flight.terminal);
        aFlight.setGate(flight.gate);
        return aFlight;
    }

    public Date convertStringDateAndTimeToDate(String itemDate, String dateFormat, String itemTime) {
        try {
            DateTimeFormatter fmtitem = DateTimeFormat.forPattern(dateFormat).withLocale(Locale.GERMAN);
            DateTime itemdt = fmtitem.parseDateTime(itemDate);
            String[] timeSplit = itemTime.split(":");
            int hours = Integer.parseInt(timeSplit[0]);
            int minutes = Integer.parseInt(timeSplit[1]);
            itemdt = itemdt.withTime(hours, minutes, 0, 0);
            return itemdt.toDate();
        } catch (Exception e) {
            LOGGER.warn("Parsing of date failed", e);
        }
        return null;
    }

    private void processFlightDates(Flight aFlight, String dateTime, String scheduledTime, String estimatedTime){
        if(scheduledTime.contains("-")) scheduledTime = null;
        if(estimatedTime.contains("-")) estimatedTime = null;
        if(scheduledTime == null && estimatedTime == null && dateTime != null){
            aFlight.setScheduledDateTime(convertStringDateToDate(dateTime,"yyyy-MM-dd HH:mm:ss"));
        }else if(scheduledTime != null && dateTime != null){
            aFlight.setScheduledDateTime(convertStringDateAndTimeToDate(dateTime,"yyyy-MM-dd HH:mm:ss", scheduledTime));
        }else{
            LOGGER.error("Couldnt parse any Date or Time for Flight.");
        }
        if(estimatedTime != null){
            aFlight.setEstimatedDateTime(convertStringDateAndTimeToDate(dateTime,"yyyy-MM-dd HH:mm:ss", estimatedTime));

        }
    }

    private void setTargetDependendInformation(GRUModel.Flight flight, Flight aFlight, Target target, Controller control){
        aFlight.setTarget(target);
        if(target == Target.ARRIVAL){
            aFlight.setOtherAirportId(control.getOtherAirportCalculator().getAirportIdForName(flight.departureLocation,ASTransportType.FLIGHT));
            aFlight.setOtherAirportCode(flight.departureLocationIATA);
            aFlight.setOtherLocationName(flight.departureLocation);
            processFlightDates(aFlight,flight.arrivalTime,flight.scheduledTime,flight.estimatedTime);
        }else{
            aFlight.setOtherAirportId(control.getOtherAirportCalculator().getAirportIdForName(flight.arrivalLocation,ASTransportType.FLIGHT));
            aFlight.setOtherAirportCode(flight.arrivalLocationIATA);
            aFlight.setOtherLocationName(flight.arrivalLocation);
            processFlightDates(aFlight,flight.departureTime,flight.scheduledTime,flight.estimatedTime);
        }
    }

    private void setStateDetails(GRUModel.Flight flight, Flight aFlight, Controller control){
        String stateText = null;
        if(flight.stateText.contains("Check-in")){
            String[] stateTextSplit = flight.stateText.split(" ");
            if(!stateTextSplit[1].contains("Fechado")){
                stateText = stateTextSplit[0];
                if(stateTextSplit[1] != null){
                    aFlight.setDesk(stateTextSplit[1]);
                }
            }
        }else{
            if(flight.stateText.contains("-")){
                stateText = flight.stateText.split("-")[0];
            }else {
                stateText = flight.stateText;
            }
        }

        aFlight.setStateText(stateText);
        aFlight.setState(control.getParserModules().getState(stateText, aFlight.getScheduledDateTime(), aFlight.getEstimatedDateTime(), this.getClass().getSimpleName()));
    }

    private void addFlightToListIfValid(List<Flight> allFlights, Flight aFlight){
        if(aFlight.getTransportNumber() != null && aFlight.getCarrierId() != null && aFlight.getScheduledDateTime()!=null){
            allFlights.add(aFlight);
        }else{
            LOGGER.warn("Couldnt add Flight To Flight List, not enough information.");
        }
    }

    private List<Flight> parse(Controller control, Transport.Target target, GRUModel model) {
        List<Flight> allFlights = new ArrayList<Flight>();
        for(GRUModel.Flight flight : model.flights){
            Flight aFlight = initializeFlightFromModel(flight,control);
            setTargetDependendInformation(flight,aFlight,target,control);
            setStateDetails(flight,aFlight,control);
            if(flight.codeshares.size()>0){
                for(GRUModel.Flight.Codeshare codeshare:flight.codeshares){
                    Flight cloneFlight = control.getParserModules().cloneFlight(aFlight);
                    setFlightNoAndCarrier(control,codeshare.flightIATA,codeshare.flightNo,cloneFlight);
                    addFlightToListIfValid(allFlights,cloneFlight);
                }
            }
            addFlightToListIfValid(allFlights,aFlight);
        }
        return allFlights;
    }

    private List<Transport> extractFlights(Controller control,  Target target, String url)
            throws IOException {
        List<Transport> allFlights = new ArrayList<Transport>();
        String json = getJson(target,control,url);
        GRUModel mainModel = map(json);
        allFlights.addAll(parse(control, target, mainModel));
        return allFlights;
    }

    @Override
    public List<Transport> analyzeArrivals(Controller control, ASAirportLog aLog) {
        try {
            airport = control.getAirportDAO().getByIATACode("GRU");
            String airportURL = airport.getFlightURLArrival();
            return extractFlights(control, Target.ARRIVAL, airportURL);
        } catch (Exception e) {
            ErrorLog.error(control, LOGGER, getClass().getName(), e, "", aLog, true);
        }
        return null;
    }

    @Override
    public List<Transport> analyzeDepartures(Controller control, ASAirportLog aLog) {
        try {
            airport = control.getAirportDAO().getByIATACode("GRU");
            String airportURL = airport.getFlightURLDeparture();
            return extractFlights(control, Target.DEPARTURE, airportURL);
        } catch (Exception e) {
            ErrorLog.error(control, LOGGER, getClass().getName(), e, "", aLog, false);
        }
        return null;
    }

    @Override
    public List<Transport> syncronizeArrivalFlight(Flight f, Controller control, ASAirportLog aLog) {
        // TODO Auto-generated method stub
        return null;

    }

    @Override
    public List<Transport> syncronizeDepartureFlight(Flight f, Controller control, ASAirportLog aLog) {
        // TODO Auto-generated method stub
        return null;

    }

}
