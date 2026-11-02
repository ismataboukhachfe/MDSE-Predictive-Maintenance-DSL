/**
 */
package maintenanceSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Of Change Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.RateOfChangeCondition#getVarOperator <em>Var Operator</em>}</li>
 *   <li>{@link maintenanceSystem.RateOfChangeCondition#getChangeRate <em>Change Rate</em>}</li>
 *   <li>{@link maintenanceSystem.RateOfChangeCondition#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getRateOfChangeCondition()
 * @model
 * @generated
 */
public interface RateOfChangeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Var Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.VariationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Operator</em>' attribute.
	 * @see maintenanceSystem.VariationOperator
	 * @see #setVarOperator(VariationOperator)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getRateOfChangeCondition_VarOperator()
	 * @model
	 * @generated
	 */
	VariationOperator getVarOperator();

	/**
	 * Sets the value of the '{@link maintenanceSystem.RateOfChangeCondition#getVarOperator <em>Var Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Operator</em>' attribute.
	 * @see maintenanceSystem.VariationOperator
	 * @see #getVarOperator()
	 * @generated
	 */
	void setVarOperator(VariationOperator value);

	/**
	 * Returns the value of the '<em><b>Change Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Rate</em>' attribute.
	 * @see #setChangeRate(float)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getRateOfChangeCondition_ChangeRate()
	 * @model
	 * @generated
	 */
	float getChangeRate();

	/**
	 * Sets the value of the '{@link maintenanceSystem.RateOfChangeCondition#getChangeRate <em>Change Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Rate</em>' attribute.
	 * @see #getChangeRate()
	 * @generated
	 */
	void setChangeRate(float value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(int)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getRateOfChangeCondition_TimeInterval()
	 * @model
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link maintenanceSystem.RateOfChangeCondition#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

} // RateOfChangeCondition
