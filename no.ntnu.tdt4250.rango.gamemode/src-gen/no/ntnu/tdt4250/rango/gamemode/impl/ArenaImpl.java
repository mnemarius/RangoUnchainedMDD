/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Obstacle;

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
 * An implementation of the model object '<em><b>Arena</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl#getPlayerStart <em>Player Start</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl#getObstacles <em>Obstacles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArenaImpl extends EObjectImpl implements Arena {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerStart() <em>Player Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerStart()
	 * @generated
	 * @ordered
	 */
	protected static final float PLAYER_START_EDEFAULT = 10.0F;

	/**
	 * The cached value of the '{@link #getPlayerStart() <em>Player Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerStart()
	 * @generated
	 * @ordered
	 */
	protected float playerStart = PLAYER_START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObstacles() <em>Obstacles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstacles()
	 * @generated
	 * @ordered
	 */
	protected EList<Obstacle> obstacles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArenaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.ARENA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ARENA__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPlayerStart() {
		return playerStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerStart(float newPlayerStart) {
		float oldPlayerStart = playerStart;
		playerStart = newPlayerStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ARENA__PLAYER_START, oldPlayerStart, playerStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Obstacle> getObstacles() {
		if (obstacles == null) {
			obstacles = new EObjectContainmentEList<Obstacle>(Obstacle.class, this, GamemodePackage.ARENA__OBSTACLES);
		}
		return obstacles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.ARENA__OBSTACLES:
				return ((InternalEList<?>)getObstacles()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.ARENA__BACKGROUND:
				return getBackground();
			case GamemodePackage.ARENA__PLAYER_START:
				return getPlayerStart();
			case GamemodePackage.ARENA__OBSTACLES:
				return getObstacles();
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
			case GamemodePackage.ARENA__BACKGROUND:
				setBackground((String)newValue);
				return;
			case GamemodePackage.ARENA__PLAYER_START:
				setPlayerStart((Float)newValue);
				return;
			case GamemodePackage.ARENA__OBSTACLES:
				getObstacles().clear();
				getObstacles().addAll((Collection<? extends Obstacle>)newValue);
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
			case GamemodePackage.ARENA__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case GamemodePackage.ARENA__PLAYER_START:
				setPlayerStart(PLAYER_START_EDEFAULT);
				return;
			case GamemodePackage.ARENA__OBSTACLES:
				getObstacles().clear();
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
			case GamemodePackage.ARENA__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case GamemodePackage.ARENA__PLAYER_START:
				return playerStart != PLAYER_START_EDEFAULT;
			case GamemodePackage.ARENA__OBSTACLES:
				return obstacles != null && !obstacles.isEmpty();
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
		result.append(" (background: ");
		result.append(background);
		result.append(", playerStart: ");
		result.append(playerStart);
		result.append(')');
		return result.toString();
	}

} //ArenaImpl
