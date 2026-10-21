/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.BallType;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;

import no.ntnu.tdt4250.rango.gamemode.SpeedBonus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getBallTypes <em>Ball Types</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getGravity <em>Gravity</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getSpeedBonus <em>Speed Bonus</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getArena <em>Arena</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getSpawning <em>Spawning</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getDrops <em>Drops</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getWinConditions <em>Win Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getLoseConditions <em>Lose Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getPowerUps <em>Power Ups</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getPopsToClear <em>Pops To Clear</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl#getEffectiveDrops <em>Effective Drops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameModeImpl extends NamedElementImpl implements GameMode {
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
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected PlayerProfile player;

	/**
	 * The default value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected static final float GRAVITY_EDEFAULT = 10.0F;

	/**
	 * The cached value of the '{@link #getGravity() <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravity()
	 * @generated
	 * @ordered
	 */
	protected float gravity = GRAVITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpeedBonus() <em>Speed Bonus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedBonus()
	 * @generated
	 * @ordered
	 */
	protected SpeedBonus speedBonus;

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
	 * The cached value of the '{@link #getDrops() <em>Drops</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrops()
	 * @generated
	 * @ordered
	 */
	protected EList<DropTable> drops;

	/**
	 * The cached value of the '{@link #getWinConditions() <em>Win Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<EndCondition> winConditions;

	/**
	 * The cached value of the '{@link #getLoseConditions() <em>Lose Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoseConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<EndCondition> loseConditions;

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
	protected GameModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.GAME_MODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerProfile getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (PlayerProfile)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamemodePackage.GAME_MODE__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerProfile basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(PlayerProfile newPlayer) {
		PlayerProfile oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<BallType> getBallTypes() {
		return GamemodeDerivations.ballTypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getGravity() {
		return gravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGravity(float newGravity) {
		float oldGravity = gravity;
		gravity = newGravity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__GRAVITY, oldGravity, gravity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedBonus getSpeedBonus() {
		return speedBonus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedBonus(SpeedBonus newSpeedBonus, NotificationChain msgs) {
		SpeedBonus oldSpeedBonus = speedBonus;
		speedBonus = newSpeedBonus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__SPEED_BONUS, oldSpeedBonus, newSpeedBonus);
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
	public void setSpeedBonus(SpeedBonus newSpeedBonus) {
		if (newSpeedBonus != speedBonus) {
			NotificationChain msgs = null;
			if (speedBonus != null)
				msgs = ((InternalEObject)speedBonus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__SPEED_BONUS, null, msgs);
			if (newSpeedBonus != null)
				msgs = ((InternalEObject)newSpeedBonus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__SPEED_BONUS, null, msgs);
			msgs = basicSetSpeedBonus(newSpeedBonus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__SPEED_BONUS, newSpeedBonus, newSpeedBonus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__ARENA, oldArena, newArena);
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
				msgs = ((InternalEObject)arena).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__ARENA, null, msgs);
			if (newArena != null)
				msgs = ((InternalEObject)newArena).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__ARENA, null, msgs);
			msgs = basicSetArena(newArena, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__ARENA, newArena, newArena));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__SPAWNING, oldSpawning, newSpawning);
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
				msgs = ((InternalEObject)spawning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__SPAWNING, null, msgs);
			if (newSpawning != null)
				msgs = ((InternalEObject)newSpawning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.GAME_MODE__SPAWNING, null, msgs);
			msgs = basicSetSpawning(newSpawning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.GAME_MODE__SPAWNING, newSpawning, newSpawning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DropTable> getDrops() {
		if (drops == null) {
			drops = new EObjectContainmentEList<DropTable>(DropTable.class, this, GamemodePackage.GAME_MODE__DROPS);
		}
		return drops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndCondition> getWinConditions() {
		if (winConditions == null) {
			winConditions = new EObjectContainmentEList<EndCondition>(EndCondition.class, this, GamemodePackage.GAME_MODE__WIN_CONDITIONS);
		}
		return winConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EndCondition> getLoseConditions() {
		if (loseConditions == null) {
			loseConditions = new EObjectContainmentEList<EndCondition>(EndCondition.class, this, GamemodePackage.GAME_MODE__LOSE_CONDITIONS);
		}
		return loseConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PowerUp> getPowerUps() {
		return GamemodeDerivations.powerUps(this);
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
	 * @generated NOT
	 */
	@Override
	public EList<DropTable> getEffectiveDrops() {
		return GamemodeDerivations.effectiveDrops(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.GAME_MODE__SPEED_BONUS:
				return basicSetSpeedBonus(null, msgs);
			case GamemodePackage.GAME_MODE__ARENA:
				return basicSetArena(null, msgs);
			case GamemodePackage.GAME_MODE__SPAWNING:
				return basicSetSpawning(null, msgs);
			case GamemodePackage.GAME_MODE__DROPS:
				return ((InternalEList<?>)getDrops()).basicRemove(otherEnd, msgs);
			case GamemodePackage.GAME_MODE__WIN_CONDITIONS:
				return ((InternalEList<?>)getWinConditions()).basicRemove(otherEnd, msgs);
			case GamemodePackage.GAME_MODE__LOSE_CONDITIONS:
				return ((InternalEList<?>)getLoseConditions()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.GAME_MODE__TITLE:
				return getTitle();
			case GamemodePackage.GAME_MODE__DESCRIPTION:
				return getDescription();
			case GamemodePackage.GAME_MODE__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case GamemodePackage.GAME_MODE__BALL_TYPES:
				return getBallTypes();
			case GamemodePackage.GAME_MODE__GRAVITY:
				return getGravity();
			case GamemodePackage.GAME_MODE__SPEED_BONUS:
				return getSpeedBonus();
			case GamemodePackage.GAME_MODE__ARENA:
				return getArena();
			case GamemodePackage.GAME_MODE__SPAWNING:
				return getSpawning();
			case GamemodePackage.GAME_MODE__DROPS:
				return getDrops();
			case GamemodePackage.GAME_MODE__WIN_CONDITIONS:
				return getWinConditions();
			case GamemodePackage.GAME_MODE__LOSE_CONDITIONS:
				return getLoseConditions();
			case GamemodePackage.GAME_MODE__POWER_UPS:
				return getPowerUps();
			case GamemodePackage.GAME_MODE__POPS_TO_CLEAR:
				return getPopsToClear();
			case GamemodePackage.GAME_MODE__MAX_SCORE:
				return getMaxScore();
			case GamemodePackage.GAME_MODE__EFFECTIVE_DROPS:
				return getEffectiveDrops();
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
			case GamemodePackage.GAME_MODE__TITLE:
				setTitle((String)newValue);
				return;
			case GamemodePackage.GAME_MODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GamemodePackage.GAME_MODE__PLAYER:
				setPlayer((PlayerProfile)newValue);
				return;
			case GamemodePackage.GAME_MODE__GRAVITY:
				setGravity((Float)newValue);
				return;
			case GamemodePackage.GAME_MODE__SPEED_BONUS:
				setSpeedBonus((SpeedBonus)newValue);
				return;
			case GamemodePackage.GAME_MODE__ARENA:
				setArena((Arena)newValue);
				return;
			case GamemodePackage.GAME_MODE__SPAWNING:
				setSpawning((SpawnStrategy)newValue);
				return;
			case GamemodePackage.GAME_MODE__DROPS:
				getDrops().clear();
				getDrops().addAll((Collection<? extends DropTable>)newValue);
				return;
			case GamemodePackage.GAME_MODE__WIN_CONDITIONS:
				getWinConditions().clear();
				getWinConditions().addAll((Collection<? extends EndCondition>)newValue);
				return;
			case GamemodePackage.GAME_MODE__LOSE_CONDITIONS:
				getLoseConditions().clear();
				getLoseConditions().addAll((Collection<? extends EndCondition>)newValue);
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
			case GamemodePackage.GAME_MODE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GamemodePackage.GAME_MODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GamemodePackage.GAME_MODE__PLAYER:
				setPlayer((PlayerProfile)null);
				return;
			case GamemodePackage.GAME_MODE__GRAVITY:
				setGravity(GRAVITY_EDEFAULT);
				return;
			case GamemodePackage.GAME_MODE__SPEED_BONUS:
				setSpeedBonus((SpeedBonus)null);
				return;
			case GamemodePackage.GAME_MODE__ARENA:
				setArena((Arena)null);
				return;
			case GamemodePackage.GAME_MODE__SPAWNING:
				setSpawning((SpawnStrategy)null);
				return;
			case GamemodePackage.GAME_MODE__DROPS:
				getDrops().clear();
				return;
			case GamemodePackage.GAME_MODE__WIN_CONDITIONS:
				getWinConditions().clear();
				return;
			case GamemodePackage.GAME_MODE__LOSE_CONDITIONS:
				getLoseConditions().clear();
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
			case GamemodePackage.GAME_MODE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GamemodePackage.GAME_MODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GamemodePackage.GAME_MODE__PLAYER:
				return player != null;
			case GamemodePackage.GAME_MODE__BALL_TYPES:
				return !getBallTypes().isEmpty();
			case GamemodePackage.GAME_MODE__GRAVITY:
				return gravity != GRAVITY_EDEFAULT;
			case GamemodePackage.GAME_MODE__SPEED_BONUS:
				return speedBonus != null;
			case GamemodePackage.GAME_MODE__ARENA:
				return arena != null;
			case GamemodePackage.GAME_MODE__SPAWNING:
				return spawning != null;
			case GamemodePackage.GAME_MODE__DROPS:
				return drops != null && !drops.isEmpty();
			case GamemodePackage.GAME_MODE__WIN_CONDITIONS:
				return winConditions != null && !winConditions.isEmpty();
			case GamemodePackage.GAME_MODE__LOSE_CONDITIONS:
				return loseConditions != null && !loseConditions.isEmpty();
			case GamemodePackage.GAME_MODE__POWER_UPS:
				return !getPowerUps().isEmpty();
			case GamemodePackage.GAME_MODE__POPS_TO_CLEAR:
				return getPopsToClear() != POPS_TO_CLEAR_EDEFAULT;
			case GamemodePackage.GAME_MODE__MAX_SCORE:
				return getMaxScore() != MAX_SCORE_EDEFAULT;
			case GamemodePackage.GAME_MODE__EFFECTIVE_DROPS:
				return !getEffectiveDrops().isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", gravity: ");
		result.append(gravity);
		result.append(')');
		return result.toString();
	}

} //GameModeImpl
