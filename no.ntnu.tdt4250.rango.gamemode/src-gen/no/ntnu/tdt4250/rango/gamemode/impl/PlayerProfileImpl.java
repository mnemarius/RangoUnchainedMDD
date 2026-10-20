/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getHealth <em>Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getMaxHealth <em>Max Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getTongueTime <em>Tongue Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl#getGraceTime <em>Grace Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerProfileImpl extends NamedElementImpl implements PlayerProfile {
	/**
	 * The default value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_EDEFAULT = "Rango";

	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected String character = CHARACTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealth() <em>Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth()
	 * @generated
	 * @ordered
	 */
	protected static final int HEALTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHealth() <em>Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealth()
	 * @generated
	 * @ordered
	 */
	protected int health = HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHealth() <em>Max Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHealth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEALTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHealth() <em>Max Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHealth()
	 * @generated
	 * @ordered
	 */
	protected int maxHealth = MAX_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_EDEFAULT = 5.0F;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected float speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTongueTime() <em>Tongue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTongueTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TONGUE_TIME_EDEFAULT = 0.8F;

	/**
	 * The cached value of the '{@link #getTongueTime() <em>Tongue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTongueTime()
	 * @generated
	 * @ordered
	 */
	protected float tongueTime = TONGUE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected static final float COOLDOWN_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getCooldown() <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooldown()
	 * @generated
	 * @ordered
	 */
	protected float cooldown = COOLDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGraceTime() <em>Grace Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraceTime()
	 * @generated
	 * @ordered
	 */
	protected static final float GRACE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGraceTime() <em>Grace Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraceTime()
	 * @generated
	 * @ordered
	 */
	protected float graceTime = GRACE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.PLAYER_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCharacter() {
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacter(String newCharacter) {
		String oldCharacter = character;
		character = newCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHealth() {
		return health;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealth(int newHealth) {
		int oldHealth = health;
		health = newHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__HEALTH, oldHealth, health));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHealth(int newMaxHealth) {
		int oldMaxHealth = maxHealth;
		maxHealth = newMaxHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__MAX_HEALTH, oldMaxHealth, maxHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(float newSpeed) {
		float oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTongueTime() {
		return tongueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTongueTime(float newTongueTime) {
		float oldTongueTime = tongueTime;
		tongueTime = newTongueTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__TONGUE_TIME, oldTongueTime, tongueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCooldown() {
		return cooldown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCooldown(float newCooldown) {
		float oldCooldown = cooldown;
		cooldown = newCooldown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__COOLDOWN, oldCooldown, cooldown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGraceTime() {
		return graceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraceTime(float newGraceTime) {
		float oldGraceTime = graceTime;
		graceTime = newGraceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.PLAYER_PROFILE__GRACE_TIME, oldGraceTime, graceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.PLAYER_PROFILE__CHARACTER:
				return getCharacter();
			case GamemodePackage.PLAYER_PROFILE__HEALTH:
				return getHealth();
			case GamemodePackage.PLAYER_PROFILE__MAX_HEALTH:
				return getMaxHealth();
			case GamemodePackage.PLAYER_PROFILE__SPEED:
				return getSpeed();
			case GamemodePackage.PLAYER_PROFILE__TONGUE_TIME:
				return getTongueTime();
			case GamemodePackage.PLAYER_PROFILE__COOLDOWN:
				return getCooldown();
			case GamemodePackage.PLAYER_PROFILE__GRACE_TIME:
				return getGraceTime();
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
			case GamemodePackage.PLAYER_PROFILE__CHARACTER:
				setCharacter((String)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__HEALTH:
				setHealth((Integer)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__MAX_HEALTH:
				setMaxHealth((Integer)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__SPEED:
				setSpeed((Float)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__TONGUE_TIME:
				setTongueTime((Float)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__COOLDOWN:
				setCooldown((Float)newValue);
				return;
			case GamemodePackage.PLAYER_PROFILE__GRACE_TIME:
				setGraceTime((Float)newValue);
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
			case GamemodePackage.PLAYER_PROFILE__CHARACTER:
				setCharacter(CHARACTER_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__HEALTH:
				setHealth(HEALTH_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__MAX_HEALTH:
				setMaxHealth(MAX_HEALTH_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__TONGUE_TIME:
				setTongueTime(TONGUE_TIME_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__COOLDOWN:
				setCooldown(COOLDOWN_EDEFAULT);
				return;
			case GamemodePackage.PLAYER_PROFILE__GRACE_TIME:
				setGraceTime(GRACE_TIME_EDEFAULT);
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
			case GamemodePackage.PLAYER_PROFILE__CHARACTER:
				return CHARACTER_EDEFAULT == null ? character != null : !CHARACTER_EDEFAULT.equals(character);
			case GamemodePackage.PLAYER_PROFILE__HEALTH:
				return health != HEALTH_EDEFAULT;
			case GamemodePackage.PLAYER_PROFILE__MAX_HEALTH:
				return maxHealth != MAX_HEALTH_EDEFAULT;
			case GamemodePackage.PLAYER_PROFILE__SPEED:
				return speed != SPEED_EDEFAULT;
			case GamemodePackage.PLAYER_PROFILE__TONGUE_TIME:
				return tongueTime != TONGUE_TIME_EDEFAULT;
			case GamemodePackage.PLAYER_PROFILE__COOLDOWN:
				return cooldown != COOLDOWN_EDEFAULT;
			case GamemodePackage.PLAYER_PROFILE__GRACE_TIME:
				return graceTime != GRACE_TIME_EDEFAULT;
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
		result.append(" (character: ");
		result.append(character);
		result.append(", health: ");
		result.append(health);
		result.append(", maxHealth: ");
		result.append(maxHealth);
		result.append(", speed: ");
		result.append(speed);
		result.append(", tongueTime: ");
		result.append(tongueTime);
		result.append(", cooldown: ");
		result.append(cooldown);
		result.append(", graceTime: ");
		result.append(graceTime);
		result.append(')');
		return result.toString();
	}

} //PlayerProfileImpl
