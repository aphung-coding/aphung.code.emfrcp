/**
 */
package com.phungkhac.family.impl;

import com.phungkhac.family.Child;

import com.phungkhac.family.FamilyPackage;
import com.phungkhac.family.Father;
import com.phungkhac.family.Mother;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mother</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.phungkhac.family.impl.MotherImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.MotherImpl#getHusband <em>Husband</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotherImpl extends PersonImpl implements Mother {
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
	 * The cached value of the '{@link #getHusband() <em>Husband</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHusband()
	 * @generated
	 * @ordered
	 */
	protected Father husband;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.MOTHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Child>(Child.class, this, FamilyPackage.MOTHER__CHILDREN, FamilyPackage.CHILD__MOTHER);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father getHusband() {
		if (husband != null && husband.eIsProxy()) {
			InternalEObject oldHusband = (InternalEObject)husband;
			husband = (Father)eResolveProxy(oldHusband);
			if (husband != oldHusband) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.MOTHER__HUSBAND, oldHusband, husband));
			}
		}
		return husband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Father basicGetHusband() {
		return husband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHusband(Father newHusband, NotificationChain msgs) {
		Father oldHusband = husband;
		husband = newHusband;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilyPackage.MOTHER__HUSBAND, oldHusband, newHusband);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHusband(Father newHusband) {
		if (newHusband != husband) {
			NotificationChain msgs = null;
			if (husband != null)
				msgs = ((InternalEObject)husband).eInverseRemove(this, FamilyPackage.FATHER__WIFE, Father.class, msgs);
			if (newHusband != null)
				msgs = ((InternalEObject)newHusband).eInverseAdd(this, FamilyPackage.FATHER__WIFE, Father.class, msgs);
			msgs = basicSetHusband(newHusband, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.MOTHER__HUSBAND, newHusband, newHusband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FamilyPackage.MOTHER__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case FamilyPackage.MOTHER__HUSBAND:
				if (husband != null)
					msgs = ((InternalEObject)husband).eInverseRemove(this, FamilyPackage.FATHER__WIFE, Father.class, msgs);
				return basicSetHusband((Father)otherEnd, msgs);
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
			case FamilyPackage.MOTHER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FamilyPackage.MOTHER__HUSBAND:
				return basicSetHusband(null, msgs);
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
			case FamilyPackage.MOTHER__CHILDREN:
				return getChildren();
			case FamilyPackage.MOTHER__HUSBAND:
				if (resolve) return getHusband();
				return basicGetHusband();
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
			case FamilyPackage.MOTHER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
				return;
			case FamilyPackage.MOTHER__HUSBAND:
				setHusband((Father)newValue);
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
			case FamilyPackage.MOTHER__CHILDREN:
				getChildren().clear();
				return;
			case FamilyPackage.MOTHER__HUSBAND:
				setHusband((Father)null);
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
			case FamilyPackage.MOTHER__CHILDREN:
				return children != null && !children.isEmpty();
			case FamilyPackage.MOTHER__HUSBAND:
				return husband != null;
		}
		return super.eIsSet(featureID);
	}

} //MotherImpl
