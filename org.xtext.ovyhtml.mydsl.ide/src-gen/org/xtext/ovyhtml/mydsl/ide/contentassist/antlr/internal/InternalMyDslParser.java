package org.xtext.ovyhtml.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.ovyhtml.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Titre'", "'H1'", "'H2'", "'H3'", "'H4'", "'P'", "'span'", "'div'", "'class'", "'id'", "'src'", "'href'", "'HTML'", "'{'", "'balise'", "'}'", "','", "'Balise'", "'nom'", "'attribut'", "'Attribut'", "'nom_attr'", "'contenu'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHTML"
    // InternalMyDsl.g:53:1: entryRuleHTML : ruleHTML EOF ;
    public final void entryRuleHTML() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleHTML EOF )
            // InternalMyDsl.g:55:1: ruleHTML EOF
            {
             before(grammarAccess.getHTMLRule()); 
            pushFollow(FOLLOW_1);
            ruleHTML();

            state._fsp--;

             after(grammarAccess.getHTMLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHTML"


    // $ANTLR start "ruleHTML"
    // InternalMyDsl.g:62:1: ruleHTML : ( ( rule__HTML__Group__0 ) ) ;
    public final void ruleHTML() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__HTML__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__HTML__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__HTML__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__HTML__Group__0 )
            {
             before(grammarAccess.getHTMLAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__HTML__Group__0 )
            // InternalMyDsl.g:69:4: rule__HTML__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HTML__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHTML"


    // $ANTLR start "entryRuleBalise"
    // InternalMyDsl.g:78:1: entryRuleBalise : ruleBalise EOF ;
    public final void entryRuleBalise() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBalise EOF )
            // InternalMyDsl.g:80:1: ruleBalise EOF
            {
             before(grammarAccess.getBaliseRule()); 
            pushFollow(FOLLOW_1);
            ruleBalise();

            state._fsp--;

             after(grammarAccess.getBaliseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBalise"


    // $ANTLR start "ruleBalise"
    // InternalMyDsl.g:87:1: ruleBalise : ( ( rule__Balise__Group__0 ) ) ;
    public final void ruleBalise() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Balise__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Balise__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Balise__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Balise__Group__0 )
            {
             before(grammarAccess.getBaliseAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Balise__Group__0 )
            // InternalMyDsl.g:94:4: rule__Balise__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalise"


    // $ANTLR start "entryRuleAttribut"
    // InternalMyDsl.g:103:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAttribut EOF )
            // InternalMyDsl.g:105:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalMyDsl.g:112:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Attribut__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Attribut__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Attribut__Group__0 )
            // InternalMyDsl.g:119:4: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEString EOF )
            // InternalMyDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleBalise_Type"
    // InternalMyDsl.g:153:1: ruleBalise_Type : ( ( rule__Balise_Type__Alternatives ) ) ;
    public final void ruleBalise_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:157:1: ( ( ( rule__Balise_Type__Alternatives ) ) )
            // InternalMyDsl.g:158:2: ( ( rule__Balise_Type__Alternatives ) )
            {
            // InternalMyDsl.g:158:2: ( ( rule__Balise_Type__Alternatives ) )
            // InternalMyDsl.g:159:3: ( rule__Balise_Type__Alternatives )
            {
             before(grammarAccess.getBalise_TypeAccess().getAlternatives()); 
            // InternalMyDsl.g:160:3: ( rule__Balise_Type__Alternatives )
            // InternalMyDsl.g:160:4: rule__Balise_Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Balise_Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBalise_TypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBalise_Type"


    // $ANTLR start "ruleAttr_Type"
    // InternalMyDsl.g:169:1: ruleAttr_Type : ( ( rule__Attr_Type__Alternatives ) ) ;
    public final void ruleAttr_Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:173:1: ( ( ( rule__Attr_Type__Alternatives ) ) )
            // InternalMyDsl.g:174:2: ( ( rule__Attr_Type__Alternatives ) )
            {
            // InternalMyDsl.g:174:2: ( ( rule__Attr_Type__Alternatives ) )
            // InternalMyDsl.g:175:3: ( rule__Attr_Type__Alternatives )
            {
             before(grammarAccess.getAttr_TypeAccess().getAlternatives()); 
            // InternalMyDsl.g:176:3: ( rule__Attr_Type__Alternatives )
            // InternalMyDsl.g:176:4: rule__Attr_Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attr_Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttr_TypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttr_Type"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:184:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:188:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:189:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:189:2: ( RULE_STRING )
                    // InternalMyDsl.g:190:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:195:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:195:2: ( RULE_ID )
                    // InternalMyDsl.g:196:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Balise_Type__Alternatives"
    // InternalMyDsl.g:205:1: rule__Balise_Type__Alternatives : ( ( ( 'Titre' ) ) | ( ( 'H1' ) ) | ( ( 'H2' ) ) | ( ( 'H3' ) ) | ( ( 'H4' ) ) | ( ( 'P' ) ) | ( ( 'span' ) ) | ( ( 'div' ) ) );
    public final void rule__Balise_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:209:1: ( ( ( 'Titre' ) ) | ( ( 'H1' ) ) | ( ( 'H2' ) ) | ( ( 'H3' ) ) | ( ( 'H4' ) ) | ( ( 'P' ) ) | ( ( 'span' ) ) | ( ( 'div' ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:210:2: ( ( 'Titre' ) )
                    {
                    // InternalMyDsl.g:210:2: ( ( 'Titre' ) )
                    // InternalMyDsl.g:211:3: ( 'Titre' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getTitreEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:212:3: ( 'Titre' )
                    // InternalMyDsl.g:212:4: 'Titre'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getTitreEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:216:2: ( ( 'H1' ) )
                    {
                    // InternalMyDsl.g:216:2: ( ( 'H1' ) )
                    // InternalMyDsl.g:217:3: ( 'H1' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getH1EnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:218:3: ( 'H1' )
                    // InternalMyDsl.g:218:4: 'H1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getH1EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:222:2: ( ( 'H2' ) )
                    {
                    // InternalMyDsl.g:222:2: ( ( 'H2' ) )
                    // InternalMyDsl.g:223:3: ( 'H2' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getH2EnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:224:3: ( 'H2' )
                    // InternalMyDsl.g:224:4: 'H2'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getH2EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:228:2: ( ( 'H3' ) )
                    {
                    // InternalMyDsl.g:228:2: ( ( 'H3' ) )
                    // InternalMyDsl.g:229:3: ( 'H3' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getH3EnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:230:3: ( 'H3' )
                    // InternalMyDsl.g:230:4: 'H3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getH3EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:234:2: ( ( 'H4' ) )
                    {
                    // InternalMyDsl.g:234:2: ( ( 'H4' ) )
                    // InternalMyDsl.g:235:3: ( 'H4' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getH4EnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:236:3: ( 'H4' )
                    // InternalMyDsl.g:236:4: 'H4'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getH4EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:240:2: ( ( 'P' ) )
                    {
                    // InternalMyDsl.g:240:2: ( ( 'P' ) )
                    // InternalMyDsl.g:241:3: ( 'P' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getPEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:242:3: ( 'P' )
                    // InternalMyDsl.g:242:4: 'P'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getPEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:246:2: ( ( 'span' ) )
                    {
                    // InternalMyDsl.g:246:2: ( ( 'span' ) )
                    // InternalMyDsl.g:247:3: ( 'span' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getSpanEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:248:3: ( 'span' )
                    // InternalMyDsl.g:248:4: 'span'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getSpanEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:252:2: ( ( 'div' ) )
                    {
                    // InternalMyDsl.g:252:2: ( ( 'div' ) )
                    // InternalMyDsl.g:253:3: ( 'div' )
                    {
                     before(grammarAccess.getBalise_TypeAccess().getDivEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:254:3: ( 'div' )
                    // InternalMyDsl.g:254:4: 'div'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBalise_TypeAccess().getDivEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise_Type__Alternatives"


    // $ANTLR start "rule__Attr_Type__Alternatives"
    // InternalMyDsl.g:262:1: rule__Attr_Type__Alternatives : ( ( ( 'class' ) ) | ( ( 'id' ) ) | ( ( 'src' ) ) | ( ( 'href' ) ) );
    public final void rule__Attr_Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( ( ( 'class' ) ) | ( ( 'id' ) ) | ( ( 'src' ) ) | ( ( 'href' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:267:2: ( ( 'class' ) )
                    {
                    // InternalMyDsl.g:267:2: ( ( 'class' ) )
                    // InternalMyDsl.g:268:3: ( 'class' )
                    {
                     before(grammarAccess.getAttr_TypeAccess().getClassEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:269:3: ( 'class' )
                    // InternalMyDsl.g:269:4: 'class'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttr_TypeAccess().getClassEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:273:2: ( ( 'id' ) )
                    {
                    // InternalMyDsl.g:273:2: ( ( 'id' ) )
                    // InternalMyDsl.g:274:3: ( 'id' )
                    {
                     before(grammarAccess.getAttr_TypeAccess().getIdEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:275:3: ( 'id' )
                    // InternalMyDsl.g:275:4: 'id'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttr_TypeAccess().getIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:279:2: ( ( 'src' ) )
                    {
                    // InternalMyDsl.g:279:2: ( ( 'src' ) )
                    // InternalMyDsl.g:280:3: ( 'src' )
                    {
                     before(grammarAccess.getAttr_TypeAccess().getSrcEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:281:3: ( 'src' )
                    // InternalMyDsl.g:281:4: 'src'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttr_TypeAccess().getSrcEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:285:2: ( ( 'href' ) )
                    {
                    // InternalMyDsl.g:285:2: ( ( 'href' ) )
                    // InternalMyDsl.g:286:3: ( 'href' )
                    {
                     before(grammarAccess.getAttr_TypeAccess().getHrefEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:287:3: ( 'href' )
                    // InternalMyDsl.g:287:4: 'href'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAttr_TypeAccess().getHrefEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attr_Type__Alternatives"


    // $ANTLR start "rule__HTML__Group__0"
    // InternalMyDsl.g:295:1: rule__HTML__Group__0 : rule__HTML__Group__0__Impl rule__HTML__Group__1 ;
    public final void rule__HTML__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( rule__HTML__Group__0__Impl rule__HTML__Group__1 )
            // InternalMyDsl.g:300:2: rule__HTML__Group__0__Impl rule__HTML__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HTML__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__0"


    // $ANTLR start "rule__HTML__Group__0__Impl"
    // InternalMyDsl.g:307:1: rule__HTML__Group__0__Impl : ( 'HTML' ) ;
    public final void rule__HTML__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( ( 'HTML' ) )
            // InternalMyDsl.g:312:1: ( 'HTML' )
            {
            // InternalMyDsl.g:312:1: ( 'HTML' )
            // InternalMyDsl.g:313:2: 'HTML'
            {
             before(grammarAccess.getHTMLAccess().getHTMLKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getHTMLKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__0__Impl"


    // $ANTLR start "rule__HTML__Group__1"
    // InternalMyDsl.g:322:1: rule__HTML__Group__1 : rule__HTML__Group__1__Impl rule__HTML__Group__2 ;
    public final void rule__HTML__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( rule__HTML__Group__1__Impl rule__HTML__Group__2 )
            // InternalMyDsl.g:327:2: rule__HTML__Group__1__Impl rule__HTML__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__HTML__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__1"


    // $ANTLR start "rule__HTML__Group__1__Impl"
    // InternalMyDsl.g:334:1: rule__HTML__Group__1__Impl : ( '{' ) ;
    public final void rule__HTML__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:338:1: ( ( '{' ) )
            // InternalMyDsl.g:339:1: ( '{' )
            {
            // InternalMyDsl.g:339:1: ( '{' )
            // InternalMyDsl.g:340:2: '{'
            {
             before(grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__1__Impl"


    // $ANTLR start "rule__HTML__Group__2"
    // InternalMyDsl.g:349:1: rule__HTML__Group__2 : rule__HTML__Group__2__Impl rule__HTML__Group__3 ;
    public final void rule__HTML__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__HTML__Group__2__Impl rule__HTML__Group__3 )
            // InternalMyDsl.g:354:2: rule__HTML__Group__2__Impl rule__HTML__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__HTML__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__2"


    // $ANTLR start "rule__HTML__Group__2__Impl"
    // InternalMyDsl.g:361:1: rule__HTML__Group__2__Impl : ( 'balise' ) ;
    public final void rule__HTML__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'balise' ) )
            // InternalMyDsl.g:366:1: ( 'balise' )
            {
            // InternalMyDsl.g:366:1: ( 'balise' )
            // InternalMyDsl.g:367:2: 'balise'
            {
             before(grammarAccess.getHTMLAccess().getBaliseKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getBaliseKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__2__Impl"


    // $ANTLR start "rule__HTML__Group__3"
    // InternalMyDsl.g:376:1: rule__HTML__Group__3 : rule__HTML__Group__3__Impl rule__HTML__Group__4 ;
    public final void rule__HTML__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__HTML__Group__3__Impl rule__HTML__Group__4 )
            // InternalMyDsl.g:381:2: rule__HTML__Group__3__Impl rule__HTML__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__HTML__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__3"


    // $ANTLR start "rule__HTML__Group__3__Impl"
    // InternalMyDsl.g:388:1: rule__HTML__Group__3__Impl : ( '{' ) ;
    public final void rule__HTML__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( '{' ) )
            // InternalMyDsl.g:393:1: ( '{' )
            {
            // InternalMyDsl.g:393:1: ( '{' )
            // InternalMyDsl.g:394:2: '{'
            {
             before(grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__3__Impl"


    // $ANTLR start "rule__HTML__Group__4"
    // InternalMyDsl.g:403:1: rule__HTML__Group__4 : rule__HTML__Group__4__Impl rule__HTML__Group__5 ;
    public final void rule__HTML__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__HTML__Group__4__Impl rule__HTML__Group__5 )
            // InternalMyDsl.g:408:2: rule__HTML__Group__4__Impl rule__HTML__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__HTML__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__4"


    // $ANTLR start "rule__HTML__Group__4__Impl"
    // InternalMyDsl.g:415:1: rule__HTML__Group__4__Impl : ( ( rule__HTML__BaliseAssignment_4 ) ) ;
    public final void rule__HTML__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:419:1: ( ( ( rule__HTML__BaliseAssignment_4 ) ) )
            // InternalMyDsl.g:420:1: ( ( rule__HTML__BaliseAssignment_4 ) )
            {
            // InternalMyDsl.g:420:1: ( ( rule__HTML__BaliseAssignment_4 ) )
            // InternalMyDsl.g:421:2: ( rule__HTML__BaliseAssignment_4 )
            {
             before(grammarAccess.getHTMLAccess().getBaliseAssignment_4()); 
            // InternalMyDsl.g:422:2: ( rule__HTML__BaliseAssignment_4 )
            // InternalMyDsl.g:422:3: rule__HTML__BaliseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HTML__BaliseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getBaliseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__4__Impl"


    // $ANTLR start "rule__HTML__Group__5"
    // InternalMyDsl.g:430:1: rule__HTML__Group__5 : rule__HTML__Group__5__Impl rule__HTML__Group__6 ;
    public final void rule__HTML__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( rule__HTML__Group__5__Impl rule__HTML__Group__6 )
            // InternalMyDsl.g:435:2: rule__HTML__Group__5__Impl rule__HTML__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__HTML__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__5"


    // $ANTLR start "rule__HTML__Group__5__Impl"
    // InternalMyDsl.g:442:1: rule__HTML__Group__5__Impl : ( ( rule__HTML__Group_5__0 )* ) ;
    public final void rule__HTML__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( ( ( rule__HTML__Group_5__0 )* ) )
            // InternalMyDsl.g:447:1: ( ( rule__HTML__Group_5__0 )* )
            {
            // InternalMyDsl.g:447:1: ( ( rule__HTML__Group_5__0 )* )
            // InternalMyDsl.g:448:2: ( rule__HTML__Group_5__0 )*
            {
             before(grammarAccess.getHTMLAccess().getGroup_5()); 
            // InternalMyDsl.g:449:2: ( rule__HTML__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:449:3: rule__HTML__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__HTML__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getHTMLAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__5__Impl"


    // $ANTLR start "rule__HTML__Group__6"
    // InternalMyDsl.g:457:1: rule__HTML__Group__6 : rule__HTML__Group__6__Impl rule__HTML__Group__7 ;
    public final void rule__HTML__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__HTML__Group__6__Impl rule__HTML__Group__7 )
            // InternalMyDsl.g:462:2: rule__HTML__Group__6__Impl rule__HTML__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__HTML__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__6"


    // $ANTLR start "rule__HTML__Group__6__Impl"
    // InternalMyDsl.g:469:1: rule__HTML__Group__6__Impl : ( '}' ) ;
    public final void rule__HTML__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( '}' ) )
            // InternalMyDsl.g:474:1: ( '}' )
            {
            // InternalMyDsl.g:474:1: ( '}' )
            // InternalMyDsl.g:475:2: '}'
            {
             before(grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__6__Impl"


    // $ANTLR start "rule__HTML__Group__7"
    // InternalMyDsl.g:484:1: rule__HTML__Group__7 : rule__HTML__Group__7__Impl ;
    public final void rule__HTML__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( rule__HTML__Group__7__Impl )
            // InternalMyDsl.g:489:2: rule__HTML__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HTML__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__7"


    // $ANTLR start "rule__HTML__Group__7__Impl"
    // InternalMyDsl.g:495:1: rule__HTML__Group__7__Impl : ( '}' ) ;
    public final void rule__HTML__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( ( '}' ) )
            // InternalMyDsl.g:500:1: ( '}' )
            {
            // InternalMyDsl.g:500:1: ( '}' )
            // InternalMyDsl.g:501:2: '}'
            {
             before(grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group__7__Impl"


    // $ANTLR start "rule__HTML__Group_5__0"
    // InternalMyDsl.g:511:1: rule__HTML__Group_5__0 : rule__HTML__Group_5__0__Impl rule__HTML__Group_5__1 ;
    public final void rule__HTML__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( rule__HTML__Group_5__0__Impl rule__HTML__Group_5__1 )
            // InternalMyDsl.g:516:2: rule__HTML__Group_5__0__Impl rule__HTML__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__HTML__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HTML__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group_5__0"


    // $ANTLR start "rule__HTML__Group_5__0__Impl"
    // InternalMyDsl.g:523:1: rule__HTML__Group_5__0__Impl : ( ',' ) ;
    public final void rule__HTML__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( ',' ) )
            // InternalMyDsl.g:528:1: ( ',' )
            {
            // InternalMyDsl.g:528:1: ( ',' )
            // InternalMyDsl.g:529:2: ','
            {
             before(grammarAccess.getHTMLAccess().getCommaKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHTMLAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group_5__0__Impl"


    // $ANTLR start "rule__HTML__Group_5__1"
    // InternalMyDsl.g:538:1: rule__HTML__Group_5__1 : rule__HTML__Group_5__1__Impl ;
    public final void rule__HTML__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( rule__HTML__Group_5__1__Impl )
            // InternalMyDsl.g:543:2: rule__HTML__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HTML__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group_5__1"


    // $ANTLR start "rule__HTML__Group_5__1__Impl"
    // InternalMyDsl.g:549:1: rule__HTML__Group_5__1__Impl : ( ( rule__HTML__BaliseAssignment_5_1 ) ) ;
    public final void rule__HTML__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( ( rule__HTML__BaliseAssignment_5_1 ) ) )
            // InternalMyDsl.g:554:1: ( ( rule__HTML__BaliseAssignment_5_1 ) )
            {
            // InternalMyDsl.g:554:1: ( ( rule__HTML__BaliseAssignment_5_1 ) )
            // InternalMyDsl.g:555:2: ( rule__HTML__BaliseAssignment_5_1 )
            {
             before(grammarAccess.getHTMLAccess().getBaliseAssignment_5_1()); 
            // InternalMyDsl.g:556:2: ( rule__HTML__BaliseAssignment_5_1 )
            // InternalMyDsl.g:556:3: rule__HTML__BaliseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__HTML__BaliseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHTMLAccess().getBaliseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__Group_5__1__Impl"


    // $ANTLR start "rule__Balise__Group__0"
    // InternalMyDsl.g:565:1: rule__Balise__Group__0 : rule__Balise__Group__0__Impl rule__Balise__Group__1 ;
    public final void rule__Balise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( rule__Balise__Group__0__Impl rule__Balise__Group__1 )
            // InternalMyDsl.g:570:2: rule__Balise__Group__0__Impl rule__Balise__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Balise__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__0"


    // $ANTLR start "rule__Balise__Group__0__Impl"
    // InternalMyDsl.g:577:1: rule__Balise__Group__0__Impl : ( () ) ;
    public final void rule__Balise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( () ) )
            // InternalMyDsl.g:582:1: ( () )
            {
            // InternalMyDsl.g:582:1: ( () )
            // InternalMyDsl.g:583:2: ()
            {
             before(grammarAccess.getBaliseAccess().getBaliseAction_0()); 
            // InternalMyDsl.g:584:2: ()
            // InternalMyDsl.g:584:3: 
            {
            }

             after(grammarAccess.getBaliseAccess().getBaliseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__0__Impl"


    // $ANTLR start "rule__Balise__Group__1"
    // InternalMyDsl.g:592:1: rule__Balise__Group__1 : rule__Balise__Group__1__Impl rule__Balise__Group__2 ;
    public final void rule__Balise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( rule__Balise__Group__1__Impl rule__Balise__Group__2 )
            // InternalMyDsl.g:597:2: rule__Balise__Group__1__Impl rule__Balise__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Balise__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__1"


    // $ANTLR start "rule__Balise__Group__1__Impl"
    // InternalMyDsl.g:604:1: rule__Balise__Group__1__Impl : ( 'Balise' ) ;
    public final void rule__Balise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( 'Balise' ) )
            // InternalMyDsl.g:609:1: ( 'Balise' )
            {
            // InternalMyDsl.g:609:1: ( 'Balise' )
            // InternalMyDsl.g:610:2: 'Balise'
            {
             before(grammarAccess.getBaliseAccess().getBaliseKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getBaliseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__1__Impl"


    // $ANTLR start "rule__Balise__Group__2"
    // InternalMyDsl.g:619:1: rule__Balise__Group__2 : rule__Balise__Group__2__Impl rule__Balise__Group__3 ;
    public final void rule__Balise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( rule__Balise__Group__2__Impl rule__Balise__Group__3 )
            // InternalMyDsl.g:624:2: rule__Balise__Group__2__Impl rule__Balise__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Balise__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__2"


    // $ANTLR start "rule__Balise__Group__2__Impl"
    // InternalMyDsl.g:631:1: rule__Balise__Group__2__Impl : ( '{' ) ;
    public final void rule__Balise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( ( '{' ) )
            // InternalMyDsl.g:636:1: ( '{' )
            {
            // InternalMyDsl.g:636:1: ( '{' )
            // InternalMyDsl.g:637:2: '{'
            {
             before(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__2__Impl"


    // $ANTLR start "rule__Balise__Group__3"
    // InternalMyDsl.g:646:1: rule__Balise__Group__3 : rule__Balise__Group__3__Impl rule__Balise__Group__4 ;
    public final void rule__Balise__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( rule__Balise__Group__3__Impl rule__Balise__Group__4 )
            // InternalMyDsl.g:651:2: rule__Balise__Group__3__Impl rule__Balise__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Balise__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__3"


    // $ANTLR start "rule__Balise__Group__3__Impl"
    // InternalMyDsl.g:658:1: rule__Balise__Group__3__Impl : ( ( rule__Balise__Group_3__0 )? ) ;
    public final void rule__Balise__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__Balise__Group_3__0 )? ) )
            // InternalMyDsl.g:663:1: ( ( rule__Balise__Group_3__0 )? )
            {
            // InternalMyDsl.g:663:1: ( ( rule__Balise__Group_3__0 )? )
            // InternalMyDsl.g:664:2: ( rule__Balise__Group_3__0 )?
            {
             before(grammarAccess.getBaliseAccess().getGroup_3()); 
            // InternalMyDsl.g:665:2: ( rule__Balise__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:665:3: rule__Balise__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Balise__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaliseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__3__Impl"


    // $ANTLR start "rule__Balise__Group__4"
    // InternalMyDsl.g:673:1: rule__Balise__Group__4 : rule__Balise__Group__4__Impl rule__Balise__Group__5 ;
    public final void rule__Balise__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( rule__Balise__Group__4__Impl rule__Balise__Group__5 )
            // InternalMyDsl.g:678:2: rule__Balise__Group__4__Impl rule__Balise__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Balise__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__4"


    // $ANTLR start "rule__Balise__Group__4__Impl"
    // InternalMyDsl.g:685:1: rule__Balise__Group__4__Impl : ( ( rule__Balise__Group_4__0 )? ) ;
    public final void rule__Balise__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( ( ( rule__Balise__Group_4__0 )? ) )
            // InternalMyDsl.g:690:1: ( ( rule__Balise__Group_4__0 )? )
            {
            // InternalMyDsl.g:690:1: ( ( rule__Balise__Group_4__0 )? )
            // InternalMyDsl.g:691:2: ( rule__Balise__Group_4__0 )?
            {
             before(grammarAccess.getBaliseAccess().getGroup_4()); 
            // InternalMyDsl.g:692:2: ( rule__Balise__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:692:3: rule__Balise__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Balise__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaliseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__4__Impl"


    // $ANTLR start "rule__Balise__Group__5"
    // InternalMyDsl.g:700:1: rule__Balise__Group__5 : rule__Balise__Group__5__Impl rule__Balise__Group__6 ;
    public final void rule__Balise__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__Balise__Group__5__Impl rule__Balise__Group__6 )
            // InternalMyDsl.g:705:2: rule__Balise__Group__5__Impl rule__Balise__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Balise__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__5"


    // $ANTLR start "rule__Balise__Group__5__Impl"
    // InternalMyDsl.g:712:1: rule__Balise__Group__5__Impl : ( ( rule__Balise__Group_5__0 )? ) ;
    public final void rule__Balise__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( ( rule__Balise__Group_5__0 )? ) )
            // InternalMyDsl.g:717:1: ( ( rule__Balise__Group_5__0 )? )
            {
            // InternalMyDsl.g:717:1: ( ( rule__Balise__Group_5__0 )? )
            // InternalMyDsl.g:718:2: ( rule__Balise__Group_5__0 )?
            {
             before(grammarAccess.getBaliseAccess().getGroup_5()); 
            // InternalMyDsl.g:719:2: ( rule__Balise__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:719:3: rule__Balise__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Balise__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaliseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__5__Impl"


    // $ANTLR start "rule__Balise__Group__6"
    // InternalMyDsl.g:727:1: rule__Balise__Group__6 : rule__Balise__Group__6__Impl ;
    public final void rule__Balise__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__Balise__Group__6__Impl )
            // InternalMyDsl.g:732:2: rule__Balise__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__6"


    // $ANTLR start "rule__Balise__Group__6__Impl"
    // InternalMyDsl.g:738:1: rule__Balise__Group__6__Impl : ( '}' ) ;
    public final void rule__Balise__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( '}' ) )
            // InternalMyDsl.g:743:1: ( '}' )
            {
            // InternalMyDsl.g:743:1: ( '}' )
            // InternalMyDsl.g:744:2: '}'
            {
             before(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group__6__Impl"


    // $ANTLR start "rule__Balise__Group_3__0"
    // InternalMyDsl.g:754:1: rule__Balise__Group_3__0 : rule__Balise__Group_3__0__Impl rule__Balise__Group_3__1 ;
    public final void rule__Balise__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__Balise__Group_3__0__Impl rule__Balise__Group_3__1 )
            // InternalMyDsl.g:759:2: rule__Balise__Group_3__0__Impl rule__Balise__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Balise__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__0"


    // $ANTLR start "rule__Balise__Group_3__0__Impl"
    // InternalMyDsl.g:766:1: rule__Balise__Group_3__0__Impl : ( 'nom' ) ;
    public final void rule__Balise__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( 'nom' ) )
            // InternalMyDsl.g:771:1: ( 'nom' )
            {
            // InternalMyDsl.g:771:1: ( 'nom' )
            // InternalMyDsl.g:772:2: 'nom'
            {
             before(grammarAccess.getBaliseAccess().getNomKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getNomKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__0__Impl"


    // $ANTLR start "rule__Balise__Group_3__1"
    // InternalMyDsl.g:781:1: rule__Balise__Group_3__1 : rule__Balise__Group_3__1__Impl rule__Balise__Group_3__2 ;
    public final void rule__Balise__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__Balise__Group_3__1__Impl rule__Balise__Group_3__2 )
            // InternalMyDsl.g:786:2: rule__Balise__Group_3__1__Impl rule__Balise__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Balise__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__1"


    // $ANTLR start "rule__Balise__Group_3__1__Impl"
    // InternalMyDsl.g:793:1: rule__Balise__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Balise__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( '{' ) )
            // InternalMyDsl.g:798:1: ( '{' )
            {
            // InternalMyDsl.g:798:1: ( '{' )
            // InternalMyDsl.g:799:2: '{'
            {
             before(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__1__Impl"


    // $ANTLR start "rule__Balise__Group_3__2"
    // InternalMyDsl.g:808:1: rule__Balise__Group_3__2 : rule__Balise__Group_3__2__Impl rule__Balise__Group_3__3 ;
    public final void rule__Balise__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( rule__Balise__Group_3__2__Impl rule__Balise__Group_3__3 )
            // InternalMyDsl.g:813:2: rule__Balise__Group_3__2__Impl rule__Balise__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__2"


    // $ANTLR start "rule__Balise__Group_3__2__Impl"
    // InternalMyDsl.g:820:1: rule__Balise__Group_3__2__Impl : ( ( rule__Balise__NomAssignment_3_2 ) ) ;
    public final void rule__Balise__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( ( rule__Balise__NomAssignment_3_2 ) ) )
            // InternalMyDsl.g:825:1: ( ( rule__Balise__NomAssignment_3_2 ) )
            {
            // InternalMyDsl.g:825:1: ( ( rule__Balise__NomAssignment_3_2 ) )
            // InternalMyDsl.g:826:2: ( rule__Balise__NomAssignment_3_2 )
            {
             before(grammarAccess.getBaliseAccess().getNomAssignment_3_2()); 
            // InternalMyDsl.g:827:2: ( rule__Balise__NomAssignment_3_2 )
            // InternalMyDsl.g:827:3: rule__Balise__NomAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Balise__NomAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getNomAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__2__Impl"


    // $ANTLR start "rule__Balise__Group_3__3"
    // InternalMyDsl.g:835:1: rule__Balise__Group_3__3 : rule__Balise__Group_3__3__Impl rule__Balise__Group_3__4 ;
    public final void rule__Balise__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__Balise__Group_3__3__Impl rule__Balise__Group_3__4 )
            // InternalMyDsl.g:840:2: rule__Balise__Group_3__3__Impl rule__Balise__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__3"


    // $ANTLR start "rule__Balise__Group_3__3__Impl"
    // InternalMyDsl.g:847:1: rule__Balise__Group_3__3__Impl : ( ( rule__Balise__Group_3_3__0 )* ) ;
    public final void rule__Balise__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( ( ( rule__Balise__Group_3_3__0 )* ) )
            // InternalMyDsl.g:852:1: ( ( rule__Balise__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:852:1: ( ( rule__Balise__Group_3_3__0 )* )
            // InternalMyDsl.g:853:2: ( rule__Balise__Group_3_3__0 )*
            {
             before(grammarAccess.getBaliseAccess().getGroup_3_3()); 
            // InternalMyDsl.g:854:2: ( rule__Balise__Group_3_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:854:3: rule__Balise__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Balise__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBaliseAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__3__Impl"


    // $ANTLR start "rule__Balise__Group_3__4"
    // InternalMyDsl.g:862:1: rule__Balise__Group_3__4 : rule__Balise__Group_3__4__Impl ;
    public final void rule__Balise__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__Balise__Group_3__4__Impl )
            // InternalMyDsl.g:867:2: rule__Balise__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__4"


    // $ANTLR start "rule__Balise__Group_3__4__Impl"
    // InternalMyDsl.g:873:1: rule__Balise__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Balise__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( '}' ) )
            // InternalMyDsl.g:878:1: ( '}' )
            {
            // InternalMyDsl.g:878:1: ( '}' )
            // InternalMyDsl.g:879:2: '}'
            {
             before(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3__4__Impl"


    // $ANTLR start "rule__Balise__Group_3_3__0"
    // InternalMyDsl.g:889:1: rule__Balise__Group_3_3__0 : rule__Balise__Group_3_3__0__Impl rule__Balise__Group_3_3__1 ;
    public final void rule__Balise__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Balise__Group_3_3__0__Impl rule__Balise__Group_3_3__1 )
            // InternalMyDsl.g:894:2: rule__Balise__Group_3_3__0__Impl rule__Balise__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Balise__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3_3__0"


    // $ANTLR start "rule__Balise__Group_3_3__0__Impl"
    // InternalMyDsl.g:901:1: rule__Balise__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Balise__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( ',' ) )
            // InternalMyDsl.g:906:1: ( ',' )
            {
            // InternalMyDsl.g:906:1: ( ',' )
            // InternalMyDsl.g:907:2: ','
            {
             before(grammarAccess.getBaliseAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3_3__0__Impl"


    // $ANTLR start "rule__Balise__Group_3_3__1"
    // InternalMyDsl.g:916:1: rule__Balise__Group_3_3__1 : rule__Balise__Group_3_3__1__Impl ;
    public final void rule__Balise__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Balise__Group_3_3__1__Impl )
            // InternalMyDsl.g:921:2: rule__Balise__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3_3__1"


    // $ANTLR start "rule__Balise__Group_3_3__1__Impl"
    // InternalMyDsl.g:927:1: rule__Balise__Group_3_3__1__Impl : ( ( rule__Balise__NomAssignment_3_3_1 ) ) ;
    public final void rule__Balise__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( ( rule__Balise__NomAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:932:1: ( ( rule__Balise__NomAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:932:1: ( ( rule__Balise__NomAssignment_3_3_1 ) )
            // InternalMyDsl.g:933:2: ( rule__Balise__NomAssignment_3_3_1 )
            {
             before(grammarAccess.getBaliseAccess().getNomAssignment_3_3_1()); 
            // InternalMyDsl.g:934:2: ( rule__Balise__NomAssignment_3_3_1 )
            // InternalMyDsl.g:934:3: rule__Balise__NomAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Balise__NomAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getNomAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_3_3__1__Impl"


    // $ANTLR start "rule__Balise__Group_4__0"
    // InternalMyDsl.g:943:1: rule__Balise__Group_4__0 : rule__Balise__Group_4__0__Impl rule__Balise__Group_4__1 ;
    public final void rule__Balise__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Balise__Group_4__0__Impl rule__Balise__Group_4__1 )
            // InternalMyDsl.g:948:2: rule__Balise__Group_4__0__Impl rule__Balise__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Balise__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__0"


    // $ANTLR start "rule__Balise__Group_4__0__Impl"
    // InternalMyDsl.g:955:1: rule__Balise__Group_4__0__Impl : ( 'balise' ) ;
    public final void rule__Balise__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( 'balise' ) )
            // InternalMyDsl.g:960:1: ( 'balise' )
            {
            // InternalMyDsl.g:960:1: ( 'balise' )
            // InternalMyDsl.g:961:2: 'balise'
            {
             before(grammarAccess.getBaliseAccess().getBaliseKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getBaliseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__0__Impl"


    // $ANTLR start "rule__Balise__Group_4__1"
    // InternalMyDsl.g:970:1: rule__Balise__Group_4__1 : rule__Balise__Group_4__1__Impl rule__Balise__Group_4__2 ;
    public final void rule__Balise__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Balise__Group_4__1__Impl rule__Balise__Group_4__2 )
            // InternalMyDsl.g:975:2: rule__Balise__Group_4__1__Impl rule__Balise__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Balise__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__1"


    // $ANTLR start "rule__Balise__Group_4__1__Impl"
    // InternalMyDsl.g:982:1: rule__Balise__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Balise__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( '{' ) )
            // InternalMyDsl.g:987:1: ( '{' )
            {
            // InternalMyDsl.g:987:1: ( '{' )
            // InternalMyDsl.g:988:2: '{'
            {
             before(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__1__Impl"


    // $ANTLR start "rule__Balise__Group_4__2"
    // InternalMyDsl.g:997:1: rule__Balise__Group_4__2 : rule__Balise__Group_4__2__Impl rule__Balise__Group_4__3 ;
    public final void rule__Balise__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__Balise__Group_4__2__Impl rule__Balise__Group_4__3 )
            // InternalMyDsl.g:1002:2: rule__Balise__Group_4__2__Impl rule__Balise__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__2"


    // $ANTLR start "rule__Balise__Group_4__2__Impl"
    // InternalMyDsl.g:1009:1: rule__Balise__Group_4__2__Impl : ( ( rule__Balise__BaliseAssignment_4_2 ) ) ;
    public final void rule__Balise__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( ( rule__Balise__BaliseAssignment_4_2 ) ) )
            // InternalMyDsl.g:1014:1: ( ( rule__Balise__BaliseAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1014:1: ( ( rule__Balise__BaliseAssignment_4_2 ) )
            // InternalMyDsl.g:1015:2: ( rule__Balise__BaliseAssignment_4_2 )
            {
             before(grammarAccess.getBaliseAccess().getBaliseAssignment_4_2()); 
            // InternalMyDsl.g:1016:2: ( rule__Balise__BaliseAssignment_4_2 )
            // InternalMyDsl.g:1016:3: rule__Balise__BaliseAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Balise__BaliseAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getBaliseAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__2__Impl"


    // $ANTLR start "rule__Balise__Group_4__3"
    // InternalMyDsl.g:1024:1: rule__Balise__Group_4__3 : rule__Balise__Group_4__3__Impl rule__Balise__Group_4__4 ;
    public final void rule__Balise__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__Balise__Group_4__3__Impl rule__Balise__Group_4__4 )
            // InternalMyDsl.g:1029:2: rule__Balise__Group_4__3__Impl rule__Balise__Group_4__4
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__3"


    // $ANTLR start "rule__Balise__Group_4__3__Impl"
    // InternalMyDsl.g:1036:1: rule__Balise__Group_4__3__Impl : ( ( rule__Balise__Group_4_3__0 )* ) ;
    public final void rule__Balise__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__Balise__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1041:1: ( ( rule__Balise__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__Balise__Group_4_3__0 )* )
            // InternalMyDsl.g:1042:2: ( rule__Balise__Group_4_3__0 )*
            {
             before(grammarAccess.getBaliseAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1043:2: ( rule__Balise__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1043:3: rule__Balise__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Balise__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBaliseAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__3__Impl"


    // $ANTLR start "rule__Balise__Group_4__4"
    // InternalMyDsl.g:1051:1: rule__Balise__Group_4__4 : rule__Balise__Group_4__4__Impl ;
    public final void rule__Balise__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( rule__Balise__Group_4__4__Impl )
            // InternalMyDsl.g:1056:2: rule__Balise__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__4"


    // $ANTLR start "rule__Balise__Group_4__4__Impl"
    // InternalMyDsl.g:1062:1: rule__Balise__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Balise__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( '}' ) )
            // InternalMyDsl.g:1067:1: ( '}' )
            {
            // InternalMyDsl.g:1067:1: ( '}' )
            // InternalMyDsl.g:1068:2: '}'
            {
             before(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4__4__Impl"


    // $ANTLR start "rule__Balise__Group_4_3__0"
    // InternalMyDsl.g:1078:1: rule__Balise__Group_4_3__0 : rule__Balise__Group_4_3__0__Impl rule__Balise__Group_4_3__1 ;
    public final void rule__Balise__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( rule__Balise__Group_4_3__0__Impl rule__Balise__Group_4_3__1 )
            // InternalMyDsl.g:1083:2: rule__Balise__Group_4_3__0__Impl rule__Balise__Group_4_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Balise__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4_3__0"


    // $ANTLR start "rule__Balise__Group_4_3__0__Impl"
    // InternalMyDsl.g:1090:1: rule__Balise__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Balise__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( ',' ) )
            // InternalMyDsl.g:1095:1: ( ',' )
            {
            // InternalMyDsl.g:1095:1: ( ',' )
            // InternalMyDsl.g:1096:2: ','
            {
             before(grammarAccess.getBaliseAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4_3__0__Impl"


    // $ANTLR start "rule__Balise__Group_4_3__1"
    // InternalMyDsl.g:1105:1: rule__Balise__Group_4_3__1 : rule__Balise__Group_4_3__1__Impl ;
    public final void rule__Balise__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( rule__Balise__Group_4_3__1__Impl )
            // InternalMyDsl.g:1110:2: rule__Balise__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4_3__1"


    // $ANTLR start "rule__Balise__Group_4_3__1__Impl"
    // InternalMyDsl.g:1116:1: rule__Balise__Group_4_3__1__Impl : ( ( rule__Balise__BaliseAssignment_4_3_1 ) ) ;
    public final void rule__Balise__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( ( rule__Balise__BaliseAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1121:1: ( ( rule__Balise__BaliseAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1121:1: ( ( rule__Balise__BaliseAssignment_4_3_1 ) )
            // InternalMyDsl.g:1122:2: ( rule__Balise__BaliseAssignment_4_3_1 )
            {
             before(grammarAccess.getBaliseAccess().getBaliseAssignment_4_3_1()); 
            // InternalMyDsl.g:1123:2: ( rule__Balise__BaliseAssignment_4_3_1 )
            // InternalMyDsl.g:1123:3: rule__Balise__BaliseAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Balise__BaliseAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getBaliseAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_4_3__1__Impl"


    // $ANTLR start "rule__Balise__Group_5__0"
    // InternalMyDsl.g:1132:1: rule__Balise__Group_5__0 : rule__Balise__Group_5__0__Impl rule__Balise__Group_5__1 ;
    public final void rule__Balise__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( rule__Balise__Group_5__0__Impl rule__Balise__Group_5__1 )
            // InternalMyDsl.g:1137:2: rule__Balise__Group_5__0__Impl rule__Balise__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Balise__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__0"


    // $ANTLR start "rule__Balise__Group_5__0__Impl"
    // InternalMyDsl.g:1144:1: rule__Balise__Group_5__0__Impl : ( 'attribut' ) ;
    public final void rule__Balise__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1148:1: ( ( 'attribut' ) )
            // InternalMyDsl.g:1149:1: ( 'attribut' )
            {
            // InternalMyDsl.g:1149:1: ( 'attribut' )
            // InternalMyDsl.g:1150:2: 'attribut'
            {
             before(grammarAccess.getBaliseAccess().getAttributKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getAttributKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__0__Impl"


    // $ANTLR start "rule__Balise__Group_5__1"
    // InternalMyDsl.g:1159:1: rule__Balise__Group_5__1 : rule__Balise__Group_5__1__Impl rule__Balise__Group_5__2 ;
    public final void rule__Balise__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( rule__Balise__Group_5__1__Impl rule__Balise__Group_5__2 )
            // InternalMyDsl.g:1164:2: rule__Balise__Group_5__1__Impl rule__Balise__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Balise__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__1"


    // $ANTLR start "rule__Balise__Group_5__1__Impl"
    // InternalMyDsl.g:1171:1: rule__Balise__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Balise__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( ( '{' ) )
            // InternalMyDsl.g:1176:1: ( '{' )
            {
            // InternalMyDsl.g:1176:1: ( '{' )
            // InternalMyDsl.g:1177:2: '{'
            {
             before(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__1__Impl"


    // $ANTLR start "rule__Balise__Group_5__2"
    // InternalMyDsl.g:1186:1: rule__Balise__Group_5__2 : rule__Balise__Group_5__2__Impl rule__Balise__Group_5__3 ;
    public final void rule__Balise__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( rule__Balise__Group_5__2__Impl rule__Balise__Group_5__3 )
            // InternalMyDsl.g:1191:2: rule__Balise__Group_5__2__Impl rule__Balise__Group_5__3
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__2"


    // $ANTLR start "rule__Balise__Group_5__2__Impl"
    // InternalMyDsl.g:1198:1: rule__Balise__Group_5__2__Impl : ( ( rule__Balise__AttributAssignment_5_2 ) ) ;
    public final void rule__Balise__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1202:1: ( ( ( rule__Balise__AttributAssignment_5_2 ) ) )
            // InternalMyDsl.g:1203:1: ( ( rule__Balise__AttributAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1203:1: ( ( rule__Balise__AttributAssignment_5_2 ) )
            // InternalMyDsl.g:1204:2: ( rule__Balise__AttributAssignment_5_2 )
            {
             before(grammarAccess.getBaliseAccess().getAttributAssignment_5_2()); 
            // InternalMyDsl.g:1205:2: ( rule__Balise__AttributAssignment_5_2 )
            // InternalMyDsl.g:1205:3: rule__Balise__AttributAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Balise__AttributAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getAttributAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__2__Impl"


    // $ANTLR start "rule__Balise__Group_5__3"
    // InternalMyDsl.g:1213:1: rule__Balise__Group_5__3 : rule__Balise__Group_5__3__Impl rule__Balise__Group_5__4 ;
    public final void rule__Balise__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( rule__Balise__Group_5__3__Impl rule__Balise__Group_5__4 )
            // InternalMyDsl.g:1218:2: rule__Balise__Group_5__3__Impl rule__Balise__Group_5__4
            {
            pushFollow(FOLLOW_6);
            rule__Balise__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__3"


    // $ANTLR start "rule__Balise__Group_5__3__Impl"
    // InternalMyDsl.g:1225:1: rule__Balise__Group_5__3__Impl : ( ( rule__Balise__Group_5_3__0 )* ) ;
    public final void rule__Balise__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( ( rule__Balise__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1230:1: ( ( rule__Balise__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1230:1: ( ( rule__Balise__Group_5_3__0 )* )
            // InternalMyDsl.g:1231:2: ( rule__Balise__Group_5_3__0 )*
            {
             before(grammarAccess.getBaliseAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1232:2: ( rule__Balise__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1232:3: rule__Balise__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Balise__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBaliseAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__3__Impl"


    // $ANTLR start "rule__Balise__Group_5__4"
    // InternalMyDsl.g:1240:1: rule__Balise__Group_5__4 : rule__Balise__Group_5__4__Impl ;
    public final void rule__Balise__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__Balise__Group_5__4__Impl )
            // InternalMyDsl.g:1245:2: rule__Balise__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__4"


    // $ANTLR start "rule__Balise__Group_5__4__Impl"
    // InternalMyDsl.g:1251:1: rule__Balise__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Balise__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( '}' ) )
            // InternalMyDsl.g:1256:1: ( '}' )
            {
            // InternalMyDsl.g:1256:1: ( '}' )
            // InternalMyDsl.g:1257:2: '}'
            {
             before(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5__4__Impl"


    // $ANTLR start "rule__Balise__Group_5_3__0"
    // InternalMyDsl.g:1267:1: rule__Balise__Group_5_3__0 : rule__Balise__Group_5_3__0__Impl rule__Balise__Group_5_3__1 ;
    public final void rule__Balise__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__Balise__Group_5_3__0__Impl rule__Balise__Group_5_3__1 )
            // InternalMyDsl.g:1272:2: rule__Balise__Group_5_3__0__Impl rule__Balise__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Balise__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Balise__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5_3__0"


    // $ANTLR start "rule__Balise__Group_5_3__0__Impl"
    // InternalMyDsl.g:1279:1: rule__Balise__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Balise__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( ',' ) )
            // InternalMyDsl.g:1284:1: ( ',' )
            {
            // InternalMyDsl.g:1284:1: ( ',' )
            // InternalMyDsl.g:1285:2: ','
            {
             before(grammarAccess.getBaliseAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBaliseAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5_3__0__Impl"


    // $ANTLR start "rule__Balise__Group_5_3__1"
    // InternalMyDsl.g:1294:1: rule__Balise__Group_5_3__1 : rule__Balise__Group_5_3__1__Impl ;
    public final void rule__Balise__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__Balise__Group_5_3__1__Impl )
            // InternalMyDsl.g:1299:2: rule__Balise__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Balise__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5_3__1"


    // $ANTLR start "rule__Balise__Group_5_3__1__Impl"
    // InternalMyDsl.g:1305:1: rule__Balise__Group_5_3__1__Impl : ( ( rule__Balise__AttributAssignment_5_3_1 ) ) ;
    public final void rule__Balise__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( ( rule__Balise__AttributAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1310:1: ( ( rule__Balise__AttributAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1310:1: ( ( rule__Balise__AttributAssignment_5_3_1 ) )
            // InternalMyDsl.g:1311:2: ( rule__Balise__AttributAssignment_5_3_1 )
            {
             before(grammarAccess.getBaliseAccess().getAttributAssignment_5_3_1()); 
            // InternalMyDsl.g:1312:2: ( rule__Balise__AttributAssignment_5_3_1 )
            // InternalMyDsl.g:1312:3: rule__Balise__AttributAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Balise__AttributAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaliseAccess().getAttributAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__Group_5_3__1__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalMyDsl.g:1321:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalMyDsl.g:1326:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0"


    // $ANTLR start "rule__Attribut__Group__0__Impl"
    // InternalMyDsl.g:1333:1: rule__Attribut__Group__0__Impl : ( () ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( () ) )
            // InternalMyDsl.g:1338:1: ( () )
            {
            // InternalMyDsl.g:1338:1: ( () )
            // InternalMyDsl.g:1339:2: ()
            {
             before(grammarAccess.getAttributAccess().getAttributAction_0()); 
            // InternalMyDsl.g:1340:2: ()
            // InternalMyDsl.g:1340:3: 
            {
            }

             after(grammarAccess.getAttributAccess().getAttributAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0__Impl"


    // $ANTLR start "rule__Attribut__Group__1"
    // InternalMyDsl.g:1348:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalMyDsl.g:1353:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1"


    // $ANTLR start "rule__Attribut__Group__1__Impl"
    // InternalMyDsl.g:1360:1: rule__Attribut__Group__1__Impl : ( 'Attribut' ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( 'Attribut' ) )
            // InternalMyDsl.g:1365:1: ( 'Attribut' )
            {
            // InternalMyDsl.g:1365:1: ( 'Attribut' )
            // InternalMyDsl.g:1366:2: 'Attribut'
            {
             before(grammarAccess.getAttributAccess().getAttributKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getAttributKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1__Impl"


    // $ANTLR start "rule__Attribut__Group__2"
    // InternalMyDsl.g:1375:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl rule__Attribut__Group__3 ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__Attribut__Group__2__Impl rule__Attribut__Group__3 )
            // InternalMyDsl.g:1380:2: rule__Attribut__Group__2__Impl rule__Attribut__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Attribut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2"


    // $ANTLR start "rule__Attribut__Group__2__Impl"
    // InternalMyDsl.g:1387:1: rule__Attribut__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( '{' ) )
            // InternalMyDsl.g:1392:1: ( '{' )
            {
            // InternalMyDsl.g:1392:1: ( '{' )
            // InternalMyDsl.g:1393:2: '{'
            {
             before(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2__Impl"


    // $ANTLR start "rule__Attribut__Group__3"
    // InternalMyDsl.g:1402:1: rule__Attribut__Group__3 : rule__Attribut__Group__3__Impl rule__Attribut__Group__4 ;
    public final void rule__Attribut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__Attribut__Group__3__Impl rule__Attribut__Group__4 )
            // InternalMyDsl.g:1407:2: rule__Attribut__Group__3__Impl rule__Attribut__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Attribut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__3"


    // $ANTLR start "rule__Attribut__Group__3__Impl"
    // InternalMyDsl.g:1414:1: rule__Attribut__Group__3__Impl : ( ( rule__Attribut__Group_3__0 )? ) ;
    public final void rule__Attribut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ( rule__Attribut__Group_3__0 )? ) )
            // InternalMyDsl.g:1419:1: ( ( rule__Attribut__Group_3__0 )? )
            {
            // InternalMyDsl.g:1419:1: ( ( rule__Attribut__Group_3__0 )? )
            // InternalMyDsl.g:1420:2: ( rule__Attribut__Group_3__0 )?
            {
             before(grammarAccess.getAttributAccess().getGroup_3()); 
            // InternalMyDsl.g:1421:2: ( rule__Attribut__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1421:3: rule__Attribut__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribut__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__3__Impl"


    // $ANTLR start "rule__Attribut__Group__4"
    // InternalMyDsl.g:1429:1: rule__Attribut__Group__4 : rule__Attribut__Group__4__Impl rule__Attribut__Group__5 ;
    public final void rule__Attribut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__Attribut__Group__4__Impl rule__Attribut__Group__5 )
            // InternalMyDsl.g:1434:2: rule__Attribut__Group__4__Impl rule__Attribut__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Attribut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__4"


    // $ANTLR start "rule__Attribut__Group__4__Impl"
    // InternalMyDsl.g:1441:1: rule__Attribut__Group__4__Impl : ( ( rule__Attribut__Group_4__0 )? ) ;
    public final void rule__Attribut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( ( rule__Attribut__Group_4__0 )? ) )
            // InternalMyDsl.g:1446:1: ( ( rule__Attribut__Group_4__0 )? )
            {
            // InternalMyDsl.g:1446:1: ( ( rule__Attribut__Group_4__0 )? )
            // InternalMyDsl.g:1447:2: ( rule__Attribut__Group_4__0 )?
            {
             before(grammarAccess.getAttributAccess().getGroup_4()); 
            // InternalMyDsl.g:1448:2: ( rule__Attribut__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1448:3: rule__Attribut__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribut__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__4__Impl"


    // $ANTLR start "rule__Attribut__Group__5"
    // InternalMyDsl.g:1456:1: rule__Attribut__Group__5 : rule__Attribut__Group__5__Impl ;
    public final void rule__Attribut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__Attribut__Group__5__Impl )
            // InternalMyDsl.g:1461:2: rule__Attribut__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__5"


    // $ANTLR start "rule__Attribut__Group__5__Impl"
    // InternalMyDsl.g:1467:1: rule__Attribut__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( '}' ) )
            // InternalMyDsl.g:1472:1: ( '}' )
            {
            // InternalMyDsl.g:1472:1: ( '}' )
            // InternalMyDsl.g:1473:2: '}'
            {
             before(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__5__Impl"


    // $ANTLR start "rule__Attribut__Group_3__0"
    // InternalMyDsl.g:1483:1: rule__Attribut__Group_3__0 : rule__Attribut__Group_3__0__Impl rule__Attribut__Group_3__1 ;
    public final void rule__Attribut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__Attribut__Group_3__0__Impl rule__Attribut__Group_3__1 )
            // InternalMyDsl.g:1488:2: rule__Attribut__Group_3__0__Impl rule__Attribut__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribut__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__0"


    // $ANTLR start "rule__Attribut__Group_3__0__Impl"
    // InternalMyDsl.g:1495:1: rule__Attribut__Group_3__0__Impl : ( 'nom_attr' ) ;
    public final void rule__Attribut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( 'nom_attr' ) )
            // InternalMyDsl.g:1500:1: ( 'nom_attr' )
            {
            // InternalMyDsl.g:1500:1: ( 'nom_attr' )
            // InternalMyDsl.g:1501:2: 'nom_attr'
            {
             before(grammarAccess.getAttributAccess().getNom_attrKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getNom_attrKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__0__Impl"


    // $ANTLR start "rule__Attribut__Group_3__1"
    // InternalMyDsl.g:1510:1: rule__Attribut__Group_3__1 : rule__Attribut__Group_3__1__Impl rule__Attribut__Group_3__2 ;
    public final void rule__Attribut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__Attribut__Group_3__1__Impl rule__Attribut__Group_3__2 )
            // InternalMyDsl.g:1515:2: rule__Attribut__Group_3__1__Impl rule__Attribut__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Attribut__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__1"


    // $ANTLR start "rule__Attribut__Group_3__1__Impl"
    // InternalMyDsl.g:1522:1: rule__Attribut__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Attribut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( '{' ) )
            // InternalMyDsl.g:1527:1: ( '{' )
            {
            // InternalMyDsl.g:1527:1: ( '{' )
            // InternalMyDsl.g:1528:2: '{'
            {
             before(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__1__Impl"


    // $ANTLR start "rule__Attribut__Group_3__2"
    // InternalMyDsl.g:1537:1: rule__Attribut__Group_3__2 : rule__Attribut__Group_3__2__Impl rule__Attribut__Group_3__3 ;
    public final void rule__Attribut__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__Attribut__Group_3__2__Impl rule__Attribut__Group_3__3 )
            // InternalMyDsl.g:1542:2: rule__Attribut__Group_3__2__Impl rule__Attribut__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Attribut__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__2"


    // $ANTLR start "rule__Attribut__Group_3__2__Impl"
    // InternalMyDsl.g:1549:1: rule__Attribut__Group_3__2__Impl : ( ( rule__Attribut__Nom_attrAssignment_3_2 ) ) ;
    public final void rule__Attribut__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( ( rule__Attribut__Nom_attrAssignment_3_2 ) ) )
            // InternalMyDsl.g:1554:1: ( ( rule__Attribut__Nom_attrAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1554:1: ( ( rule__Attribut__Nom_attrAssignment_3_2 ) )
            // InternalMyDsl.g:1555:2: ( rule__Attribut__Nom_attrAssignment_3_2 )
            {
             before(grammarAccess.getAttributAccess().getNom_attrAssignment_3_2()); 
            // InternalMyDsl.g:1556:2: ( rule__Attribut__Nom_attrAssignment_3_2 )
            // InternalMyDsl.g:1556:3: rule__Attribut__Nom_attrAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Nom_attrAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNom_attrAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__2__Impl"


    // $ANTLR start "rule__Attribut__Group_3__3"
    // InternalMyDsl.g:1564:1: rule__Attribut__Group_3__3 : rule__Attribut__Group_3__3__Impl rule__Attribut__Group_3__4 ;
    public final void rule__Attribut__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__Attribut__Group_3__3__Impl rule__Attribut__Group_3__4 )
            // InternalMyDsl.g:1569:2: rule__Attribut__Group_3__3__Impl rule__Attribut__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Attribut__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__3"


    // $ANTLR start "rule__Attribut__Group_3__3__Impl"
    // InternalMyDsl.g:1576:1: rule__Attribut__Group_3__3__Impl : ( ( rule__Attribut__Group_3_3__0 )* ) ;
    public final void rule__Attribut__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( ( rule__Attribut__Group_3_3__0 )* ) )
            // InternalMyDsl.g:1581:1: ( ( rule__Attribut__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:1581:1: ( ( rule__Attribut__Group_3_3__0 )* )
            // InternalMyDsl.g:1582:2: ( rule__Attribut__Group_3_3__0 )*
            {
             before(grammarAccess.getAttributAccess().getGroup_3_3()); 
            // InternalMyDsl.g:1583:2: ( rule__Attribut__Group_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1583:3: rule__Attribut__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Attribut__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAttributAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__3__Impl"


    // $ANTLR start "rule__Attribut__Group_3__4"
    // InternalMyDsl.g:1591:1: rule__Attribut__Group_3__4 : rule__Attribut__Group_3__4__Impl ;
    public final void rule__Attribut__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__Attribut__Group_3__4__Impl )
            // InternalMyDsl.g:1596:2: rule__Attribut__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__4"


    // $ANTLR start "rule__Attribut__Group_3__4__Impl"
    // InternalMyDsl.g:1602:1: rule__Attribut__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Attribut__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( '}' ) )
            // InternalMyDsl.g:1607:1: ( '}' )
            {
            // InternalMyDsl.g:1607:1: ( '}' )
            // InternalMyDsl.g:1608:2: '}'
            {
             before(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3__4__Impl"


    // $ANTLR start "rule__Attribut__Group_3_3__0"
    // InternalMyDsl.g:1618:1: rule__Attribut__Group_3_3__0 : rule__Attribut__Group_3_3__0__Impl rule__Attribut__Group_3_3__1 ;
    public final void rule__Attribut__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__Attribut__Group_3_3__0__Impl rule__Attribut__Group_3_3__1 )
            // InternalMyDsl.g:1623:2: rule__Attribut__Group_3_3__0__Impl rule__Attribut__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribut__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3_3__0"


    // $ANTLR start "rule__Attribut__Group_3_3__0__Impl"
    // InternalMyDsl.g:1630:1: rule__Attribut__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Attribut__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( ',' ) )
            // InternalMyDsl.g:1635:1: ( ',' )
            {
            // InternalMyDsl.g:1635:1: ( ',' )
            // InternalMyDsl.g:1636:2: ','
            {
             before(grammarAccess.getAttributAccess().getCommaKeyword_3_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3_3__0__Impl"


    // $ANTLR start "rule__Attribut__Group_3_3__1"
    // InternalMyDsl.g:1645:1: rule__Attribut__Group_3_3__1 : rule__Attribut__Group_3_3__1__Impl ;
    public final void rule__Attribut__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__Attribut__Group_3_3__1__Impl )
            // InternalMyDsl.g:1650:2: rule__Attribut__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3_3__1"


    // $ANTLR start "rule__Attribut__Group_3_3__1__Impl"
    // InternalMyDsl.g:1656:1: rule__Attribut__Group_3_3__1__Impl : ( ( rule__Attribut__Nom_attrAssignment_3_3_1 ) ) ;
    public final void rule__Attribut__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( ( ( rule__Attribut__Nom_attrAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:1661:1: ( ( rule__Attribut__Nom_attrAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:1661:1: ( ( rule__Attribut__Nom_attrAssignment_3_3_1 ) )
            // InternalMyDsl.g:1662:2: ( rule__Attribut__Nom_attrAssignment_3_3_1 )
            {
             before(grammarAccess.getAttributAccess().getNom_attrAssignment_3_3_1()); 
            // InternalMyDsl.g:1663:2: ( rule__Attribut__Nom_attrAssignment_3_3_1 )
            // InternalMyDsl.g:1663:3: rule__Attribut__Nom_attrAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Nom_attrAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNom_attrAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_3_3__1__Impl"


    // $ANTLR start "rule__Attribut__Group_4__0"
    // InternalMyDsl.g:1672:1: rule__Attribut__Group_4__0 : rule__Attribut__Group_4__0__Impl rule__Attribut__Group_4__1 ;
    public final void rule__Attribut__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__Attribut__Group_4__0__Impl rule__Attribut__Group_4__1 )
            // InternalMyDsl.g:1677:2: rule__Attribut__Group_4__0__Impl rule__Attribut__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribut__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_4__0"


    // $ANTLR start "rule__Attribut__Group_4__0__Impl"
    // InternalMyDsl.g:1684:1: rule__Attribut__Group_4__0__Impl : ( 'contenu' ) ;
    public final void rule__Attribut__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( 'contenu' ) )
            // InternalMyDsl.g:1689:1: ( 'contenu' )
            {
            // InternalMyDsl.g:1689:1: ( 'contenu' )
            // InternalMyDsl.g:1690:2: 'contenu'
            {
             before(grammarAccess.getAttributAccess().getContenuKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getContenuKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_4__0__Impl"


    // $ANTLR start "rule__Attribut__Group_4__1"
    // InternalMyDsl.g:1699:1: rule__Attribut__Group_4__1 : rule__Attribut__Group_4__1__Impl ;
    public final void rule__Attribut__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__Attribut__Group_4__1__Impl )
            // InternalMyDsl.g:1704:2: rule__Attribut__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_4__1"


    // $ANTLR start "rule__Attribut__Group_4__1__Impl"
    // InternalMyDsl.g:1710:1: rule__Attribut__Group_4__1__Impl : ( ( rule__Attribut__ContenuAssignment_4_1 ) ) ;
    public final void rule__Attribut__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ( rule__Attribut__ContenuAssignment_4_1 ) ) )
            // InternalMyDsl.g:1715:1: ( ( rule__Attribut__ContenuAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1715:1: ( ( rule__Attribut__ContenuAssignment_4_1 ) )
            // InternalMyDsl.g:1716:2: ( rule__Attribut__ContenuAssignment_4_1 )
            {
             before(grammarAccess.getAttributAccess().getContenuAssignment_4_1()); 
            // InternalMyDsl.g:1717:2: ( rule__Attribut__ContenuAssignment_4_1 )
            // InternalMyDsl.g:1717:3: rule__Attribut__ContenuAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__ContenuAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getContenuAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group_4__1__Impl"


    // $ANTLR start "rule__HTML__BaliseAssignment_4"
    // InternalMyDsl.g:1726:1: rule__HTML__BaliseAssignment_4 : ( ruleBalise ) ;
    public final void rule__HTML__BaliseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( ruleBalise ) )
            // InternalMyDsl.g:1731:2: ( ruleBalise )
            {
            // InternalMyDsl.g:1731:2: ( ruleBalise )
            // InternalMyDsl.g:1732:3: ruleBalise
            {
             before(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise();

            state._fsp--;

             after(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__BaliseAssignment_4"


    // $ANTLR start "rule__HTML__BaliseAssignment_5_1"
    // InternalMyDsl.g:1741:1: rule__HTML__BaliseAssignment_5_1 : ( ruleBalise ) ;
    public final void rule__HTML__BaliseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ruleBalise ) )
            // InternalMyDsl.g:1746:2: ( ruleBalise )
            {
            // InternalMyDsl.g:1746:2: ( ruleBalise )
            // InternalMyDsl.g:1747:3: ruleBalise
            {
             before(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise();

            state._fsp--;

             after(grammarAccess.getHTMLAccess().getBaliseBaliseParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HTML__BaliseAssignment_5_1"


    // $ANTLR start "rule__Balise__NomAssignment_3_2"
    // InternalMyDsl.g:1756:1: rule__Balise__NomAssignment_3_2 : ( ruleBalise_Type ) ;
    public final void rule__Balise__NomAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( ( ruleBalise_Type ) )
            // InternalMyDsl.g:1761:2: ( ruleBalise_Type )
            {
            // InternalMyDsl.g:1761:2: ( ruleBalise_Type )
            // InternalMyDsl.g:1762:3: ruleBalise_Type
            {
             before(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise_Type();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__NomAssignment_3_2"


    // $ANTLR start "rule__Balise__NomAssignment_3_3_1"
    // InternalMyDsl.g:1771:1: rule__Balise__NomAssignment_3_3_1 : ( ruleBalise_Type ) ;
    public final void rule__Balise__NomAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( ( ruleBalise_Type ) )
            // InternalMyDsl.g:1776:2: ( ruleBalise_Type )
            {
            // InternalMyDsl.g:1776:2: ( ruleBalise_Type )
            // InternalMyDsl.g:1777:3: ruleBalise_Type
            {
             before(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise_Type();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getNomBalise_TypeEnumRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__NomAssignment_3_3_1"


    // $ANTLR start "rule__Balise__BaliseAssignment_4_2"
    // InternalMyDsl.g:1786:1: rule__Balise__BaliseAssignment_4_2 : ( ruleBalise ) ;
    public final void rule__Balise__BaliseAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ruleBalise ) )
            // InternalMyDsl.g:1791:2: ( ruleBalise )
            {
            // InternalMyDsl.g:1791:2: ( ruleBalise )
            // InternalMyDsl.g:1792:3: ruleBalise
            {
             before(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__BaliseAssignment_4_2"


    // $ANTLR start "rule__Balise__BaliseAssignment_4_3_1"
    // InternalMyDsl.g:1801:1: rule__Balise__BaliseAssignment_4_3_1 : ( ruleBalise ) ;
    public final void rule__Balise__BaliseAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( ( ruleBalise ) )
            // InternalMyDsl.g:1806:2: ( ruleBalise )
            {
            // InternalMyDsl.g:1806:2: ( ruleBalise )
            // InternalMyDsl.g:1807:3: ruleBalise
            {
             before(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBalise();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getBaliseBaliseParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__BaliseAssignment_4_3_1"


    // $ANTLR start "rule__Balise__AttributAssignment_5_2"
    // InternalMyDsl.g:1816:1: rule__Balise__AttributAssignment_5_2 : ( ruleAttribut ) ;
    public final void rule__Balise__AttributAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1820:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:1821:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:1821:2: ( ruleAttribut )
            // InternalMyDsl.g:1822:3: ruleAttribut
            {
             before(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__AttributAssignment_5_2"


    // $ANTLR start "rule__Balise__AttributAssignment_5_3_1"
    // InternalMyDsl.g:1831:1: rule__Balise__AttributAssignment_5_3_1 : ( ruleAttribut ) ;
    public final void rule__Balise__AttributAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1835:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:1836:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:1836:2: ( ruleAttribut )
            // InternalMyDsl.g:1837:3: ruleAttribut
            {
             before(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getBaliseAccess().getAttributAttributParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Balise__AttributAssignment_5_3_1"


    // $ANTLR start "rule__Attribut__Nom_attrAssignment_3_2"
    // InternalMyDsl.g:1846:1: rule__Attribut__Nom_attrAssignment_3_2 : ( ruleAttr_Type ) ;
    public final void rule__Attribut__Nom_attrAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( ( ruleAttr_Type ) )
            // InternalMyDsl.g:1851:2: ( ruleAttr_Type )
            {
            // InternalMyDsl.g:1851:2: ( ruleAttr_Type )
            // InternalMyDsl.g:1852:3: ruleAttr_Type
            {
             before(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttr_Type();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Nom_attrAssignment_3_2"


    // $ANTLR start "rule__Attribut__Nom_attrAssignment_3_3_1"
    // InternalMyDsl.g:1861:1: rule__Attribut__Nom_attrAssignment_3_3_1 : ( ruleAttr_Type ) ;
    public final void rule__Attribut__Nom_attrAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( ( ruleAttr_Type ) )
            // InternalMyDsl.g:1866:2: ( ruleAttr_Type )
            {
            // InternalMyDsl.g:1866:2: ( ruleAttr_Type )
            // InternalMyDsl.g:1867:3: ruleAttr_Type
            {
             before(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttr_Type();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getNom_attrAttr_TypeEnumRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Nom_attrAssignment_3_3_1"


    // $ANTLR start "rule__Attribut__ContenuAssignment_4_1"
    // InternalMyDsl.g:1876:1: rule__Attribut__ContenuAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Attribut__ContenuAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1881:2: ( ruleEString )
            {
            // InternalMyDsl.g:1881:2: ( ruleEString )
            // InternalMyDsl.g:1882:3: ruleEString
            {
             before(grammarAccess.getAttributAccess().getContenuEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getContenuEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__ContenuAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000066000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000304000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});

}