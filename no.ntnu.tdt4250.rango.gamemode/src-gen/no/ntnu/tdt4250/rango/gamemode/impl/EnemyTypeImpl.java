/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PlayerEffect;
import no.ntnu.tdt4250.rango.gamemode.SplitRule;

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
 * An implementation of the model object '<em><b>Enemy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getSprite <em>Sprite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getBounce <em>Bounce</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getSplitRule <em>Split Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getContactEffects <em>Contact Effects</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl#getProducedTypes <em>Produced Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnemyTypeImpl extends NamedElementImpl implements EnemyType {
	/**
	 * The default value of the '{@link #getSprite() <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprite()
	 * @generated
	 * @ordered
	 */
	protected static final String SPRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSprite() <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprite()
	 * @generated
	 * @ordered
	 */
	protected String sprite = SPRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected float scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBounce() <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounce()
	 * @generated
	 * @ordered
	 */
	protected static final float BOUNCE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getBounce() <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounce()
	 * @generated
	 * @ordered
	 */
	protected float bounce = BOUNCE_EDEFAULT;

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
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 10;

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
	 * The cached value of the '{@link #getSplitRule() <em>Split Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitRule()
	 * @generated
	 * @ordered
	 */
	protected SplitRule splitRule;

	/**
	 * The cached value of the '{@link #getContactEffects() <em>Contact Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerEffect> contactEffects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnemyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.ENEMY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSprite() {
		return sprite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSprite(String newSprite) {
		String oldSprite = sprite;
		sprite = newSprite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__SPRITE, oldSprite, sprite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(float newScale) {
		float oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getBounce() {
		return bounce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBounce(float newBounce) {
		float oldBounce = bounce;
		bounce = newBounce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__BOUNCE, oldBounce, bounce));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__SPEED, oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitRule getSplitRule() {
		return splitRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplitRule(SplitRule newSplitRule, NotificationChain msgs) {
		SplitRule oldSplitRule = splitRule;
		splitRule = newSplitRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__SPLIT_RULE, oldSplitRule, newSplitRule);
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
	public void setSplitRule(SplitRule newSplitRule) {
		if (newSplitRule != splitRule) {
			NotificationChain msgs = null;
			if (splitRule != null)
				msgs = ((InternalEObject)splitRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.ENEMY_TYPE__SPLIT_RULE, null, msgs);
			if (newSplitRule != null)
				msgs = ((InternalEObject)newSplitRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamemodePackage.ENEMY_TYPE__SPLIT_RULE, null, msgs);
			msgs = basicSetSplitRule(newSplitRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_TYPE__SPLIT_RULE, newSplitRule, newSplitRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerEffect> getContactEffects() {
		if (contactEffects == null) {
			contactEffects = new EObjectContainmentEList<PlayerEffect>(PlayerEffect.class, this, GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS);
		}
		return contactEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<EnemyType> getProducedTypes() {
		return GamemodeDerivations.producedTypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.ENEMY_TYPE__SPLIT_RULE:
				return basicSetSplitRule(null, msgs);
			case GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS:
				return ((InternalEList<?>)getContactEffects()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.ENEMY_TYPE__SPRITE:
				return getSprite();
			case GamemodePackage.ENEMY_TYPE__SCALE:
				return getScale();
			case GamemodePackage.ENEMY_TYPE__BOUNCE:
				return getBounce();
			case GamemodePackage.ENEMY_TYPE__SPEED:
				return getSpeed();
			case GamemodePackage.ENEMY_TYPE__POINTS:
				return getPoints();
			case GamemodePackage.ENEMY_TYPE__SPLIT_RULE:
				return getSplitRule();
			case GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS:
				return getContactEffects();
			case GamemodePackage.ENEMY_TYPE__PRODUCED_TYPES:
				return getProducedTypes();
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
			case GamemodePackage.ENEMY_TYPE__SPRITE:
				setSprite((String)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__SCALE:
				setScale((Float)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__BOUNCE:
				setBounce((Float)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__SPEED:
				setSpeed((Float)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__POINTS:
				setPoints((Integer)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__SPLIT_RULE:
				setSplitRule((SplitRule)newValue);
				return;
			case GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS:
				getContactEffects().clear();
				getContactEffects().addAll((Collection<? extends PlayerEffect>)newValue);
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
			case GamemodePackage.ENEMY_TYPE__SPRITE:
				setSprite(SPRITE_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_TYPE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_TYPE__BOUNCE:
				setBounce(BOUNCE_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_TYPE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_TYPE__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_TYPE__SPLIT_RULE:
				setSplitRule((SplitRule)null);
				return;
			case GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS:
				getContactEffects().clear();
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
			case GamemodePackage.ENEMY_TYPE__SPRITE:
				return SPRITE_EDEFAULT == null ? sprite != null : !SPRITE_EDEFAULT.equals(sprite);
			case GamemodePackage.ENEMY_TYPE__SCALE:
				return scale != SCALE_EDEFAULT;
			case GamemodePackage.ENEMY_TYPE__BOUNCE:
				return bounce != BOUNCE_EDEFAULT;
			case GamemodePackage.ENEMY_TYPE__SPEED:
				return speed != SPEED_EDEFAULT;
			case GamemodePackage.ENEMY_TYPE__POINTS:
				return points != POINTS_EDEFAULT;
			case GamemodePackage.ENEMY_TYPE__SPLIT_RULE:
				return splitRule != null;
			case GamemodePackage.ENEMY_TYPE__CONTACT_EFFECTS:
				return contactEffects != null && !contactEffects.isEmpty();
			case GamemodePackage.ENEMY_TYPE__PRODUCED_TYPES:
				return !getProducedTypes().isEmpty();
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
		result.append(" (sprite: ");
		result.append(sprite);
		result.append(", scale: ");
		result.append(scale);
		result.append(", bounce: ");
		result.append(bounce);
		result.append(", speed: ");
		result.append(speed);
		result.append(", points: ");
		result.append(points);
		result.append(')');
		return result.toString();
	}

} //EnemyTypeImpl
