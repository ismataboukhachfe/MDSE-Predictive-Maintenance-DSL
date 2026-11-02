/**
 */
package maintenanceSystem;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.Pin#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.Pin#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link maintenanceSystem.Pin#getPinType <em>Pin Type</em>}</li>
 * </ul>
 *
 * @see maintenanceSystem.MaintenanceSystemPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getPin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Pin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(BigInteger)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getPin_PinNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getPinNumber();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Pin#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Pin Type</b></em>' attribute.
	 * The literals are from the enumeration {@link maintenanceSystem.PinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Type</em>' attribute.
	 * @see maintenanceSystem.PinType
	 * @see #setPinType(PinType)
	 * @see maintenanceSystem.MaintenanceSystemPackage#getPin_PinType()
	 * @model
	 * @generated
	 */
	PinType getPinType();

	/**
	 * Sets the value of the '{@link maintenanceSystem.Pin#getPinType <em>Pin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Type</em>' attribute.
	 * @see maintenanceSystem.PinType
	 * @see #getPinType()
	 * @generated
	 */
	void setPinType(PinType value);

} // Pin
