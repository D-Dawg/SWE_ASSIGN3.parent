package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SWEUIBKGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSWEUIBKParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'Monitor'", "'Analyzer'", "'Page'", "'.'", "'loadStructure'", "'('", "')'", "'generateHeaderList'", "'AddAnalyzer'", "'RemoveAnalyzer'", "'LoadPage'", "'Execute'", "'RemovePage'", "'LoadModel'", "'url'", "'connectType'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSWEUIBKParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSWEUIBKParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSWEUIBKParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSWEUIBK.g"; }



     	private SWEUIBKGrammarAccess grammarAccess;

        public InternalSWEUIBKParser(TokenStream input, SWEUIBKGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected SWEUIBKGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalSWEUIBK.g:65:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalSWEUIBK.g:65:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalSWEUIBK.g:66:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalSWEUIBK.g:72:1: ruleDomainmodel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleObjectDeclaration ) )* ( (lv_actions_1_0= ruleObjectAction ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_actions_1_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:78:2: ( ( ( (lv_elements_0_0= ruleObjectDeclaration ) )* ( (lv_actions_1_0= ruleObjectAction ) )* ) )
            // InternalSWEUIBK.g:79:2: ( ( (lv_elements_0_0= ruleObjectDeclaration ) )* ( (lv_actions_1_0= ruleObjectAction ) )* )
            {
            // InternalSWEUIBK.g:79:2: ( ( (lv_elements_0_0= ruleObjectDeclaration ) )* ( (lv_actions_1_0= ruleObjectAction ) )* )
            // InternalSWEUIBK.g:80:3: ( (lv_elements_0_0= ruleObjectDeclaration ) )* ( (lv_actions_1_0= ruleObjectAction ) )*
            {
            // InternalSWEUIBK.g:80:3: ( (lv_elements_0_0= ruleObjectDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSWEUIBK.g:81:4: (lv_elements_0_0= ruleObjectDeclaration )
            	    {
            	    // InternalSWEUIBK.g:81:4: (lv_elements_0_0= ruleObjectDeclaration )
            	    // InternalSWEUIBK.g:82:5: lv_elements_0_0= ruleObjectDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsObjectDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleObjectDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.xtext.example.mydsl.SWEUIBK.ObjectDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSWEUIBK.g:99:3: ( (lv_actions_1_0= ruleObjectAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSWEUIBK.g:100:4: (lv_actions_1_0= ruleObjectAction )
            	    {
            	    // InternalSWEUIBK.g:100:4: (lv_actions_1_0= ruleObjectAction )
            	    // InternalSWEUIBK.g:101:5: lv_actions_1_0= ruleObjectAction
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getActionsObjectActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actions_1_0=ruleObjectAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_1_0,
            	    						"org.xtext.example.mydsl.SWEUIBK.ObjectAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleObjectDeclaration"
    // InternalSWEUIBK.g:122:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalSWEUIBK.g:122:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalSWEUIBK.g:123:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
            {
             newCompositeNode(grammarAccess.getObjectDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectDeclaration=ruleObjectDeclaration();

            state._fsp--;

             current =iv_ruleObjectDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDeclaration"


    // $ANTLR start "ruleObjectDeclaration"
    // InternalSWEUIBK.g:129:1: ruleObjectDeclaration returns [EObject current=null] : (this_MonitorDeclaration_0= ruleMonitorDeclaration | this_AnalyzerDeclaration_1= ruleAnalyzerDeclaration | this_PageDeclaration_2= rulePageDeclaration | this_ModelDeclaration_3= ruleModelDeclaration ) ;
    public final EObject ruleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_MonitorDeclaration_0 = null;

        EObject this_AnalyzerDeclaration_1 = null;

        EObject this_PageDeclaration_2 = null;

        EObject this_ModelDeclaration_3 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:135:2: ( (this_MonitorDeclaration_0= ruleMonitorDeclaration | this_AnalyzerDeclaration_1= ruleAnalyzerDeclaration | this_PageDeclaration_2= rulePageDeclaration | this_ModelDeclaration_3= ruleModelDeclaration ) )
            // InternalSWEUIBK.g:136:2: (this_MonitorDeclaration_0= ruleMonitorDeclaration | this_AnalyzerDeclaration_1= ruleAnalyzerDeclaration | this_PageDeclaration_2= rulePageDeclaration | this_ModelDeclaration_3= ruleModelDeclaration )
            {
            // InternalSWEUIBK.g:136:2: (this_MonitorDeclaration_0= ruleMonitorDeclaration | this_AnalyzerDeclaration_1= ruleAnalyzerDeclaration | this_PageDeclaration_2= rulePageDeclaration | this_ModelDeclaration_3= ruleModelDeclaration )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 11:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSWEUIBK.g:137:3: this_MonitorDeclaration_0= ruleMonitorDeclaration
                    {

                    			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getMonitorDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonitorDeclaration_0=ruleMonitorDeclaration();

                    state._fsp--;


                    			current = this_MonitorDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:146:3: this_AnalyzerDeclaration_1= ruleAnalyzerDeclaration
                    {

                    			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAnalyzerDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalyzerDeclaration_1=ruleAnalyzerDeclaration();

                    state._fsp--;


                    			current = this_AnalyzerDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:155:3: this_PageDeclaration_2= rulePageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getPageDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageDeclaration_2=rulePageDeclaration();

                    state._fsp--;


                    			current = this_PageDeclaration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSWEUIBK.g:164:3: this_ModelDeclaration_3= ruleModelDeclaration
                    {

                    			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getModelDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelDeclaration_3=ruleModelDeclaration();

                    state._fsp--;


                    			current = this_ModelDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectDeclaration"


    // $ANTLR start "entryRuleModelDeclaration"
    // InternalSWEUIBK.g:176:1: entryRuleModelDeclaration returns [EObject current=null] : iv_ruleModelDeclaration= ruleModelDeclaration EOF ;
    public final EObject entryRuleModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDeclaration = null;


        try {
            // InternalSWEUIBK.g:176:57: (iv_ruleModelDeclaration= ruleModelDeclaration EOF )
            // InternalSWEUIBK.g:177:2: iv_ruleModelDeclaration= ruleModelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelDeclaration=ruleModelDeclaration();

            state._fsp--;

             current =iv_ruleModelDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelDeclaration"


    // $ANTLR start "ruleModelDeclaration"
    // InternalSWEUIBK.g:183:1: ruleModelDeclaration returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:189:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSWEUIBK.g:190:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSWEUIBK.g:190:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:191:3: otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelDeclarationAccess().getModelKeyword_0());
            		
            // InternalSWEUIBK.g:195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWEUIBK.g:196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSWEUIBK.g:196:4: (lv_name_1_0= RULE_ID )
            // InternalSWEUIBK.g:197:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelDeclaration"


    // $ANTLR start "entryRuleMonitorDeclaration"
    // InternalSWEUIBK.g:217:1: entryRuleMonitorDeclaration returns [EObject current=null] : iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF ;
    public final EObject entryRuleMonitorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorDeclaration = null;


        try {
            // InternalSWEUIBK.g:217:59: (iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF )
            // InternalSWEUIBK.g:218:2: iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMonitorDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorDeclaration=ruleMonitorDeclaration();

            state._fsp--;

             current =iv_ruleMonitorDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitorDeclaration"


    // $ANTLR start "ruleMonitorDeclaration"
    // InternalSWEUIBK.g:224:1: ruleMonitorDeclaration returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) ruleMonitorInitialization ) ;
    public final EObject ruleMonitorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:230:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) ruleMonitorInitialization ) )
            // InternalSWEUIBK.g:231:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) ruleMonitorInitialization )
            {
            // InternalSWEUIBK.g:231:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) ruleMonitorInitialization )
            // InternalSWEUIBK.g:232:3: otherlv_0= 'Monitor' ( (lv_name_1_0= RULE_ID ) ) ruleMonitorInitialization
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitorDeclarationAccess().getMonitorKeyword_0());
            		
            // InternalSWEUIBK.g:236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWEUIBK.g:237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSWEUIBK.g:237:4: (lv_name_1_0= RULE_ID )
            // InternalSWEUIBK.g:238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitorDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            			newCompositeNode(grammarAccess.getMonitorDeclarationAccess().getMonitorInitializationParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            ruleMonitorInitialization();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitorDeclaration"


    // $ANTLR start "entryRuleMonitorInitialization"
    // InternalSWEUIBK.g:265:1: entryRuleMonitorInitialization returns [String current=null] : iv_ruleMonitorInitialization= ruleMonitorInitialization EOF ;
    public final String entryRuleMonitorInitialization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMonitorInitialization = null;


        try {
            // InternalSWEUIBK.g:265:61: (iv_ruleMonitorInitialization= ruleMonitorInitialization EOF )
            // InternalSWEUIBK.g:266:2: iv_ruleMonitorInitialization= ruleMonitorInitialization EOF
            {
             newCompositeNode(grammarAccess.getMonitorInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorInitialization=ruleMonitorInitialization();

            state._fsp--;

             current =iv_ruleMonitorInitialization.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitorInitialization"


    // $ANTLR start "ruleMonitorInitialization"
    // InternalSWEUIBK.g:272:1: ruleMonitorInitialization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleMonitorInitialization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:278:2: (this_STRING_0= RULE_STRING )
            // InternalSWEUIBK.g:279:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getMonitorInitializationAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitorInitialization"


    // $ANTLR start "entryRuleAnalyzerDeclaration"
    // InternalSWEUIBK.g:289:1: entryRuleAnalyzerDeclaration returns [EObject current=null] : iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF ;
    public final EObject entryRuleAnalyzerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerDeclaration = null;


        try {
            // InternalSWEUIBK.g:289:60: (iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF )
            // InternalSWEUIBK.g:290:2: iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAnalyzerDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzerDeclaration=ruleAnalyzerDeclaration();

            state._fsp--;

             current =iv_ruleAnalyzerDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyzerDeclaration"


    // $ANTLR start "ruleAnalyzerDeclaration"
    // InternalSWEUIBK.g:296:1: ruleAnalyzerDeclaration returns [EObject current=null] : (otherlv_0= 'Analyzer' this_Analyzer_1= ruleAnalyzer ) ;
    public final EObject ruleAnalyzerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Analyzer_1 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:302:2: ( (otherlv_0= 'Analyzer' this_Analyzer_1= ruleAnalyzer ) )
            // InternalSWEUIBK.g:303:2: (otherlv_0= 'Analyzer' this_Analyzer_1= ruleAnalyzer )
            {
            // InternalSWEUIBK.g:303:2: (otherlv_0= 'Analyzer' this_Analyzer_1= ruleAnalyzer )
            // InternalSWEUIBK.g:304:3: otherlv_0= 'Analyzer' this_Analyzer_1= ruleAnalyzer
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyzerDeclarationAccess().getAnalyzerKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAnalyzerDeclarationAccess().getAnalyzerParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Analyzer_1=ruleAnalyzer();

            state._fsp--;


            			current = this_Analyzer_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyzerDeclaration"


    // $ANTLR start "entryRuleAnalyzer"
    // InternalSWEUIBK.g:320:1: entryRuleAnalyzer returns [EObject current=null] : iv_ruleAnalyzer= ruleAnalyzer EOF ;
    public final EObject entryRuleAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzer = null;


        try {
            // InternalSWEUIBK.g:320:49: (iv_ruleAnalyzer= ruleAnalyzer EOF )
            // InternalSWEUIBK.g:321:2: iv_ruleAnalyzer= ruleAnalyzer EOF
            {
             newCompositeNode(grammarAccess.getAnalyzerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzer=ruleAnalyzer();

            state._fsp--;

             current =iv_ruleAnalyzer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyzer"


    // $ANTLR start "ruleAnalyzer"
    // InternalSWEUIBK.g:327:1: ruleAnalyzer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAnalyzer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:333:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:334:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSWEUIBK.g:334:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:335:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:335:3: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:336:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnalyzerRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyzer"


    // $ANTLR start "entryRulePageDeclaration"
    // InternalSWEUIBK.g:355:1: entryRulePageDeclaration returns [EObject current=null] : iv_rulePageDeclaration= rulePageDeclaration EOF ;
    public final EObject entryRulePageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageDeclaration = null;


        try {
            // InternalSWEUIBK.g:355:56: (iv_rulePageDeclaration= rulePageDeclaration EOF )
            // InternalSWEUIBK.g:356:2: iv_rulePageDeclaration= rulePageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageDeclaration=rulePageDeclaration();

            state._fsp--;

             current =iv_rulePageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageDeclaration"


    // $ANTLR start "rulePageDeclaration"
    // InternalSWEUIBK.g:362:1: rulePageDeclaration returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:368:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSWEUIBK.g:369:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSWEUIBK.g:369:2: (otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:370:3: otherlv_0= 'Page' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPageDeclarationAccess().getPageKeyword_0());
            		
            // InternalSWEUIBK.g:374:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSWEUIBK.g:375:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSWEUIBK.g:375:4: (lv_name_1_0= RULE_ID )
            // InternalSWEUIBK.g:376:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageDeclaration"


    // $ANTLR start "entryRuleObjectAction"
    // InternalSWEUIBK.g:396:1: entryRuleObjectAction returns [EObject current=null] : iv_ruleObjectAction= ruleObjectAction EOF ;
    public final EObject entryRuleObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAction = null;


        try {
            // InternalSWEUIBK.g:396:53: (iv_ruleObjectAction= ruleObjectAction EOF )
            // InternalSWEUIBK.g:397:2: iv_ruleObjectAction= ruleObjectAction EOF
            {
             newCompositeNode(grammarAccess.getObjectActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAction=ruleObjectAction();

            state._fsp--;

             current =iv_ruleObjectAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectAction"


    // $ANTLR start "ruleObjectAction"
    // InternalSWEUIBK.g:403:1: ruleObjectAction returns [EObject current=null] : (this_MonitorObjectAction_0= ruleMonitorObjectAction | this_AnalyzerObjectAction_1= ruleAnalyzerObjectAction | this_PageObjectAction_2= rulePageObjectAction | this_ModelAction_3= ruleModelAction ) ;
    public final EObject ruleObjectAction() throws RecognitionException {
        EObject current = null;

        EObject this_MonitorObjectAction_0 = null;

        EObject this_AnalyzerObjectAction_1 = null;

        EObject this_PageObjectAction_2 = null;

        EObject this_ModelAction_3 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:409:2: ( (this_MonitorObjectAction_0= ruleMonitorObjectAction | this_AnalyzerObjectAction_1= ruleAnalyzerObjectAction | this_PageObjectAction_2= rulePageObjectAction | this_ModelAction_3= ruleModelAction ) )
            // InternalSWEUIBK.g:410:2: (this_MonitorObjectAction_0= ruleMonitorObjectAction | this_AnalyzerObjectAction_1= ruleAnalyzerObjectAction | this_PageObjectAction_2= rulePageObjectAction | this_ModelAction_3= ruleModelAction )
            {
            // InternalSWEUIBK.g:410:2: (this_MonitorObjectAction_0= ruleMonitorObjectAction | this_AnalyzerObjectAction_1= ruleAnalyzerObjectAction | this_PageObjectAction_2= rulePageObjectAction | this_ModelAction_3= ruleModelAction )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    switch ( input.LA(3) ) {
                    case 16:
                        {
                        alt4=4;
                        }
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        {
                        alt4=2;
                        }
                        break;
                    case 20:
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case 19:
                    case 26:
                    case 27:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSWEUIBK.g:411:3: this_MonitorObjectAction_0= ruleMonitorObjectAction
                    {

                    			newCompositeNode(grammarAccess.getObjectActionAccess().getMonitorObjectActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MonitorObjectAction_0=ruleMonitorObjectAction();

                    state._fsp--;


                    			current = this_MonitorObjectAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:420:3: this_AnalyzerObjectAction_1= ruleAnalyzerObjectAction
                    {

                    			newCompositeNode(grammarAccess.getObjectActionAccess().getAnalyzerObjectActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnalyzerObjectAction_1=ruleAnalyzerObjectAction();

                    state._fsp--;


                    			current = this_AnalyzerObjectAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:429:3: this_PageObjectAction_2= rulePageObjectAction
                    {

                    			newCompositeNode(grammarAccess.getObjectActionAccess().getPageObjectActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageObjectAction_2=rulePageObjectAction();

                    state._fsp--;


                    			current = this_PageObjectAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSWEUIBK.g:438:3: this_ModelAction_3= ruleModelAction
                    {

                    			newCompositeNode(grammarAccess.getObjectActionAccess().getModelActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelAction_3=ruleModelAction();

                    state._fsp--;


                    			current = this_ModelAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectAction"


    // $ANTLR start "entryRuleModelAction"
    // InternalSWEUIBK.g:450:1: entryRuleModelAction returns [EObject current=null] : iv_ruleModelAction= ruleModelAction EOF ;
    public final EObject entryRuleModelAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelAction = null;


        try {
            // InternalSWEUIBK.g:450:52: (iv_ruleModelAction= ruleModelAction EOF )
            // InternalSWEUIBK.g:451:2: iv_ruleModelAction= ruleModelAction EOF
            {
             newCompositeNode(grammarAccess.getModelActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelAction=ruleModelAction();

            state._fsp--;

             current =iv_ruleModelAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelAction"


    // $ANTLR start "ruleModelAction"
    // InternalSWEUIBK.g:457:1: ruleModelAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( ruleModelStructure )+ otherlv_5= ')' ) ;
    public final EObject ruleModelAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:463:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( ruleModelStructure )+ otherlv_5= ')' ) )
            // InternalSWEUIBK.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( ruleModelStructure )+ otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( ruleModelStructure )+ otherlv_5= ')' )
            // InternalSWEUIBK.g:465:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( ruleModelStructure )+ otherlv_5= ')'
            {
            // InternalSWEUIBK.g:465:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:466:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:466:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:467:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getModelActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getModelActionAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getModelActionAccess().getLoadStructureKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelActionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSWEUIBK.g:495:3: ( ruleModelStructure )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSWEUIBK.g:496:4: ruleModelStructure
            	    {

            	    				newCompositeNode(grammarAccess.getModelActionAccess().getModelStructureParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleModelStructure();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelActionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelAction"


    // $ANTLR start "entryRuleModelStructure"
    // InternalSWEUIBK.g:512:1: entryRuleModelStructure returns [String current=null] : iv_ruleModelStructure= ruleModelStructure EOF ;
    public final String entryRuleModelStructure() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModelStructure = null;


        try {
            // InternalSWEUIBK.g:512:54: (iv_ruleModelStructure= ruleModelStructure EOF )
            // InternalSWEUIBK.g:513:2: iv_ruleModelStructure= ruleModelStructure EOF
            {
             newCompositeNode(grammarAccess.getModelStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelStructure=ruleModelStructure();

            state._fsp--;

             current =iv_ruleModelStructure.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelStructure"


    // $ANTLR start "ruleModelStructure"
    // InternalSWEUIBK.g:519:1: ruleModelStructure returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleModelStructure() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:525:2: (this_STRING_0= RULE_STRING )
            // InternalSWEUIBK.g:526:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getModelStructureAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelStructure"


    // $ANTLR start "entryRuleMonitorObjectAction"
    // InternalSWEUIBK.g:536:1: entryRuleMonitorObjectAction returns [EObject current=null] : iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF ;
    public final EObject entryRuleMonitorObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorObjectAction = null;


        try {
            // InternalSWEUIBK.g:536:60: (iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF )
            // InternalSWEUIBK.g:537:2: iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF
            {
             newCompositeNode(grammarAccess.getMonitorObjectActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorObjectAction=ruleMonitorObjectAction();

            state._fsp--;

             current =iv_ruleMonitorObjectAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonitorObjectAction"


    // $ANTLR start "ruleMonitorObjectAction"
    // InternalSWEUIBK.g:543:1: ruleMonitorObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) ;
    public final EObject ruleMonitorObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:549:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) )
            // InternalSWEUIBK.g:550:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:550:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
            // InternalSWEUIBK.g:551:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')'
            {
            // InternalSWEUIBK.g:551:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:552:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:552:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:553:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMonitorObjectActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorObjectActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitorObjectActionAccess().getFullStopKeyword_1());
            		
            // InternalSWEUIBK.g:573:3: ( (lv_value_2_0= ruleMonitorOperations ) )
            // InternalSWEUIBK.g:574:4: (lv_value_2_0= ruleMonitorOperations )
            {
            // InternalSWEUIBK.g:574:4: (lv_value_2_0= ruleMonitorOperations )
            // InternalSWEUIBK.g:575:5: lv_value_2_0= ruleMonitorOperations
            {

            					newCompositeNode(grammarAccess.getMonitorObjectActionAccess().getValueMonitorOperationsEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_2_0=ruleMonitorOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitorObjectActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.SWEUIBK.MonitorOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitorObjectActionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSWEUIBK.g:596:3: ( (lv_method_4_0= ruleMethodParameter ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSWEUIBK.g:597:4: (lv_method_4_0= ruleMethodParameter )
                    {
                    // InternalSWEUIBK.g:597:4: (lv_method_4_0= ruleMethodParameter )
                    // InternalSWEUIBK.g:598:5: lv_method_4_0= ruleMethodParameter
                    {

                    					newCompositeNode(grammarAccess.getMonitorObjectActionAccess().getMethodMethodParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_method_4_0=ruleMethodParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMonitorObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_4_0,
                    						"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMonitorObjectActionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitorObjectAction"


    // $ANTLR start "entryRuleAnalyzerObjectAction"
    // InternalSWEUIBK.g:623:1: entryRuleAnalyzerObjectAction returns [EObject current=null] : iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF ;
    public final EObject entryRuleAnalyzerObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerObjectAction = null;


        try {
            // InternalSWEUIBK.g:623:61: (iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF )
            // InternalSWEUIBK.g:624:2: iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF
            {
             newCompositeNode(grammarAccess.getAnalyzerObjectActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnalyzerObjectAction=ruleAnalyzerObjectAction();

            state._fsp--;

             current =iv_ruleAnalyzerObjectAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnalyzerObjectAction"


    // $ANTLR start "ruleAnalyzerObjectAction"
    // InternalSWEUIBK.g:630:1: ruleAnalyzerObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) ;
    public final EObject ruleAnalyzerObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:636:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) )
            // InternalSWEUIBK.g:637:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:637:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
            // InternalSWEUIBK.g:638:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')'
            {
            // InternalSWEUIBK.g:638:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:639:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:639:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:640:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAnalyzerObjectActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnalyzerObjectActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalyzerObjectActionAccess().getFullStopKeyword_1());
            		
            // InternalSWEUIBK.g:660:3: ( (lv_value_2_0= ruleAnalyzerOperations ) )
            // InternalSWEUIBK.g:661:4: (lv_value_2_0= ruleAnalyzerOperations )
            {
            // InternalSWEUIBK.g:661:4: (lv_value_2_0= ruleAnalyzerOperations )
            // InternalSWEUIBK.g:662:5: lv_value_2_0= ruleAnalyzerOperations
            {

            					newCompositeNode(grammarAccess.getAnalyzerObjectActionAccess().getValueAnalyzerOperationsEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_2_0=ruleAnalyzerOperations();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyzerObjectActionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.SWEUIBK.AnalyzerOperations");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getAnalyzerObjectActionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSWEUIBK.g:683:3: ( (lv_method_4_0= ruleMethodParameter ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSWEUIBK.g:684:4: (lv_method_4_0= ruleMethodParameter )
                    {
                    // InternalSWEUIBK.g:684:4: (lv_method_4_0= ruleMethodParameter )
                    // InternalSWEUIBK.g:685:5: lv_method_4_0= ruleMethodParameter
                    {

                    					newCompositeNode(grammarAccess.getAnalyzerObjectActionAccess().getMethodMethodParameterParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_method_4_0=ruleMethodParameter();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnalyzerObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"method",
                    						lv_method_4_0,
                    						"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnalyzerObjectActionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyzerObjectAction"


    // $ANTLR start "entryRulePageObjectAction"
    // InternalSWEUIBK.g:710:1: entryRulePageObjectAction returns [EObject current=null] : iv_rulePageObjectAction= rulePageObjectAction EOF ;
    public final EObject entryRulePageObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageObjectAction = null;


        try {
            // InternalSWEUIBK.g:710:57: (iv_rulePageObjectAction= rulePageObjectAction EOF )
            // InternalSWEUIBK.g:711:2: iv_rulePageObjectAction= rulePageObjectAction EOF
            {
             newCompositeNode(grammarAccess.getPageObjectActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageObjectAction=rulePageObjectAction();

            state._fsp--;

             current =iv_rulePageObjectAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageObjectAction"


    // $ANTLR start "rulePageObjectAction"
    // InternalSWEUIBK.g:717:1: rulePageObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader ) ) ;
    public final EObject rulePageObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:723:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader ) ) )
            // InternalSWEUIBK.g:724:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader ) )
            {
            // InternalSWEUIBK.g:724:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader ) )
            // InternalSWEUIBK.g:725:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader )
            {
            // InternalSWEUIBK.g:725:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:726:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:726:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:727:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPageObjectActionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageObjectActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPageObjectActionAccess().getFullStopKeyword_1());
            		
            // InternalSWEUIBK.g:747:3: ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' ) | ruleGenerateHeader )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=26 && LA9_0<=27)) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSWEUIBK.g:748:4: ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
                    {
                    // InternalSWEUIBK.g:748:4: ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')' )
                    // InternalSWEUIBK.g:749:5: ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= ruleMethodParameter ) )? otherlv_5= ')'
                    {
                    // InternalSWEUIBK.g:749:5: ( (lv_value_2_0= rulePageOperations ) )
                    // InternalSWEUIBK.g:750:6: (lv_value_2_0= rulePageOperations )
                    {
                    // InternalSWEUIBK.g:750:6: (lv_value_2_0= rulePageOperations )
                    // InternalSWEUIBK.g:751:7: lv_value_2_0= rulePageOperations
                    {

                    							newCompositeNode(grammarAccess.getPageObjectActionAccess().getValuePageOperationsEnumRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_value_2_0=rulePageOperations();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
                    							}
                    							set(
                    								current,
                    								"value",
                    								lv_value_2_0,
                    								"org.xtext.example.mydsl.SWEUIBK.PageOperations");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(otherlv_3, grammarAccess.getPageObjectActionAccess().getLeftParenthesisKeyword_2_0_1());
                    				
                    // InternalSWEUIBK.g:772:5: ( (lv_method_4_0= ruleMethodParameter ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_STRING) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSWEUIBK.g:773:6: (lv_method_4_0= ruleMethodParameter )
                            {
                            // InternalSWEUIBK.g:773:6: (lv_method_4_0= ruleMethodParameter )
                            // InternalSWEUIBK.g:774:7: lv_method_4_0= ruleMethodParameter
                            {

                            							newCompositeNode(grammarAccess.getPageObjectActionAccess().getMethodMethodParameterParserRuleCall_2_0_2_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_method_4_0=ruleMethodParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
                            							}
                            							set(
                            								current,
                            								"method",
                            								lv_method_4_0,
                            								"org.xtext.example.mydsl.SWEUIBK.MethodParameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getPageObjectActionAccess().getRightParenthesisKeyword_2_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:797:4: ruleGenerateHeader
                    {

                    				newCompositeNode(grammarAccess.getPageObjectActionAccess().getGenerateHeaderParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleGenerateHeader();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageObjectAction"


    // $ANTLR start "entryRuleGenerateHeader"
    // InternalSWEUIBK.g:809:1: entryRuleGenerateHeader returns [String current=null] : iv_ruleGenerateHeader= ruleGenerateHeader EOF ;
    public final String entryRuleGenerateHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGenerateHeader = null;


        try {
            // InternalSWEUIBK.g:809:54: (iv_ruleGenerateHeader= ruleGenerateHeader EOF )
            // InternalSWEUIBK.g:810:2: iv_ruleGenerateHeader= ruleGenerateHeader EOF
            {
             newCompositeNode(grammarAccess.getGenerateHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerateHeader=ruleGenerateHeader();

            state._fsp--;

             current =iv_ruleGenerateHeader.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenerateHeader"


    // $ANTLR start "ruleGenerateHeader"
    // InternalSWEUIBK.g:816:1: ruleGenerateHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'generateHeaderList' kw= '(' (this_Header_2= ruleHeader )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleGenerateHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Header_2 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:822:2: ( (kw= 'generateHeaderList' kw= '(' (this_Header_2= ruleHeader )* kw= ')' ) )
            // InternalSWEUIBK.g:823:2: (kw= 'generateHeaderList' kw= '(' (this_Header_2= ruleHeader )* kw= ')' )
            {
            // InternalSWEUIBK.g:823:2: (kw= 'generateHeaderList' kw= '(' (this_Header_2= ruleHeader )* kw= ')' )
            // InternalSWEUIBK.g:824:3: kw= 'generateHeaderList' kw= '(' (this_Header_2= ruleHeader )* kw= ')'
            {
            kw=(Token)match(input,19,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getGenerateHeaderListKeyword_0());
            		
            kw=(Token)match(input,17,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSWEUIBK.g:834:3: (this_Header_2= ruleHeader )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSWEUIBK.g:835:4: this_Header_2= ruleHeader
            	    {

            	    				newCompositeNode(grammarAccess.getGenerateHeaderAccess().getHeaderParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_10);
            	    this_Header_2=ruleHeader();

            	    state._fsp--;


            	    				current.merge(this_Header_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getGenerateHeaderAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenerateHeader"


    // $ANTLR start "entryRuleHeader"
    // InternalSWEUIBK.g:855:1: entryRuleHeader returns [String current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final String entryRuleHeader() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHeader = null;


        try {
            // InternalSWEUIBK.g:855:46: (iv_ruleHeader= ruleHeader EOF )
            // InternalSWEUIBK.g:856:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalSWEUIBK.g:862:1: ruleHeader returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= '(' this_STRING_2= RULE_STRING kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleHeader() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:868:2: ( (this_STRING_0= RULE_STRING kw= '(' this_STRING_2= RULE_STRING kw= ')' ) )
            // InternalSWEUIBK.g:869:2: (this_STRING_0= RULE_STRING kw= '(' this_STRING_2= RULE_STRING kw= ')' )
            {
            // InternalSWEUIBK.g:869:2: (this_STRING_0= RULE_STRING kw= '(' this_STRING_2= RULE_STRING kw= ')' )
            // InternalSWEUIBK.g:870:3: this_STRING_0= RULE_STRING kw= '(' this_STRING_2= RULE_STRING kw= ')'
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall_0());
            		
            kw=(Token)match(input,17,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1());
            		
            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_12); 

            			current.merge(this_STRING_2);
            		

            			newLeafNode(this_STRING_2, grammarAccess.getHeaderAccess().getSTRINGTerminalRuleCall_2());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleMethodParameter"
    // InternalSWEUIBK.g:898:1: entryRuleMethodParameter returns [String current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final String entryRuleMethodParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodParameter = null;


        try {
            // InternalSWEUIBK.g:898:55: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // InternalSWEUIBK.g:899:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // InternalSWEUIBK.g:905:1: ruleMethodParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleMethodParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:911:2: (this_STRING_0= RULE_STRING )
            // InternalSWEUIBK.g:912:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getMethodParameterAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "ruleMonitorOperations"
    // InternalSWEUIBK.g:922:1: ruleMonitorOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) ) ;
    public final Enumerator ruleMonitorOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:928:2: ( ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) ) )
            // InternalSWEUIBK.g:929:2: ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) )
            {
            // InternalSWEUIBK.g:929:2: ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSWEUIBK.g:930:3: (enumLiteral_0= 'AddAnalyzer' )
                    {
                    // InternalSWEUIBK.g:930:3: (enumLiteral_0= 'AddAnalyzer' )
                    // InternalSWEUIBK.g:931:4: enumLiteral_0= 'AddAnalyzer'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:938:3: (enumLiteral_1= 'RemoveAnalyzer' )
                    {
                    // InternalSWEUIBK.g:938:3: (enumLiteral_1= 'RemoveAnalyzer' )
                    // InternalSWEUIBK.g:939:4: enumLiteral_1= 'RemoveAnalyzer'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getMonitorOperationsAccess().getREMOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMonitorOperationsAccess().getREMOVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonitorOperations"


    // $ANTLR start "ruleAnalyzerOperations"
    // InternalSWEUIBK.g:949:1: ruleAnalyzerOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'LoadPage' ) | (enumLiteral_1= 'Execute' ) | (enumLiteral_2= 'RemovePage' ) | (enumLiteral_3= 'LoadModel' ) ) ;
    public final Enumerator ruleAnalyzerOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:955:2: ( ( (enumLiteral_0= 'LoadPage' ) | (enumLiteral_1= 'Execute' ) | (enumLiteral_2= 'RemovePage' ) | (enumLiteral_3= 'LoadModel' ) ) )
            // InternalSWEUIBK.g:956:2: ( (enumLiteral_0= 'LoadPage' ) | (enumLiteral_1= 'Execute' ) | (enumLiteral_2= 'RemovePage' ) | (enumLiteral_3= 'LoadModel' ) )
            {
            // InternalSWEUIBK.g:956:2: ( (enumLiteral_0= 'LoadPage' ) | (enumLiteral_1= 'Execute' ) | (enumLiteral_2= 'RemovePage' ) | (enumLiteral_3= 'LoadModel' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSWEUIBK.g:957:3: (enumLiteral_0= 'LoadPage' )
                    {
                    // InternalSWEUIBK.g:957:3: (enumLiteral_0= 'LoadPage' )
                    // InternalSWEUIBK.g:958:4: enumLiteral_0= 'LoadPage'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:965:3: (enumLiteral_1= 'Execute' )
                    {
                    // InternalSWEUIBK.g:965:3: (enumLiteral_1= 'Execute' )
                    // InternalSWEUIBK.g:966:4: enumLiteral_1= 'Execute'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:973:3: (enumLiteral_2= 'RemovePage' )
                    {
                    // InternalSWEUIBK.g:973:3: (enumLiteral_2= 'RemovePage' )
                    // InternalSWEUIBK.g:974:4: enumLiteral_2= 'RemovePage'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getREMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAnalyzerOperationsAccess().getREMOVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSWEUIBK.g:981:3: (enumLiteral_3= 'LoadModel' )
                    {
                    // InternalSWEUIBK.g:981:3: (enumLiteral_3= 'LoadModel' )
                    // InternalSWEUIBK.g:982:4: enumLiteral_3= 'LoadModel'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnalyzerOperations"


    // $ANTLR start "rulePageOperations"
    // InternalSWEUIBK.g:992:1: rulePageOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'url' ) | (enumLiteral_1= 'connectType' ) ) ;
    public final Enumerator rulePageOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:998:2: ( ( (enumLiteral_0= 'url' ) | (enumLiteral_1= 'connectType' ) ) )
            // InternalSWEUIBK.g:999:2: ( (enumLiteral_0= 'url' ) | (enumLiteral_1= 'connectType' ) )
            {
            // InternalSWEUIBK.g:999:2: ( (enumLiteral_0= 'url' ) | (enumLiteral_1= 'connectType' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSWEUIBK.g:1000:3: (enumLiteral_0= 'url' )
                    {
                    // InternalSWEUIBK.g:1000:3: (enumLiteral_0= 'url' )
                    // InternalSWEUIBK.g:1001:4: enumLiteral_0= 'url'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:1008:3: (enumLiteral_1= 'connectType' )
                    {
                    // InternalSWEUIBK.g:1008:3: (enumLiteral_1= 'connectType' )
                    // InternalSWEUIBK.g:1009:4: enumLiteral_1= 'connectType'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPageOperationsAccess().getCONNECTIONTYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPageOperationsAccess().getCONNECTIONTYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageOperations"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C080000L});

}