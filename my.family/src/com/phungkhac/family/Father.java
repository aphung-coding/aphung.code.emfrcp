/**
 */
package com.phungkhac.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Father</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.phungkhac.family.Father#getChildren <em>Children</em>}</li>
 *   <li>{@link com.phungkhac.family.Father#getWife <em>Wife</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.phungkhac.family.FamilyPackage#getFather()
 * @model
 * @generated
 */
public interface Father extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.phungkhac.family.Child}.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Child#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.phungkhac.family.FamilyPackage#getFather_Children()
	 * @see com.phungkhac.family.Child#getFather
	 * @model opposite="father"
	 * @generated
	 */
	EList<Child> getChildren();

	/**
	 * Returns the value of the '<em><b>Wife</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Mother#getHusband <em>Husband</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wife</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wife</em>' reference.
	 * @see #setWife(Mother)
	 * @see com.phungkhac.family.FamilyPackage#getFather_Wife()
	 * @see com.phungkhac.family.Mother#getHusband
	 * @model opposite="husband"
	 * @generated
	 */
	Mother getWife();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Father#getWife <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wife</em>' reference.
	 * @see #getWife()
	 * @generated
	 */
	void setWife(Mother value);

} // Father
