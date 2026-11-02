/**
 */
package maintenanceSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.ThresholdCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link maintenanceSystem.ThresholdCondition#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getThresholdCondition()
 * @model
 * @generated
 */
public interface ThresholdCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see maintenanceSystem.Operator
	 * @see #setOperator(Operator)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getThresholdCondition_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link maintenanceSystem.ThresholdCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see maintenanceSystem.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(float)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getThresholdCondition_Threshold()
	 * @model
	 * @generated
	 */
	float getThreshold();

	/**
	 * Sets the value of the '{@link maintenanceSystem.ThresholdCondition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(float value);

} // ThresholdCondition
