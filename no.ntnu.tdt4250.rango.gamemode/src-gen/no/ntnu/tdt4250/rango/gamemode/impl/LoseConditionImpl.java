/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.LoseCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lose Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LoseConditionImpl#isHealthDepleted <em>Health Depleted</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LoseConditionImpl#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LoseConditionImpl#getEnemiesAlive <em>Enemies Alive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoseConditionImpl extends EObjectImpl implements LoseCondition {
	/**
	 * The default value of the '{@link #isHealthDepleted() <em>Health Depleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHealthDepleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEALTH_DEPLETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHealthDepleted() <em>Health Depleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHealthDepleted()
	 * @generated
	 * @ordered
	 */
	protected boolean healthDepleted = HEALTH_DEPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_LIMIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected float timeLimit = TIME_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnemiesAlive() <em>Enemies Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemiesAlive()
	 * @generated
	 * @ordered
	 */
	protected static final int ENEMIES_ALIVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnemiesAlive() <em>Enemies Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemiesAlive()
	 * @generated
	 * @ordered
	 */
	protected int enemiesAlive = ENEMIES_ALIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoseConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.LOSE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHealthDepleted() {
		return healthDepleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthDepleted(boolean newHealthDepleted) {
		boolean oldHealthDepleted = healthDepleted;
		healthDepleted = newHealthDepleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LOSE_CONDITION__HEALTH_DEPLETED, oldHealthDepleted, healthDepleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTimeLimit() {
		return timeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeLimit(float newTimeLimit) {
		float oldTimeLimit = timeLimit;
		timeLimit = newTimeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LOSE_CONDITION__TIME_LIMIT, oldTimeLimit, timeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnemiesAlive() {
		return enemiesAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnemiesAlive(int newEnemiesAlive) {
		int oldEnemiesAlive = enemiesAlive;
		enemiesAlive = newEnemiesAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LOSE_CONDITION__ENEMIES_ALIVE, oldEnemiesAlive, enemiesAlive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.LOSE_CONDITION__HEALTH_DEPLETED:
				return isHealthDepleted();
			case GamemodePackage.LOSE_CONDITION__TIME_LIMIT:
				return getTimeLimit();
			case GamemodePackage.LOSE_CONDITION__ENEMIES_ALIVE:
				return getEnemiesAlive();
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
			case GamemodePackage.LOSE_CONDITION__HEALTH_DEPLETED:
				setHealthDepleted((Boolean)newValue);
				return;
			case GamemodePackage.LOSE_CONDITION__TIME_LIMIT:
				setTimeLimit((Float)newValue);
				return;
			case GamemodePackage.LOSE_CONDITION__ENEMIES_ALIVE:
				setEnemiesAlive((Integer)newValue);
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
			case GamemodePackage.LOSE_CONDITION__HEALTH_DEPLETED:
				setHealthDepleted(HEALTH_DEPLETED_EDEFAULT);
				return;
			case GamemodePackage.LOSE_CONDITION__TIME_LIMIT:
				setTimeLimit(TIME_LIMIT_EDEFAULT);
				return;
			case GamemodePackage.LOSE_CONDITION__ENEMIES_ALIVE:
				setEnemiesAlive(ENEMIES_ALIVE_EDEFAULT);
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
			case GamemodePackage.LOSE_CONDITION__HEALTH_DEPLETED:
				return healthDepleted != HEALTH_DEPLETED_EDEFAULT;
			case GamemodePackage.LOSE_CONDITION__TIME_LIMIT:
				return timeLimit != TIME_LIMIT_EDEFAULT;
			case GamemodePackage.LOSE_CONDITION__ENEMIES_ALIVE:
				return enemiesAlive != ENEMIES_ALIVE_EDEFAULT;
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
		result.append(" (healthDepleted: ");
		result.append(healthDepleted);
		result.append(", timeLimit: ");
		result.append(timeLimit);
		result.append(", enemiesAlive: ");
		result.append(enemiesAlive);
		result.append(')');
		return result.toString();
	}

} //LoseConditionImpl
