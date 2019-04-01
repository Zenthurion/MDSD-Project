/*
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.validation

import dk.sdu.mdsd.guilang.AvailableSpecifications
import dk.sdu.mdsd.guilang.guilang.Entity
import dk.sdu.mdsd.guilang.guilang.GuilangPackage
import dk.sdu.mdsd.guilang.guilang.Specification
import dk.sdu.mdsd.guilang.guilang.Template
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GuilangValidator extends AbstractGuilangValidator {

	public static val INVALID_NAME = 'invalidName'
	public static val INVALID_OPTION = 'invalidOption'

//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					GuilangPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	@Check
	def checkValidOptions(Specification spec) {
		var correctOptions = AvailableSpecifications.instance.getSpecifications(spec.ref.class)
		
		var int index = 0
		for (o : spec.options) {
			var flag = false;
			for (key : correctOptions.keys) {
				if(o.key.equals(key)) {
					flag = true;
				}
			}	
			if(!flag) {
				var type = spec.ref.class.canonicalName
				type = type.substring(type.lastIndexOf('.') + 1, type.length - 4)
				error('''"�o.key�" is not a valid key for an entity of type �type�''', GuilangPackage.Literals.SPECIFICATION__OPTIONS, index, INVALID_OPTION)
			}
			index++
		}
	} 

	@Check
	def checkTemplateNamesStartWithCapital(Template template) {
		if (!Character.isUpperCase(template.name.charAt(0))) {
			warning("Template names should start with a capital letter", GuilangPackage.Literals.TEMPLATE__NAME,
				INVALID_NAME)
		}
	}

	@Check
	def checkEntityNamesStartWithLowerCase(Entity entity) {
		if (entity.name !== null && Character.isUpperCase(entity.name.charAt(0))) {
			warning("Entity names should start with a lowercase letter", GuilangPackage.Literals.ENTITY__NAME,
				INVALID_NAME)
		}
	}
}
