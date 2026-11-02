/**
 */
package maintenanceSystem.util;

import maintenanceSystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maintenanceSystem.MaintenanceSystemPackage
 * @generated
 */
public class MaintenanceSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MaintenanceSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MaintenanceSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceSystemSwitch<Adapter> modelSwitch = new MaintenanceSystemSwitch<Adapter>() {
		@Override
		public Adapter caseMaintenanceSystem(MaintenanceSystem object) {
			return createMaintenanceSystemAdapter();
		}

		@Override
		public Adapter caseMachine(Machine object) {
			return createMachineAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseMonitoringRule(MonitoringRule object) {
			return createMonitoringRuleAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseRangeCondition(RangeCondition object) {
			return createRangeConditionAdapter();
		}

		@Override
		public Adapter caseThresholdCondition(ThresholdCondition object) {
			return createThresholdConditionAdapter();
		}

		@Override
		public Adapter caseRateOfChangeCondition(RateOfChangeCondition object) {
			return createRateOfChangeConditionAdapter();
		}

		@Override
		public Adapter caseAlert(Alert object) {
			return createAlertAdapter();
		}

		@Override
		public Adapter caseBoard(Board object) {
			return createBoardAdapter();
		}

		@Override
		public Adapter caseSystemStructure(SystemStructure object) {
			return createSystemStructureAdapter();
		}

		@Override
		public Adapter caseSystemBehavior(SystemBehavior object) {
			return createSystemBehaviorAdapter();
		}

		@Override
		public Adapter casePinGroup(PinGroup object) {
			return createPinGroupAdapter();
		}

		@Override
		public Adapter casePin(Pin object) {
			return createPinAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.MaintenanceSystem <em>Maintenance System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.MaintenanceSystem
	 * @generated
	 */
	public Adapter createMaintenanceSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.MonitoringRule <em>Monitoring Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.MonitoringRule
	 * @generated
	 */
	public Adapter createMonitoringRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.RangeCondition <em>Range Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.RangeCondition
	 * @generated
	 */
	public Adapter createRangeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.ThresholdCondition <em>Threshold Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.ThresholdCondition
	 * @generated
	 */
	public Adapter createThresholdConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.RateOfChangeCondition <em>Rate Of Change Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.RateOfChangeCondition
	 * @generated
	 */
	public Adapter createRateOfChangeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Alert
	 * @generated
	 */
	public Adapter createAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.SystemStructure <em>System Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.SystemStructure
	 * @generated
	 */
	public Adapter createSystemStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.SystemBehavior <em>System Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.SystemBehavior
	 * @generated
	 */
	public Adapter createSystemBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.PinGroup <em>Pin Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.PinGroup
	 * @generated
	 */
	public Adapter createPinGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maintenanceSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maintenanceSystem.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MaintenanceSystemAdapterFactory
