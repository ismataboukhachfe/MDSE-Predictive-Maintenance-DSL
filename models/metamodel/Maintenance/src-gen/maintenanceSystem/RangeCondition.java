/**
 */
package maintenanceSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.RangeCondition#getMinRange <em>Min Range</em>}</li>
 *   <li>{@link maintenanceSystem.RangeCondition#getMaxRange <em>Max Range</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getRangeCondition()
 * @model
 * @generated
 */
public interface RangeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Min Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Range</em>' attribute.
	 * @see #setMinRange(int)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getRangeCondition_MinRange()
	 * @model
	 * @generated
	 */
	int getMinRange();

	/**
	 * Sets the value of the '{@link maintenanceSystem.RangeCondition#getMinRange <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Range</em>' attribute.
	 * @see #getMinRange()
	 * @generated
	 */
	void setMinRange(int value);

	/**
	 * Returns the value of the '<em><b>Max Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Range</em>' attribute.
	 * @see #setMaxRange(int)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getRangeCondition_MaxRange()
	 * @model
	 * @generated
	 */
	int getMaxRange();

	/**
	 * Sets the value of the '{@link maintenanceSystem.RangeCondition#getMaxRange <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Range</em>' attribute.
	 * @see #getMaxRange()
	 * @generated
	 */
	void setMaxRange(int value);

} // RangeCondition
