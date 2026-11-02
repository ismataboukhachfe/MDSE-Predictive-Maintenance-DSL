/**
 */
package maintenanceSystem.impl;

import java.util.Collection;

import maintenanceSystem.Alert;
import maintenanceSystem.Board;
import maintenanceSystem.Connection;
import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.SystemStructure;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.SystemStructureImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link maintenanceSystem.impl.SystemStructureImpl#getAlert <em>Alert</em>}</li>
 *   <li>{@link maintenanceSystem.impl.SystemStructureImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemStructureImpl extends MinimalEObjectImpl.Container implements SystemStructure {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> board;

	/**
	 * The cached value of the '{@link #getAlert() <em>Alert</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlert()
	 * @generated
	 * @ordered
	 */
	protected EList<Alert> alert;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.SYSTEM_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Board> getBoard() {
		if (board == null) {
			board = new EObjectContainmentEList<Board>(Board.class, this,
					MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD);
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Alert> getAlert() {
		if (alert == null) {
			alert = new EObjectContainmentEList<Alert>(Alert.class, this,
					MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT);
		}
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this,
					MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return ((InternalEList<?>) getBoard()).basicRemove(otherEnd, msgs);
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT:
			return ((InternalEList<?>) getAlert()).basicRemove(otherEnd, msgs);
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS:
			return ((InternalEList<?>) getConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return getBoard();
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT:
			return getAlert();
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS:
			return getConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD:
			getBoard().clear();
			getBoard().addAll((Collection<? extends Board>) newValue);
			return;
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT:
			getAlert().clear();
			getAlert().addAll((Collection<? extends Alert>) newValue);
			return;
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS:
			getConnections().clear();
			getConnections().addAll((Collection<? extends Connection>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD:
			getBoard().clear();
			return;
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT:
			getAlert().clear();
			return;
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS:
			getConnections().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__BOARD:
			return board != null && !board.isEmpty();
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__ALERT:
			return alert != null && !alert.isEmpty();
		case MaintenanceSystemPackage.SYSTEM_STRUCTURE__CONNECTIONS:
			return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemStructureImpl
