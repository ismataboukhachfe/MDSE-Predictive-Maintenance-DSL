/**
 */
package maintenanceSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.Alert#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.Alert#getMessage <em>Message</em>}</li>
 *   <li>{@link maintenanceSystem.Alert#getAction <em>Action</em>}</li>
 *   <li>{@link maintenanceSystem.Alert#getPingroups <em>Pingroups</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getAlert_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Alert#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getAlert_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Alert#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see maintenanceSystem.ActionType
	 * @see #setAction(ActionType)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getAlert_Action()
	 * @model
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Alert#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see maintenanceSystem.ActionType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Pingroups</b></em>' containment reference list.
	 * The list contents are of type {@link maintenanceSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pingroups</em>' containment reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getAlert_Pingroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPingroups();

} // Alert
