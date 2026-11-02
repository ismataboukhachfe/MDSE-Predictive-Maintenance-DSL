/**
 */
package maintenanceSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.Sensor#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link maintenanceSystem.Sensor#getUnit <em>Unit</em>}</li>
 *   <li>{@link maintenanceSystem.Sensor#getPingroups <em>Pingroups</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSensor_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see maintenanceSystem.SensorType
	 * @see #setType(SensorType)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSensor_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see maintenanceSystem.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSensor_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Sensor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Pingroups</b></em>' containment reference list.
	 * The list contents are of type {@link maintenanceSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pingroups</em>' containment reference list.
	 * @see maintenanceSystem.MaintenanceSystemPackage#getSensor_Pingroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPingroups();

} // Sensor
