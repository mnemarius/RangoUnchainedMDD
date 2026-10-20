/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.PlayerEffect;
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
 * An implementation of the model object '<em><b>Power Up</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl#getSprite <em>Sprite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerUpImpl extends NamedElementImpl implements PowerUp {
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
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerEffect> effects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerUpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.POWER_UP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.POWER_UP__SPRITE, oldSprite, sprite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayerEffect> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<PlayerEffect>(PlayerEffect.class, this, GamemodePackage.POWER_UP__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.POWER_UP__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.POWER_UP__SPRITE:
				return getSprite();
			case GamemodePackage.POWER_UP__EFFECTS:
				return getEffects();
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
			case GamemodePackage.POWER_UP__SPRITE:
				setSprite((String)newValue);
				return;
			case GamemodePackage.POWER_UP__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends PlayerEffect>)newValue);
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
			case GamemodePackage.POWER_UP__SPRITE:
				setSprite(SPRITE_EDEFAULT);
				return;
			case GamemodePackage.POWER_UP__EFFECTS:
				getEffects().clear();
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
			case GamemodePackage.POWER_UP__SPRITE:
				return SPRITE_EDEFAULT == null ? sprite != null : !SPRITE_EDEFAULT.equals(sprite);
			case GamemodePackage.POWER_UP__EFFECTS:
				return effects != null && !effects.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PowerUpImpl
