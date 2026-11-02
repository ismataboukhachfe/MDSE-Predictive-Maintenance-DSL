/**
 */
package maintenanceSystem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see maintenanceSystem.MaintenanceSystemPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>DHT11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHT11_VALUE
	 * @generated
	 * @ordered
	 */
	DHT11(0, "DHT11", "DHT11"),

	/**
	 * The '<em><b>Digital Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	DIGITAL_TEMPERATURE(1, "DigitalTemperature", "DigitalTemperature"),

	/**
	 * The '<em><b>Vibration Big Sound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_BIG_SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	VIBRATION_BIG_SOUND(2, "VibrationBigSound", "VibrationBigSound"),

	/**
	 * The '<em><b>Vibration Small Sound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_SMALL_SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	VIBRATION_SMALL_SOUND(3, "VibrationSmallSound", "VibrationSmallSound");

	/**
	 * The '<em><b>DHT11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHT11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DHT11_VALUE = 0;

	/**
	 * The '<em><b>Digital Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIGITAL_TEMPERATURE
	 * @model name="DigitalTemperature"
	 * @generated
	 * @ordered
	 */
	public static final int DIGITAL_TEMPERATURE_VALUE = 1;

	/**
	 * The '<em><b>Vibration Big Sound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_BIG_SOUND
	 * @model name="VibrationBigSound"
	 * @generated
	 * @ordered
	 */
	public static final int VIBRATION_BIG_SOUND_VALUE = 2;

	/**
	 * The '<em><b>Vibration Small Sound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_SMALL_SOUND
	 * @model name="VibrationSmallSound"
	 * @generated
	 * @ordered
	 */
	public static final int VIBRATION_SMALL_SOUND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY = new SensorType[] { DHT11, DIGITAL_TEMPERATURE, VIBRATION_BIG_SOUND,
			VIBRATION_SMALL_SOUND, };

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
		case DHT11_VALUE:
			return DHT11;
		case DIGITAL_TEMPERATURE_VALUE:
			return DIGITAL_TEMPERATURE;
		case VIBRATION_BIG_SOUND_VALUE:
			return VIBRATION_BIG_SOUND;
		case VIBRATION_SMALL_SOUND_VALUE:
			return VIBRATION_SMALL_SOUND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SensorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SensorType
