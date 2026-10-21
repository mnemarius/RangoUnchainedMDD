/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl#getFragmentType <em>Fragment Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl#getLaunchSpeed <em>Launch Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitImpl extends SplitRuleImpl implements Split {
	/**
	 * The default value of the '{@link #getFragments() <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAGMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected int fragments = FRAGMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFragmentType() <em>Fragment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentType()
	 * @generated
	 * @ordered
	 */
	protected EnemyType fragmentType;

	/**
	 * The default value of the '{@link #getLaunchSpeed() <em>Launch Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final float LAUNCH_SPEED_EDEFAULT = 5.0F;

	/**
	 * The cached value of the '{@link #getLaunchSpeed() <em>Launch Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchSpeed()
	 * @generated
	 * @ordered
	 */
	protected float launchSpeed = LAUNCH_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final float SPACING_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFragments() {
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragments(int newFragments) {
		int oldFragments = fragments;
		fragments = newFragments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.SPLIT__FRAGMENTS, oldFragments, fragments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemyType getFragmentType() {
		if (fragmentType != null && fragmentType.eIsProxy()) {
			InternalEObject oldFragmentType = (InternalEObject)fragmentType;
			fragmentType = (EnemyType)eResolveProxy(oldFragmentType);
			if (fragmentType != oldFragmentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamemodePackage.SPLIT__FRAGMENT_TYPE, oldFragmentType, fragmentType));
			}
		}
		return fragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnemyType basicGetFragmentType() {
		return fragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragmentType(EnemyType newFragmentType) {
		EnemyType oldFragmentType = fragmentType;
		fragmentType = newFragmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.SPLIT__FRAGMENT_TYPE, oldFragmentType, fragmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLaunchSpeed() {
		return launchSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaunchSpeed(float newLaunchSpeed) {
		float oldLaunchSpeed = launchSpeed;
		launchSpeed = newLaunchSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.SPLIT__LAUNCH_SPEED, oldLaunchSpeed, launchSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemyType getResultType() {
		EnemyType resultType = basicGetResultType();
		return resultType != null && resultType.eIsProxy() ? (EnemyType)eResolveProxy((InternalEObject)resultType) : resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EnemyType basicGetResultType() {
		return GamemodeDerivations.resultType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public float getSpacing() {
		return GamemodeDerivations.spacing(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.SPLIT__FRAGMENTS:
				return getFragments();
			case GamemodePackage.SPLIT__FRAGMENT_TYPE:
				if (resolve) return getFragmentType();
				return basicGetFragmentType();
			case GamemodePackage.SPLIT__LAUNCH_SPEED:
				return getLaunchSpeed();
			case GamemodePackage.SPLIT__RESULT_TYPE:
				if (resolve) return getResultType();
				return basicGetResultType();
			case GamemodePackage.SPLIT__SPACING:
				return getSpacing();
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
			case GamemodePackage.SPLIT__FRAGMENTS:
				setFragments((Integer)newValue);
				return;
			case GamemodePackage.SPLIT__FRAGMENT_TYPE:
				setFragmentType((EnemyType)newValue);
				return;
			case GamemodePackage.SPLIT__LAUNCH_SPEED:
				setLaunchSpeed((Float)newValue);
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
			case GamemodePackage.SPLIT__FRAGMENTS:
				setFragments(FRAGMENTS_EDEFAULT);
				return;
			case GamemodePackage.SPLIT__FRAGMENT_TYPE:
				setFragmentType((EnemyType)null);
				return;
			case GamemodePackage.SPLIT__LAUNCH_SPEED:
				setLaunchSpeed(LAUNCH_SPEED_EDEFAULT);
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
			case GamemodePackage.SPLIT__FRAGMENTS:
				return fragments != FRAGMENTS_EDEFAULT;
			case GamemodePackage.SPLIT__FRAGMENT_TYPE:
				return fragmentType != null;
			case GamemodePackage.SPLIT__LAUNCH_SPEED:
				return launchSpeed != LAUNCH_SPEED_EDEFAULT;
			case GamemodePackage.SPLIT__RESULT_TYPE:
				return basicGetResultType() != null;
			case GamemodePackage.SPLIT__SPACING:
				return getSpacing() != SPACING_EDEFAULT;
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
		result.append(" (fragments: ");
		result.append(fragments);
		result.append(", launchSpeed: ");
		result.append(launchSpeed);
		result.append(')');
		return result.toString();
	}

} //SplitImpl
