/**
 */
package com.phungkhac.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.phungkhac.family.Family#getMembers <em>Members</em>}</li>
 *   <li>{@link com.phungkhac.family.Family#getFather <em>Father</em>}</li>
 *   <li>{@link com.phungkhac.family.Family#getMother <em>Mother</em>}</li>
 *   <li>{@link com.phungkhac.family.Family#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.phungkhac.family.FamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends FNamedElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link com.phungkhac.family.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see com.phungkhac.family.FamilyPackage#getFamily_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getMembers();

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Father)
	 * @see com.phungkhac.family.FamilyPackage#getFamily_Father()
	 * @model
	 * @generated
	 */
	Father getFather();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Family#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Father value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Mother)
	 * @see com.phungkhac.family.FamilyPackage#getFamily_Mother()
	 * @model
	 * @generated
	 */
	Mother getMother();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Family#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Mother value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.phungkhac.family.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.phungkhac.family.FamilyPackage#getFamily_Children()
	 * @model
	 * @generated
	 */
	EList<Child> getChildren();

} // Family
