/**
 */
package maintenanceSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.MaintenanceSystem#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.MaintenanceSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenanceSystem.MaintenanceSystem#getSamplingTimeInMs <em>Sampling Time In Ms</em>}</li>
 *   <li>{@link maintenanceSystem.MaintenanceSystem#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link maintenanceSystem.MaintenanceSystem#getSystembehavior <em>Systembehavior</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem()
 * @model
 * @generated
 */
public interface MaintenanceSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MaintenanceSystem#getName <em>Name</em>}' attribute.
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
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MaintenanceSystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sampling Time In Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Time In Ms</em>' attribute.
	 * @see #setSamplingTimeInMs(int)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem_SamplingTimeInMs()
	 * @model
	 * @generated
	 */
	int getSamplingTimeInMs();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MaintenanceSystem#getSamplingTimeInMs <em>Sampling Time In Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Time In Ms</em>' attribute.
	 * @see #getSamplingTimeInMs()
	 * @generated
	 */
	void setSamplingTimeInMs(int value);

	/**
	 * Returns the value of the '<em><b>Systemstructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemstructure</em>' containment reference.
	 * @see #setSystemstructure(SystemStructure)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem_Systemstructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SystemStructure getSystemstructure();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MaintenanceSystem#getSystemstructure <em>Systemstructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemstructure</em>' containment reference.
	 * @see #getSystemstructure()
	 * @generated
	 */
	void setSystemstructure(SystemStructure value);

	/**
	 * Returns the value of the '<em><b>Systembehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systembehavior</em>' containment reference.
	 * @see #setSystembehavior(SystemBehavior)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getMaintenanceSystem_Systembehavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SystemBehavior getSystembehavior();

	/**
	 * Sets the value of the '{@link maintenanceSystem.MaintenanceSystem#getSystembehavior <em>Systembehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systembehavior</em>' containment reference.
	 * @see #getSystembehavior()
	 * @generated
	 */
	void setSystembehavior(SystemBehavior value);

} // MaintenanceSystem
