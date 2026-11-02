/**
 */
package maintenanceSystem.impl;

import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.RateOfChangeCondition;
import maintenanceSystem.VariationOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Of Change Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.RateOfChangeConditionImpl#getVarOperator <em>Var Operator</em>}</li>
 *   <li>{@link maintenanceSystem.impl.RateOfChangeConditionImpl#getChangeRate <em>Change Rate</em>}</li>
 *   <li>{@link maintenanceSystem.impl.RateOfChangeConditionImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RateOfChangeConditionImpl extends ConditionImpl implements RateOfChangeCondition {
	/**
	 * The default value of the '{@link #getVarOperator() <em>Var Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarOperator()
	 * @generated
	 * @ordered
	 */
	protected static final VariationOperator VAR_OPERATOR_EDEFAULT = VariationOperator.INCREASING;

	/**
	 * The cached value of the '{@link #getVarOperator() <em>Var Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarOperator()
	 * @generated
	 * @ordered
	 */
	protected VariationOperator varOperator = VAR_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeRate() <em>Change Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRate()
	 * @generated
	 * @ordered
	 */
	protected static final float CHANGE_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getChangeRate() <em>Change Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRate()
	 * @generated
	 * @ordered
	 */
	protected float changeRate = CHANGE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected int timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateOfChangeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.RATE_OF_CHANGE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariationOperator getVarOperator() {
		return varOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarOperator(VariationOperator newVarOperator) {
		VariationOperator oldVarOperator = varOperator;
		varOperator = newVarOperator == null ? VAR_OPERATOR_EDEFAULT : newVarOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__VAR_OPERATOR, oldVarOperator, varOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getChangeRate() {
		return changeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeRate(float newChangeRate) {
		float oldChangeRate = changeRate;
		changeRate = newChangeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__CHANGE_RATE, oldChangeRate, changeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInterval(int newTimeInterval) {
		int oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__VAR_OPERATOR:
			return getVarOperator();
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__CHANGE_RATE:
			return getChangeRate();
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__TIME_INTERVAL:
			return getTimeInterval();
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
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__VAR_OPERATOR:
			setVarOperator((VariationOperator) newValue);
			return;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__CHANGE_RATE:
			setChangeRate((Float) newValue);
			return;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__TIME_INTERVAL:
			setTimeInterval((Integer) newValue);
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
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__VAR_OPERATOR:
			setVarOperator(VAR_OPERATOR_EDEFAULT);
			return;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__CHANGE_RATE:
			setChangeRate(CHANGE_RATE_EDEFAULT);
			return;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__TIME_INTERVAL:
			setTimeInterval(TIME_INTERVAL_EDEFAULT);
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
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__VAR_OPERATOR:
			return varOperator != VAR_OPERATOR_EDEFAULT;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__CHANGE_RATE:
			return changeRate != CHANGE_RATE_EDEFAULT;
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION__TIME_INTERVAL:
			return timeInterval != TIME_INTERVAL_EDEFAULT;
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
		result.append(" (VarOperator: ");
		result.append(varOperator);
		result.append(", ChangeRate: ");
		result.append(changeRate);
		result.append(", timeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //RateOfChangeConditionImpl
