/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.WinCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WinConditionImpl#isCleared <em>Cleared</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WinConditionImpl#getSurviveSeconds <em>Survive Seconds</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WinConditionImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WinConditionImpl#getEnemiesPopped <em>Enemies Popped</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.WinConditionImpl#getWavesSurvived <em>Waves Survived</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinConditionImpl extends EObjectImpl implements WinCondition {
	/**
	 * The default value of the '{@link #isCleared() <em>Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleared()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEARED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleared() <em>Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleared()
	 * @generated
	 * @ordered
	 */
	protected boolean cleared = CLEARED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurviveSeconds() <em>Survive Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurviveSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final float SURVIVE_SECONDS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSurviveSeconds() <em>Survive Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurviveSeconds()
	 * @generated
	 * @ordered
	 */
	protected float surviveSeconds = SURVIVE_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnemiesPopped() <em>Enemies Popped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemiesPopped()
	 * @generated
	 * @ordered
	 */
	protected static final int ENEMIES_POPPED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnemiesPopped() <em>Enemies Popped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemiesPopped()
	 * @generated
	 * @ordered
	 */
	protected int enemiesPopped = ENEMIES_POPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWavesSurvived() <em>Waves Survived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavesSurvived()
	 * @generated
	 * @ordered
	 */
	protected static final int WAVES_SURVIVED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWavesSurvived() <em>Waves Survived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavesSurvived()
	 * @generated
	 * @ordered
	 */
	protected int wavesSurvived = WAVES_SURVIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.WIN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCleared() {
		return cleared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleared(boolean newCleared) {
		boolean oldCleared = cleared;
		cleared = newCleared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WIN_CONDITION__CLEARED, oldCleared, cleared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSurviveSeconds() {
		return surviveSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurviveSeconds(float newSurviveSeconds) {
		float oldSurviveSeconds = surviveSeconds;
		surviveSeconds = newSurviveSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WIN_CONDITION__SURVIVE_SECONDS, oldSurviveSeconds, surviveSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WIN_CONDITION__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnemiesPopped() {
		return enemiesPopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnemiesPopped(int newEnemiesPopped) {
		int oldEnemiesPopped = enemiesPopped;
		enemiesPopped = newEnemiesPopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WIN_CONDITION__ENEMIES_POPPED, oldEnemiesPopped, enemiesPopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWavesSurvived() {
		return wavesSurvived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWavesSurvived(int newWavesSurvived) {
		int oldWavesSurvived = wavesSurvived;
		wavesSurvived = newWavesSurvived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.WIN_CONDITION__WAVES_SURVIVED, oldWavesSurvived, wavesSurvived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.WIN_CONDITION__CLEARED:
				return isCleared();
			case GamemodePackage.WIN_CONDITION__SURVIVE_SECONDS:
				return getSurviveSeconds();
			case GamemodePackage.WIN_CONDITION__POINTS:
				return getPoints();
			case GamemodePackage.WIN_CONDITION__ENEMIES_POPPED:
				return getEnemiesPopped();
			case GamemodePackage.WIN_CONDITION__WAVES_SURVIVED:
				return getWavesSurvived();
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
			case GamemodePackage.WIN_CONDITION__CLEARED:
				setCleared((Boolean)newValue);
				return;
			case GamemodePackage.WIN_CONDITION__SURVIVE_SECONDS:
				setSurviveSeconds((Float)newValue);
				return;
			case GamemodePackage.WIN_CONDITION__POINTS:
				setPoints((Integer)newValue);
				return;
			case GamemodePackage.WIN_CONDITION__ENEMIES_POPPED:
				setEnemiesPopped((Integer)newValue);
				return;
			case GamemodePackage.WIN_CONDITION__WAVES_SURVIVED:
				setWavesSurvived((Integer)newValue);
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
			case GamemodePackage.WIN_CONDITION__CLEARED:
				setCleared(CLEARED_EDEFAULT);
				return;
			case GamemodePackage.WIN_CONDITION__SURVIVE_SECONDS:
				setSurviveSeconds(SURVIVE_SECONDS_EDEFAULT);
				return;
			case GamemodePackage.WIN_CONDITION__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case GamemodePackage.WIN_CONDITION__ENEMIES_POPPED:
				setEnemiesPopped(ENEMIES_POPPED_EDEFAULT);
				return;
			case GamemodePackage.WIN_CONDITION__WAVES_SURVIVED:
				setWavesSurvived(WAVES_SURVIVED_EDEFAULT);
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
			case GamemodePackage.WIN_CONDITION__CLEARED:
				return cleared != CLEARED_EDEFAULT;
			case GamemodePackage.WIN_CONDITION__SURVIVE_SECONDS:
				return surviveSeconds != SURVIVE_SECONDS_EDEFAULT;
			case GamemodePackage.WIN_CONDITION__POINTS:
				return points != POINTS_EDEFAULT;
			case GamemodePackage.WIN_CONDITION__ENEMIES_POPPED:
				return enemiesPopped != ENEMIES_POPPED_EDEFAULT;
			case GamemodePackage.WIN_CONDITION__WAVES_SURVIVED:
				return wavesSurvived != WAVES_SURVIVED_EDEFAULT;
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
		result.append(" (cleared: ");
		result.append(cleared);
		result.append(", surviveSeconds: ");
		result.append(surviveSeconds);
		result.append(", points: ");
		result.append(points);
		result.append(", enemiesPopped: ");
		result.append(enemiesPopped);
		result.append(", wavesSurvived: ");
		result.append(wavesSurvived);
		result.append(')');
		return result.toString();
	}

} //WinConditionImpl
