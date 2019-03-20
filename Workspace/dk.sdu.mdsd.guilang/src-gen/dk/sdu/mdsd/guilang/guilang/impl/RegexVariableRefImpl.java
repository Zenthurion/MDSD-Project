/**
 * generated by Xtext 2.16.0
 */
package dk.sdu.mdsd.guilang.guilang.impl;

import dk.sdu.mdsd.guilang.guilang.GuilangPackage;
import dk.sdu.mdsd.guilang.guilang.RegexVariableRef;
import dk.sdu.mdsd.guilang.guilang.RegexVariableValidate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regex Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.guilang.guilang.impl.RegexVariableRefImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegexVariableRefImpl extends MinimalEObjectImpl.Container implements RegexVariableRef
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected RegexVariableValidate ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegexVariableRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GuilangPackage.Literals.REGEX_VARIABLE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RegexVariableValidate getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (RegexVariableValidate)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuilangPackage.REGEX_VARIABLE_REF__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexVariableValidate basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(RegexVariableValidate newRef)
  {
    RegexVariableValidate oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuilangPackage.REGEX_VARIABLE_REF__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GuilangPackage.REGEX_VARIABLE_REF__REF:
        if (resolve) return getRef();
        return basicGetRef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GuilangPackage.REGEX_VARIABLE_REF__REF:
        setRef((RegexVariableValidate)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GuilangPackage.REGEX_VARIABLE_REF__REF:
        setRef((RegexVariableValidate)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GuilangPackage.REGEX_VARIABLE_REF__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //RegexVariableRefImpl
