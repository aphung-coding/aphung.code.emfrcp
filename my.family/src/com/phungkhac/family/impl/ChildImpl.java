/**
 */
package com.phungkhac.family.impl;

import com.phungkhac.family.Child;
import com.phungkhac.family.FamilyPackage;
import com.phungkhac.family.Father;
import com.phungkhac.family.Mother;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.phungkhac.family.impl.ChildImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.ChildImpl#getFather <em>Father</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildImpl extends PersonImpl implements Child {
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
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Father father;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.CHILD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.CHILD__MOTHER, oldMother, mother));
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
	public NotificationChain basicSetMother(Mother newMother, NotificationChain msgs) {
		Mother oldMother = mother;
		mother = newMother;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__MOTHER, oldMother, newMother);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Mother newMother) {
		if (newMother != mother) {
			NotificationChain msgs = null;
			if (mother != null)
				msgs = ((InternalEObject)mother).eInverseRemove(this, FamilyPackage.MOTHER__CHILDREN, Mother.class, msgs);
			if (newMother != null)
				msgs = ((InternalEObject)newMother).eInverseAdd(this, FamilyPackage.MOTHER__CHILDREN, Mother.class, msgs);
			msgs = basicSetMother(newMother, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__MOTHER, newMother, newMother));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.CHILD__FATHER, oldFather, father));
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
	public NotificationChain basicSetFather(Father newFather, NotificationChain msgs) {
		Father oldFather = father;
		father = newFather;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__FATHER, oldFather, newFather);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Father newFather) {
		if (newFather != father) {
			NotificationChain msgs = null;
			if (father != null)
				msgs = ((InternalEObject)father).eInverseRemove(this, FamilyPackage.FATHER__CHILDREN, Father.class, msgs);
			if (newFather != null)
				msgs = ((InternalEObject)newFather).eInverseAdd(this, FamilyPackage.FATHER__CHILDREN, Father.class, msgs);
			msgs = basicSetFather(newFather, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.CHILD__FATHER, newFather, newFather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.CHILD__MOTHER:
				if (mother != null)
					msgs = ((InternalEObject)mother).eInverseRemove(this, FamilyPackage.MOTHER__CHILDREN, Mother.class, msgs);
				return basicSetMother((Mother)otherEnd, msgs);
			case FamilyPackage.CHILD__FATHER:
				if (father != null)
					msgs = ((InternalEObject)father).eInverseRemove(this, FamilyPackage.FATHER__CHILDREN, Father.class, msgs);
				return basicSetFather((Father)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.CHILD__MOTHER:
				return basicSetMother(null, msgs);
			case FamilyPackage.CHILD__FATHER:
				return basicSetFather(null, msgs);
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
			case FamilyPackage.CHILD__MOTHER:
				if (resolve) return getMother();
				return basicGetMother();
			case FamilyPackage.CHILD__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FamilyPackage.CHILD__MOTHER:
				setMother((Mother)newValue);
				return;
			case FamilyPackage.CHILD__FATHER:
				setFather((Father)newValue);
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
			case FamilyPackage.CHILD__MOTHER:
				setMother((Mother)null);
				return;
			case FamilyPackage.CHILD__FATHER:
				setFather((Father)null);
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
			case FamilyPackage.CHILD__MOTHER:
				return mother != null;
			case FamilyPackage.CHILD__FATHER:
				return father != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildImpl
