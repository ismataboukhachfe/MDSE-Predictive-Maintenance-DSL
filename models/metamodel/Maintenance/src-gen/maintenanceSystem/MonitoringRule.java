/**
 */
package maintenanceSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.MonitoringRule#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getObserves <em>Observes</em>}</li>
 *   <li>{@link maintenanceSystem.MonitoringRule#getAlertColor <em>Alert Color</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule()
 * @model
 * @generated
 */
public interface MonitoringRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.Severity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see maintenanceSystem.Severity
	 * @see #setSeverity(Severity)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Severity()
	 * @model
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see maintenanceSystem.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference.
	 * @see #setTriggers(Alert)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Triggers()
	 * @model required="true"
	 * @generated
	 */
	Alert getTriggers();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getTriggers <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Alert value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Observes</b></em>' reference list.
	 * The list contents are of type {@link maintenanceSystem.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observes</em>' reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_Observes()
	 * @model
	 * @generated
	 */
	EList<Sensor> getObserves();

	/**
	 * Returns the value of the '<em><b>Alert Color</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.AlertColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alert Color</em>' attribute.
	 * @see maintenanceSystem.AlertColor
	 * @see #setAlertColor(AlertColor)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMonitoringRule_AlertColor()
	 * @model
	 * @generated
	 */
	AlertColor getAlertColor();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MonitoringRule#getAlertColor <em>Alert Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alert Color</em>' attribute.
	 * @see maintenanceSystem.AlertColor
	 * @see #getAlertColor()
	 * @generated
	 */
	void setAlertColor(AlertColor value);

} // MonitoringRule
