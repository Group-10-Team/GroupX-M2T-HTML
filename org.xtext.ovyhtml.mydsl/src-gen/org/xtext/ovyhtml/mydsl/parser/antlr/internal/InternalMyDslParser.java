package org.xtext.ovyhtml.mydsl.parser.antlr.internal;

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
import org.xtext.ovyhtml.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'HTML'", "'{'", "'balise'", "','", "'}'", "'Balise'", "'nom'", "'attribut'", "'Attribut'", "'nom_attr'", "'contenu'", "'Titre'", "'H1'", "'H2'", "'H3'", "'H4'", "'P'", "'span'", "'div'", "'class'", "'id'", "'src'", "'href'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HTML";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHTML"
    // InternalMyDsl.g:65:1: entryRuleHTML returns [EObject current=null] : iv_ruleHTML= ruleHTML EOF ;
    public final EObject entryRuleHTML() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHTML = null;


        try {
            // InternalMyDsl.g:65:45: (iv_ruleHTML= ruleHTML EOF )
            // InternalMyDsl.g:66:2: iv_ruleHTML= ruleHTML EOF
            {
             newCompositeNode(grammarAccess.getHTMLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHTML=ruleHTML();

            state._fsp--;

             current =iv_ruleHTML; 
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
    // $ANTLR end "entryRuleHTML"


    // $ANTLR start "ruleHTML"
    // InternalMyDsl.g:72:1: ruleHTML returns [EObject current=null] : (otherlv_0= 'HTML' otherlv_1= '{' otherlv_2= 'balise' otherlv_3= '{' ( (lv_balise_4_0= ruleBalise ) ) (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleHTML() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_balise_4_0 = null;

        EObject lv_balise_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'HTML' otherlv_1= '{' otherlv_2= 'balise' otherlv_3= '{' ( (lv_balise_4_0= ruleBalise ) ) (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'HTML' otherlv_1= '{' otherlv_2= 'balise' otherlv_3= '{' ( (lv_balise_4_0= ruleBalise ) ) (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'HTML' otherlv_1= '{' otherlv_2= 'balise' otherlv_3= '{' ( (lv_balise_4_0= ruleBalise ) ) (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'HTML' otherlv_1= '{' otherlv_2= 'balise' otherlv_3= '{' ( (lv_balise_4_0= ruleBalise ) ) (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHTMLAccess().getHTMLKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getHTMLAccess().getBaliseKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:96:3: ( (lv_balise_4_0= ruleBalise ) )
            // InternalMyDsl.g:97:4: (lv_balise_4_0= ruleBalise )
            {
            // InternalMyDsl.g:97:4: (lv_balise_4_0= ruleBalise )
            // InternalMyDsl.g:98:5: lv_balise_4_0= ruleBalise
            {

            					newCompositeNode(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_balise_4_0=ruleBalise();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHTMLRule());
            					}
            					add(
            						current,
            						"balise",
            						lv_balise_4_0,
            						"org.xtext.ovyhtml.mydsl.MyDsl.Balise");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:115:3: (otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:116:4: otherlv_5= ',' ( (lv_balise_6_0= ruleBalise ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getHTMLAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMyDsl.g:120:4: ( (lv_balise_6_0= ruleBalise ) )
            	    // InternalMyDsl.g:121:5: (lv_balise_6_0= ruleBalise )
            	    {
            	    // InternalMyDsl.g:121:5: (lv_balise_6_0= ruleBalise )
            	    // InternalMyDsl.g:122:6: lv_balise_6_0= ruleBalise
            	    {

            	    						newCompositeNode(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_balise_6_0=ruleBalise();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHTMLRule());
            	    						}
            	    						add(
            	    							current,
            	    							"balise",
            	    							lv_balise_6_0,
            	    							"org.xtext.ovyhtml.mydsl.MyDsl.Balise");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleHTML"


    // $ANTLR start "entryRuleBalise"
    // InternalMyDsl.g:152:1: entryRuleBalise returns [EObject current=null] : iv_ruleBalise= ruleBalise EOF ;
    public final EObject entryRuleBalise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBalise = null;


        try {
            // InternalMyDsl.g:152:47: (iv_ruleBalise= ruleBalise EOF )
            // InternalMyDsl.g:153:2: iv_ruleBalise= ruleBalise EOF
            {
             newCompositeNode(grammarAccess.getBaliseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBalise=ruleBalise();

            state._fsp--;

             current =iv_ruleBalise; 
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
    // $ANTLR end "entryRuleBalise"


    // $ANTLR start "ruleBalise"
    // InternalMyDsl.g:159:1: ruleBalise returns [EObject current=null] : ( () otherlv_1= 'Balise' otherlv_2= '{' (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )? (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleBalise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Enumerator lv_nom_5_0 = null;

        Enumerator lv_nom_7_0 = null;

        EObject lv_balise_11_0 = null;

        EObject lv_balise_13_0 = null;

        EObject lv_attribut_17_0 = null;

        EObject lv_attribut_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:165:2: ( ( () otherlv_1= 'Balise' otherlv_2= '{' (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )? (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalMyDsl.g:166:2: ( () otherlv_1= 'Balise' otherlv_2= '{' (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )? (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalMyDsl.g:166:2: ( () otherlv_1= 'Balise' otherlv_2= '{' (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )? (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalMyDsl.g:167:3: () otherlv_1= 'Balise' otherlv_2= '{' (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )? (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalMyDsl.g:167:3: ()
            // InternalMyDsl.g:168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaliseAccess().getBaliseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaliseAccess().getBaliseKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:182:3: (otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:183:4: otherlv_3= 'nom' otherlv_4= '{' ( (lv_nom_5_0= ruleBalise_Type ) ) (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBaliseAccess().getNomKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:191:4: ( (lv_nom_5_0= ruleBalise_Type ) )
                    // InternalMyDsl.g:192:5: (lv_nom_5_0= ruleBalise_Type )
                    {
                    // InternalMyDsl.g:192:5: (lv_nom_5_0= ruleBalise_Type )
                    // InternalMyDsl.g:193:6: lv_nom_5_0= ruleBalise_Type
                    {

                    						newCompositeNode(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nom_5_0=ruleBalise_Type();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaliseRule());
                    						}
                    						add(
                    							current,
                    							"nom",
                    							lv_nom_5_0,
                    							"org.xtext.ovyhtml.mydsl.MyDsl.Balise_Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:210:4: (otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:211:5: otherlv_6= ',' ( (lv_nom_7_0= ruleBalise_Type ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBaliseAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:215:5: ( (lv_nom_7_0= ruleBalise_Type ) )
                    	    // InternalMyDsl.g:216:6: (lv_nom_7_0= ruleBalise_Type )
                    	    {
                    	    // InternalMyDsl.g:216:6: (lv_nom_7_0= ruleBalise_Type )
                    	    // InternalMyDsl.g:217:7: lv_nom_7_0= ruleBalise_Type
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_nom_7_0=ruleBalise_Type();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaliseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nom",
                    	    								lv_nom_7_0,
                    	    								"org.xtext.ovyhtml.mydsl.MyDsl.Balise_Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:240:3: (otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:241:4: otherlv_9= 'balise' otherlv_10= '{' ( (lv_balise_11_0= ruleBalise ) ) (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaliseAccess().getBaliseKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:249:4: ( (lv_balise_11_0= ruleBalise ) )
                    // InternalMyDsl.g:250:5: (lv_balise_11_0= ruleBalise )
                    {
                    // InternalMyDsl.g:250:5: (lv_balise_11_0= ruleBalise )
                    // InternalMyDsl.g:251:6: lv_balise_11_0= ruleBalise
                    {

                    						newCompositeNode(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_balise_11_0=ruleBalise();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaliseRule());
                    						}
                    						add(
                    							current,
                    							"balise",
                    							lv_balise_11_0,
                    							"org.xtext.ovyhtml.mydsl.MyDsl.Balise");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:268:4: (otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:269:5: otherlv_12= ',' ( (lv_balise_13_0= ruleBalise ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getBaliseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:273:5: ( (lv_balise_13_0= ruleBalise ) )
                    	    // InternalMyDsl.g:274:6: (lv_balise_13_0= ruleBalise )
                    	    {
                    	    // InternalMyDsl.g:274:6: (lv_balise_13_0= ruleBalise )
                    	    // InternalMyDsl.g:275:7: lv_balise_13_0= ruleBalise
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_balise_13_0=ruleBalise();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaliseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"balise",
                    	    								lv_balise_13_0,
                    	    								"org.xtext.ovyhtml.mydsl.MyDsl.Balise");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:298:3: (otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:299:4: otherlv_15= 'attribut' otherlv_16= '{' ( (lv_attribut_17_0= ruleAttribut ) ) (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getBaliseAccess().getAttributKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:307:4: ( (lv_attribut_17_0= ruleAttribut ) )
                    // InternalMyDsl.g:308:5: (lv_attribut_17_0= ruleAttribut )
                    {
                    // InternalMyDsl.g:308:5: (lv_attribut_17_0= ruleAttribut )
                    // InternalMyDsl.g:309:6: lv_attribut_17_0= ruleAttribut
                    {

                    						newCompositeNode(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_attribut_17_0=ruleAttribut();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaliseRule());
                    						}
                    						add(
                    							current,
                    							"attribut",
                    							lv_attribut_17_0,
                    							"org.xtext.ovyhtml.mydsl.MyDsl.Attribut");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:326:4: (otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:327:5: otherlv_18= ',' ( (lv_attribut_19_0= ruleAttribut ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBaliseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:331:5: ( (lv_attribut_19_0= ruleAttribut ) )
                    	    // InternalMyDsl.g:332:6: (lv_attribut_19_0= ruleAttribut )
                    	    {
                    	    // InternalMyDsl.g:332:6: (lv_attribut_19_0= ruleAttribut )
                    	    // InternalMyDsl.g:333:7: lv_attribut_19_0= ruleAttribut
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_attribut_19_0=ruleAttribut();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaliseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribut",
                    	    								lv_attribut_19_0,
                    	    								"org.xtext.ovyhtml.mydsl.MyDsl.Attribut");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_20, grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBalise"


    // $ANTLR start "entryRuleAttribut"
    // InternalMyDsl.g:364:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalMyDsl.g:364:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalMyDsl.g:365:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
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
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalMyDsl.g:371:1: ruleAttribut returns [EObject current=null] : ( () otherlv_1= 'Attribut' otherlv_2= '{' (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_nom_attr_5_0 = null;

        Enumerator lv_nom_attr_7_0 = null;

        AntlrDatatypeRuleToken lv_contenu_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( ( () otherlv_1= 'Attribut' otherlv_2= '{' (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:378:2: ( () otherlv_1= 'Attribut' otherlv_2= '{' (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:378:2: ( () otherlv_1= 'Attribut' otherlv_2= '{' (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:379:3: () otherlv_1= 'Attribut' otherlv_2= '{' (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )? (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:379:3: ()
            // InternalMyDsl.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributAccess().getAttributAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getAttributKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:394:3: (otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:395:4: otherlv_3= 'nom_attr' otherlv_4= '{' ( (lv_nom_attr_5_0= ruleAttr_Type ) ) (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getNom_attrKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:403:4: ( (lv_nom_attr_5_0= ruleAttr_Type ) )
                    // InternalMyDsl.g:404:5: (lv_nom_attr_5_0= ruleAttr_Type )
                    {
                    // InternalMyDsl.g:404:5: (lv_nom_attr_5_0= ruleAttr_Type )
                    // InternalMyDsl.g:405:6: lv_nom_attr_5_0= ruleAttr_Type
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nom_attr_5_0=ruleAttr_Type();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						add(
                    							current,
                    							"nom_attr",
                    							lv_nom_attr_5_0,
                    							"org.xtext.ovyhtml.mydsl.MyDsl.Attr_Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:422:4: (otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:423:5: otherlv_6= ',' ( (lv_nom_attr_7_0= ruleAttr_Type ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAttributAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:427:5: ( (lv_nom_attr_7_0= ruleAttr_Type ) )
                    	    // InternalMyDsl.g:428:6: (lv_nom_attr_7_0= ruleAttr_Type )
                    	    {
                    	    // InternalMyDsl.g:428:6: (lv_nom_attr_7_0= ruleAttr_Type )
                    	    // InternalMyDsl.g:429:7: lv_nom_attr_7_0= ruleAttr_Type
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_nom_attr_7_0=ruleAttr_Type();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nom_attr",
                    	    								lv_nom_attr_7_0,
                    	    								"org.xtext.ovyhtml.mydsl.MyDsl.Attr_Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:452:3: (otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:453:4: otherlv_9= 'contenu' ( (lv_contenu_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributAccess().getContenuKeyword_4_0());
                    			
                    // InternalMyDsl.g:457:4: ( (lv_contenu_10_0= ruleEString ) )
                    // InternalMyDsl.g:458:5: (lv_contenu_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:458:5: (lv_contenu_10_0= ruleEString )
                    // InternalMyDsl.g:459:6: lv_contenu_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributAccess().getContenuEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_contenu_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributRule());
                    						}
                    						set(
                    							current,
                    							"contenu",
                    							lv_contenu_10_0,
                    							"org.xtext.ovyhtml.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:485:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:485:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:486:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:492:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:498:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:499:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:499:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:500:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:508:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleBalise_Type"
    // InternalMyDsl.g:519:1: ruleBalise_Type returns [Enumerator current=null] : ( (enumLiteral_0= 'Titre' ) | (enumLiteral_1= 'H1' ) | (enumLiteral_2= 'H2' ) | (enumLiteral_3= 'H3' ) | (enumLiteral_4= 'H4' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'span' ) | (enumLiteral_7= 'div' ) ) ;
    public final Enumerator ruleBalise_Type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( ( (enumLiteral_0= 'Titre' ) | (enumLiteral_1= 'H1' ) | (enumLiteral_2= 'H2' ) | (enumLiteral_3= 'H3' ) | (enumLiteral_4= 'H4' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'span' ) | (enumLiteral_7= 'div' ) ) )
            // InternalMyDsl.g:526:2: ( (enumLiteral_0= 'Titre' ) | (enumLiteral_1= 'H1' ) | (enumLiteral_2= 'H2' ) | (enumLiteral_3= 'H3' ) | (enumLiteral_4= 'H4' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'span' ) | (enumLiteral_7= 'div' ) )
            {
            // InternalMyDsl.g:526:2: ( (enumLiteral_0= 'Titre' ) | (enumLiteral_1= 'H1' ) | (enumLiteral_2= 'H2' ) | (enumLiteral_3= 'H3' ) | (enumLiteral_4= 'H4' ) | (enumLiteral_5= 'P' ) | (enumLiteral_6= 'span' ) | (enumLiteral_7= 'div' ) )
            int alt12=8;
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
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            case 29:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:527:3: (enumLiteral_0= 'Titre' )
                    {
                    // InternalMyDsl.g:527:3: (enumLiteral_0= 'Titre' )
                    // InternalMyDsl.g:528:4: enumLiteral_0= 'Titre'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getTitreEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBalise_TypeAccess().getTitreEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:535:3: (enumLiteral_1= 'H1' )
                    {
                    // InternalMyDsl.g:535:3: (enumLiteral_1= 'H1' )
                    // InternalMyDsl.g:536:4: enumLiteral_1= 'H1'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getH1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBalise_TypeAccess().getH1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:543:3: (enumLiteral_2= 'H2' )
                    {
                    // InternalMyDsl.g:543:3: (enumLiteral_2= 'H2' )
                    // InternalMyDsl.g:544:4: enumLiteral_2= 'H2'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getH2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBalise_TypeAccess().getH2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:551:3: (enumLiteral_3= 'H3' )
                    {
                    // InternalMyDsl.g:551:3: (enumLiteral_3= 'H3' )
                    // InternalMyDsl.g:552:4: enumLiteral_3= 'H3'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getH3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBalise_TypeAccess().getH3EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:559:3: (enumLiteral_4= 'H4' )
                    {
                    // InternalMyDsl.g:559:3: (enumLiteral_4= 'H4' )
                    // InternalMyDsl.g:560:4: enumLiteral_4= 'H4'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getH4EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBalise_TypeAccess().getH4EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:567:3: (enumLiteral_5= 'P' )
                    {
                    // InternalMyDsl.g:567:3: (enumLiteral_5= 'P' )
                    // InternalMyDsl.g:568:4: enumLiteral_5= 'P'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBalise_TypeAccess().getPEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:575:3: (enumLiteral_6= 'span' )
                    {
                    // InternalMyDsl.g:575:3: (enumLiteral_6= 'span' )
                    // InternalMyDsl.g:576:4: enumLiteral_6= 'span'
                    {
                    enumLiteral_6=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getSpanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBalise_TypeAccess().getSpanEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:583:3: (enumLiteral_7= 'div' )
                    {
                    // InternalMyDsl.g:583:3: (enumLiteral_7= 'div' )
                    // InternalMyDsl.g:584:4: enumLiteral_7= 'div'
                    {
                    enumLiteral_7=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBalise_TypeAccess().getDivEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBalise_TypeAccess().getDivEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleBalise_Type"


    // $ANTLR start "ruleAttr_Type"
    // InternalMyDsl.g:594:1: ruleAttr_Type returns [Enumerator current=null] : ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'src' ) | (enumLiteral_3= 'href' ) ) ;
    public final Enumerator ruleAttr_Type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:600:2: ( ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'src' ) | (enumLiteral_3= 'href' ) ) )
            // InternalMyDsl.g:601:2: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'src' ) | (enumLiteral_3= 'href' ) )
            {
            // InternalMyDsl.g:601:2: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'src' ) | (enumLiteral_3= 'href' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 33:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:602:3: (enumLiteral_0= 'class' )
                    {
                    // InternalMyDsl.g:602:3: (enumLiteral_0= 'class' )
                    // InternalMyDsl.g:603:4: enumLiteral_0= 'class'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getAttr_TypeAccess().getClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttr_TypeAccess().getClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:610:3: (enumLiteral_1= 'id' )
                    {
                    // InternalMyDsl.g:610:3: (enumLiteral_1= 'id' )
                    // InternalMyDsl.g:611:4: enumLiteral_1= 'id'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getAttr_TypeAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttr_TypeAccess().getIdEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:618:3: (enumLiteral_2= 'src' )
                    {
                    // InternalMyDsl.g:618:3: (enumLiteral_2= 'src' )
                    // InternalMyDsl.g:619:4: enumLiteral_2= 'src'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getAttr_TypeAccess().getSrcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttr_TypeAccess().getSrcEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:626:3: (enumLiteral_3= 'href' )
                    {
                    // InternalMyDsl.g:626:3: (enumLiteral_3= 'href' )
                    // InternalMyDsl.g:627:4: enumLiteral_3= 'href'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAttr_TypeAccess().getHrefEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttr_TypeAccess().getHrefEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleAttr_Type"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000004A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});

}