/**
 */
package com.phungkhac.family;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.phungkhac.family.Person#getAge <em>Age</em>}</li>
 *   <li>{@link com.phungkhac.family.Person#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.phungkhac.family.FamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends FNamedElement {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see com.phungkhac.family.FamilyPackage#getPerson_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link com.phungkhac.family.SexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see com.phungkhac.family.SexType
	 * @see #setSex(SexType)
	 * @see com.phungkhac.family.FamilyPackage#getPerson_Sex()
	 * @model required="true"
	 * @generated
	 */
	SexType getSex();

	/**
	 * Sets the value of the '{@link com.phungkhac.family.Person#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see com.phungkhac.family.SexType
	 * @see #getSex()
	 * @generated
	 */
	void setSex(SexType value);

} // Person
