/**
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.guilang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regex Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.guilang.guilang.RegexVariableRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.guilang.guilang.GuilangPackage#getRegexVariableRef()
 * @model
 * @generated
 */
public interface RegexVariableRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(RegexVariableValidate)
   * @see dk.sdu.mdsd.guilang.guilang.GuilangPackage#getRegexVariableRef_Ref()
   * @model
   * @generated
   */
  RegexVariableValidate getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.guilang.guilang.RegexVariableRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(RegexVariableValidate value);

} // RegexVariableRef
