/**
 */
package com.phungkhac.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.phungkhac.family.Child#getMother <em>Mother</em>}</li>
 *   <li>{@link com.phungkhac.family.Child#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.phungkhac.family.FamilyPackage#getChild()
 * @model
 * @generated
 */
public interface Child extends Person {
	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Mother#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Mother)
	 * @see com.phungkhac.family.FamilyPackage#getChild_Mother()
	 * @see com.phungkhac.family.Mother#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Mother getMother();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Child#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Mother value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.phungkhac.family.Father#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Father)
	 * @see com.phungkhac.family.FamilyPackage#getChild_Father()
	 * @see com.phungkhac.family.Father#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Father getFather();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Child#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Father value);

} // Child
