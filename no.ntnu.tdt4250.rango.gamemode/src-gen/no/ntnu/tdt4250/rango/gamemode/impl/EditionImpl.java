/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;

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
 * An implementation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getEnemyTypes <em>Enemy Types</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getPowerUps <em>Power Ups</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl#getDrops <em>Drops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditionImpl extends NamedElementImpl implements Edition {
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
	 * The cached value of the '{@link #getEnemyTypes() <em>Enemy Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnemyType> enemyTypes;

	/**
	 * The cached value of the '{@link #getPowerUps() <em>Power Ups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUps()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerUp> powerUps;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerProfile> players;

	/**
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<GameMode> modes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.EDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.EDITION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnemyType> getEnemyTypes() {
		if (enemyTypes == null) {
			enemyTypes = new EObjectContainmentEList<EnemyType>(EnemyType.class, this, GamemodePackage.EDITION__ENEMY_TYPES);
		}
		return enemyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PowerUp> getPowerUps() {
		if (powerUps == null) {
			powerUps = new EObjectContainmentEList<PowerUp>(PowerUp.class, this, GamemodePackage.EDITION__POWER_UPS);
		}
		return powerUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerProfile> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<PlayerProfile>(PlayerProfile.class, this, GamemodePackage.EDITION__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GameMode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<GameMode>(GameMode.class, this, GamemodePackage.EDITION__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DropTable> getDrops() {
		if (drops == null) {
			drops = new EObjectContainmentEList<DropTable>(DropTable.class, this, GamemodePackage.EDITION__DROPS);
		}
		return drops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.EDITION__ENEMY_TYPES:
				return ((InternalEList<?>)getEnemyTypes()).basicRemove(otherEnd, msgs);
			case GamemodePackage.EDITION__POWER_UPS:
				return ((InternalEList<?>)getPowerUps()).basicRemove(otherEnd, msgs);
			case GamemodePackage.EDITION__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case GamemodePackage.EDITION__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
			case GamemodePackage.EDITION__DROPS:
				return ((InternalEList<?>)getDrops()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.EDITION__TITLE:
				return getTitle();
			case GamemodePackage.EDITION__ENEMY_TYPES:
				return getEnemyTypes();
			case GamemodePackage.EDITION__POWER_UPS:
				return getPowerUps();
			case GamemodePackage.EDITION__PLAYERS:
				return getPlayers();
			case GamemodePackage.EDITION__MODES:
				return getModes();
			case GamemodePackage.EDITION__DROPS:
				return getDrops();
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
			case GamemodePackage.EDITION__TITLE:
				setTitle((String)newValue);
				return;
			case GamemodePackage.EDITION__ENEMY_TYPES:
				getEnemyTypes().clear();
				getEnemyTypes().addAll((Collection<? extends EnemyType>)newValue);
				return;
			case GamemodePackage.EDITION__POWER_UPS:
				getPowerUps().clear();
				getPowerUps().addAll((Collection<? extends PowerUp>)newValue);
				return;
			case GamemodePackage.EDITION__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends PlayerProfile>)newValue);
				return;
			case GamemodePackage.EDITION__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends GameMode>)newValue);
				return;
			case GamemodePackage.EDITION__DROPS:
				getDrops().clear();
				getDrops().addAll((Collection<? extends DropTable>)newValue);
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
			case GamemodePackage.EDITION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GamemodePackage.EDITION__ENEMY_TYPES:
				getEnemyTypes().clear();
				return;
			case GamemodePackage.EDITION__POWER_UPS:
				getPowerUps().clear();
				return;
			case GamemodePackage.EDITION__PLAYERS:
				getPlayers().clear();
				return;
			case GamemodePackage.EDITION__MODES:
				getModes().clear();
				return;
			case GamemodePackage.EDITION__DROPS:
				getDrops().clear();
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
			case GamemodePackage.EDITION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GamemodePackage.EDITION__ENEMY_TYPES:
				return enemyTypes != null && !enemyTypes.isEmpty();
			case GamemodePackage.EDITION__POWER_UPS:
				return powerUps != null && !powerUps.isEmpty();
			case GamemodePackage.EDITION__PLAYERS:
				return players != null && !players.isEmpty();
			case GamemodePackage.EDITION__MODES:
				return modes != null && !modes.isEmpty();
			case GamemodePackage.EDITION__DROPS:
				return drops != null && !drops.isEmpty();
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

} //EditionImpl
