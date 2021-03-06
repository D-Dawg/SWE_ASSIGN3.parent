/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.sWEUIBK.Analyzer;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerDeclaration;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerObjectAction;
import org.xtext.example.mydsl.sWEUIBK.AnalyzerOperations;
import org.xtext.example.mydsl.sWEUIBK.ConnectionType;
import org.xtext.example.mydsl.sWEUIBK.Domainmodel;
import org.xtext.example.mydsl.sWEUIBK.GenerateHeader;
import org.xtext.example.mydsl.sWEUIBK.Header;
import org.xtext.example.mydsl.sWEUIBK.Model;
import org.xtext.example.mydsl.sWEUIBK.ModelAction;
import org.xtext.example.mydsl.sWEUIBK.ModelDeclaration;
import org.xtext.example.mydsl.sWEUIBK.ModelStructure;
import org.xtext.example.mydsl.sWEUIBK.Monitor;
import org.xtext.example.mydsl.sWEUIBK.MonitorDeclaration;
import org.xtext.example.mydsl.sWEUIBK.MonitorInitialization;
import org.xtext.example.mydsl.sWEUIBK.MonitorObjectAction;
import org.xtext.example.mydsl.sWEUIBK.MonitorOperations;
import org.xtext.example.mydsl.sWEUIBK.ObjectAction;
import org.xtext.example.mydsl.sWEUIBK.ObjectDeclaration;
import org.xtext.example.mydsl.sWEUIBK.Page;
import org.xtext.example.mydsl.sWEUIBK.PageDeclaration;
import org.xtext.example.mydsl.sWEUIBK.PageObjectAction;
import org.xtext.example.mydsl.sWEUIBK.PageOperations;
import org.xtext.example.mydsl.sWEUIBK.SetConnecttionType;

@SuppressWarnings("all")
public class SWEUIBKGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Domainmodel> _filter = Iterators.<Domainmodel>filter(_allContents, Domainmodel.class);
    final Procedure1<Domainmodel> _function = new Procedure1<Domainmodel>() {
      @Override
      public void apply(final Domainmodel it) {
        String _vnlContents = SWEUIBKGenerator.this.vnlContents(it);
        fsa.generateFile("Analyzer.java", _vnlContents);
      }
    };
    IteratorExtensions.<Domainmodel>forEach(_filter, _function);
  }
  
  public String vnlContents(final Domainmodel domainmodel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package mydsl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.apache.http.Header;");
    _builder.newLine();
    _builder.append("import org.apache.http.message.BasicHeader;");
    _builder.newLine();
    _builder.append("import server.Analyzer;");
    _builder.newLine();
    _builder.append("import server.Model;");
    _builder.newLine();
    _builder.append("import server.Monitor;");
    _builder.newLine();
    _builder.append("import server.Page;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Generator {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main (String [] args){");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ObjectDeclaration> _elements = domainmodel.getElements();
      for(final ObjectDeclaration objectInitialization : _elements) {
        {
          MonitorDeclaration _monitor = objectInitialization.getMonitor();
          boolean _notEquals = (!Objects.equal(_monitor, null));
          if (_notEquals) {
            _builder.append("\t");
            MonitorDeclaration _monitor_1 = objectInitialization.getMonitor();
            String _monitorInitialization = this.monitorInitialization(_monitor_1);
            _builder.append(_monitorInitialization, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          ModelDeclaration _model = objectInitialization.getModel();
          boolean _notEquals_1 = (!Objects.equal(_model, null));
          if (_notEquals_1) {
            _builder.append("\t");
            ModelDeclaration _model_1 = objectInitialization.getModel();
            String _modelInitialization = this.modelInitialization(_model_1);
            _builder.append(_modelInitialization, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          PageDeclaration _page = objectInitialization.getPage();
          boolean _notEquals_2 = (!Objects.equal(_page, null));
          if (_notEquals_2) {
            _builder.append("\t");
            PageDeclaration _page_1 = objectInitialization.getPage();
            String _pageInitialization = this.pageInitialization(_page_1);
            _builder.append(_pageInitialization, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        {
          AnalyzerDeclaration _analyzer = objectInitialization.getAnalyzer();
          boolean _notEquals_3 = (!Objects.equal(_analyzer, null));
          if (_notEquals_3) {
            _builder.append("\t");
            AnalyzerDeclaration _analyzer_1 = objectInitialization.getAnalyzer();
            String _analyzerInitialization = this.analyzerInitialization(_analyzer_1);
            _builder.append(_analyzerInitialization, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<ObjectAction> _actions = domainmodel.getActions();
      for(final ObjectAction objectAction : _actions) {
        {
          MonitorObjectAction _monitorAction = objectAction.getMonitorAction();
          boolean _notEquals_4 = (!Objects.equal(_monitorAction, null));
          if (_notEquals_4) {
            _builder.append("\t");
            MonitorObjectAction _monitorAction_1 = objectAction.getMonitorAction();
            String _monitorAction_2 = this.monitorAction(_monitorAction_1);
            _builder.append(_monitorAction_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          ModelAction _modelAction = objectAction.getModelAction();
          boolean _notEquals_5 = (!Objects.equal(_modelAction, null));
          if (_notEquals_5) {
            _builder.append("\t");
            ModelAction _modelAction_1 = objectAction.getModelAction();
            String _modelAction_2 = this.modelAction(_modelAction_1);
            _builder.append(_modelAction_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          PageObjectAction _pageAction = objectAction.getPageAction();
          boolean _notEquals_6 = (!Objects.equal(_pageAction, null));
          if (_notEquals_6) {
            _builder.append("\t");
            PageObjectAction _pageAction_1 = objectAction.getPageAction();
            String _pageAction_2 = this.pageAction(_pageAction_1);
            _builder.append(_pageAction_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        {
          AnalyzerObjectAction _analyzerAction = objectAction.getAnalyzerAction();
          boolean _notEquals_7 = (!Objects.equal(_analyzerAction, null));
          if (_notEquals_7) {
            _builder.append("\t");
            AnalyzerObjectAction _analyzerAction_1 = objectAction.getAnalyzerAction();
            String _analyzerAction_2 = this.analyzerAction(_analyzerAction_1);
            _builder.append(_analyzerAction_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String modelInitialization(final ModelDeclaration model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Model ");
    Model _name = model.getName();
    String _name_1 = _name.getName();
    _builder.append(_name_1, "");
    _builder.append(" = new Model();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String analyzerInitialization(final AnalyzerDeclaration analyzer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Analyzer ");
    Analyzer _name = analyzer.getName();
    String _name_1 = _name.getName();
    _builder.append(_name_1, "");
    _builder.append(" = new Analyzer();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String monitorInitialization(final MonitorDeclaration monitor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Monitor ");
    Monitor _name = monitor.getName();
    String _name_1 = _name.getName();
    _builder.append(_name_1, "");
    _builder.append(" = new Monitor();");
    _builder.newLineIfNotEmpty();
    Monitor _name_2 = monitor.getName();
    String _name_3 = _name_2.getName();
    _builder.append(_name_3, "");
    _builder.append(".initialzeFromSource(\"");
    MonitorInitialization _url = monitor.getUrl();
    String _url_1 = _url.getUrl();
    _builder.append(_url_1, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String pageInitialization(final PageDeclaration page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Page ");
    Page _name = page.getName();
    String _name_1 = _name.getName();
    _builder.append(_name_1, "");
    _builder.append(" = new Page();");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String modelAction(final ModelAction modelAction) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = modelAction.getName();
    _builder.append(_name, "");
    _builder.append(".initialzeFromSource(\"");
    ModelStructure _modelStructure = modelAction.getModelStructure();
    String _source = _modelStructure.getSource();
    _builder.append(_source, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String pageAction(final PageObjectAction pageAction) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PageOperations _value = pageAction.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        {
          PageOperations _value_1 = pageAction.getValue();
          boolean _equals = Objects.equal(_value_1, PageOperations.URL);
          if (_equals) {
            String _name = pageAction.getName();
            _builder.append(_name, "");
            _builder.append(".setUrl(\"");
            String _method = pageAction.getMethod();
            _builder.append(_method, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          SetConnecttionType _setConnectionType = pageAction.getSetConnectionType();
          boolean _notEquals_1 = (!Objects.equal(_setConnectionType, null));
          if (_notEquals_1) {
            String _name_1 = pageAction.getName();
            _builder.append(_name_1, "");
            SetConnecttionType _setConnectionType_1 = pageAction.getSetConnectionType();
            String _defineConnectionType = this.defineConnectionType(_setConnectionType_1);
            _builder.append(_defineConnectionType, "");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          GenerateHeader _headerList = pageAction.getHeaderList();
          boolean _notEquals_2 = (!Objects.equal(_headerList, null));
          if (_notEquals_2) {
            GenerateHeader _headerList_1 = pageAction.getHeaderList();
            String _generateHeaderList = this.generateHeaderList(_headerList_1);
            _builder.append(_generateHeaderList, "");
            _builder.newLineIfNotEmpty();
            String _name_2 = pageAction.getName();
            _builder.append(_name_2, "");
            _builder.append(".setHeaderList(headerList);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String monitorAction(final MonitorObjectAction monitorAction) {
    StringConcatenation _builder = new StringConcatenation();
    {
      MonitorOperations _value = monitorAction.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        {
          MonitorOperations _value_1 = monitorAction.getValue();
          boolean _equals = Objects.equal(_value_1, MonitorOperations.ADD);
          if (_equals) {
            String _name = monitorAction.getName();
            _builder.append(_name, "");
            _builder.append(".setAnalyzer(");
            String _method = monitorAction.getMethod();
            _builder.append(_method, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            String _name_1 = monitorAction.getName();
            _builder.append(_name_1, "");
            _builder.append(".setAnalyzer(null);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String analyzerAction(final AnalyzerObjectAction analyzerAction) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AnalyzerOperations _value = analyzerAction.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        {
          AnalyzerOperations _value_1 = analyzerAction.getValue();
          boolean _equals = Objects.equal(_value_1, AnalyzerOperations.LOADMODEL);
          if (_equals) {
            String _name = analyzerAction.getName();
            _builder.append(_name, "");
            _builder.append(".setModel(");
            String _method = analyzerAction.getMethod();
            _builder.append(_method, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          AnalyzerOperations _value_2 = analyzerAction.getValue();
          boolean _equals_1 = Objects.equal(_value_2, AnalyzerOperations.LOADPAGE);
          if (_equals_1) {
            String _name_1 = analyzerAction.getName();
            _builder.append(_name_1, "");
            _builder.append(".setPage(");
            String _method_1 = analyzerAction.getMethod();
            _builder.append(_method_1, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          AnalyzerOperations _value_3 = analyzerAction.getValue();
          boolean _equals_2 = Objects.equal(_value_3, AnalyzerOperations.EXECUTE);
          if (_equals_2) {
            String _name_2 = analyzerAction.getName();
            _builder.append(_name_2, "");
            _builder.append(".execute();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateHeaderList(final GenerateHeader headerList) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("List<Header> headerList = new ArrayList<Header>();");
    _builder.newLine();
    {
      EList<Header> _header = headerList.getHeader();
      for(final Header header : _header) {
        _builder.append("headerList.add(new BasicHeader(\"");
        String _key = header.getKey();
        _builder.append(_key, "");
        _builder.append("\",\"");
        String _headerValue = header.getHeaderValue();
        _builder.append(_headerValue, "");
        _builder.append("\"));");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String defineConnectionType(final SetConnecttionType connectionType) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ConnectionType _type = connectionType.getType();
      boolean _equals = Objects.equal(_type, ConnectionType.GET);
      if (_equals) {
        _builder.append(".setConnectionType(\"GET\");");
        _builder.newLine();
      } else {
        _builder.append(".setConnectionType(\"POST\");");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
}
