/**
 */
package maintenanceSystem.impl;

import java.util.Collection;

import maintenanceSystem.Alert;
import maintenanceSystem.AlertColor;
import maintenanceSystem.Condition;
import maintenanceSystem.MaintenanceSystemPackage;
import maintenanceSystem.MonitoringRule;
import maintenanceSystem.Sensor;
import maintenanceSystem.Severity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getObserves <em>Observes</em>}</li>
 *   <li>{@link maintenanceSystem.impl.MonitoringRuleImpl#getAlertColor <em>Alert Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringRuleImpl extends MinimalEObjectImpl.Container implements MonitoringRule {
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
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.NORMAL;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected Alert triggers;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getObserves() <em>Observes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserves()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> observes;

	/**
	 * The default value of the '{@link #getAlertColor() <em>Alert Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertColor()
	 * @generated
	 * @ordered
	 */
	protected static final AlertColor ALERT_COLOR_EDEFAULT = AlertColor.GREEN;

	/**
	 * The cached value of the '{@link #getAlertColor() <em>Alert Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertColor()
	 * @generated
	 * @ordered
	 */
	protected AlertColor alertColor = ALERT_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenanceSystemPackage.Literals.MONITORING_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__SEVERITY,
					oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__ENABLED,
					oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alert getTriggers() {
		if (triggers != null && triggers.eIsProxy()) {
			InternalEObject oldTriggers = (InternalEObject) triggers;
			triggers = (Alert) eResolveProxy(oldTriggers);
			if (triggers != oldTriggers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS, oldTriggers, triggers));
			}
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alert basicGetTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggers(Alert newTriggers) {
		Alert oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS,
					oldTriggers, triggers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MaintenanceSystemPackage.MONITORING_RULE__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MONITORING_RULE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MaintenanceSystemPackage.MONITORING_RULE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getObserves() {
		if (observes == null) {
			observes = new EObjectResolvingEList<Sensor>(Sensor.class, this,
					MaintenanceSystemPackage.MONITORING_RULE__OBSERVES);
		}
		return observes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlertColor getAlertColor() {
		return alertColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlertColor(AlertColor newAlertColor) {
		AlertColor oldAlertColor = alertColor;
		alertColor = newAlertColor == null ? ALERT_COLOR_EDEFAULT : newAlertColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenanceSystemPackage.MONITORING_RULE__ALERT_COLOR,
					oldAlertColor, alertColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MaintenanceSystemPackage.MONITORING_RULE__CONDITION:
			return basicSetCondition(null, msgs);
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
		case MaintenanceSystemPackage.MONITORING_RULE__NAME:
			return getName();
		case MaintenanceSystemPackage.MONITORING_RULE__DESCRIPTION:
			return getDescription();
		case MaintenanceSystemPackage.MONITORING_RULE__SEVERITY:
			return getSeverity();
		case MaintenanceSystemPackage.MONITORING_RULE__ENABLED:
			return isEnabled();
		case MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS:
			if (resolve)
				return getTriggers();
			return basicGetTriggers();
		case MaintenanceSystemPackage.MONITORING_RULE__CONDITION:
			return getCondition();
		case MaintenanceSystemPackage.MONITORING_RULE__OBSERVES:
			return getObserves();
		case MaintenanceSystemPackage.MONITORING_RULE__ALERT_COLOR:
			return getAlertColor();
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
		case MaintenanceSystemPackage.MONITORING_RULE__NAME:
			setName((String) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__SEVERITY:
			setSeverity((Severity) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS:
			setTriggers((Alert) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__CONDITION:
			setCondition((Condition) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__OBSERVES:
			getObserves().clear();
			getObserves().addAll((Collection<? extends Sensor>) newValue);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__ALERT_COLOR:
			setAlertColor((AlertColor) newValue);
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
		case MaintenanceSystemPackage.MONITORING_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS:
			setTriggers((Alert) null);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__CONDITION:
			setCondition((Condition) null);
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__OBSERVES:
			getObserves().clear();
			return;
		case MaintenanceSystemPackage.MONITORING_RULE__ALERT_COLOR:
			setAlertColor(ALERT_COLOR_EDEFAULT);
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
		case MaintenanceSystemPackage.MONITORING_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MaintenanceSystemPackage.MONITORING_RULE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MaintenanceSystemPackage.MONITORING_RULE__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		case MaintenanceSystemPackage.MONITORING_RULE__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case MaintenanceSystemPackage.MONITORING_RULE__TRIGGERS:
			return triggers != null;
		case MaintenanceSystemPackage.MONITORING_RULE__CONDITION:
			return condition != null;
		case MaintenanceSystemPackage.MONITORING_RULE__OBSERVES:
			return observes != null && !observes.isEmpty();
		case MaintenanceSystemPackage.MONITORING_RULE__ALERT_COLOR:
			return alertColor != ALERT_COLOR_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", Severity: ");
		result.append(severity);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", AlertColor: ");
		result.append(alertColor);
		result.append(')');
		return result.toString();
	}

} //MonitoringRuleImpl
