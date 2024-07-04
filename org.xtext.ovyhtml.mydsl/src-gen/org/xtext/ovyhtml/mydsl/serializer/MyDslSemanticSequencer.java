/*
 * generated by Xtext 2.35.0
 */
package org.xtext.ovyhtml.mydsl.serializer;

import com.google.inject.Inject;
import goupxm2thtml.goupdix.Attribut;
import goupxm2thtml.goupdix.Balise;
import goupxm2thtml.goupdix.GoupdixPackage;
import goupxm2thtml.goupdix.HTML;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.ovyhtml.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GoupdixPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GoupdixPackage.ATTRIBUT:
				sequence_Attribut(context, (Attribut) semanticObject); 
				return; 
			case GoupdixPackage.BALISE:
				sequence_Balise(context, (Balise) semanticObject); 
				return; 
			case GoupdixPackage.HTML:
				sequence_HTML(context, (HTML) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribut returns Attribut
	 *
	 * Constraint:
	 *     ((nom_attr+=Attr_Type nom_attr+=Attr_Type*)? contenu=EString?)
	 * </pre>
	 */
	protected void sequence_Attribut(ISerializationContext context, Attribut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Balise returns Balise
	 *
	 * Constraint:
	 *     ((nom+=Balise_Type nom+=Balise_Type*)? (balise+=Balise balise+=Balise*)? (attribut+=Attribut attribut+=Attribut*)?)
	 * </pre>
	 */
	protected void sequence_Balise(ISerializationContext context, Balise semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     HTML returns HTML
	 *
	 * Constraint:
	 *     (balise+=Balise balise+=Balise*)
	 * </pre>
	 */
	protected void sequence_HTML(ISerializationContext context, HTML semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
