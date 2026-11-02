/**
 */
package maintenanceSystem.impl;

import maintenanceSystem.MaintenanceSystem;
import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.SystemBehavior;
import maintenanceSystem.SystemStructure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maintenance System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.MaintenanceSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MaintenanceSystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MaintenanceSystemImpl#getSamplingTimeInMs <em>Sampling Time In Ms</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MaintenanceSystemImpl#getSystemstructure <em>Systemstructure</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MaintenanceSystemImpl#getSystembehavior <em>Systembehavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaintenanceSystemImpl extends MinimalEObjectImpl.Container implements MaintenanceSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplingTimeInMs() <em>Sampling Time In Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingTimeInMs()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLING_TIME_IN_MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSamplingTimeInMs() <em>Sampling Time In Ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingTimeInMs()
	 * @generated
	 * @ordered
	 */
	protected int samplingTimeInMs = SAMPLING_TIME_IN_MS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemstructure() <em>Systemstructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemstructure()
	 * @generated
	 * @ordered
	 */
	protected SystemStructure systemstructure;

	/**
	 * The cached value of the '{@link #getSystembehavior() <em>Systembehavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystembehavior()
	 * @generated
	 * @ordered
	 */
	protected SystemBehavior systembehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintenanceSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.MAINTENANCE_SYSTEM;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MAINTENANCE_SYSTEM__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSamplingTimeInMs() {
		return samplingTimeInMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSamplingTimeInMs(int newSamplingTimeInMs) {
		int oldSamplingTimeInMs = samplingTimeInMs;
		samplingTimeInMs = newSamplingTimeInMs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS, oldSamplingTimeInMs,
					samplingTimeInMs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStructure getSystemstructure() {
		return systemstructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemstructure(SystemStructure newSystemstructure, NotificationChain msgs) {
		SystemStructure oldSystemstructure = systemstructure;
		systemstructure = newSystemstructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE, oldSystemstructure,
					newSystemstructure);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemstructure(SystemStructure newSystemstructure) {
		if (newSystemstructure != systemstructure) {
			NotificationChain msgs = null;
			if (systemstructure != null)
				msgs = ((InternalEObject) systemstructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE, null,
						msgs);
			if (newSystemstructure != null)
				msgs = ((InternalEObject) newSystemstructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE, null,
						msgs);
			msgs = basicSetSystemstructure(newSystemstructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE, newSystemstructure,
					newSystemstructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBehavior getSystembehavior() {
		return systembehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystembehavior(SystemBehavior newSystembehavior, NotificationChain msgs) {
		SystemBehavior oldSystembehavior = systembehavior;
		systembehavior = newSystembehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR, oldSystembehavior, newSystembehavior);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystembehavior(SystemBehavior newSystembehavior) {
		if (newSystembehavior != systembehavior) {
			NotificationChain msgs = null;
			if (systembehavior != null)
				msgs = ((InternalEObject) systembehavior).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR, null,
						msgs);
			if (newSystembehavior != null)
				msgs = ((InternalEObject) newSystembehavior).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR, null,
						msgs);
			msgs = basicSetSystembehavior(newSystembehavior, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR, newSystembehavior, newSystembehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE:
			return basicSetSystemstructure(null, msgs);
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR:
			return basicSetSystembehavior(null, msgs);
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
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__NAME:
			return getName();
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__DESCRIPTION:
			return getDescription();
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS:
			return getSamplingTimeInMs();
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE:
			return getSystemstructure();
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR:
			return getSystembehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__NAME:
			setName((String) newValue);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS:
			setSamplingTimeInMs((Integer) newValue);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE:
			setSystemstructure((SystemStructure) newValue);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR:
			setSystembehavior((SystemBehavior) newValue);
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
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS:
			setSamplingTimeInMs(SAMPLING_TIME_IN_MS_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE:
			setSystemstructure((SystemStructure) null);
			return;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR:
			setSystembehavior((SystemBehavior) null);
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
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SAMPLING_TIME_IN_MS:
			return samplingTimeInMs != SAMPLING_TIME_IN_MS_EDEFAULT;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMSTRUCTURE:
			return systemstructure != null;
		case MaintenanceSystemPackage.MAINTENANCE_SYSTEM__SYSTEMBEHAVIOR:
			return systembehavior != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(", samplingTimeInMs: ");
		result.append(samplingTimeInMs);
		result.append(')');
		return result.toString();
	}

} //MaintenanceSystemImpl
