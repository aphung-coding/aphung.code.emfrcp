/**
 */
package com.phungkhac.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mother</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.phungkhac.family.Mother#getChildren <em>Children</em>}</li>
 *   <li>{@link com.phungkhac.family.Mother#getHusband <em>Husband</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.phungkhac.family.FamilyPackage#getMother()
 * @model
 * @generated
 */
public interface Mother extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.phungkhac.family.Child}.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Child#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.phungkhac.family.FamilyPackage#getMother_Children()
	 * @see com.phungkhac.family.Child#getMother
	 * @model opposite="mother"
	 * @generated
	 */
	EList<Child> getChildren();

	/**
	 * Returns the value of the '<em><b>Husband</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Father#getWife <em>Wife</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Husband</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Husband</em>' reference.
	 * @see #setHusband(Father)
	 * @see com.phungkhac.family.FamilyPackage#getMother_Husband()
	 * @see com.phungkhac.family.Father#getWife
	 * @model opposite="wife"
	 * @generated
	 */
	Father getHusband();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Mother#getHusband <em>Husband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Husband</em>' reference.
	 * @see #getHusband()
	 * @generated
	 */
	void setHusband(Father value);

} // Mother
