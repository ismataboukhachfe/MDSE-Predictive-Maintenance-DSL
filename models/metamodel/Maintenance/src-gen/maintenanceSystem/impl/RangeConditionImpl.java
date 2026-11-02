/**
 */
package maintenanceSystem.impl;

import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.RangeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.RangeConditionImpl#getMinRange <em>Min Range</em>}</li>
 *   <li>{@link maintenanceSystem.impl.RangeConditionImpl#getMaxRange <em>Max Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeConditionImpl extends ConditionImpl implements RangeCondition {
	/**
	 * The default value of the '{@link #getMinRange() <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_RANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRange() <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRange()
	 * @generated
	 * @ordered
	 */
	protected int minRange = MIN_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRange() <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RANGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRange() <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRange()
	 * @generated
	 * @ordered
	 */
	protected int maxRange = MAX_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.RANGE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinRange() {
		return minRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRange(int newMinRange) {
		int oldMinRange = minRange;
		minRange = newMinRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.RANGE_CONDITION__MIN_RANGE,
					oldMinRange, minRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxRange() {
		return maxRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRange(int newMaxRange) {
		int oldMaxRange = maxRange;
		maxRange = newMaxRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.RANGE_CONDITION__MAX_RANGE,
					oldMaxRange, maxRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaintenanceSystemPackage.RANGE_CONDITION__MIN_RANGE:
			return getMinRange();
		case MaintenanceSystemPackage.RANGE_CONDITION__MAX_RANGE:
			return getMaxRange();
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
		case MaintenanceSystemPackage.RANGE_CONDITION__MIN_RANGE:
			setMinRange((Integer) newValue);
			return;
		case MaintenanceSystemPackage.RANGE_CONDITION__MAX_RANGE:
			setMaxRange((Integer) newValue);
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
		case MaintenanceSystemPackage.RANGE_CONDITION__MIN_RANGE:
			setMinRange(MIN_RANGE_EDEFAULT);
			return;
		case MaintenanceSystemPackage.RANGE_CONDITION__MAX_RANGE:
			setMaxRange(MAX_RANGE_EDEFAULT);
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
		case MaintenanceSystemPackage.RANGE_CONDITION__MIN_RANGE:
			return minRange != MIN_RANGE_EDEFAULT;
		case MaintenanceSystemPackage.RANGE_CONDITION__MAX_RANGE:
			return maxRange != MAX_RANGE_EDEFAULT;
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
		result.append(" (minRange: ");
		result.append(minRange);
		result.append(", maxRange: ");
		result.append(maxRange);
		result.append(')');
		return result.toString();
	}

} //RangeConditionImpl
