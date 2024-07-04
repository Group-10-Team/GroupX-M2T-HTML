/*
 * generated by Xtext 2.35.0
 */
package org.xtext.ovyhtml.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class HTMLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.HTML");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHTMLKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBaliseKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBaliseAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBaliseBaliseParserRuleCall_4_0 = (RuleCall)cBaliseAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBaliseAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBaliseBaliseParserRuleCall_5_1_0 = (RuleCall)cBaliseAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//HTML returns HTML:
		//    'HTML'
		//    '{'
		//        'balise' '{' balise+=Balise ( "," balise+=Balise)* '}'
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'HTML'
		//'{'
		//    'balise' '{' balise+=Balise ( "," balise+=Balise)* '}'
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'HTML'
		public Keyword getHTMLKeyword_0() { return cHTMLKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'balise'
		public Keyword getBaliseKeyword_2() { return cBaliseKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//balise+=Balise
		public Assignment getBaliseAssignment_4() { return cBaliseAssignment_4; }
		
		//Balise
		public RuleCall getBaliseBaliseParserRuleCall_4_0() { return cBaliseBaliseParserRuleCall_4_0; }
		
		//( "," balise+=Balise)*
		public Group getGroup_5() { return cGroup_5; }
		
		//","
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }
		
		//balise+=Balise
		public Assignment getBaliseAssignment_5_1() { return cBaliseAssignment_5_1; }
		
		//Balise
		public RuleCall getBaliseBaliseParserRuleCall_5_1_0() { return cBaliseBaliseParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class BaliseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.Balise");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBaliseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBaliseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNomKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cNomAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cNomBalise_TypeEnumRuleCall_3_2_0 = (RuleCall)cNomAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cNomAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cNomBalise_TypeEnumRuleCall_3_3_1_0 = (RuleCall)cNomAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBaliseKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cBaliseAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cBaliseBaliseParserRuleCall_4_2_0 = (RuleCall)cBaliseAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cBaliseAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cBaliseBaliseParserRuleCall_4_3_1_0 = (RuleCall)cBaliseAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cAttributKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cAttributAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cAttributAttributParserRuleCall_5_2_0 = (RuleCall)cAttributAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cAttributAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cAttributAttributParserRuleCall_5_3_1_0 = (RuleCall)cAttributAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Balise returns Balise:
		//    {Balise}
		//    'Balise'
		//    '{'
		//        ('nom' '{' nom+=Balise_Type ( "," nom+=Balise_Type)* '}' )?
		//        ('balise' '{' balise+=Balise ( "," balise+=Balise)* '}' )?
		//        ('attribut' '{' attribut+=Attribut ( "," attribut+=Attribut)* '}' )?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Balise}
		//'Balise'
		//'{'
		//    ('nom' '{' nom+=Balise_Type ( "," nom+=Balise_Type)* '}' )?
		//    ('balise' '{' balise+=Balise ( "," balise+=Balise)* '}' )?
		//    ('attribut' '{' attribut+=Attribut ( "," attribut+=Attribut)* '}' )?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Balise}
		public Action getBaliseAction_0() { return cBaliseAction_0; }
		
		//'Balise'
		public Keyword getBaliseKeyword_1() { return cBaliseKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('nom' '{' nom+=Balise_Type ( "," nom+=Balise_Type)* '}' )?
		public Group getGroup_3() { return cGroup_3; }
		
		//'nom'
		public Keyword getNomKeyword_3_0() { return cNomKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//nom+=Balise_Type
		public Assignment getNomAssignment_3_2() { return cNomAssignment_3_2; }
		
		//Balise_Type
		public RuleCall getNomBalise_TypeEnumRuleCall_3_2_0() { return cNomBalise_TypeEnumRuleCall_3_2_0; }
		
		//( "," nom+=Balise_Type)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//nom+=Balise_Type
		public Assignment getNomAssignment_3_3_1() { return cNomAssignment_3_3_1; }
		
		//Balise_Type
		public RuleCall getNomBalise_TypeEnumRuleCall_3_3_1_0() { return cNomBalise_TypeEnumRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//('balise' '{' balise+=Balise ( "," balise+=Balise)* '}' )?
		public Group getGroup_4() { return cGroup_4; }
		
		//'balise'
		public Keyword getBaliseKeyword_4_0() { return cBaliseKeyword_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }
		
		//balise+=Balise
		public Assignment getBaliseAssignment_4_2() { return cBaliseAssignment_4_2; }
		
		//Balise
		public RuleCall getBaliseBaliseParserRuleCall_4_2_0() { return cBaliseBaliseParserRuleCall_4_2_0; }
		
		//( "," balise+=Balise)*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//balise+=Balise
		public Assignment getBaliseAssignment_4_3_1() { return cBaliseAssignment_4_3_1; }
		
		//Balise
		public RuleCall getBaliseBaliseParserRuleCall_4_3_1_0() { return cBaliseBaliseParserRuleCall_4_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }
		
		//('attribut' '{' attribut+=Attribut ( "," attribut+=Attribut)* '}' )?
		public Group getGroup_5() { return cGroup_5; }
		
		//'attribut'
		public Keyword getAttributKeyword_5_0() { return cAttributKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//attribut+=Attribut
		public Assignment getAttributAssignment_5_2() { return cAttributAssignment_5_2; }
		
		//Attribut
		public RuleCall getAttributAttributParserRuleCall_5_2_0() { return cAttributAttributParserRuleCall_5_2_0; }
		
		//( "," attribut+=Attribut)*
		public Group getGroup_5_3() { return cGroup_5_3; }
		
		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }
		
		//attribut+=Attribut
		public Assignment getAttributAssignment_5_3_1() { return cAttributAssignment_5_3_1; }
		
		//Attribut
		public RuleCall getAttributAttributParserRuleCall_5_3_1_0() { return cAttributAttributParserRuleCall_5_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AttributElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.Attribut");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAttributAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAttributKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNom_attrKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cNom_attrAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cNom_attrAttr_TypeEnumRuleCall_3_2_0 = (RuleCall)cNom_attrAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cNom_attrAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cNom_attrAttr_TypeEnumRuleCall_3_3_1_0 = (RuleCall)cNom_attrAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cContenuKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cContenuAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cContenuEStringParserRuleCall_4_1_0 = (RuleCall)cContenuAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Attribut returns Attribut:
		//    {Attribut}
		//    'Attribut'
		//    '{'
		//        ('nom_attr' '{' nom_attr+=Attr_Type ( "," nom_attr+=Attr_Type)* '}' )?
		//        ('contenu' contenu=EString)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Attribut}
		//'Attribut'
		//'{'
		//    ('nom_attr' '{' nom_attr+=Attr_Type ( "," nom_attr+=Attr_Type)* '}' )?
		//    ('contenu' contenu=EString)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Attribut}
		public Action getAttributAction_0() { return cAttributAction_0; }
		
		//'Attribut'
		public Keyword getAttributKeyword_1() { return cAttributKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('nom_attr' '{' nom_attr+=Attr_Type ( "," nom_attr+=Attr_Type)* '}' )?
		public Group getGroup_3() { return cGroup_3; }
		
		//'nom_attr'
		public Keyword getNom_attrKeyword_3_0() { return cNom_attrKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//nom_attr+=Attr_Type
		public Assignment getNom_attrAssignment_3_2() { return cNom_attrAssignment_3_2; }
		
		//Attr_Type
		public RuleCall getNom_attrAttr_TypeEnumRuleCall_3_2_0() { return cNom_attrAttr_TypeEnumRuleCall_3_2_0; }
		
		//( "," nom_attr+=Attr_Type)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//nom_attr+=Attr_Type
		public Assignment getNom_attrAssignment_3_3_1() { return cNom_attrAssignment_3_3_1; }
		
		//Attr_Type
		public RuleCall getNom_attrAttr_TypeEnumRuleCall_3_3_1_0() { return cNom_attrAttr_TypeEnumRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//('contenu' contenu=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'contenu'
		public Keyword getContenuKeyword_4_0() { return cContenuKeyword_4_0; }
		
		//contenu=EString
		public Assignment getContenuAssignment_4_1() { return cContenuAssignment_4_1; }
		
		//EString
		public RuleCall getContenuEStringParserRuleCall_4_1_0() { return cContenuEStringParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	public class Balise_TypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.Balise_Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTitreEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTitreTitreKeyword_0_0 = (Keyword)cTitreEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cH1EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cH1H1Keyword_1_0 = (Keyword)cH1EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cH2EnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cH2H2Keyword_2_0 = (Keyword)cH2EnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cH3EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cH3H3Keyword_3_0 = (Keyword)cH3EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cH4EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cH4H4Keyword_4_0 = (Keyword)cH4EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cPEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cPPKeyword_5_0 = (Keyword)cPEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cSpanEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cSpanSpanKeyword_6_0 = (Keyword)cSpanEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDivEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDivDivKeyword_7_0 = (Keyword)cDivEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum Balise_Type returns Balise_Type:
		//                Titre = 'Titre' | H1 = 'H1' | H2 = 'H2' | H3 = 'H3' | H4 = 'H4' | P = 'P' | span = 'span' | div = 'div';
		public EnumRule getRule() { return rule; }
		
		//Titre = 'Titre' | H1 = 'H1' | H2 = 'H2' | H3 = 'H3' | H4 = 'H4' | P = 'P' | span = 'span' | div = 'div'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Titre = 'Titre'
		public EnumLiteralDeclaration getTitreEnumLiteralDeclaration_0() { return cTitreEnumLiteralDeclaration_0; }
		
		//'Titre'
		public Keyword getTitreTitreKeyword_0_0() { return cTitreTitreKeyword_0_0; }
		
		//H1 = 'H1'
		public EnumLiteralDeclaration getH1EnumLiteralDeclaration_1() { return cH1EnumLiteralDeclaration_1; }
		
		//'H1'
		public Keyword getH1H1Keyword_1_0() { return cH1H1Keyword_1_0; }
		
		//H2 = 'H2'
		public EnumLiteralDeclaration getH2EnumLiteralDeclaration_2() { return cH2EnumLiteralDeclaration_2; }
		
		//'H2'
		public Keyword getH2H2Keyword_2_0() { return cH2H2Keyword_2_0; }
		
		//H3 = 'H3'
		public EnumLiteralDeclaration getH3EnumLiteralDeclaration_3() { return cH3EnumLiteralDeclaration_3; }
		
		//'H3'
		public Keyword getH3H3Keyword_3_0() { return cH3H3Keyword_3_0; }
		
		//H4 = 'H4'
		public EnumLiteralDeclaration getH4EnumLiteralDeclaration_4() { return cH4EnumLiteralDeclaration_4; }
		
		//'H4'
		public Keyword getH4H4Keyword_4_0() { return cH4H4Keyword_4_0; }
		
		//P = 'P'
		public EnumLiteralDeclaration getPEnumLiteralDeclaration_5() { return cPEnumLiteralDeclaration_5; }
		
		//'P'
		public Keyword getPPKeyword_5_0() { return cPPKeyword_5_0; }
		
		//span = 'span'
		public EnumLiteralDeclaration getSpanEnumLiteralDeclaration_6() { return cSpanEnumLiteralDeclaration_6; }
		
		//'span'
		public Keyword getSpanSpanKeyword_6_0() { return cSpanSpanKeyword_6_0; }
		
		//div = 'div'
		public EnumLiteralDeclaration getDivEnumLiteralDeclaration_7() { return cDivEnumLiteralDeclaration_7; }
		
		//'div'
		public Keyword getDivDivKeyword_7_0() { return cDivDivKeyword_7_0; }
	}
	public class Attr_TypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.ovyhtml.mydsl.MyDsl.Attr_Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cClassEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cClassClassKeyword_0_0 = (Keyword)cClassEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIdEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIdIdKeyword_1_0 = (Keyword)cIdEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSrcEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSrcSrcKeyword_2_0 = (Keyword)cSrcEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cHrefEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cHrefHrefKeyword_3_0 = (Keyword)cHrefEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Attr_Type returns Attr_Type:
		//                class = 'class' | id = 'id' | src = 'src' | href = 'href';
		public EnumRule getRule() { return rule; }
		
		//class = 'class' | id = 'id' | src = 'src' | href = 'href'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//class = 'class'
		public EnumLiteralDeclaration getClassEnumLiteralDeclaration_0() { return cClassEnumLiteralDeclaration_0; }
		
		//'class'
		public Keyword getClassClassKeyword_0_0() { return cClassClassKeyword_0_0; }
		
		//id = 'id'
		public EnumLiteralDeclaration getIdEnumLiteralDeclaration_1() { return cIdEnumLiteralDeclaration_1; }
		
		//'id'
		public Keyword getIdIdKeyword_1_0() { return cIdIdKeyword_1_0; }
		
		//src = 'src'
		public EnumLiteralDeclaration getSrcEnumLiteralDeclaration_2() { return cSrcEnumLiteralDeclaration_2; }
		
		//'src'
		public Keyword getSrcSrcKeyword_2_0() { return cSrcSrcKeyword_2_0; }
		
		//href = 'href'
		public EnumLiteralDeclaration getHrefEnumLiteralDeclaration_3() { return cHrefEnumLiteralDeclaration_3; }
		
		//'href'
		public Keyword getHrefHrefKeyword_3_0() { return cHrefHrefKeyword_3_0; }
	}
	
	private final HTMLElements pHTML;
	private final BaliseElements pBalise;
	private final Balise_TypeElements eBalise_Type;
	private final AttributElements pAttribut;
	private final Attr_TypeElements eAttr_Type;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pHTML = new HTMLElements();
		this.pBalise = new BaliseElements();
		this.eBalise_Type = new Balise_TypeElements();
		this.pAttribut = new AttributElements();
		this.eAttr_Type = new Attr_TypeElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.ovyhtml.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//HTML returns HTML:
	//    'HTML'
	//    '{'
	//        'balise' '{' balise+=Balise ( "," balise+=Balise)* '}'
	//    '}';
	public HTMLElements getHTMLAccess() {
		return pHTML;
	}
	
	public ParserRule getHTMLRule() {
		return getHTMLAccess().getRule();
	}
	
	//Balise returns Balise:
	//    {Balise}
	//    'Balise'
	//    '{'
	//        ('nom' '{' nom+=Balise_Type ( "," nom+=Balise_Type)* '}' )?
	//        ('balise' '{' balise+=Balise ( "," balise+=Balise)* '}' )?
	//        ('attribut' '{' attribut+=Attribut ( "," attribut+=Attribut)* '}' )?
	//    '}';
	public BaliseElements getBaliseAccess() {
		return pBalise;
	}
	
	public ParserRule getBaliseRule() {
		return getBaliseAccess().getRule();
	}
	
	//enum Balise_Type returns Balise_Type:
	//                Titre = 'Titre' | H1 = 'H1' | H2 = 'H2' | H3 = 'H3' | H4 = 'H4' | P = 'P' | span = 'span' | div = 'div';
	public Balise_TypeElements getBalise_TypeAccess() {
		return eBalise_Type;
	}
	
	public EnumRule getBalise_TypeRule() {
		return getBalise_TypeAccess().getRule();
	}
	
	//Attribut returns Attribut:
	//    {Attribut}
	//    'Attribut'
	//    '{'
	//        ('nom_attr' '{' nom_attr+=Attr_Type ( "," nom_attr+=Attr_Type)* '}' )?
	//        ('contenu' contenu=EString)?
	//    '}';
	public AttributElements getAttributAccess() {
		return pAttribut;
	}
	
	public ParserRule getAttributRule() {
		return getAttributAccess().getRule();
	}
	
	//enum Attr_Type returns Attr_Type:
	//                class = 'class' | id = 'id' | src = 'src' | href = 'href';
	public Attr_TypeElements getAttr_TypeAccess() {
		return eAttr_Type;
	}
	
	public EnumRule getAttr_TypeRule() {
		return getAttr_TypeAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}