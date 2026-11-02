/**
 */
package maintenanceSystem.impl;

import java.math.BigInteger;

import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.Pin;
import maintenanceSystem.PinType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.PinImpl#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.impl.PinImpl#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link maintenanceSystem.impl.PinImpl#getPinType <em>Pin Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinImpl extends MinimalEObjectImpl.Container implements Pin {
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
	 * The default value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PIN_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pinNumber = PIN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinType() <em>Pin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinType()
	 * @generated
	 * @ordered
	 */
	protected static final PinType PIN_TYPE_EDEFAULT = PinType.DIGITAL_IN;

	/**
	 * The cached value of the '{@link #getPinType() <em>Pin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinType()
	 * @generated
	 * @ordered
	 */
	protected PinType pinType = PIN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.PIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.PIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getPinNumber() {
		return pinNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinNumber(BigInteger newPinNumber) {
		BigInteger oldPinNumber = pinNumber;
		pinNumber = newPinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.PIN__PIN_NUMBER,
					oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PinType getPinType() {
		return pinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinType(PinType newPinType) {
		PinType oldPinType = pinType;
		pinType = newPinType == null ? PIN_TYPE_EDEFAULT : newPinType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.PIN__PIN_TYPE, oldPinType,
					pinType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaintenanceSystemPackage.PIN__NAME:
			return getName();
		case MaintenanceSystemPackage.PIN__PIN_NUMBER:
			return getPinNumber();
		case MaintenanceSystemPackage.PIN__PIN_TYPE:
			return getPinType();
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
		case MaintenanceSystemPackage.PIN__NAME:
			setName((String) newValue);
			return;
		case MaintenanceSystemPackage.PIN__PIN_NUMBER:
			setPinNumber((BigInteger) newValue);
			return;
		case MaintenanceSystemPackage.PIN__PIN_TYPE:
			setPinType((PinType) newValue);
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
		case MaintenanceSystemPackage.PIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MaintenanceSystemPackage.PIN__PIN_NUMBER:
			setPinNumber(PIN_NUMBER_EDEFAULT);
			return;
		case MaintenanceSystemPackage.PIN__PIN_TYPE:
			setPinType(PIN_TYPE_EDEFAULT);
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
		case MaintenanceSystemPackage.PIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MaintenanceSystemPackage.PIN__PIN_NUMBER:
			return PIN_NUMBER_EDEFAULT == null ? pinNumber != null : !PIN_NUMBER_EDEFAULT.equals(pinNumber);
		case MaintenanceSystemPackage.PIN__PIN_TYPE:
			return pinType != PIN_TYPE_EDEFAULT;
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
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(", pinType: ");
		result.append(pinType);
		result.append(')');
		return result.toString();
	}

} //PinImpl
