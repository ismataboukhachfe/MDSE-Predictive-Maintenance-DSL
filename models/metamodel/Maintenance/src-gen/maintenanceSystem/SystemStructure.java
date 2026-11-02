/**
 */
package maintenanceSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.SystemStructure#getBoard <em>Board</em>}</li>
 *   <li>{@link maintenanceSystem.SystemStructure#getAlert <em>Alert</em>}</li>
 *   <li>{@link maintenanceSystem.SystemStructure#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getSystemStructure()
 * @model
 * @generated
 */
public interface SystemStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference list.
	 * The list contents are of type {@link maintenanceSystem.Board}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSystemStructure_Board()
	 * @model containment="true"
	 * @generated
	 */
	EList<Board> getBoard();

	/**
	 * Returns the value of the '<em><b>Alert</b></em>' containment reference list.
	 * The list contents are of type {@link maintenanceSystem.Alert}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alert</em>' containment reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSystemStructure_Alert()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alert> getAlert();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link maintenanceSystem.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSystemStructure_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SystemStructure
