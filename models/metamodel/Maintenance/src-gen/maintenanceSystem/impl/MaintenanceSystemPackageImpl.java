/**
 */
package maintenanceSystem.impl;

import maintenanceSystem.ActionType;
import maintenanceSystem.Alert;
import maintenanceSystem.AlertColor;
import maintenanceSystem.Board;
import maintenanceSystem.Condition;
import maintenanceSystem.Connection;
import maintenanceSystem.Machine;
import maintenanceSystem.MaintenanceSystem;
import maintenanceSystem.MaintenanceSystemFactory;
import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.MonitoringRule;
import maintenanceSystem.Operator;
import maintenanceSystem.Pin;
import maintenanceSystem.PinGroup;
import maintenanceSystem.PinType;
import maintenanceSystem.RangeCondition;
import maintenanceSystem.RateOfChangeCondition;
import maintenanceSystem.Sensor;
import maintenanceSystem.SensorType;
import maintenanceSystem.Severity;
import maintenanceSystem.SystemBehavior;
import maintenanceSystem.SystemStructure;
import maintenanceSystem.ThresholdCondition;
import maintenanceSystem.VariationOperator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenanceSystemPackageImpl extends EPackageImpl implements MaintenanceSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintenanceSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateOfChangeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variationOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alertColorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see maintenanceSystem.MaintenanceSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaintenanceSystemPackageImpl() {
		super(eNS_URI, MaintenanceSystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MaintenanceSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaintenanceSystemPackage init() {
		if (isInited)
			return (MaintenanceSystemPackage) EPackage.Registry.INSTANCE.getEPackage(MaintenanceSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMaintenanceSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MaintenanceSystemPackageImpl theMaintenanceSystemPackage = registeredMaintenanceSystemPackage instanceof MaintenanceSystemPackageImpl
				? (MaintenanceSystemPackageImpl) registeredMaintenanceSystemPackage
				: new MaintenanceSystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMaintenanceSystemPackage.createPackageContents();

		// Initialize created meta-data
		theMaintenanceSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMaintenanceSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaintenanceSystemPackage.eNS_URI, theMaintenanceSystemPackage);
		return theMaintenanceSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaintenanceSystem() {
		return maintenanceSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaintenanceSystem_Name() {
		return (EAttribute) maintenanceSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaintenanceSystem_Description() {
		return (EAttribute) maintenanceSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaintenanceSystem_SamplingTimeInMs() {
		return (EAttribute) maintenanceSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaintenanceSystem_Systemstructure() {
		return (EReference) maintenanceSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaintenanceSystem_Systembehavior() {
		return (EReference) maintenanceSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Name() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Model() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Manufacturer() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Sensor() {
		return (EReference) machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Name() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Type() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Unit() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSensor_Pingroups() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringRule() {
		return monitoringRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Name() {
		return (EAttribute) monitoringRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Description() {
		return (EAttribute) monitoringRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Severity() {
		return (EAttribute) monitoringRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_Enabled() {
		return (EAttribute) monitoringRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringRule_Triggers() {
		return (EReference) monitoringRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringRule_Condition() {
		return (EReference) monitoringRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonitoringRule_Observes() {
		return (EReference) monitoringRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonitoringRule_AlertColor() {
		return (EAttribute) monitoringRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondition_Name() {
		return (EAttribute) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeCondition() {
		return rangeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeCondition_MinRange() {
		return (EAttribute) rangeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeCondition_MaxRange() {
		return (EAttribute) rangeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThresholdCondition() {
		return thresholdConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThresholdCondition_Operator() {
		return (EAttribute) thresholdConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThresholdCondition_Threshold() {
		return (EAttribute) thresholdConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRateOfChangeCondition() {
		return rateOfChangeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateOfChangeCondition_VarOperator() {
		return (EAttribute) rateOfChangeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateOfChangeCondition_ChangeRate() {
		return (EAttribute) rateOfChangeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRateOfChangeCondition_TimeInterval() {
		return (EAttribute) rateOfChangeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Name() {
		return (EAttribute) alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Message() {
		return (EAttribute) alertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Action() {
		return (EAttribute) alertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlert_Pingroups() {
		return (EReference) alertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoard_Machine() {
		return (EReference) boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoard_Name() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoard_Pingroups() {
		return (EReference) boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemStructure() {
		return systemStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Board() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Alert() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemStructure_Connections() {
		return (EReference) systemStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemBehavior() {
		return systemBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemBehavior_Name() {
		return (EAttribute) systemBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBehavior_Monitoringrule() {
		return (EReference) systemBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPinGroup() {
		return pinGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPinGroup_Name() {
		return (EAttribute) pinGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPinGroup_Pins() {
		return (EReference) pinGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Name() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_PinNumber() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_PinType() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Name() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Source() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Target() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariationOperator() {
		return variationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPinType() {
		return pinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlertColor() {
		return alertColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintenanceSystemFactory getMaintenanceSystemFactory() {
		return (MaintenanceSystemFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		maintenanceSystemEClass = createEClass(MAINTENANCE_SYSTEM);
		createEAttribute(maintenanceSystemEClass, MAINTENANCE_SYSTEM__NAME);
		createEAttribute(maintenanceSystemEClass, MAINTENANCE_SYSTEM__DESCRIPTION);
		createEAttribute(maintenanceSystemEClass, MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS);
		createEReference(maintenanceSystemEClass, MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE);
		createEReference(maintenanceSystemEClass, MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEAttribute(machineEClass, MACHINE__MODEL);
		createEAttribute(machineEClass, MACHINE__MANUFACTURER);
		createEReference(machineEClass, MACHINE__SENSOR);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__NAME);
		createEAttribute(sensorEClass, SENSOR__TYPE);
		createEAttribute(sensorEClass, SENSOR__UNIT);
		createEReference(sensorEClass, SENSOR__PINGROUPS);

		monitoringRuleEClass = createEClass(MONITORING_RULE);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__NAME);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__DESCRIPTION);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__SEVERITY);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__ENABLED);
		createEReference(monitoringRuleEClass, MONITORING_RULE__TRIGGERS);
		createEReference(monitoringRuleEClass, MONITORING_RULE__CONDITION);
		createEReference(monitoringRuleEClass, MONITORING_RULE__OBSERVES);
		createEAttribute(monitoringRuleEClass, MONITORING_RULE__ALERT_COLOR);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__NAME);

		rangeConditionEClass = createEClass(RANGE_CONDITION);
		createEAttribute(rangeConditionEClass, RANGE_CONDITION__MIN_RANGE);
		createEAttribute(rangeConditionEClass, RANGE_CONDITION__MAX_RANGE);

		thresholdConditionEClass = createEClass(THRESHOLD_CONDITION);
		createEAttribute(thresholdConditionEClass, THRESHOLD_CONDITION__OPERATOR);
		createEAttribute(thresholdConditionEClass, THRESHOLD_CONDITION__THRESHOLD);

		rateOfChangeConditionEClass = createEClass(RATE_OF_CHANGE_CONDITION);
		createEAttribute(rateOfChangeConditionEClass, RATE_OF_CHANGE_CONDITION__VAR_OPERATOR);
		createEAttribute(rateOfChangeConditionEClass, RATE_OF_CHANGE_CONDITION__CHANGE_RATE);
		createEAttribute(rateOfChangeConditionEClass, RATE_OF_CHANGE_CONDITION__TIME_INTERVAL);

		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__NAME);
		createEAttribute(alertEClass, ALERT__MESSAGE);
		createEAttribute(alertEClass, ALERT__ACTION);
		createEReference(alertEClass, ALERT__PINGROUPS);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__MACHINE);
		createEAttribute(boardEClass, BOARD__NAME);
		createEReference(boardEClass, BOARD__PINGROUPS);

		systemStructureEClass = createEClass(SYSTEM_STRUCTURE);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__BOARD);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__ALERT);
		createEReference(systemStructureEClass, SYSTEM_STRUCTURE__CONNECTIONS);

		systemBehaviorEClass = createEClass(SYSTEM_BEHAVIOR);
		createEAttribute(systemBehaviorEClass, SYSTEM_BEHAVIOR__NAME);
		createEReference(systemBehaviorEClass, SYSTEM_BEHAVIOR__MONITORINGRULE);

		pinGroupEClass = createEClass(PIN_GROUP);
		createEAttribute(pinGroupEClass, PIN_GROUP__NAME);
		createEReference(pinGroupEClass, PIN_GROUP__PINS);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__NAME);
		createEAttribute(pinEClass, PIN__PIN_NUMBER);
		createEAttribute(pinEClass, PIN__PIN_TYPE);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__NAME);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
		operatorEEnum = createEEnum(OPERATOR);
		variationOperatorEEnum = createEEnum(VARIATION_OPERATOR);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		pinTypeEEnum = createEEnum(PIN_TYPE);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
		alertColorEEnum = createEEnum(ALERT_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rangeConditionEClass.getESuperTypes().add(this.getCondition());
		thresholdConditionEClass.getESuperTypes().add(this.getCondition());
		rateOfChangeConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(maintenanceSystemEClass, MaintenanceSystem.class, "MaintenanceSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaintenanceSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MaintenanceSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceSystem_Description(), ecorePackage.getEString(), "Description", null, 0, 1,
				MaintenanceSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaintenanceSystem_SamplingTimeInMs(), ecorePackage.getEInt(), "samplingTimeInMs", null, 0, 1,
				MaintenanceSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMaintenanceSystem_Systemstructure(), this.getSystemStructure(), null, "systemstructure", null,
				1, 1, MaintenanceSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaintenanceSystem_Systembehavior(), this.getSystemBehavior(), null, "systembehavior", null, 1,
				1, MaintenanceSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachine_Name(), ecorePackage.getEString(), "name", null, 0, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Model(), ecorePackage.getEString(), "Model", null, 0, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachine_Manufacturer(), ecorePackage.getEString(), "Manufacturer", null, 0, 1, Machine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Sensor(), this.getSensor(), null, "sensor", null, 1, -1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Type(), this.getSensorType(), "Type", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Pingroups(), this.getPinGroup(), null, "pingroups", null, 0, -1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monitoringRuleEClass, MonitoringRule.class, "MonitoringRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitoringRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MonitoringRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_Severity(), this.getSeverity(), "Severity", null, 0, 1, MonitoringRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoringRule_Triggers(), this.getAlert(), null, "triggers", null, 1, 1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoringRule_Condition(), this.getCondition(), null, "condition", null, 0, 1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoringRule_Observes(), this.getSensor(), null, "observes", null, 0, -1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitoringRule_AlertColor(), this.getAlertColor(), "AlertColor", null, 0, 1,
				MonitoringRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Condition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeConditionEClass, RangeCondition.class, "RangeCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeCondition_MinRange(), ecorePackage.getEInt(), "minRange", null, 0, 1,
				RangeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeCondition_MaxRange(), ecorePackage.getEInt(), "maxRange", null, 0, 1,
				RangeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(thresholdConditionEClass, ThresholdCondition.class, "ThresholdCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThresholdCondition_Operator(), this.getOperator(), "Operator", null, 0, 1,
				ThresholdCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getThresholdCondition_Threshold(), ecorePackage.getEFloat(), "Threshold", null, 0, 1,
				ThresholdCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(rateOfChangeConditionEClass, RateOfChangeCondition.class, "RateOfChangeCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRateOfChangeCondition_VarOperator(), this.getVariationOperator(), "VarOperator", null, 0, 1,
				RateOfChangeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateOfChangeCondition_ChangeRate(), ecorePackage.getEFloat(), "ChangeRate", null, 0, 1,
				RateOfChangeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRateOfChangeCondition_TimeInterval(), ecorePackage.getEInt(), "timeInterval", null, 0, 1,
				RateOfChangeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alert.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Message(), ecorePackage.getEString(), "Message", null, 0, 1, Alert.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlert_Action(), this.getActionType(), "Action", null, 0, 1, Alert.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlert_Pingroups(), this.getPinGroup(), null, "pingroups", null, 0, -1, Alert.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Machine(), this.getMachine(), null, "machine", null, 1, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBoard_Name(), ecorePackage.getEString(), "name", null, 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoard_Pingroups(), this.getPinGroup(), null, "pingroups", null, 0, -1, Board.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemStructureEClass, SystemStructure.class, "SystemStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemStructure_Board(), this.getBoard(), null, "board", null, 0, -1, SystemStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemStructure_Alert(), this.getAlert(), null, "alert", null, 0, -1, SystemStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemStructure_Connections(), this.getConnection(), null, "connections", null, 0, -1,
				SystemStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemBehaviorEClass, SystemBehavior.class, "SystemBehavior", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemBehavior_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemBehavior.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBehavior_Monitoringrule(), this.getMonitoringRule(), null, "monitoringrule", null, 1,
				-1, SystemBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinGroupEClass, PinGroup.class, "PinGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPinGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, PinGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPinGroup_Pins(), this.getPin(), null, "pins", null, 0, -1, PinGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_PinNumber(), theXMLTypePackage.getInteger(), "pinNumber", null, 0, 1, Pin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_PinType(), this.getPinType(), "pinType", null, 0, 1, Pin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Source(), this.getPin(), null, "source", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getPin(), null, "target", null, 0, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.NORMAL);
		addEEnumLiteral(severityEEnum, Severity.WARNING);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.GREATER);
		addEEnumLiteral(operatorEEnum, Operator.LESS);
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.GREATER_OR_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.LESS_OR_EQUAL);

		initEEnum(variationOperatorEEnum, VariationOperator.class, "VariationOperator");
		addEEnumLiteral(variationOperatorEEnum, VariationOperator.INCREASING);
		addEEnumLiteral(variationOperatorEEnum, VariationOperator.DECREASING);
		addEEnumLiteral(variationOperatorEEnum, VariationOperator.CONSTANT);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.RGB_LED);
		addEEnumLiteral(actionTypeEEnum, ActionType.ACTIVE_BUZZER);
		addEEnumLiteral(actionTypeEEnum, ActionType.PASSIVE_BUZZER);

		initEEnum(pinTypeEEnum, PinType.class, "PinType");
		addEEnumLiteral(pinTypeEEnum, PinType.DIGITAL_IN);
		addEEnumLiteral(pinTypeEEnum, PinType.DIGITAL_OUT);
		addEEnumLiteral(pinTypeEEnum, PinType.GND);
		addEEnumLiteral(pinTypeEEnum, PinType.VCC_5V);
		addEEnumLiteral(pinTypeEEnum, PinType.VCC_33V);
		addEEnumLiteral(pinTypeEEnum, PinType.INTERRUPT);
		addEEnumLiteral(pinTypeEEnum, PinType.ANALOG_IN);
		addEEnumLiteral(pinTypeEEnum, PinType.ANALOG_OUT);
		addEEnumLiteral(pinTypeEEnum, PinType.DC_POWER_IN);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.DHT11);
		addEEnumLiteral(sensorTypeEEnum, SensorType.DIGITAL_TEMPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.VIBRATION_BIG_SOUND);
		addEEnumLiteral(sensorTypeEEnum, SensorType.VIBRATION_SMALL_SOUND);

		initEEnum(alertColorEEnum, AlertColor.class, "AlertColor");
		addEEnumLiteral(alertColorEEnum, AlertColor.GREEN);
		addEEnumLiteral(alertColorEEnum, AlertColor.RED);
		addEEnumLiteral(alertColorEEnum, AlertColor.BLUE);
		addEEnumLiteral(alertColorEEnum, AlertColor.NAN);

		// Create resource
		createResource(eNS_URI);
	}

} //MaintenanceSystemPackageImpl
