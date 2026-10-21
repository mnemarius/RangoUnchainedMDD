/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getArena <em>Arena</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getSpawning <em>Spawning</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getPopsToClear <em>Pops To Clear</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl#getMaxScore <em>Max Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LevelImpl extends EObjectImpl implements Level {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArena() <em>Arena</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArena()
	 * @generated
	 * @ordered
	 */
	protected Arena arena;

	/**
	 * The cached value of the '{@link #getSpawning() <em>Spawning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpawning()
	 * @generated
	 * @ordered
	 */
	protected SpawnStrategy spawning;

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
	 * The default value of the '{@link #getMaxScore() <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScore()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SCORE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LEVEL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arena getArena() {
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArena(Arena newArena, NotificationChain msgs) {
		Arena oldArena = arena;
		arena = newArena;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.LEVEL__ARENA, oldArena, newArena);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArena(Arena newArena) {
		if (newArena != arena) {
			NotificationChain msgs = null;
			if (arena != null)
				msgs = ((InternalEObject)arena).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.LEVEL__ARENA, null, msgs);
			if (newArena != null)
				msgs = ((InternalEObject)newArena).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.LEVEL__ARENA, null, msgs);
			msgs = basicSetArena(newArena, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LEVEL__ARENA, newArena, newArena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpawnStrategy getSpawning() {
		return spawning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpawning(SpawnStrategy newSpawning, NotificationChain msgs) {
		SpawnStrategy oldSpawning = spawning;
		spawning = newSpawning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.LEVEL__SPAWNING, oldSpawning, newSpawning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpawning(SpawnStrategy newSpawning) {
		if (newSpawning != spawning) {
			NotificationChain msgs = null;
			if (spawning != null)
				msgs = ((InternalEObject)spawning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.LEVEL__SPAWNING, null, msgs);
			if (newSpawning != null)
				msgs = ((InternalEObject)newSpawning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.LEVEL__SPAWNING, null, msgs);
			msgs = basicSetSpawning(newSpawning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.LEVEL__SPAWNING, newSpawning, newSpawning));
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
	 * @generated NOT
	 */
	@Override
	public int getMaxScore() {
		return GamemodeDerivations.maxScore(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.LEVEL__ARENA:
				return basicSetArena(null, msgs);
			case GamemodePackage.LEVEL__SPAWNING:
				return basicSetSpawning(null, msgs);
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
			case GamemodePackage.LEVEL__TITLE:
				return getTitle();
			case GamemodePackage.LEVEL__ARENA:
				return getArena();
			case GamemodePackage.LEVEL__SPAWNING:
				return getSpawning();
			case GamemodePackage.LEVEL__NUMBER:
				return getNumber();
			case GamemodePackage.LEVEL__POPS_TO_CLEAR:
				return getPopsToClear();
			case GamemodePackage.LEVEL__MAX_SCORE:
				return getMaxScore();
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
			case GamemodePackage.LEVEL__TITLE:
				setTitle((String)newValue);
				return;
			case GamemodePackage.LEVEL__ARENA:
				setArena((Arena)newValue);
				return;
			case GamemodePackage.LEVEL__SPAWNING:
				setSpawning((SpawnStrategy)newValue);
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
			case GamemodePackage.LEVEL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GamemodePackage.LEVEL__ARENA:
				setArena((Arena)null);
				return;
			case GamemodePackage.LEVEL__SPAWNING:
				setSpawning((SpawnStrategy)null);
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
			case GamemodePackage.LEVEL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GamemodePackage.LEVEL__ARENA:
				return arena != null;
			case GamemodePackage.LEVEL__SPAWNING:
				return spawning != null;
			case GamemodePackage.LEVEL__NUMBER:
				return getNumber() != NUMBER_EDEFAULT;
			case GamemodePackage.LEVEL__POPS_TO_CLEAR:
				return getPopsToClear() != POPS_TO_CLEAR_EDEFAULT;
			case GamemodePackage.LEVEL__MAX_SCORE:
				return getMaxScore() != MAX_SCORE_EDEFAULT;
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //LevelImpl
