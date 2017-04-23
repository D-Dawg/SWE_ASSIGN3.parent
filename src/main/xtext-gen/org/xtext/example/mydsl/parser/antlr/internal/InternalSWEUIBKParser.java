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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'Analyzer'", "'Monitor'", "'Page'", "'.'", "'loadStructure'", "'('", "')'", "'generateHeaderList'", "'connectType'", "'AddAnalyzer'", "'RemoveAnalyzer'", "'Execute'", "'LoadPage'", "'LoadModel'", "'url'", "'post'", "'get'"
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
    public static final int T__28=28;
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
    // InternalSWEUIBK.g:129:1: ruleObjectDeclaration returns [EObject current=null] : ( ( (lv_monitor_0_0= ruleMonitorDeclaration ) ) | ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) ) | ( (lv_page_2_0= rulePageDeclaration ) ) | ( (lv_model_3_0= ruleModelDeclaration ) ) ) ;
    public final EObject ruleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_monitor_0_0 = null;

        EObject lv_analyzer_1_0 = null;

        EObject lv_page_2_0 = null;

        EObject lv_model_3_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:135:2: ( ( ( (lv_monitor_0_0= ruleMonitorDeclaration ) ) | ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) ) | ( (lv_page_2_0= rulePageDeclaration ) ) | ( (lv_model_3_0= ruleModelDeclaration ) ) ) )
            // InternalSWEUIBK.g:136:2: ( ( (lv_monitor_0_0= ruleMonitorDeclaration ) ) | ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) ) | ( (lv_page_2_0= rulePageDeclaration ) ) | ( (lv_model_3_0= ruleModelDeclaration ) ) )
            {
            // InternalSWEUIBK.g:136:2: ( ( (lv_monitor_0_0= ruleMonitorDeclaration ) ) | ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) ) | ( (lv_page_2_0= rulePageDeclaration ) ) | ( (lv_model_3_0= ruleModelDeclaration ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 12:
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
                    // InternalSWEUIBK.g:137:3: ( (lv_monitor_0_0= ruleMonitorDeclaration ) )
                    {
                    // InternalSWEUIBK.g:137:3: ( (lv_monitor_0_0= ruleMonitorDeclaration ) )
                    // InternalSWEUIBK.g:138:4: (lv_monitor_0_0= ruleMonitorDeclaration )
                    {
                    // InternalSWEUIBK.g:138:4: (lv_monitor_0_0= ruleMonitorDeclaration )
                    // InternalSWEUIBK.g:139:5: lv_monitor_0_0= ruleMonitorDeclaration
                    {

                    					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getMonitorMonitorDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_monitor_0_0=ruleMonitorDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"monitor",
                    						lv_monitor_0_0,
                    						"org.xtext.example.mydsl.SWEUIBK.MonitorDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:157:3: ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) )
                    {
                    // InternalSWEUIBK.g:157:3: ( (lv_analyzer_1_0= ruleAnalyzerDeclaration ) )
                    // InternalSWEUIBK.g:158:4: (lv_analyzer_1_0= ruleAnalyzerDeclaration )
                    {
                    // InternalSWEUIBK.g:158:4: (lv_analyzer_1_0= ruleAnalyzerDeclaration )
                    // InternalSWEUIBK.g:159:5: lv_analyzer_1_0= ruleAnalyzerDeclaration
                    {

                    					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAnalyzerAnalyzerDeclarationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_analyzer_1_0=ruleAnalyzerDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"analyzer",
                    						lv_analyzer_1_0,
                    						"org.xtext.example.mydsl.SWEUIBK.AnalyzerDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:177:3: ( (lv_page_2_0= rulePageDeclaration ) )
                    {
                    // InternalSWEUIBK.g:177:3: ( (lv_page_2_0= rulePageDeclaration ) )
                    // InternalSWEUIBK.g:178:4: (lv_page_2_0= rulePageDeclaration )
                    {
                    // InternalSWEUIBK.g:178:4: (lv_page_2_0= rulePageDeclaration )
                    // InternalSWEUIBK.g:179:5: lv_page_2_0= rulePageDeclaration
                    {

                    					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getPagePageDeclarationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_page_2_0=rulePageDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"page",
                    						lv_page_2_0,
                    						"org.xtext.example.mydsl.SWEUIBK.PageDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSWEUIBK.g:197:3: ( (lv_model_3_0= ruleModelDeclaration ) )
                    {
                    // InternalSWEUIBK.g:197:3: ( (lv_model_3_0= ruleModelDeclaration ) )
                    // InternalSWEUIBK.g:198:4: (lv_model_3_0= ruleModelDeclaration )
                    {
                    // InternalSWEUIBK.g:198:4: (lv_model_3_0= ruleModelDeclaration )
                    // InternalSWEUIBK.g:199:5: lv_model_3_0= ruleModelDeclaration
                    {

                    					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getModelModelDeclarationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_model_3_0=ruleModelDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"model",
                    						lv_model_3_0,
                    						"org.xtext.example.mydsl.SWEUIBK.ModelDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleObjectDeclaration"


    // $ANTLR start "entryRuleModelDeclaration"
    // InternalSWEUIBK.g:220:1: entryRuleModelDeclaration returns [EObject current=null] : iv_ruleModelDeclaration= ruleModelDeclaration EOF ;
    public final EObject entryRuleModelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDeclaration = null;


        try {
            // InternalSWEUIBK.g:220:57: (iv_ruleModelDeclaration= ruleModelDeclaration EOF )
            // InternalSWEUIBK.g:221:2: iv_ruleModelDeclaration= ruleModelDeclaration EOF
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
    // InternalSWEUIBK.g:227:1: ruleModelDeclaration returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= ruleModel ) ) ) ;
    public final EObject ruleModelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:233:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= ruleModel ) ) ) )
            // InternalSWEUIBK.g:234:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleModel ) ) )
            {
            // InternalSWEUIBK.g:234:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleModel ) ) )
            // InternalSWEUIBK.g:235:3: otherlv_0= 'Model' ( (lv_name_1_0= ruleModel ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelDeclarationAccess().getModelKeyword_0());
            		
            // InternalSWEUIBK.g:239:3: ( (lv_name_1_0= ruleModel ) )
            // InternalSWEUIBK.g:240:4: (lv_name_1_0= ruleModel )
            {
            // InternalSWEUIBK.g:240:4: (lv_name_1_0= ruleModel )
            // InternalSWEUIBK.g:241:5: lv_name_1_0= ruleModel
            {

            					newCompositeNode(grammarAccess.getModelDeclarationAccess().getNameModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.SWEUIBK.Model");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleAnalyzerDeclaration"
    // InternalSWEUIBK.g:262:1: entryRuleAnalyzerDeclaration returns [EObject current=null] : iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF ;
    public final EObject entryRuleAnalyzerDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerDeclaration = null;


        try {
            // InternalSWEUIBK.g:262:60: (iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF )
            // InternalSWEUIBK.g:263:2: iv_ruleAnalyzerDeclaration= ruleAnalyzerDeclaration EOF
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
    // InternalSWEUIBK.g:269:1: ruleAnalyzerDeclaration returns [EObject current=null] : (otherlv_0= 'Analyzer' ( (lv_name_1_0= ruleAnalyzer ) ) ) ;
    public final EObject ruleAnalyzerDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:275:2: ( (otherlv_0= 'Analyzer' ( (lv_name_1_0= ruleAnalyzer ) ) ) )
            // InternalSWEUIBK.g:276:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= ruleAnalyzer ) ) )
            {
            // InternalSWEUIBK.g:276:2: (otherlv_0= 'Analyzer' ( (lv_name_1_0= ruleAnalyzer ) ) )
            // InternalSWEUIBK.g:277:3: otherlv_0= 'Analyzer' ( (lv_name_1_0= ruleAnalyzer ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAnalyzerDeclarationAccess().getAnalyzerKeyword_0());
            		
            // InternalSWEUIBK.g:281:3: ( (lv_name_1_0= ruleAnalyzer ) )
            // InternalSWEUIBK.g:282:4: (lv_name_1_0= ruleAnalyzer )
            {
            // InternalSWEUIBK.g:282:4: (lv_name_1_0= ruleAnalyzer )
            // InternalSWEUIBK.g:283:5: lv_name_1_0= ruleAnalyzer
            {

            					newCompositeNode(grammarAccess.getAnalyzerDeclarationAccess().getNameAnalyzerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleAnalyzer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnalyzerDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.SWEUIBK.Analyzer");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAnalyzerDeclaration"


    // $ANTLR start "entryRuleMonitorDeclaration"
    // InternalSWEUIBK.g:304:1: entryRuleMonitorDeclaration returns [EObject current=null] : iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF ;
    public final EObject entryRuleMonitorDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorDeclaration = null;


        try {
            // InternalSWEUIBK.g:304:59: (iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF )
            // InternalSWEUIBK.g:305:2: iv_ruleMonitorDeclaration= ruleMonitorDeclaration EOF
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
    // InternalSWEUIBK.g:311:1: ruleMonitorDeclaration returns [EObject current=null] : (otherlv_0= 'Monitor' ( (lv_name_1_0= ruleMonitor ) ) ( (lv_url_2_0= ruleMonitorInitialization ) ) ) ;
    public final EObject ruleMonitorDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_url_2_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:317:2: ( (otherlv_0= 'Monitor' ( (lv_name_1_0= ruleMonitor ) ) ( (lv_url_2_0= ruleMonitorInitialization ) ) ) )
            // InternalSWEUIBK.g:318:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= ruleMonitor ) ) ( (lv_url_2_0= ruleMonitorInitialization ) ) )
            {
            // InternalSWEUIBK.g:318:2: (otherlv_0= 'Monitor' ( (lv_name_1_0= ruleMonitor ) ) ( (lv_url_2_0= ruleMonitorInitialization ) ) )
            // InternalSWEUIBK.g:319:3: otherlv_0= 'Monitor' ( (lv_name_1_0= ruleMonitor ) ) ( (lv_url_2_0= ruleMonitorInitialization ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitorDeclarationAccess().getMonitorKeyword_0());
            		
            // InternalSWEUIBK.g:323:3: ( (lv_name_1_0= ruleMonitor ) )
            // InternalSWEUIBK.g:324:4: (lv_name_1_0= ruleMonitor )
            {
            // InternalSWEUIBK.g:324:4: (lv_name_1_0= ruleMonitor )
            // InternalSWEUIBK.g:325:5: lv_name_1_0= ruleMonitor
            {

            					newCompositeNode(grammarAccess.getMonitorDeclarationAccess().getNameMonitorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleMonitor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitorDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.SWEUIBK.Monitor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSWEUIBK.g:342:3: ( (lv_url_2_0= ruleMonitorInitialization ) )
            // InternalSWEUIBK.g:343:4: (lv_url_2_0= ruleMonitorInitialization )
            {
            // InternalSWEUIBK.g:343:4: (lv_url_2_0= ruleMonitorInitialization )
            // InternalSWEUIBK.g:344:5: lv_url_2_0= ruleMonitorInitialization
            {

            					newCompositeNode(grammarAccess.getMonitorDeclarationAccess().getUrlMonitorInitializationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_2_0=ruleMonitorInitialization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitorDeclarationRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.xtext.example.mydsl.SWEUIBK.MonitorInitialization");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMonitorDeclaration"


    // $ANTLR start "entryRulePageDeclaration"
    // InternalSWEUIBK.g:365:1: entryRulePageDeclaration returns [EObject current=null] : iv_rulePageDeclaration= rulePageDeclaration EOF ;
    public final EObject entryRulePageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageDeclaration = null;


        try {
            // InternalSWEUIBK.g:365:56: (iv_rulePageDeclaration= rulePageDeclaration EOF )
            // InternalSWEUIBK.g:366:2: iv_rulePageDeclaration= rulePageDeclaration EOF
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
    // InternalSWEUIBK.g:372:1: rulePageDeclaration returns [EObject current=null] : (otherlv_0= 'Page' ( (lv_name_1_0= rulePage ) ) ) ;
    public final EObject rulePageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:378:2: ( (otherlv_0= 'Page' ( (lv_name_1_0= rulePage ) ) ) )
            // InternalSWEUIBK.g:379:2: (otherlv_0= 'Page' ( (lv_name_1_0= rulePage ) ) )
            {
            // InternalSWEUIBK.g:379:2: (otherlv_0= 'Page' ( (lv_name_1_0= rulePage ) ) )
            // InternalSWEUIBK.g:380:3: otherlv_0= 'Page' ( (lv_name_1_0= rulePage ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPageDeclarationAccess().getPageKeyword_0());
            		
            // InternalSWEUIBK.g:384:3: ( (lv_name_1_0= rulePage ) )
            // InternalSWEUIBK.g:385:4: (lv_name_1_0= rulePage )
            {
            // InternalSWEUIBK.g:385:4: (lv_name_1_0= rulePage )
            // InternalSWEUIBK.g:386:5: lv_name_1_0= rulePage
            {

            					newCompositeNode(grammarAccess.getPageDeclarationAccess().getNamePageParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=rulePage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.SWEUIBK.Page");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleAnalyzer"
    // InternalSWEUIBK.g:407:1: entryRuleAnalyzer returns [EObject current=null] : iv_ruleAnalyzer= ruleAnalyzer EOF ;
    public final EObject entryRuleAnalyzer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzer = null;


        try {
            // InternalSWEUIBK.g:407:49: (iv_ruleAnalyzer= ruleAnalyzer EOF )
            // InternalSWEUIBK.g:408:2: iv_ruleAnalyzer= ruleAnalyzer EOF
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
    // InternalSWEUIBK.g:414:1: ruleAnalyzer returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAnalyzer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:420:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:421:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSWEUIBK.g:421:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:422:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:422:3: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:423:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleModel"
    // InternalSWEUIBK.g:442:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSWEUIBK.g:442:46: (iv_ruleModel= ruleModel EOF )
            // InternalSWEUIBK.g:443:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSWEUIBK.g:449:1: ruleModel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:455:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:456:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSWEUIBK.g:456:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:457:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:457:3: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:458:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMonitor"
    // InternalSWEUIBK.g:477:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // InternalSWEUIBK.g:477:48: (iv_ruleMonitor= ruleMonitor EOF )
            // InternalSWEUIBK.g:478:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalSWEUIBK.g:484:1: ruleMonitor returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:490:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:491:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSWEUIBK.g:491:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:492:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:492:3: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:493:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonitorRule());
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
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "entryRulePage"
    // InternalSWEUIBK.g:512:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalSWEUIBK.g:512:45: (iv_rulePage= rulePage EOF )
            // InternalSWEUIBK.g:513:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalSWEUIBK.g:519:1: rulePage returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSWEUIBK.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSWEUIBK.g:526:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:527:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:527:3: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:528:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPageRule());
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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleMonitorInitialization"
    // InternalSWEUIBK.g:547:1: entryRuleMonitorInitialization returns [EObject current=null] : iv_ruleMonitorInitialization= ruleMonitorInitialization EOF ;
    public final EObject entryRuleMonitorInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorInitialization = null;


        try {
            // InternalSWEUIBK.g:547:62: (iv_ruleMonitorInitialization= ruleMonitorInitialization EOF )
            // InternalSWEUIBK.g:548:2: iv_ruleMonitorInitialization= ruleMonitorInitialization EOF
            {
             newCompositeNode(grammarAccess.getMonitorInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitorInitialization=ruleMonitorInitialization();

            state._fsp--;

             current =iv_ruleMonitorInitialization; 
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
    // InternalSWEUIBK.g:554:1: ruleMonitorInitialization returns [EObject current=null] : ( (lv_url_0_0= RULE_STRING ) ) ;
    public final EObject ruleMonitorInitialization() throws RecognitionException {
        EObject current = null;

        Token lv_url_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:560:2: ( ( (lv_url_0_0= RULE_STRING ) ) )
            // InternalSWEUIBK.g:561:2: ( (lv_url_0_0= RULE_STRING ) )
            {
            // InternalSWEUIBK.g:561:2: ( (lv_url_0_0= RULE_STRING ) )
            // InternalSWEUIBK.g:562:3: (lv_url_0_0= RULE_STRING )
            {
            // InternalSWEUIBK.g:562:3: (lv_url_0_0= RULE_STRING )
            // InternalSWEUIBK.g:563:4: lv_url_0_0= RULE_STRING
            {
            lv_url_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_url_0_0, grammarAccess.getMonitorInitializationAccess().getUrlSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMonitorInitializationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"url",
            					lv_url_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleMonitorInitialization"


    // $ANTLR start "entryRuleObjectAction"
    // InternalSWEUIBK.g:582:1: entryRuleObjectAction returns [EObject current=null] : iv_ruleObjectAction= ruleObjectAction EOF ;
    public final EObject entryRuleObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAction = null;


        try {
            // InternalSWEUIBK.g:582:53: (iv_ruleObjectAction= ruleObjectAction EOF )
            // InternalSWEUIBK.g:583:2: iv_ruleObjectAction= ruleObjectAction EOF
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
    // InternalSWEUIBK.g:589:1: ruleObjectAction returns [EObject current=null] : ( ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) ) | ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) ) | ( (lv_pageAction_2_0= rulePageObjectAction ) ) | ( (lv_modelAction_3_0= ruleModelAction ) ) ) ;
    public final EObject ruleObjectAction() throws RecognitionException {
        EObject current = null;

        EObject lv_monitorAction_0_0 = null;

        EObject lv_analyzerAction_1_0 = null;

        EObject lv_pageAction_2_0 = null;

        EObject lv_modelAction_3_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:595:2: ( ( ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) ) | ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) ) | ( (lv_pageAction_2_0= rulePageObjectAction ) ) | ( (lv_modelAction_3_0= ruleModelAction ) ) ) )
            // InternalSWEUIBK.g:596:2: ( ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) ) | ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) ) | ( (lv_pageAction_2_0= rulePageObjectAction ) ) | ( (lv_modelAction_3_0= ruleModelAction ) ) )
            {
            // InternalSWEUIBK.g:596:2: ( ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) ) | ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) ) | ( (lv_pageAction_2_0= rulePageObjectAction ) ) | ( (lv_modelAction_3_0= ruleModelAction ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    switch ( input.LA(3) ) {
                    case 21:
                    case 22:
                        {
                        alt4=1;
                        }
                        break;
                    case 19:
                    case 20:
                    case 26:
                        {
                        alt4=3;
                        }
                        break;
                    case 16:
                        {
                        alt4=4;
                        }
                        break;
                    case 23:
                    case 24:
                    case 25:
                        {
                        alt4=2;
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
                    // InternalSWEUIBK.g:597:3: ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) )
                    {
                    // InternalSWEUIBK.g:597:3: ( (lv_monitorAction_0_0= ruleMonitorObjectAction ) )
                    // InternalSWEUIBK.g:598:4: (lv_monitorAction_0_0= ruleMonitorObjectAction )
                    {
                    // InternalSWEUIBK.g:598:4: (lv_monitorAction_0_0= ruleMonitorObjectAction )
                    // InternalSWEUIBK.g:599:5: lv_monitorAction_0_0= ruleMonitorObjectAction
                    {

                    					newCompositeNode(grammarAccess.getObjectActionAccess().getMonitorActionMonitorObjectActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_monitorAction_0_0=ruleMonitorObjectAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"monitorAction",
                    						lv_monitorAction_0_0,
                    						"org.xtext.example.mydsl.SWEUIBK.MonitorObjectAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:617:3: ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) )
                    {
                    // InternalSWEUIBK.g:617:3: ( (lv_analyzerAction_1_0= ruleAnalyzerObjectAction ) )
                    // InternalSWEUIBK.g:618:4: (lv_analyzerAction_1_0= ruleAnalyzerObjectAction )
                    {
                    // InternalSWEUIBK.g:618:4: (lv_analyzerAction_1_0= ruleAnalyzerObjectAction )
                    // InternalSWEUIBK.g:619:5: lv_analyzerAction_1_0= ruleAnalyzerObjectAction
                    {

                    					newCompositeNode(grammarAccess.getObjectActionAccess().getAnalyzerActionAnalyzerObjectActionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_analyzerAction_1_0=ruleAnalyzerObjectAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"analyzerAction",
                    						lv_analyzerAction_1_0,
                    						"org.xtext.example.mydsl.SWEUIBK.AnalyzerObjectAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:637:3: ( (lv_pageAction_2_0= rulePageObjectAction ) )
                    {
                    // InternalSWEUIBK.g:637:3: ( (lv_pageAction_2_0= rulePageObjectAction ) )
                    // InternalSWEUIBK.g:638:4: (lv_pageAction_2_0= rulePageObjectAction )
                    {
                    // InternalSWEUIBK.g:638:4: (lv_pageAction_2_0= rulePageObjectAction )
                    // InternalSWEUIBK.g:639:5: lv_pageAction_2_0= rulePageObjectAction
                    {

                    					newCompositeNode(grammarAccess.getObjectActionAccess().getPageActionPageObjectActionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pageAction_2_0=rulePageObjectAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"pageAction",
                    						lv_pageAction_2_0,
                    						"org.xtext.example.mydsl.SWEUIBK.PageObjectAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSWEUIBK.g:657:3: ( (lv_modelAction_3_0= ruleModelAction ) )
                    {
                    // InternalSWEUIBK.g:657:3: ( (lv_modelAction_3_0= ruleModelAction ) )
                    // InternalSWEUIBK.g:658:4: (lv_modelAction_3_0= ruleModelAction )
                    {
                    // InternalSWEUIBK.g:658:4: (lv_modelAction_3_0= ruleModelAction )
                    // InternalSWEUIBK.g:659:5: lv_modelAction_3_0= ruleModelAction
                    {

                    					newCompositeNode(grammarAccess.getObjectActionAccess().getModelActionModelActionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_modelAction_3_0=ruleModelAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectActionRule());
                    					}
                    					set(
                    						current,
                    						"modelAction",
                    						lv_modelAction_3_0,
                    						"org.xtext.example.mydsl.SWEUIBK.ModelAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleObjectAction"


    // $ANTLR start "entryRuleModelAction"
    // InternalSWEUIBK.g:680:1: entryRuleModelAction returns [EObject current=null] : iv_ruleModelAction= ruleModelAction EOF ;
    public final EObject entryRuleModelAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelAction = null;


        try {
            // InternalSWEUIBK.g:680:52: (iv_ruleModelAction= ruleModelAction EOF )
            // InternalSWEUIBK.g:681:2: iv_ruleModelAction= ruleModelAction EOF
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
    // InternalSWEUIBK.g:687:1: ruleModelAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( (lv_modelStructure_4_0= ruleModelStructure ) )+ otherlv_5= ')' ) ;
    public final EObject ruleModelAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_modelStructure_4_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:693:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( (lv_modelStructure_4_0= ruleModelStructure ) )+ otherlv_5= ')' ) )
            // InternalSWEUIBK.g:694:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( (lv_modelStructure_4_0= ruleModelStructure ) )+ otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:694:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( (lv_modelStructure_4_0= ruleModelStructure ) )+ otherlv_5= ')' )
            // InternalSWEUIBK.g:695:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'loadStructure' otherlv_3= '(' ( (lv_modelStructure_4_0= ruleModelStructure ) )+ otherlv_5= ')'
            {
            // InternalSWEUIBK.g:695:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:696:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:696:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:697:5: lv_name_0_0= RULE_ID
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
            		
            // InternalSWEUIBK.g:725:3: ( (lv_modelStructure_4_0= ruleModelStructure ) )+
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
            	    // InternalSWEUIBK.g:726:4: (lv_modelStructure_4_0= ruleModelStructure )
            	    {
            	    // InternalSWEUIBK.g:726:4: (lv_modelStructure_4_0= ruleModelStructure )
            	    // InternalSWEUIBK.g:727:5: lv_modelStructure_4_0= ruleModelStructure
            	    {

            	    					newCompositeNode(grammarAccess.getModelActionAccess().getModelStructureModelStructureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_modelStructure_4_0=ruleModelStructure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelActionRule());
            	    					}
            	    					set(
            	    						current,
            	    						"modelStructure",
            	    						lv_modelStructure_4_0,
            	    						"org.xtext.example.mydsl.SWEUIBK.ModelStructure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // InternalSWEUIBK.g:752:1: entryRuleModelStructure returns [EObject current=null] : iv_ruleModelStructure= ruleModelStructure EOF ;
    public final EObject entryRuleModelStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelStructure = null;


        try {
            // InternalSWEUIBK.g:752:55: (iv_ruleModelStructure= ruleModelStructure EOF )
            // InternalSWEUIBK.g:753:2: iv_ruleModelStructure= ruleModelStructure EOF
            {
             newCompositeNode(grammarAccess.getModelStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelStructure=ruleModelStructure();

            state._fsp--;

             current =iv_ruleModelStructure; 
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
    // InternalSWEUIBK.g:759:1: ruleModelStructure returns [EObject current=null] : ( (lv_source_0_0= RULE_STRING ) ) ;
    public final EObject ruleModelStructure() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:765:2: ( ( (lv_source_0_0= RULE_STRING ) ) )
            // InternalSWEUIBK.g:766:2: ( (lv_source_0_0= RULE_STRING ) )
            {
            // InternalSWEUIBK.g:766:2: ( (lv_source_0_0= RULE_STRING ) )
            // InternalSWEUIBK.g:767:3: (lv_source_0_0= RULE_STRING )
            {
            // InternalSWEUIBK.g:767:3: (lv_source_0_0= RULE_STRING )
            // InternalSWEUIBK.g:768:4: lv_source_0_0= RULE_STRING
            {
            lv_source_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_source_0_0, grammarAccess.getModelStructureAccess().getSourceSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModelStructureRule());
            				}
            				setWithLastConsumed(
            					current,
            					"source",
            					lv_source_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleModelStructure"


    // $ANTLR start "entryRuleMonitorObjectAction"
    // InternalSWEUIBK.g:787:1: entryRuleMonitorObjectAction returns [EObject current=null] : iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF ;
    public final EObject entryRuleMonitorObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitorObjectAction = null;


        try {
            // InternalSWEUIBK.g:787:60: (iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF )
            // InternalSWEUIBK.g:788:2: iv_ruleMonitorObjectAction= ruleMonitorObjectAction EOF
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
    // InternalSWEUIBK.g:794:1: ruleMonitorObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' ) ;
    public final EObject ruleMonitorObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:800:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalSWEUIBK.g:801:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:801:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' )
            // InternalSWEUIBK.g:802:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleMonitorOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')'
            {
            // InternalSWEUIBK.g:802:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:803:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:803:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:804:5: lv_name_0_0= RULE_ID
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
            		
            // InternalSWEUIBK.g:824:3: ( (lv_value_2_0= ruleMonitorOperations ) )
            // InternalSWEUIBK.g:825:4: (lv_value_2_0= ruleMonitorOperations )
            {
            // InternalSWEUIBK.g:825:4: (lv_value_2_0= ruleMonitorOperations )
            // InternalSWEUIBK.g:826:5: lv_value_2_0= ruleMonitorOperations
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

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitorObjectActionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSWEUIBK.g:847:3: ( (lv_method_4_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSWEUIBK.g:848:4: (lv_method_4_0= RULE_ID )
                    {
                    // InternalSWEUIBK.g:848:4: (lv_method_4_0= RULE_ID )
                    // InternalSWEUIBK.g:849:5: lv_method_4_0= RULE_ID
                    {
                    lv_method_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    					newLeafNode(lv_method_4_0, grammarAccess.getMonitorObjectActionAccess().getMethodIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMonitorObjectActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"method",
                    						lv_method_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // InternalSWEUIBK.g:873:1: entryRuleAnalyzerObjectAction returns [EObject current=null] : iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF ;
    public final EObject entryRuleAnalyzerObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnalyzerObjectAction = null;


        try {
            // InternalSWEUIBK.g:873:61: (iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF )
            // InternalSWEUIBK.g:874:2: iv_ruleAnalyzerObjectAction= ruleAnalyzerObjectAction EOF
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
    // InternalSWEUIBK.g:880:1: ruleAnalyzerObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' ) ;
    public final EObject ruleAnalyzerObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:886:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalSWEUIBK.g:887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalSWEUIBK.g:887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')' )
            // InternalSWEUIBK.g:888:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_value_2_0= ruleAnalyzerOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_ID ) )? otherlv_5= ')'
            {
            // InternalSWEUIBK.g:888:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:889:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:889:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:890:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAnalyzerObjectActionAccess().getFullStopKeyword_1());
            		
            // InternalSWEUIBK.g:910:3: ( (lv_value_2_0= ruleAnalyzerOperations ) )
            // InternalSWEUIBK.g:911:4: (lv_value_2_0= ruleAnalyzerOperations )
            {
            // InternalSWEUIBK.g:911:4: (lv_value_2_0= ruleAnalyzerOperations )
            // InternalSWEUIBK.g:912:5: lv_value_2_0= ruleAnalyzerOperations
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

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAnalyzerObjectActionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSWEUIBK.g:933:3: ( (lv_method_4_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSWEUIBK.g:934:4: (lv_method_4_0= RULE_ID )
                    {
                    // InternalSWEUIBK.g:934:4: (lv_method_4_0= RULE_ID )
                    // InternalSWEUIBK.g:935:5: lv_method_4_0= RULE_ID
                    {
                    lv_method_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    					newLeafNode(lv_method_4_0, grammarAccess.getAnalyzerObjectActionAccess().getMethodIDTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAnalyzerObjectActionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"method",
                    						lv_method_4_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // InternalSWEUIBK.g:959:1: entryRulePageObjectAction returns [EObject current=null] : iv_rulePageObjectAction= rulePageObjectAction EOF ;
    public final EObject entryRulePageObjectAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageObjectAction = null;


        try {
            // InternalSWEUIBK.g:959:57: (iv_rulePageObjectAction= rulePageObjectAction EOF )
            // InternalSWEUIBK.g:960:2: iv_rulePageObjectAction= rulePageObjectAction EOF
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
    // InternalSWEUIBK.g:966:1: rulePageObjectAction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) ) ) ;
    public final EObject rulePageObjectAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_value_2_0 = null;

        EObject lv_headerList_6_0 = null;

        EObject lv_setConnectionType_7_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:972:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) ) ) )
            // InternalSWEUIBK.g:973:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) ) )
            {
            // InternalSWEUIBK.g:973:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) ) )
            // InternalSWEUIBK.g:974:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) )
            {
            // InternalSWEUIBK.g:974:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSWEUIBK.g:975:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSWEUIBK.g:975:4: (lv_name_0_0= RULE_ID )
            // InternalSWEUIBK.g:976:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPageObjectActionAccess().getFullStopKeyword_1());
            		
            // InternalSWEUIBK.g:996:3: ( ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' ) | ( (lv_headerList_6_0= ruleGenerateHeader ) ) | ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSWEUIBK.g:997:4: ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' )
                    {
                    // InternalSWEUIBK.g:997:4: ( ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')' )
                    // InternalSWEUIBK.g:998:5: ( (lv_value_2_0= rulePageOperations ) ) otherlv_3= '(' ( (lv_method_4_0= RULE_STRING ) )? otherlv_5= ')'
                    {
                    // InternalSWEUIBK.g:998:5: ( (lv_value_2_0= rulePageOperations ) )
                    // InternalSWEUIBK.g:999:6: (lv_value_2_0= rulePageOperations )
                    {
                    // InternalSWEUIBK.g:999:6: (lv_value_2_0= rulePageOperations )
                    // InternalSWEUIBK.g:1000:7: lv_value_2_0= rulePageOperations
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
                    				
                    // InternalSWEUIBK.g:1021:5: ( (lv_method_4_0= RULE_STRING ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_STRING) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSWEUIBK.g:1022:6: (lv_method_4_0= RULE_STRING )
                            {
                            // InternalSWEUIBK.g:1022:6: (lv_method_4_0= RULE_STRING )
                            // InternalSWEUIBK.g:1023:7: lv_method_4_0= RULE_STRING
                            {
                            lv_method_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                            							newLeafNode(lv_method_4_0, grammarAccess.getPageObjectActionAccess().getMethodSTRINGTerminalRuleCall_2_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPageObjectActionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"method",
                            								lv_method_4_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

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
                    // InternalSWEUIBK.g:1045:4: ( (lv_headerList_6_0= ruleGenerateHeader ) )
                    {
                    // InternalSWEUIBK.g:1045:4: ( (lv_headerList_6_0= ruleGenerateHeader ) )
                    // InternalSWEUIBK.g:1046:5: (lv_headerList_6_0= ruleGenerateHeader )
                    {
                    // InternalSWEUIBK.g:1046:5: (lv_headerList_6_0= ruleGenerateHeader )
                    // InternalSWEUIBK.g:1047:6: lv_headerList_6_0= ruleGenerateHeader
                    {

                    						newCompositeNode(grammarAccess.getPageObjectActionAccess().getHeaderListGenerateHeaderParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_headerList_6_0=ruleGenerateHeader();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
                    						}
                    						set(
                    							current,
                    							"headerList",
                    							lv_headerList_6_0,
                    							"org.xtext.example.mydsl.SWEUIBK.GenerateHeader");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:1065:4: ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) )
                    {
                    // InternalSWEUIBK.g:1065:4: ( (lv_setConnectionType_7_0= ruleSetConnecttionType ) )
                    // InternalSWEUIBK.g:1066:5: (lv_setConnectionType_7_0= ruleSetConnecttionType )
                    {
                    // InternalSWEUIBK.g:1066:5: (lv_setConnectionType_7_0= ruleSetConnecttionType )
                    // InternalSWEUIBK.g:1067:6: lv_setConnectionType_7_0= ruleSetConnecttionType
                    {

                    						newCompositeNode(grammarAccess.getPageObjectActionAccess().getSetConnectionTypeSetConnecttionTypeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_setConnectionType_7_0=ruleSetConnecttionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageObjectActionRule());
                    						}
                    						set(
                    							current,
                    							"setConnectionType",
                    							lv_setConnectionType_7_0,
                    							"org.xtext.example.mydsl.SWEUIBK.SetConnecttionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // InternalSWEUIBK.g:1089:1: entryRuleGenerateHeader returns [EObject current=null] : iv_ruleGenerateHeader= ruleGenerateHeader EOF ;
    public final EObject entryRuleGenerateHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateHeader = null;


        try {
            // InternalSWEUIBK.g:1089:55: (iv_ruleGenerateHeader= ruleGenerateHeader EOF )
            // InternalSWEUIBK.g:1090:2: iv_ruleGenerateHeader= ruleGenerateHeader EOF
            {
             newCompositeNode(grammarAccess.getGenerateHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerateHeader=ruleGenerateHeader();

            state._fsp--;

             current =iv_ruleGenerateHeader; 
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
    // InternalSWEUIBK.g:1096:1: ruleGenerateHeader returns [EObject current=null] : (otherlv_0= 'generateHeaderList' otherlv_1= '(' ( (lv_header_2_0= ruleHeader ) )* otherlv_3= ')' ) ;
    public final EObject ruleGenerateHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_header_2_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:1102:2: ( (otherlv_0= 'generateHeaderList' otherlv_1= '(' ( (lv_header_2_0= ruleHeader ) )* otherlv_3= ')' ) )
            // InternalSWEUIBK.g:1103:2: (otherlv_0= 'generateHeaderList' otherlv_1= '(' ( (lv_header_2_0= ruleHeader ) )* otherlv_3= ')' )
            {
            // InternalSWEUIBK.g:1103:2: (otherlv_0= 'generateHeaderList' otherlv_1= '(' ( (lv_header_2_0= ruleHeader ) )* otherlv_3= ')' )
            // InternalSWEUIBK.g:1104:3: otherlv_0= 'generateHeaderList' otherlv_1= '(' ( (lv_header_2_0= ruleHeader ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerateHeaderAccess().getGenerateHeaderListKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGenerateHeaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSWEUIBK.g:1112:3: ( (lv_header_2_0= ruleHeader ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSWEUIBK.g:1113:4: (lv_header_2_0= ruleHeader )
            	    {
            	    // InternalSWEUIBK.g:1113:4: (lv_header_2_0= ruleHeader )
            	    // InternalSWEUIBK.g:1114:5: lv_header_2_0= ruleHeader
            	    {

            	    					newCompositeNode(grammarAccess.getGenerateHeaderAccess().getHeaderHeaderParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_header_2_0=ruleHeader();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenerateHeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"header",
            	    						lv_header_2_0,
            	    						"org.xtext.example.mydsl.SWEUIBK.Header");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGenerateHeaderAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleSetConnecttionType"
    // InternalSWEUIBK.g:1139:1: entryRuleSetConnecttionType returns [EObject current=null] : iv_ruleSetConnecttionType= ruleSetConnecttionType EOF ;
    public final EObject entryRuleSetConnecttionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetConnecttionType = null;


        try {
            // InternalSWEUIBK.g:1139:59: (iv_ruleSetConnecttionType= ruleSetConnecttionType EOF )
            // InternalSWEUIBK.g:1140:2: iv_ruleSetConnecttionType= ruleSetConnecttionType EOF
            {
             newCompositeNode(grammarAccess.getSetConnecttionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetConnecttionType=ruleSetConnecttionType();

            state._fsp--;

             current =iv_ruleSetConnecttionType; 
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
    // $ANTLR end "entryRuleSetConnecttionType"


    // $ANTLR start "ruleSetConnecttionType"
    // InternalSWEUIBK.g:1146:1: ruleSetConnecttionType returns [EObject current=null] : (otherlv_0= 'connectType' otherlv_1= '(' ( (lv_type_2_0= ruleConnectionType ) ) otherlv_3= ')' ) ;
    public final EObject ruleSetConnecttionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalSWEUIBK.g:1152:2: ( (otherlv_0= 'connectType' otherlv_1= '(' ( (lv_type_2_0= ruleConnectionType ) ) otherlv_3= ')' ) )
            // InternalSWEUIBK.g:1153:2: (otherlv_0= 'connectType' otherlv_1= '(' ( (lv_type_2_0= ruleConnectionType ) ) otherlv_3= ')' )
            {
            // InternalSWEUIBK.g:1153:2: (otherlv_0= 'connectType' otherlv_1= '(' ( (lv_type_2_0= ruleConnectionType ) ) otherlv_3= ')' )
            // InternalSWEUIBK.g:1154:3: otherlv_0= 'connectType' otherlv_1= '(' ( (lv_type_2_0= ruleConnectionType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSetConnecttionTypeAccess().getConnectTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSetConnecttionTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSWEUIBK.g:1162:3: ( (lv_type_2_0= ruleConnectionType ) )
            // InternalSWEUIBK.g:1163:4: (lv_type_2_0= ruleConnectionType )
            {
            // InternalSWEUIBK.g:1163:4: (lv_type_2_0= ruleConnectionType )
            // InternalSWEUIBK.g:1164:5: lv_type_2_0= ruleConnectionType
            {

            					newCompositeNode(grammarAccess.getSetConnecttionTypeAccess().getTypeConnectionTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_2_0=ruleConnectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetConnecttionTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.SWEUIBK.ConnectionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSetConnecttionTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSetConnecttionType"


    // $ANTLR start "entryRuleHeader"
    // InternalSWEUIBK.g:1189:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalSWEUIBK.g:1189:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalSWEUIBK.g:1190:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
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
    // InternalSWEUIBK.g:1196:1: ruleHeader returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_headerValue_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_headerValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:1202:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_headerValue_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalSWEUIBK.g:1203:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_headerValue_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalSWEUIBK.g:1203:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_headerValue_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalSWEUIBK.g:1204:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '(' ( (lv_headerValue_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalSWEUIBK.g:1204:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalSWEUIBK.g:1205:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalSWEUIBK.g:1205:4: (lv_key_0_0= RULE_STRING )
            // InternalSWEUIBK.g:1206:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_key_0_0, grammarAccess.getHeaderAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSWEUIBK.g:1226:3: ( (lv_headerValue_2_0= RULE_STRING ) )
            // InternalSWEUIBK.g:1227:4: (lv_headerValue_2_0= RULE_STRING )
            {
            // InternalSWEUIBK.g:1227:4: (lv_headerValue_2_0= RULE_STRING )
            // InternalSWEUIBK.g:1228:5: lv_headerValue_2_0= RULE_STRING
            {
            lv_headerValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_headerValue_2_0, grammarAccess.getHeaderAccess().getHeaderValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"headerValue",
            						lv_headerValue_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "ruleMonitorOperations"
    // InternalSWEUIBK.g:1252:1: ruleMonitorOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) ) ;
    public final Enumerator ruleMonitorOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:1258:2: ( ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) ) )
            // InternalSWEUIBK.g:1259:2: ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) )
            {
            // InternalSWEUIBK.g:1259:2: ( (enumLiteral_0= 'AddAnalyzer' ) | (enumLiteral_1= 'RemoveAnalyzer' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSWEUIBK.g:1260:3: (enumLiteral_0= 'AddAnalyzer' )
                    {
                    // InternalSWEUIBK.g:1260:3: (enumLiteral_0= 'AddAnalyzer' )
                    // InternalSWEUIBK.g:1261:4: enumLiteral_0= 'AddAnalyzer'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMonitorOperationsAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:1268:3: (enumLiteral_1= 'RemoveAnalyzer' )
                    {
                    // InternalSWEUIBK.g:1268:3: (enumLiteral_1= 'RemoveAnalyzer' )
                    // InternalSWEUIBK.g:1269:4: enumLiteral_1= 'RemoveAnalyzer'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalSWEUIBK.g:1279:1: ruleAnalyzerOperations returns [Enumerator current=null] : ( (enumLiteral_0= 'Execute' ) | (enumLiteral_1= 'LoadPage' ) | (enumLiteral_2= 'LoadModel' ) ) ;
    public final Enumerator ruleAnalyzerOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:1285:2: ( ( (enumLiteral_0= 'Execute' ) | (enumLiteral_1= 'LoadPage' ) | (enumLiteral_2= 'LoadModel' ) ) )
            // InternalSWEUIBK.g:1286:2: ( (enumLiteral_0= 'Execute' ) | (enumLiteral_1= 'LoadPage' ) | (enumLiteral_2= 'LoadModel' ) )
            {
            // InternalSWEUIBK.g:1286:2: ( (enumLiteral_0= 'Execute' ) | (enumLiteral_1= 'LoadPage' ) | (enumLiteral_2= 'LoadModel' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSWEUIBK.g:1287:3: (enumLiteral_0= 'Execute' )
                    {
                    // InternalSWEUIBK.g:1287:3: (enumLiteral_0= 'Execute' )
                    // InternalSWEUIBK.g:1288:4: enumLiteral_0= 'Execute'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAnalyzerOperationsAccess().getEXECUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:1295:3: (enumLiteral_1= 'LoadPage' )
                    {
                    // InternalSWEUIBK.g:1295:3: (enumLiteral_1= 'LoadPage' )
                    // InternalSWEUIBK.g:1296:4: enumLiteral_1= 'LoadPage'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAnalyzerOperationsAccess().getLOADPAGEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSWEUIBK.g:1303:3: (enumLiteral_2= 'LoadModel' )
                    {
                    // InternalSWEUIBK.g:1303:3: (enumLiteral_2= 'LoadModel' )
                    // InternalSWEUIBK.g:1304:4: enumLiteral_2= 'LoadModel'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAnalyzerOperationsAccess().getLOADMODELEnumLiteralDeclaration_2());
                    			

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
    // InternalSWEUIBK.g:1314:1: rulePageOperations returns [Enumerator current=null] : (enumLiteral_0= 'url' ) ;
    public final Enumerator rulePageOperations() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:1320:2: ( (enumLiteral_0= 'url' ) )
            // InternalSWEUIBK.g:1321:2: (enumLiteral_0= 'url' )
            {
            // InternalSWEUIBK.g:1321:2: (enumLiteral_0= 'url' )
            // InternalSWEUIBK.g:1322:3: enumLiteral_0= 'url'
            {
            enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

            			current = grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getPageOperationsAccess().getURLEnumLiteralDeclaration());
            		

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


    // $ANTLR start "ruleConnectionType"
    // InternalSWEUIBK.g:1331:1: ruleConnectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'post' ) | (enumLiteral_1= 'get' ) ) ;
    public final Enumerator ruleConnectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSWEUIBK.g:1337:2: ( ( (enumLiteral_0= 'post' ) | (enumLiteral_1= 'get' ) ) )
            // InternalSWEUIBK.g:1338:2: ( (enumLiteral_0= 'post' ) | (enumLiteral_1= 'get' ) )
            {
            // InternalSWEUIBK.g:1338:2: ( (enumLiteral_0= 'post' ) | (enumLiteral_1= 'get' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSWEUIBK.g:1339:3: (enumLiteral_0= 'post' )
                    {
                    // InternalSWEUIBK.g:1339:3: (enumLiteral_0= 'post' )
                    // InternalSWEUIBK.g:1340:4: enumLiteral_0= 'post'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getConnectionTypeAccess().getPOSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConnectionTypeAccess().getPOSTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSWEUIBK.g:1347:3: (enumLiteral_1= 'get' )
                    {
                    // InternalSWEUIBK.g:1347:3: (enumLiteral_1= 'get' )
                    // InternalSWEUIBK.g:1348:4: enumLiteral_1= 'get'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getConnectionTypeAccess().getGETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConnectionTypeAccess().getGETEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleConnectionType"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});

}