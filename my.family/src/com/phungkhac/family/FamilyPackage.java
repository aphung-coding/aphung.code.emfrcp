/**
 */
package com.phungkhac.family;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.phungkhac.family.FamilyFactory
 * @model kind="package"
 * @generated
 */
public interface FamilyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "family";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.phungkhac.com/family";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "family";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FamilyPackage eINSTANCE = com.phungkhac.family.impl.FamilyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.FNamedElementImpl <em>FNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.FNamedElementImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFNamedElement()
	 * @generated
	 */
	int FNAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>FNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.PersonImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = FNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = FNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SEX = FNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = FNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.FamilyImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = FNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MEMBERS = FNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__FATHER = FNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__MOTHER = FNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__CHILDREN = FNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = FNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.FatherImpl <em>Father</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.FatherImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFather()
	 * @generated
	 */
	int FATHER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__SEX = PERSON__SEX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__CHILDREN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wife</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER__WIFE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Father</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FATHER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.MotherImpl <em>Mother</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.MotherImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getMother()
	 * @generated
	 */
	int MOTHER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__SEX = PERSON__SEX;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__CHILDREN = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Husband</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER__HUSBAND = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mother</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTHER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.impl.ChildImpl
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__SEX = PERSON__SEX;

	/**
	 * The feature id for the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__MOTHER = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__FATHER = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.phungkhac.family.SexType <em>Sex Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.phungkhac.family.SexType
	 * @see com.phungkhac.family.impl.FamilyPackageImpl#getSexType()
	 * @generated
	 */
	int SEX_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.FNamedElement <em>FNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FNamed Element</em>'.
	 * @see com.phungkhac.family.FNamedElement
	 * @generated
	 */
	EClass getFNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.phungkhac.family.FNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.phungkhac.family.FNamedElement#getName()
	 * @see #getFNamedElement()
	 * @generated
	 */
	EAttribute getFNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see com.phungkhac.family.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link com.phungkhac.family.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see com.phungkhac.family.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the attribute '{@link com.phungkhac.family.Person#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see com.phungkhac.family.Person#getSex()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Sex();

	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see com.phungkhac.family.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link com.phungkhac.family.Family#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see com.phungkhac.family.Family#getMembers()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Members();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Family#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Father</em>'.
	 * @see com.phungkhac.family.Family#getFather()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Father();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Family#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mother</em>'.
	 * @see com.phungkhac.family.Family#getMother()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Mother();

	/**
	 * Returns the meta object for the reference list '{@link com.phungkhac.family.Family#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.phungkhac.family.Family#getChildren()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Children();

	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.Father <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Father</em>'.
	 * @see com.phungkhac.family.Father
	 * @generated
	 */
	EClass getFather();

	/**
	 * Returns the meta object for the reference list '{@link com.phungkhac.family.Father#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.phungkhac.family.Father#getChildren()
	 * @see #getFather()
	 * @generated
	 */
	EReference getFather_Children();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Father#getWife <em>Wife</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wife</em>'.
	 * @see com.phungkhac.family.Father#getWife()
	 * @see #getFather()
	 * @generated
	 */
	EReference getFather_Wife();

	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.Mother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mother</em>'.
	 * @see com.phungkhac.family.Mother
	 * @generated
	 */
	EClass getMother();

	/**
	 * Returns the meta object for the reference list '{@link com.phungkhac.family.Mother#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.phungkhac.family.Mother#getChildren()
	 * @see #getMother()
	 * @generated
	 */
	EReference getMother_Children();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Mother#getHusband <em>Husband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Husband</em>'.
	 * @see com.phungkhac.family.Mother#getHusband()
	 * @see #getMother()
	 * @generated
	 */
	EReference getMother_Husband();

	/**
	 * Returns the meta object for class '{@link com.phungkhac.family.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see com.phungkhac.family.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Child#getMother <em>Mother</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mother</em>'.
	 * @see com.phungkhac.family.Child#getMother()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Mother();

	/**
	 * Returns the meta object for the reference '{@link com.phungkhac.family.Child#getFather <em>Father</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Father</em>'.
	 * @see com.phungkhac.family.Child#getFather()
	 * @see #getChild()
	 * @generated
	 */
	EReference getChild_Father();

	/**
	 * Returns the meta object for enum '{@link com.phungkhac.family.SexType <em>Sex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex Type</em>'.
	 * @see com.phungkhac.family.SexType
	 * @generated
	 */
	EEnum getSexType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FamilyFactory getFamilyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.FNamedElementImpl <em>FNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.FNamedElementImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFNamedElement()
		 * @generated
		 */
		EClass FNAMED_ELEMENT = eINSTANCE.getFNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FNAMED_ELEMENT__NAME = eINSTANCE.getFNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.PersonImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SEX = eINSTANCE.getPerson_Sex();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.FamilyImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MEMBERS = eINSTANCE.getFamily_Members();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__FATHER = eINSTANCE.getFamily_Father();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__MOTHER = eINSTANCE.getFamily_Mother();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__CHILDREN = eINSTANCE.getFamily_Children();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.FatherImpl <em>Father</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.FatherImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getFather()
		 * @generated
		 */
		EClass FATHER = eINSTANCE.getFather();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FATHER__CHILDREN = eINSTANCE.getFather_Children();

		/**
		 * The meta object literal for the '<em><b>Wife</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FATHER__WIFE = eINSTANCE.getFather_Wife();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.MotherImpl <em>Mother</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.MotherImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getMother()
		 * @generated
		 */
		EClass MOTHER = eINSTANCE.getMother();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTHER__CHILDREN = eINSTANCE.getMother_Children();

		/**
		 * The meta object literal for the '<em><b>Husband</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTHER__HUSBAND = eINSTANCE.getMother_Husband();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.impl.ChildImpl
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '<em><b>Mother</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__MOTHER = eINSTANCE.getChild_Mother();

		/**
		 * The meta object literal for the '<em><b>Father</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD__FATHER = eINSTANCE.getChild_Father();

		/**
		 * The meta object literal for the '{@link com.phungkhac.family.SexType <em>Sex Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.phungkhac.family.SexType
		 * @see com.phungkhac.family.impl.FamilyPackageImpl#getSexType()
		 * @generated
		 */
		EEnum SEX_TYPE = eINSTANCE.getSexType();

	}

} //FamilyPackage
