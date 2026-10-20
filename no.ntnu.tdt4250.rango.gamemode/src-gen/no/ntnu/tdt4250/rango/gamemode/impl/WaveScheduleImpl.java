/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wave Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl#getWaves <em>Waves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaveScheduleImpl extends SpawnStrategyImpl implements WaveSchedule {
	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean loop = LOOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEscalation() <em>Escalation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalation()
	 * @generated
	 * @ordered
	 */
	protected static final int ESCALATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEscalation() <em>Escalation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscalation()
	 * @generated
	 * @ordered
	 */
	protected int escalation = ESCALATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaves() <em>Waves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaves()
	 * @generated
	 * @ordered
	 */
	protected EList<Wave> waves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.WAVE_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoop(boolean newLoop) {
		boolean oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WAVE_SCHEDULE__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEscalation() {
		return escalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscalation(int newEscalation) {
		int oldEscalation = escalation;
		escalation = newEscalation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WAVE_SCHEDULE__ESCALATION, oldEscalation, escalation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Wave> getWaves() {
		if (waves == null) {
			waves = new EObjectContainmentEList<Wave>(Wave.class, this, GamemodePackage.WAVE_SCHEDULE__WAVES);
		}
		return waves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.WAVE_SCHEDULE__WAVES:
				return ((InternalEList<?>)getWaves()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.WAVE_SCHEDULE__LOOP:
				return isLoop();
			case GamemodePackage.WAVE_SCHEDULE__ESCALATION:
				return getEscalation();
			case GamemodePackage.WAVE_SCHEDULE__WAVES:
				return getWaves();
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
			case GamemodePackage.WAVE_SCHEDULE__LOOP:
				setLoop((Boolean)newValue);
				return;
			case GamemodePackage.WAVE_SCHEDULE__ESCALATION:
				setEscalation((Integer)newValue);
				return;
			case GamemodePackage.WAVE_SCHEDULE__WAVES:
				getWaves().clear();
				getWaves().addAll((Collection<? extends Wave>)newValue);
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
			case GamemodePackage.WAVE_SCHEDULE__LOOP:
				setLoop(LOOP_EDEFAULT);
				return;
			case GamemodePackage.WAVE_SCHEDULE__ESCALATION:
				setEscalation(ESCALATION_EDEFAULT);
				return;
			case GamemodePackage.WAVE_SCHEDULE__WAVES:
				getWaves().clear();
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
			case GamemodePackage.WAVE_SCHEDULE__LOOP:
				return loop != LOOP_EDEFAULT;
			case GamemodePackage.WAVE_SCHEDULE__ESCALATION:
				return escalation != ESCALATION_EDEFAULT;
			case GamemodePackage.WAVE_SCHEDULE__WAVES:
				return waves != null && !waves.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (loop: ");
		result.append(loop);
		result.append(", escalation: ");
		result.append(escalation);
		result.append(')');
		return result.toString();
	}

} //WaveScheduleImpl
