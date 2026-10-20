/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import no.ntnu.tdt4250.rango.gamemode.BallType;
import no.ntnu.tdt4250.rango.gamemode.Fragmenting;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragmenting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl#getFragmentType <em>Fragment Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl#getLaunchSpeed <em>Launch Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FragmentingImpl extends SplitRuleImpl implements Fragmenting {
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
	protected BallType fragmentType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.FRAGMENTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.FRAGMENTING__FRAGMENTS, oldFragments, fragments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BallType getFragmentType() {
		if (fragmentType != null && fragmentType.eIsProxy()) {
			InternalEObject oldFragmentType = (InternalEObject)fragmentType;
			fragmentType = (BallType)eResolveProxy(oldFragmentType);
			if (fragmentType != oldFragmentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamemodePackage.FRAGMENTING__FRAGMENT_TYPE, oldFragmentType, fragmentType));
			}
		}
		return fragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallType basicGetFragmentType() {
		return fragmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragmentType(BallType newFragmentType) {
		BallType oldFragmentType = fragmentType;
		fragmentType = newFragmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.FRAGMENTING__FRAGMENT_TYPE, oldFragmentType, fragmentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.FRAGMENTING__LAUNCH_SPEED, oldLaunchSpeed, launchSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BallType getResultType() {
		BallType resultType = basicGetResultType();
		return resultType != null && resultType.eIsProxy() ? (BallType)eResolveProxy((InternalEObject)resultType) : resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BallType basicGetResultType() {
		return GamemodeDerivations.resultType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.FRAGMENTING__FRAGMENTS:
				return getFragments();
			case GamemodePackage.FRAGMENTING__FRAGMENT_TYPE:
				if (resolve) return getFragmentType();
				return basicGetFragmentType();
			case GamemodePackage.FRAGMENTING__LAUNCH_SPEED:
				return getLaunchSpeed();
			case GamemodePackage.FRAGMENTING__RESULT_TYPE:
				if (resolve) return getResultType();
				return basicGetResultType();
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
			case GamemodePackage.FRAGMENTING__FRAGMENTS:
				setFragments((Integer)newValue);
				return;
			case GamemodePackage.FRAGMENTING__FRAGMENT_TYPE:
				setFragmentType((BallType)newValue);
				return;
			case GamemodePackage.FRAGMENTING__LAUNCH_SPEED:
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
			case GamemodePackage.FRAGMENTING__FRAGMENTS:
				setFragments(FRAGMENTS_EDEFAULT);
				return;
			case GamemodePackage.FRAGMENTING__FRAGMENT_TYPE:
				setFragmentType((BallType)null);
				return;
			case GamemodePackage.FRAGMENTING__LAUNCH_SPEED:
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
			case GamemodePackage.FRAGMENTING__FRAGMENTS:
				return fragments != FRAGMENTS_EDEFAULT;
			case GamemodePackage.FRAGMENTING__FRAGMENT_TYPE:
				return fragmentType != null;
			case GamemodePackage.FRAGMENTING__LAUNCH_SPEED:
				return launchSpeed != LAUNCH_SPEED_EDEFAULT;
			case GamemodePackage.FRAGMENTING__RESULT_TYPE:
				return basicGetResultType() != null;
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

} //FragmentingImpl
