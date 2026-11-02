/**
 */
package maintenanceSystem.impl;

import maintenanceSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenanceSystemFactoryImpl extends EFactoryImpl implements MaintenanceSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaintenanceSystemFactory init() {
		try {
			MaintenanceSystemFactory theMaintenanceSystemFactory = (MaintenanceSystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(MaintenanceSystemPackage.eNS_URI);
			if (theMaintenanceSystemFactory != null) {
				return theMaintenanceSystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MaintenanceSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM:
			return createMaintenanceSystem();
		case MaintenanceSystemPackage.MACHINE:
			return createMachine();
		case MaintenanceSystemPackage.SENSOR:
			return createSensor();
		case MaintenanceSystemPackage.MONITORING_RULE:
			return createMonitoringRule();
		case MaintenanceSystemPackage.RANGE_CONDITION:
			return createRangeCondition();
		case MaintenanceSystemPackage.THRESHOLD_CONDITION:
			return createThresholdCondition();
		case MaintenanceSystemPackage.RATE_OF_CHANGE_CONDITION:
			return createRateOfChangeCondition();
		case MaintenanceSystemPackage.ALERT:
			return createAlert();
		case MaintenanceSystemPackage.BOARD:
			return createBoard();
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE:
			return createSystemStructure();
		case MaintenanceSystemPackage.SYSTEM_BEHAVIOR:
			return createSystemBehavior();
		case MaintenanceSystemPackage.PIN_GROUP:
			return createPinGroup();
		case MaintenanceSystemPackage.PIN:
			return createPin();
		case MaintenanceSystemPackage.CONNECTION:
			return createConnection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MaintenanceSystemPackage.SEVERITY:
			return createSeverityFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.OPERATOR:
			return createOperatorFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.VARIATION_OPERATOR:
			return createVariationOperatorFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.ACTION_TYPE:
			return createActionTypeFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.PIN_TYPE:
			return createPinTypeFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.SENSOR_TYPE:
			return createSensorTypeFromString(eDataType, initialValue);
		case MaintenanceSystemPackage.ALERT_COLOR:
			return createAlertColorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MaintenanceSystemPackage.SEVERITY:
			return convertSeverityToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.OPERATOR:
			return convertOperatorToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.VARIATION_OPERATOR:
			return convertVariationOperatorToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.ACTION_TYPE:
			return convertActionTypeToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.PIN_TYPE:
			return convertPinTypeToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.SENSOR_TYPE:
			return convertSensorTypeToString(eDataType, instanceValue);
		case MaintenanceSystemPackage.ALERT_COLOR:
			return convertAlertColorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintenanceSystem createMaintenanceSystem() {
		MaintenanceSystemImpl maintenanceSystem = new MaintenanceSystemImpl();
		return maintenanceSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringRule createMonitoringRule() {
		MonitoringRuleImpl monitoringRule = new MonitoringRuleImpl();
		return monitoringRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeCondition createRangeCondition() {
		RangeConditionImpl rangeCondition = new RangeConditionImpl();
		return rangeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThresholdCondition createThresholdCondition() {
		ThresholdConditionImpl thresholdCondition = new ThresholdConditionImpl();
		return thresholdCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateOfChangeCondition createRateOfChangeCondition() {
		RateOfChangeConditionImpl rateOfChangeCondition = new RateOfChangeConditionImpl();
		return rateOfChangeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStructure createSystemStructure() {
		SystemStructureImpl systemStructure = new SystemStructureImpl();
		return systemStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBehavior createSystemBehavior() {
		SystemBehaviorImpl systemBehavior = new SystemBehaviorImpl();
		return systemBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PinGroup createPinGroup() {
		PinGroupImpl pinGroup = new PinGroupImpl();
		return pinGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariationOperator createVariationOperatorFromString(EDataType eDataType, String initialValue) {
		VariationOperator result = VariationOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinType createPinTypeFromString(EDataType eDataType, String initialValue) {
		PinType result = PinType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertColor createAlertColorFromString(EDataType eDataType, String initialValue) {
		AlertColor result = AlertColor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintenanceSystemPackage getMaintenanceSystemPackage() {
		return (MaintenanceSystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MaintenanceSystemPackage getPackage() {
		return MaintenanceSystemPackage.eINSTANCE;
	}

} //MaintenanceSystemFactoryImpl
