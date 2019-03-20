/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.serializer;

import com.google.inject.Inject;
import dk.sdu.mdsd.guilang.guilang.And;
import dk.sdu.mdsd.guilang.guilang.Button;
import dk.sdu.mdsd.guilang.guilang.ButtonSpec;
import dk.sdu.mdsd.guilang.guilang.Checkbox;
import dk.sdu.mdsd.guilang.guilang.CheckboxSpec;
import dk.sdu.mdsd.guilang.guilang.CheckboxValidate;
import dk.sdu.mdsd.guilang.guilang.ElementRef;
import dk.sdu.mdsd.guilang.guilang.GUI;
import dk.sdu.mdsd.guilang.guilang.GuilangPackage;
import dk.sdu.mdsd.guilang.guilang.Horizontal;
import dk.sdu.mdsd.guilang.guilang.HorizontalSpec;
import dk.sdu.mdsd.guilang.guilang.Input;
import dk.sdu.mdsd.guilang.guilang.InputSpec;
import dk.sdu.mdsd.guilang.guilang.Label;
import dk.sdu.mdsd.guilang.guilang.LabelSpec;
import dk.sdu.mdsd.guilang.guilang.Layout;
import dk.sdu.mdsd.guilang.guilang.LayoutSpec;
import dk.sdu.mdsd.guilang.guilang.Not;
import dk.sdu.mdsd.guilang.guilang.Or;
import dk.sdu.mdsd.guilang.guilang.PresetTextValidate;
import dk.sdu.mdsd.guilang.guilang.RegexValidate;
import dk.sdu.mdsd.guilang.guilang.RegexVariableRef;
import dk.sdu.mdsd.guilang.guilang.RegexVariableValidate;
import dk.sdu.mdsd.guilang.guilang.Require;
import dk.sdu.mdsd.guilang.guilang.RequireElements;
import dk.sdu.mdsd.guilang.guilang.SizeSpec;
import dk.sdu.mdsd.guilang.guilang.Specification;
import dk.sdu.mdsd.guilang.guilang.Specifications;
import dk.sdu.mdsd.guilang.guilang.TextValidate;
import dk.sdu.mdsd.guilang.guilang.Unit;
import dk.sdu.mdsd.guilang.guilang.Validate;
import dk.sdu.mdsd.guilang.guilang.Vertical;
import dk.sdu.mdsd.guilang.guilang.VerticalSpec;
import dk.sdu.mdsd.guilang.services.GuilangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GuilangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GuilangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GuilangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GuilangPackage.AND:
				sequence_RequireAnd(context, (And) semanticObject); 
				return; 
			case GuilangPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case GuilangPackage.BUTTON_SPEC:
				sequence_ButtonSpec(context, (ButtonSpec) semanticObject); 
				return; 
			case GuilangPackage.CHECKBOX:
				sequence_Checkbox(context, (Checkbox) semanticObject); 
				return; 
			case GuilangPackage.CHECKBOX_SPEC:
				sequence_CheckboxSpec(context, (CheckboxSpec) semanticObject); 
				return; 
			case GuilangPackage.CHECKBOX_VALIDATE:
				sequence_CheckboxValidate(context, (CheckboxValidate) semanticObject); 
				return; 
			case GuilangPackage.ELEMENT_REF:
				sequence_RequireBase(context, (ElementRef) semanticObject); 
				return; 
			case GuilangPackage.GUI:
				sequence_GUI(context, (GUI) semanticObject); 
				return; 
			case GuilangPackage.HORIZONTAL:
				sequence_Horizontal(context, (Horizontal) semanticObject); 
				return; 
			case GuilangPackage.HORIZONTAL_SPEC:
				sequence_HorizontalSpec(context, (HorizontalSpec) semanticObject); 
				return; 
			case GuilangPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case GuilangPackage.INPUT_SPEC:
				sequence_InputSpec(context, (InputSpec) semanticObject); 
				return; 
			case GuilangPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case GuilangPackage.LABEL_SPEC:
				sequence_LabelSpec(context, (LabelSpec) semanticObject); 
				return; 
			case GuilangPackage.LAYOUT:
				sequence_Layout(context, (Layout) semanticObject); 
				return; 
			case GuilangPackage.LAYOUT_SPEC:
				sequence_LayoutSpec(context, (LayoutSpec) semanticObject); 
				return; 
			case GuilangPackage.NOT:
				sequence_RequireBase(context, (Not) semanticObject); 
				return; 
			case GuilangPackage.OR:
				sequence_RequireOr(context, (Or) semanticObject); 
				return; 
			case GuilangPackage.PRESET_TEXT_VALIDATE:
				sequence_PresetTextValidate(context, (PresetTextValidate) semanticObject); 
				return; 
			case GuilangPackage.REGEX_VALIDATE:
				sequence_RegexValidate(context, (RegexValidate) semanticObject); 
				return; 
			case GuilangPackage.REGEX_VARIABLE_REF:
				sequence_RegexVariableRef(context, (RegexVariableRef) semanticObject); 
				return; 
			case GuilangPackage.REGEX_VARIABLE_VALIDATE:
				sequence_RegexVariableValidate(context, (RegexVariableValidate) semanticObject); 
				return; 
			case GuilangPackage.REQUIRE:
				sequence_RequireBase(context, (Require) semanticObject); 
				return; 
			case GuilangPackage.REQUIRE_ELEMENTS:
				sequence_RequireElements(context, (RequireElements) semanticObject); 
				return; 
			case GuilangPackage.SIZE_SPEC:
				sequence_SizeSpec(context, (SizeSpec) semanticObject); 
				return; 
			case GuilangPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case GuilangPackage.SPECIFICATIONS:
				sequence_Specifications(context, (Specifications) semanticObject); 
				return; 
			case GuilangPackage.TEXT_VALIDATE:
				sequence_TextValidate(context, (TextValidate) semanticObject); 
				return; 
			case GuilangPackage.UNIT:
				sequence_Unit(context, (Unit) semanticObject); 
				return; 
			case GuilangPackage.VALIDATE:
				sequence_Validate(context, (Validate) semanticObject); 
				return; 
			case GuilangPackage.VERTICAL:
				sequence_Vertical(context, (Vertical) semanticObject); 
				return; 
			case GuilangPackage.VERTICAL_SPEC:
				sequence_VerticalSpec(context, (VerticalSpec) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ButtonSpec returns ButtonSpec
	 *
	 * Constraint:
	 *     (ref=[Button|ID] options+=ButtonSpecOptions*)
	 */
	protected void sequence_ButtonSpec(ISerializationContext context, ButtonSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Button
	 *     Element returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     name=ID?
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CheckboxSpec returns CheckboxSpec
	 *
	 * Constraint:
	 *     ref=[Checkbox|ID]
	 */
	protected void sequence_CheckboxSpec(ISerializationContext context, CheckboxSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.CHECKBOX_SPEC__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.CHECKBOX_SPEC__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckboxSpecAccess().getRefCheckboxIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GuilangPackage.Literals.CHECKBOX_SPEC__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CheckboxValidate returns CheckboxValidate
	 *
	 * Constraint:
	 *     (value='is-checked' | value='is-unchecked')
	 */
	protected void sequence_CheckboxValidate(ISerializationContext context, CheckboxValidate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Checkbox
	 *     Element returns Checkbox
	 *     Checkbox returns Checkbox
	 *
	 * Constraint:
	 *     name=ID?
	 */
	protected void sequence_Checkbox(ISerializationContext context, Checkbox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GUI returns GUI
	 *
	 * Constraint:
	 *     main=Main
	 */
	protected void sequence_GUI(ISerializationContext context, GUI semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.GUI__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.GUI__MAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGUIAccess().getMainMainParserRuleCall_0(), semanticObject.getMain());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HorizontalSpec returns HorizontalSpec
	 *
	 * Constraint:
	 *     ref=[Horizontal|ID]
	 */
	protected void sequence_HorizontalSpec(ISerializationContext context, HorizontalSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.HORIZONTAL_SPEC__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.HORIZONTAL_SPEC__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHorizontalSpecAccess().getRefHorizontalIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GuilangPackage.Literals.HORIZONTAL_SPEC__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Horizontal
	 *     LayoutType returns Horizontal
	 *     Horizontal returns Horizontal
	 *
	 * Constraint:
	 *     (name=ID? entities+=Entity*)
	 */
	protected void sequence_Horizontal(ISerializationContext context, Horizontal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputSpec returns InputSpec
	 *
	 * Constraint:
	 *     (ref=[Input|ID] options+=InputSpecOptions*)
	 */
	protected void sequence_InputSpec(ISerializationContext context, InputSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Input
	 *     Element returns Input
	 *     Input returns Input
	 *
	 * Constraint:
	 *     name=ID?
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LabelSpec returns LabelSpec
	 *
	 * Constraint:
	 *     ref=[Label|ID]
	 */
	protected void sequence_LabelSpec(ISerializationContext context, LabelSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.LABEL_SPEC__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.LABEL_SPEC__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelSpecAccess().getRefLabelIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GuilangPackage.Literals.LABEL_SPEC__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Label
	 *     Element returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     name=ID?
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LayoutSpec returns LayoutSpec
	 *
	 * Constraint:
	 *     ref=[Layout|ID]
	 */
	protected void sequence_LayoutSpec(ISerializationContext context, LayoutSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.LAYOUT_SPEC__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.LAYOUT_SPEC__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLayoutSpecAccess().getRefLayoutIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GuilangPackage.Literals.LAYOUT_SPEC__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Layout
	 *     Layout returns Layout
	 *     LayoutType returns Layout
	 *
	 * Constraint:
	 *     (name=ID? entities+=Entity*)
	 */
	protected void sequence_Layout(ISerializationContext context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PresetTextValidate returns PresetTextValidate
	 *
	 * Constraint:
	 *     (value='val-password' | value='val-email')
	 */
	protected void sequence_PresetTextValidate(ISerializationContext context, PresetTextValidate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RegexValidate returns RegexValidate
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_RegexValidate(ISerializationContext context, RegexValidate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REGEX_VALIDATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REGEX_VALIDATE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegexValidateAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RegexVariableRef returns RegexVariableRef
	 *
	 * Constraint:
	 *     ref=[RegexVariableValidate|ID]
	 */
	protected void sequence_RegexVariableRef(ISerializationContext context, RegexVariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REGEX_VARIABLE_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REGEX_VARIABLE_REF__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegexVariableRefAccess().getRefRegexVariableValidateIDTerminalRuleCall_0_1(), semanticObject.eGet(GuilangPackage.Literals.REGEX_VARIABLE_REF__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RegexVariableValidate returns RegexVariableValidate
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_RegexVariableValidate(ISerializationContext context, RegexVariableValidate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REGEX_VARIABLE_VALIDATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REGEX_VARIABLE_VALIDATE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegexVariableValidateAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Require returns And
	 *     RequireOr returns And
	 *     RequireOr.Or_1_0 returns And
	 *     RequireAnd returns And
	 *     RequireAnd.And_1_0 returns And
	 *
	 * Constraint:
	 *     (left=RequireAnd_And_1_0 right=RequireBase)
	 */
	protected void sequence_RequireAnd(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRequireAndAccess().getRightRequireBaseParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Require returns ElementRef
	 *     RequireOr returns ElementRef
	 *     RequireOr.Or_1_0 returns ElementRef
	 *     RequireAnd returns ElementRef
	 *     RequireAnd.And_1_0 returns ElementRef
	 *     RequireBase returns ElementRef
	 *
	 * Constraint:
	 *     ref=[Element|ID]
	 */
	protected void sequence_RequireBase(ISerializationContext context, ElementRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.ELEMENT_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.ELEMENT_REF__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireBaseAccess().getRefElementIDTerminalRuleCall_2_1_0_1(), semanticObject.eGet(GuilangPackage.Literals.ELEMENT_REF__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Require returns Not
	 *     RequireOr returns Not
	 *     RequireOr.Or_1_0 returns Not
	 *     RequireAnd returns Not
	 *     RequireAnd.And_1_0 returns Not
	 *     RequireBase returns Not
	 *
	 * Constraint:
	 *     exp=RequireBase
	 */
	protected void sequence_RequireBase(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REQUIRE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REQUIRE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireBaseAccess().getExpRequireBaseParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Require returns Require
	 *     RequireOr returns Require
	 *     RequireOr.Or_1_0 returns Require
	 *     RequireAnd returns Require
	 *     RequireAnd.And_1_0 returns Require
	 *     RequireBase returns Require
	 *
	 * Constraint:
	 *     exp=Require
	 */
	protected void sequence_RequireBase(ISerializationContext context, Require semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REQUIRE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REQUIRE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireBaseAccess().getExpRequireParserRuleCall_0_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ButtonSpecOptions returns RequireElements
	 *     InputSpecOptions returns RequireElements
	 *     RequireElements returns RequireElements
	 *
	 * Constraint:
	 *     elements=Require
	 */
	protected void sequence_RequireElements(ISerializationContext context, RequireElements semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.REQUIRE_ELEMENTS__ELEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.REQUIRE_ELEMENTS__ELEMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireElementsAccess().getElementsRequireParserRuleCall_1_0(), semanticObject.getElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Require returns Or
	 *     RequireOr returns Or
	 *     RequireOr.Or_1_0 returns Or
	 *
	 * Constraint:
	 *     (left=RequireOr_Or_1_0 right=RequireAnd)
	 */
	protected void sequence_RequireOr(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getRequireOrAccess().getRightRequireAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SizeSpec returns SizeSpec
	 *
	 * Constraint:
	 *     ((width=INT height=INT) | (width=INT height=INT))
	 */
	protected void sequence_SizeSpec(ISerializationContext context, SizeSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (
	 *         type=LayoutSpec | 
	 *         type=VerticalSpec | 
	 *         type=HorizontalSpec | 
	 *         type=LabelSpec | 
	 *         type=ButtonSpec | 
	 *         type=InputSpec | 
	 *         type=CheckboxSpec
	 *     )
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specifications returns Specifications
	 *
	 * Constraint:
	 *     specifications+=Specification*
	 */
	protected void sequence_Specifications(ISerializationContext context, Specifications semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputSpecOptions returns TextValidate
	 *     TextValidate returns TextValidate
	 *
	 * Constraint:
	 *     (validation=RegexValidate | validation=RegexVariableRef | validation=PresetTextValidate)
	 */
	protected void sequence_TextValidate(ISerializationContext context, TextValidate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Main returns Unit
	 *     Unit returns Unit
	 *
	 * Constraint:
	 *     (layout=Layout specifications=Specifications?)
	 */
	protected void sequence_Unit(ISerializationContext context, Unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Validate returns Validate
	 *
	 * Constraint:
	 *     (validations+=TextValidate | validations+=CheckboxValidate)*
	 */
	protected void sequence_Validate(ISerializationContext context, Validate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerticalSpec returns VerticalSpec
	 *
	 * Constraint:
	 *     ref=[Vertical|ID]
	 */
	protected void sequence_VerticalSpec(ISerializationContext context, VerticalSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GuilangPackage.Literals.VERTICAL_SPEC__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GuilangPackage.Literals.VERTICAL_SPEC__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerticalSpecAccess().getRefVerticalIDTerminalRuleCall_0_0_1(), semanticObject.eGet(GuilangPackage.Literals.VERTICAL_SPEC__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Vertical
	 *     LayoutType returns Vertical
	 *     Vertical returns Vertical
	 *
	 * Constraint:
	 *     (name=ID? entities+=Entity*)
	 */
	protected void sequence_Vertical(ISerializationContext context, Vertical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
