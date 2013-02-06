/**
 */
package com.phungkhac.family.impl;

import com.phungkhac.family.Child;
import com.phungkhac.family.Family;
import com.phungkhac.family.FamilyPackage;
import com.phungkhac.family.Father;
import com.phungkhac.family.Mother;
import com.phungkhac.family.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.phungkhac.family.impl.FamilyImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.FamilyImpl#getFather <em>Father</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.FamilyImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.FamilyImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyImpl extends FNamedElementImpl implements Family {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> members;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Father father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Mother mother;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Child> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Person>(Person.class, this, FamilyPackage.FAMILY__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject)father;
			father = (Father)eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.FAMILY__FATHER, oldFather, father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Father newFather) {
		Father oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FAMILY__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother getMother() {
		if (mother != null && mother.eIsProxy()) {
			InternalEObject oldMother = (InternalEObject)mother;
			mother = (Mother)eResolveProxy(oldMother);
			if (mother != oldMother) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.FAMILY__MOTHER, oldMother, mother));
			}
		}
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother basicGetMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Mother newMother) {
		Mother oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FAMILY__MOTHER, oldMother, mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Child>(Child.class, this, FamilyPackage.FAMILY__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				return getMembers();
			case FamilyPackage.FAMILY__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
			case FamilyPackage.FAMILY__MOTHER:
				if (resolve) return getMother();
				return basicGetMother();
			case FamilyPackage.FAMILY__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Person>)newValue);
				return;
			case FamilyPackage.FAMILY__FATHER:
				setFather((Father)newValue);
				return;
			case FamilyPackage.FAMILY__MOTHER:
				setMother((Mother)newValue);
				return;
			case FamilyPackage.FAMILY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				getMembers().clear();
				return;
			case FamilyPackage.FAMILY__FATHER:
				setFather((Father)null);
				return;
			case FamilyPackage.FAMILY__MOTHER:
				setMother((Mother)null);
				return;
			case FamilyPackage.FAMILY__CHILDREN:
				getChildren().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FamilyPackage.FAMILY__MEMBERS:
				return members != null && !members.isEmpty();
			case FamilyPackage.FAMILY__FATHER:
				return father != null;
			case FamilyPackage.FAMILY__MOTHER:
				return mother != null;
			case FamilyPackage.FAMILY__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyImpl
