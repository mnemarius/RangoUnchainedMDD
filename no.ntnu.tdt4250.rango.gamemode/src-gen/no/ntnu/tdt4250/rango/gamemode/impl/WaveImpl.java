/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.BallSpawn;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Wave;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl#getSpawns <em>Spawns</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl#getPopsToClear <em>Pops To Clear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaveImpl extends EObjectImpl implements Wave {
	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final float DELAY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected float delay = DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpawns() <em>Spawns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpawns()
	 * @generated
	 * @ordered
	 */
	protected EList<BallSpawn> spawns;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPopsToClear() <em>Pops To Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopsToClear()
	 * @generated
	 * @ordered
	 */
	protected static final int POPS_TO_CLEAR_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.WAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay(float newDelay) {
		float oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WAVE__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BallSpawn> getSpawns() {
		if (spawns == null) {
			spawns = new EObjectContainmentEList<BallSpawn>(BallSpawn.class, this, GamemodePackage.WAVE__SPAWNS);
		}
		return spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumber() {
		return GamemodeDerivations.number(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getPopsToClear() {
		return GamemodeDerivations.popsToClear(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.WAVE__SPAWNS:
				return ((InternalEList<?>)getSpawns()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.WAVE__DELAY:
				return getDelay();
			case GamemodePackage.WAVE__SPAWNS:
				return getSpawns();
			case GamemodePackage.WAVE__NUMBER:
				return getNumber();
			case GamemodePackage.WAVE__POPS_TO_CLEAR:
				return getPopsToClear();
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
			case GamemodePackage.WAVE__DELAY:
				setDelay((Float)newValue);
				return;
			case GamemodePackage.WAVE__SPAWNS:
				getSpawns().clear();
				getSpawns().addAll((Collection<? extends BallSpawn>)newValue);
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
			case GamemodePackage.WAVE__DELAY:
				setDelay(DELAY_EDEFAULT);
				return;
			case GamemodePackage.WAVE__SPAWNS:
				getSpawns().clear();
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
			case GamemodePackage.WAVE__DELAY:
				return delay != DELAY_EDEFAULT;
			case GamemodePackage.WAVE__SPAWNS:
				return spawns != null && !spawns.isEmpty();
			case GamemodePackage.WAVE__NUMBER:
				return getNumber() != NUMBER_EDEFAULT;
			case GamemodePackage.WAVE__POPS_TO_CLEAR:
				return getPopsToClear() != POPS_TO_CLEAR_EDEFAULT;
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
		result.append(" (delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //WaveImpl
