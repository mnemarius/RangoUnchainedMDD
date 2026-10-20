/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Material;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl#getBounce <em>Bounce</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl#getSprite <em>Sprite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialImpl extends NamedElementImpl implements Material {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.MATERIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.MATERIAL__BOUNCE, oldBounce, bounce));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.MATERIAL__SPRITE, oldSprite, sprite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.MATERIAL__BOUNCE:
				return getBounce();
			case GamemodePackage.MATERIAL__SPRITE:
				return getSprite();
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
			case GamemodePackage.MATERIAL__BOUNCE:
				setBounce((Float)newValue);
				return;
			case GamemodePackage.MATERIAL__SPRITE:
				setSprite((String)newValue);
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
			case GamemodePackage.MATERIAL__BOUNCE:
				setBounce(BOUNCE_EDEFAULT);
				return;
			case GamemodePackage.MATERIAL__SPRITE:
				setSprite(SPRITE_EDEFAULT);
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
			case GamemodePackage.MATERIAL__BOUNCE:
				return bounce != BOUNCE_EDEFAULT;
			case GamemodePackage.MATERIAL__SPRITE:
				return SPRITE_EDEFAULT == null ? sprite != null : !SPRITE_EDEFAULT.equals(sprite);
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
		result.append(" (bounce: ");
		result.append(bounce);
		result.append(", sprite: ");
		result.append(sprite);
		result.append(')');
		return result.toString();
	}

} //MaterialImpl
