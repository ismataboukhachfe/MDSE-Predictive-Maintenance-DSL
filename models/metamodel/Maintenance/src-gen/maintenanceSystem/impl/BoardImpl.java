/**
 */
package maintenanceSystem.impl;

import java.util.Collection;

import maintenanceSystem.Board;
import maintenanceSystem.Machine;
import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.PinGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.BoardImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link maintenanceSystem.impl.BoardImpl#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.impl.BoardImpl#getPingroups <em>Pingroups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected Machine machine;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPingroups() <em>Pingroups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPingroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PinGroup> pingroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine getMachine() {
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachine(Machine newMachine, NotificationChain msgs) {
		Machine oldMachine = machine;
		machine = newMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.BOARD__MACHINE, oldMachine, newMachine);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMachine(Machine newMachine) {
		if (newMachine != machine) {
			NotificationChain msgs = null;
			if (machine != null)
				msgs = ((InternalEObject) machine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.BOARD__MACHINE, null, msgs);
			if (newMachine != null)
				msgs = ((InternalEObject) newMachine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.BOARD__MACHINE, null, msgs);
			msgs = basicSetMachine(newMachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.BOARD__MACHINE, newMachine,
					newMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.BOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PinGroup> getPingroups() {
		if (pingroups == null) {
			pingroups = new EObjectContainmentEList<PinGroup>(PinGroup.class, this,
					MaintenanceSystemPackage.BOARD__PINGROUPS);
		}
		return pingroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenanceSystemPackage.BOARD__MACHINE:
			return basicSetMachine(null, msgs);
		case MaintenanceSystemPackage.BOARD__PINGROUPS:
			return ((InternalEList<?>) getPingroups()).basicRemove(otherEnd, msgs);
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
		case MaintenanceSystemPackage.BOARD__MACHINE:
			return getMachine();
		case MaintenanceSystemPackage.BOARD__NAME:
			return getName();
		case MaintenanceSystemPackage.BOARD__PINGROUPS:
			return getPingroups();
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
		case MaintenanceSystemPackage.BOARD__MACHINE:
			setMachine((Machine) newValue);
			return;
		case MaintenanceSystemPackage.BOARD__NAME:
			setName((String) newValue);
			return;
		case MaintenanceSystemPackage.BOARD__PINGROUPS:
			getPingroups().clear();
			getPingroups().addAll((Collection<? extends PinGroup>) newValue);
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
		case MaintenanceSystemPackage.BOARD__MACHINE:
			setMachine((Machine) null);
			return;
		case MaintenanceSystemPackage.BOARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MaintenanceSystemPackage.BOARD__PINGROUPS:
			getPingroups().clear();
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
		case MaintenanceSystemPackage.BOARD__MACHINE:
			return machine != null;
		case MaintenanceSystemPackage.BOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MaintenanceSystemPackage.BOARD__PINGROUPS:
			return pingroups != null && !pingroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
