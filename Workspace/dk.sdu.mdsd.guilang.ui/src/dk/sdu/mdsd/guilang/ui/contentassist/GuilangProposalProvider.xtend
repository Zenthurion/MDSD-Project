/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.ui.contentassist

import com.google.inject.Inject
import dk.sdu.mdsd.guilang.AvailableSpecifications
import dk.sdu.mdsd.guilang.GuilangModelUtils
import dk.sdu.mdsd.guilang.guilang.Unit
import dk.sdu.mdsd.guilang.guilang.impl.SpecificationImpl
import dk.sdu.mdsd.guilang.guilang.impl.SpecificationsImpl
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Assignment

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 * 
 * Useful: https://blogs.itemis.com/en/xtext-hint-content-assist-for-multiple-consecutive-keywords
 */
class GuilangProposalProvider extends AbstractGuilangProposalProvider {
	
	@Inject extension GuilangModelUtils
	//@Inject extension GuilangGrammarAccess
	
//	override complete_Element(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.complete_Element(model, ruleCall, context, acceptor)
//		
//	}
	
//	override complete_Specification(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.complete_Specification(model, ruleCall, context, acceptor)
//	}
	
	// Filter out default suggestions // Currently not being triggered for Specifications proposals. Both child and parent objects do trigger.
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		println(contentAssistContext.currentModel)
		switch(contentAssistContext.currentModel) {
			case SpecificationImpl: {println("Specification") return}
			case SpecificationsImpl: {println("Specifications") return}
			default: super.completeKeyword(keyword, contentAssistContext, acceptor)
		}
	}
	
	override completeSpecifications_Specifications(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("Specifications specifications")
		super.completeSpecifications_Specifications(model, assignment, context, acceptor)
	}
	
	override complete_Specifications(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("Specifications")
		super.complete_Specifications(model, ruleCall, context, acceptor)
	}
	
	// Add custom suggestions (complete_TheThingYouWant)
	override complete_Option(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if(!(model instanceof SpecificationImpl)) return
		var spec = model as SpecificationImpl
		var String[] options = AvailableSpecifications.instance.getSpecifications(spec.ref.class).keys
		
		for(o : options) {
			acceptor.accept(createCompletionProposal(o, context))
		}
	}
	
	// This adds all nested entities to the proposals, but the default ones are still listed (including from other files)
	override complete_Specification(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		println("Specification")
		if(!(model instanceof SpecificationsImpl)) return; 
		var unit = model.eContainer as Unit
		val entities = getEntities(unit.layout).filter[e | e.name !== null]
		
		for(e : entities) {
			acceptor.accept(createCompletionProposal(e.name, context))
		}
	}
}
