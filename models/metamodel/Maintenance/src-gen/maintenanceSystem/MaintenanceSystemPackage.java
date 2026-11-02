/**
 */
package maintenanceSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maintenanceSystem.MaintenanceSystemFactory
 * @model kind="package"
 * @generated
 */
public interface MaintenanceSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maintenanceSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/maintenanceSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maintenanceSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenanceSystemPackage eINSTANCE = maintenanceSystem.impl.MaintenanceSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.MaintenanceSystemImpl <em>Maintenance System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.MaintenanceSystemImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMaintenanceSystem()
	 * @generated
	 */
	int MAINTENANCE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Sampling Time In Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS = 2;

	/**
	 * The feature id for the '<em><b>Systemstructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Systembehavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR = 4;

	/**
	 * The number of structural features of the '<em>Maintenance System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Maintenance System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTENANCE_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.MachineImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MANUFACTURER = 2;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SENSOR = 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.SensorImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Pingroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PINGROUPS = 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.MonitoringRuleImpl <em>Monitoring Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.MonitoringRuleImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMonitoringRule()
	 * @generated
	 */
	int MONITORING_RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__ENABLED = 3;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__TRIGGERS = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Observes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__OBSERVES = 6;

	/**
	 * The feature id for the '<em><b>Alert Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE__ALERT_COLOR = 7;

	/**
	 * The number of structural features of the '<em>Monitoring Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Monitoring Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.ConditionImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.RangeConditionImpl <em>Range Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.RangeConditionImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getRangeCondition()
	 * @generated
	 */
	int RANGE_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Min Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONDITION__MIN_RANGE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONDITION__MAX_RANGE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.ThresholdConditionImpl <em>Threshold Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.ThresholdConditionImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getThresholdCondition()
	 * @generated
	 */
	int THRESHOLD_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_CONDITION__THRESHOLD = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Threshold Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Threshold Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.RateOfChangeConditionImpl <em>Rate Of Change Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.RateOfChangeConditionImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getRateOfChangeCondition()
	 * @generated
	 */
	int RATE_OF_CHANGE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Var Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION__VAR_OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION__CHANGE_RATE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION__TIME_INTERVAL = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rate Of Change Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rate Of Change Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OF_CHANGE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.AlertImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Pingroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__PINGROUPS = 3;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.BoardImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 9;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pingroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PINGROUPS = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.SystemStructureImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSystemStructure()
	 * @generated
	 */
	int SYSTEM_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Alert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__ALERT = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.SystemBehaviorImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSystemBehavior()
	 * @generated
	 */
	int SYSTEM_BEHAVIOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Monitoringrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__MONITORINGRULE = 1;

	/**
	 * The number of structural features of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.PinGroupImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPinGroup()
	 * @generated
	 */
	int PIN_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__PINS = 1;

	/**
	 * The number of structural features of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.PinImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PIN_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Pin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PIN_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.impl.ConnectionImpl
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maintenanceSystem.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.Severity
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 15;

	/**
	 * The meta object id for the '{@link maintenanceSystem.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.Operator
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 16;

	/**
	 * The meta object id for the '{@link maintenanceSystem.VariationOperator <em>Variation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.VariationOperator
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getVariationOperator()
	 * @generated
	 */
	int VARIATION_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link maintenanceSystem.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.ActionType
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 18;

	/**
	 * The meta object id for the '{@link maintenanceSystem.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.PinType
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 19;

	/**
	 * The meta object id for the '{@link maintenanceSystem.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.SensorType
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 20;

	/**
	 * The meta object id for the '{@link maintenanceSystem.AlertColor <em>Alert Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maintenanceSystem.AlertColor
	 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getAlertColor()
	 * @generated
	 */
	int ALERT_COLOR = 21;

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.MaintenanceSystem <em>Maintenance System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintenance System</em>'.
	 * @see maintenanceSystem.MaintenanceSystem
	 * @generated
	 */
	EClass getMaintenanceSystem();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MaintenanceSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.MaintenanceSystem#getName()
	 * @see #getMaintenanceSystem()
	 * @generated
	 */
	EAttribute getMaintenanceSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MaintenanceSystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maintenanceSystem.MaintenanceSystem#getDescription()
	 * @see #getMaintenanceSystem()
	 * @generated
	 */
	EAttribute getMaintenanceSystem_Description();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MaintenanceSystem#getSamplingTimeInMs <em>Sampling Time In Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Time In Ms</em>'.
	 * @see maintenanceSystem.MaintenanceSystem#getSamplingTimeInMs()
	 * @see #getMaintenanceSystem()
	 * @generated
	 */
	EAttribute getMaintenanceSystem_SamplingTimeInMs();

	/**
	 * Returns the meta object for the containment reference '{@link maintenanceSystem.MaintenanceSystem#getSystemstructure <em>Systemstructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemstructure</em>'.
	 * @see maintenanceSystem.MaintenanceSystem#getSystemstructure()
	 * @see #getMaintenanceSystem()
	 * @generated
	 */
	EReference getMaintenanceSystem_Systemstructure();

	/**
	 * Returns the meta object for the containment reference '{@link maintenanceSystem.MaintenanceSystem#getSystembehavior <em>Systembehavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systembehavior</em>'.
	 * @see maintenanceSystem.MaintenanceSystem#getSystembehavior()
	 * @see #getMaintenanceSystem()
	 * @generated
	 */
	EReference getMaintenanceSystem_Systembehavior();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see maintenanceSystem.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Machine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Machine#getName()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Machine#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see maintenanceSystem.Machine#getModel()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Model();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Machine#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see maintenanceSystem.Machine#getManufacturer()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Manufacturer();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.Machine#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see maintenanceSystem.Machine#getSensor()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Sensor();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see maintenanceSystem.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see maintenanceSystem.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Sensor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see maintenanceSystem.Sensor#getUnit()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.Sensor#getPingroups <em>Pingroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pingroups</em>'.
	 * @see maintenanceSystem.Sensor#getPingroups()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Pingroups();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.MonitoringRule <em>Monitoring Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Rule</em>'.
	 * @see maintenanceSystem.MonitoringRule
	 * @generated
	 */
	EClass getMonitoringRule();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MonitoringRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.MonitoringRule#getName()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MonitoringRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see maintenanceSystem.MonitoringRule#getDescription()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MonitoringRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see maintenanceSystem.MonitoringRule#getSeverity()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MonitoringRule#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see maintenanceSystem.MonitoringRule#isEnabled()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_Enabled();

	/**
	 * Returns the meta object for the reference '{@link maintenanceSystem.MonitoringRule#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers</em>'.
	 * @see maintenanceSystem.MonitoringRule#getTriggers()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EReference getMonitoringRule_Triggers();

	/**
	 * Returns the meta object for the containment reference '{@link maintenanceSystem.MonitoringRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see maintenanceSystem.MonitoringRule#getCondition()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EReference getMonitoringRule_Condition();

	/**
	 * Returns the meta object for the reference list '{@link maintenanceSystem.MonitoringRule#getObserves <em>Observes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observes</em>'.
	 * @see maintenanceSystem.MonitoringRule#getObserves()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EReference getMonitoringRule_Observes();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.MonitoringRule#getAlertColor <em>Alert Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alert Color</em>'.
	 * @see maintenanceSystem.MonitoringRule#getAlertColor()
	 * @see #getMonitoringRule()
	 * @generated
	 */
	EAttribute getMonitoringRule_AlertColor();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see maintenanceSystem.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.RangeCondition <em>Range Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Condition</em>'.
	 * @see maintenanceSystem.RangeCondition
	 * @generated
	 */
	EClass getRangeCondition();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.RangeCondition#getMinRange <em>Min Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Range</em>'.
	 * @see maintenanceSystem.RangeCondition#getMinRange()
	 * @see #getRangeCondition()
	 * @generated
	 */
	EAttribute getRangeCondition_MinRange();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.RangeCondition#getMaxRange <em>Max Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Range</em>'.
	 * @see maintenanceSystem.RangeCondition#getMaxRange()
	 * @see #getRangeCondition()
	 * @generated
	 */
	EAttribute getRangeCondition_MaxRange();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.ThresholdCondition <em>Threshold Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Condition</em>'.
	 * @see maintenanceSystem.ThresholdCondition
	 * @generated
	 */
	EClass getThresholdCondition();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.ThresholdCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see maintenanceSystem.ThresholdCondition#getOperator()
	 * @see #getThresholdCondition()
	 * @generated
	 */
	EAttribute getThresholdCondition_Operator();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.ThresholdCondition#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see maintenanceSystem.ThresholdCondition#getThreshold()
	 * @see #getThresholdCondition()
	 * @generated
	 */
	EAttribute getThresholdCondition_Threshold();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.RateOfChangeCondition <em>Rate Of Change Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Of Change Condition</em>'.
	 * @see maintenanceSystem.RateOfChangeCondition
	 * @generated
	 */
	EClass getRateOfChangeCondition();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.RateOfChangeCondition#getVarOperator <em>Var Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Operator</em>'.
	 * @see maintenanceSystem.RateOfChangeCondition#getVarOperator()
	 * @see #getRateOfChangeCondition()
	 * @generated
	 */
	EAttribute getRateOfChangeCondition_VarOperator();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.RateOfChangeCondition#getChangeRate <em>Change Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Rate</em>'.
	 * @see maintenanceSystem.RateOfChangeCondition#getChangeRate()
	 * @see #getRateOfChangeCondition()
	 * @generated
	 */
	EAttribute getRateOfChangeCondition_ChangeRate();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.RateOfChangeCondition#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see maintenanceSystem.RateOfChangeCondition#getTimeInterval()
	 * @see #getRateOfChangeCondition()
	 * @generated
	 */
	EAttribute getRateOfChangeCondition_TimeInterval();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see maintenanceSystem.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Alert#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Alert#getName()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Alert#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see maintenanceSystem.Alert#getMessage()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Message();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Alert#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see maintenanceSystem.Alert#getAction()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.Alert#getPingroups <em>Pingroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pingroups</em>'.
	 * @see maintenanceSystem.Alert#getPingroups()
	 * @see #getAlert()
	 * @generated
	 */
	EReference getAlert_Pingroups();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see maintenanceSystem.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference '{@link maintenanceSystem.Board#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Machine</em>'.
	 * @see maintenanceSystem.Board#getMachine()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Machine();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.Board#getPingroups <em>Pingroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pingroups</em>'.
	 * @see maintenanceSystem.Board#getPingroups()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Pingroups();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.SystemStructure <em>System Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Structure</em>'.
	 * @see maintenanceSystem.SystemStructure
	 * @generated
	 */
	EClass getSystemStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.SystemStructure#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board</em>'.
	 * @see maintenanceSystem.SystemStructure#getBoard()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.SystemStructure#getAlert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alert</em>'.
	 * @see maintenanceSystem.SystemStructure#getAlert()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Alert();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.SystemStructure#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see maintenanceSystem.SystemStructure#getConnections()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Connections();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.SystemBehavior <em>System Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Behavior</em>'.
	 * @see maintenanceSystem.SystemBehavior
	 * @generated
	 */
	EClass getSystemBehavior();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.SystemBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.SystemBehavior#getName()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EAttribute getSystemBehavior_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.SystemBehavior#getMonitoringrule <em>Monitoringrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitoringrule</em>'.
	 * @see maintenanceSystem.SystemBehavior#getMonitoringrule()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EReference getSystemBehavior_Monitoringrule();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.PinGroup <em>Pin Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Group</em>'.
	 * @see maintenanceSystem.PinGroup
	 * @generated
	 */
	EClass getPinGroup();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.PinGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.PinGroup#getName()
	 * @see #getPinGroup()
	 * @generated
	 */
	EAttribute getPinGroup_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link maintenanceSystem.PinGroup#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see maintenanceSystem.PinGroup#getPins()
	 * @see #getPinGroup()
	 * @generated
	 */
	EReference getPinGroup_Pins();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see maintenanceSystem.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Pin#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see maintenanceSystem.Pin#getPinNumber()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_PinNumber();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Pin#getPinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Type</em>'.
	 * @see maintenanceSystem.Pin#getPinType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_PinType();

	/**
	 * Returns the meta object for class '{@link maintenanceSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see maintenanceSystem.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link maintenanceSystem.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maintenanceSystem.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the reference '{@link maintenanceSystem.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see maintenanceSystem.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link maintenanceSystem.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see maintenanceSystem.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see maintenanceSystem.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see maintenanceSystem.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.VariationOperator <em>Variation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variation Operator</em>'.
	 * @see maintenanceSystem.VariationOperator
	 * @generated
	 */
	EEnum getVariationOperator();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see maintenanceSystem.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Type</em>'.
	 * @see maintenanceSystem.PinType
	 * @generated
	 */
	EEnum getPinType();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see maintenanceSystem.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link maintenanceSystem.AlertColor <em>Alert Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alert Color</em>'.
	 * @see maintenanceSystem.AlertColor
	 * @generated
	 */
	EEnum getAlertColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaintenanceSystemFactory getMaintenanceSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.MaintenanceSystemImpl <em>Maintenance System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.MaintenanceSystemImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMaintenanceSystem()
		 * @generated
		 */
		EClass MAINTENANCE_SYSTEM = eINSTANCE.getMaintenanceSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_SYSTEM__NAME = eINSTANCE.getMaintenanceSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_SYSTEM__DESCRIPTION = eINSTANCE.getMaintenanceSystem_Description();

		/**
		 * The meta object literal for the '<em><b>Sampling Time In Ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS = eINSTANCE.getMaintenanceSystem_SamplingTimeInMs();

		/**
		 * The meta object literal for the '<em><b>Systemstructure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE = eINSTANCE.getMaintenanceSystem_Systemstructure();

		/**
		 * The meta object literal for the '<em><b>Systembehavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR = eINSTANCE.getMaintenanceSystem_Systembehavior();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.MachineImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MODEL = eINSTANCE.getMachine_Model();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__MANUFACTURER = eINSTANCE.getMachine_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__SENSOR = eINSTANCE.getMachine_Sensor();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.SensorImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__UNIT = eINSTANCE.getSensor_Unit();

		/**
		 * The meta object literal for the '<em><b>Pingroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PINGROUPS = eINSTANCE.getSensor_Pingroups();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.MonitoringRuleImpl <em>Monitoring Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.MonitoringRuleImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getMonitoringRule()
		 * @generated
		 */
		EClass MONITORING_RULE = eINSTANCE.getMonitoringRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__NAME = eINSTANCE.getMonitoringRule_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__DESCRIPTION = eINSTANCE.getMonitoringRule_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__SEVERITY = eINSTANCE.getMonitoringRule_Severity();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__ENABLED = eINSTANCE.getMonitoringRule_Enabled();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_RULE__TRIGGERS = eINSTANCE.getMonitoringRule_Triggers();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_RULE__CONDITION = eINSTANCE.getMonitoringRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Observes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_RULE__OBSERVES = eINSTANCE.getMonitoringRule_Observes();

		/**
		 * The meta object literal for the '<em><b>Alert Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING_RULE__ALERT_COLOR = eINSTANCE.getMonitoringRule_AlertColor();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.ConditionImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.RangeConditionImpl <em>Range Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.RangeConditionImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getRangeCondition()
		 * @generated
		 */
		EClass RANGE_CONDITION = eINSTANCE.getRangeCondition();

		/**
		 * The meta object literal for the '<em><b>Min Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_CONDITION__MIN_RANGE = eINSTANCE.getRangeCondition_MinRange();

		/**
		 * The meta object literal for the '<em><b>Max Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_CONDITION__MAX_RANGE = eINSTANCE.getRangeCondition_MaxRange();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.ThresholdConditionImpl <em>Threshold Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.ThresholdConditionImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getThresholdCondition()
		 * @generated
		 */
		EClass THRESHOLD_CONDITION = eINSTANCE.getThresholdCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_CONDITION__OPERATOR = eINSTANCE.getThresholdCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_CONDITION__THRESHOLD = eINSTANCE.getThresholdCondition_Threshold();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.RateOfChangeConditionImpl <em>Rate Of Change Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.RateOfChangeConditionImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getRateOfChangeCondition()
		 * @generated
		 */
		EClass RATE_OF_CHANGE_CONDITION = eINSTANCE.getRateOfChangeCondition();

		/**
		 * The meta object literal for the '<em><b>Var Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_OF_CHANGE_CONDITION__VAR_OPERATOR = eINSTANCE.getRateOfChangeCondition_VarOperator();

		/**
		 * The meta object literal for the '<em><b>Change Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_OF_CHANGE_CONDITION__CHANGE_RATE = eINSTANCE.getRateOfChangeCondition_ChangeRate();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_OF_CHANGE_CONDITION__TIME_INTERVAL = eINSTANCE.getRateOfChangeCondition_TimeInterval();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.AlertImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__NAME = eINSTANCE.getAlert_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__MESSAGE = eINSTANCE.getAlert_Message();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__ACTION = eINSTANCE.getAlert_Action();

		/**
		 * The meta object literal for the '<em><b>Pingroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALERT__PINGROUPS = eINSTANCE.getAlert_Pingroups();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.BoardImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__MACHINE = eINSTANCE.getBoard_Machine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Pingroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PINGROUPS = eINSTANCE.getBoard_Pingroups();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.SystemStructureImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSystemStructure()
		 * @generated
		 */
		EClass SYSTEM_STRUCTURE = eINSTANCE.getSystemStructure();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__BOARD = eINSTANCE.getSystemStructure_Board();

		/**
		 * The meta object literal for the '<em><b>Alert</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__ALERT = eINSTANCE.getSystemStructure_Alert();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__CONNECTIONS = eINSTANCE.getSystemStructure_Connections();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.SystemBehaviorImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSystemBehavior()
		 * @generated
		 */
		EClass SYSTEM_BEHAVIOR = eINSTANCE.getSystemBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_BEHAVIOR__NAME = eINSTANCE.getSystemBehavior_Name();

		/**
		 * The meta object literal for the '<em><b>Monitoringrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BEHAVIOR__MONITORINGRULE = eINSTANCE.getSystemBehavior_Monitoringrule();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.PinGroupImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPinGroup()
		 * @generated
		 */
		EClass PIN_GROUP = eINSTANCE.getPinGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN_GROUP__NAME = eINSTANCE.getPinGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_GROUP__PINS = eINSTANCE.getPinGroup_Pins();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.PinImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__PIN_NUMBER = eINSTANCE.getPin_PinNumber();

		/**
		 * The meta object literal for the '<em><b>Pin Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__PIN_TYPE = eINSTANCE.getPin_PinType();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.impl.ConnectionImpl
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.Severity
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.Operator
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.VariationOperator <em>Variation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.VariationOperator
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getVariationOperator()
		 * @generated
		 */
		EEnum VARIATION_OPERATOR = eINSTANCE.getVariationOperator();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.ActionType
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.PinType <em>Pin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.PinType
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getPinType()
		 * @generated
		 */
		EEnum PIN_TYPE = eINSTANCE.getPinType();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.SensorType
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link maintenanceSystem.AlertColor <em>Alert Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maintenanceSystem.AlertColor
		 * @see maintenanceSystem.impl.MaintenanceSystemPackageImpl#getAlertColor()
		 * @generated
		 */
		EEnum ALERT_COLOR = eINSTANCE.getAlertColor();

	}

} //MaintenanceSystemPackage
