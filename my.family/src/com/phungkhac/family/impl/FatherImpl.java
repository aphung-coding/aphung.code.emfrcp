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
 * An implementation of the model object '<em><b>Father</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.phungkhac.family.impl.FatherImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.phungkhac.family.impl.FatherImpl#getWife <em>Wife</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FatherImpl extends PersonImpl implements Father {
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
	 * The cached value of the '{@link #getWife() <em>Wife</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWife()
	 * @generated
	 * @ordered
	 */
	protected Mother wife;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FatherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FATHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Child>(Child.class, this, FamilyPackage.FATHER__CHILDREN, FamilyPackage.CHILD__FATHER);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother getWife() {
		if (wife != null && wife.eIsProxy()) {
			InternalEObject oldWife = (InternalEObject)wife;
			wife = (Mother)eResolveProxy(oldWife);
			if (wife != oldWife) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.FATHER__WIFE, oldWife, wife));
			}
		}
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mother basicGetWife() {
		return wife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWife(Mother newWife, NotificationChain msgs) {
		Mother oldWife = wife;
		wife = newWife;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FamilyPackage.FATHER__WIFE, oldWife, newWife);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWife(Mother newWife) {
		if (newWife != wife) {
			NotificationChain msgs = null;
			if (wife != null)
				msgs = ((InternalEObject)wife).eInverseRemove(this, FamilyPackage.MOTHER__HUSBAND, Mother.class, msgs);
			if (newWife != null)
				msgs = ((InternalEObject)newWife).eInverseAdd(this, FamilyPackage.MOTHER__HUSBAND, Mother.class, msgs);
			msgs = basicSetWife(newWife, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FATHER__WIFE, newWife, newWife));
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
			case FamilyPackage.FATHER__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case FamilyPackage.FATHER__WIFE:
				if (wife != null)
					msgs = ((InternalEObject)wife).eInverseRemove(this, FamilyPackage.MOTHER__HUSBAND, Mother.class, msgs);
				return basicSetWife((Mother)otherEnd, msgs);
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
			case FamilyPackage.FATHER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case FamilyPackage.FATHER__WIFE:
				return basicSetWife(null, msgs);
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
			case FamilyPackage.FATHER__CHILDREN:
				return getChildren();
			case FamilyPackage.FATHER__WIFE:
				if (resolve) return getWife();
				return basicGetWife();
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
			case FamilyPackage.FATHER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
				return;
			case FamilyPackage.FATHER__WIFE:
				setWife((Mother)newValue);
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
			case FamilyPackage.FATHER__CHILDREN:
				getChildren().clear();
				return;
			case FamilyPackage.FATHER__WIFE:
				setWife((Mother)null);
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
			case FamilyPackage.FATHER__CHILDREN:
				return children != null && !children.isEmpty();
			case FamilyPackage.FATHER__WIFE:
				return wife != null;
		}
		return super.eIsSet(featureID);
	}

} //FatherImpl
