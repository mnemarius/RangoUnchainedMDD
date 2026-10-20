/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.BallSpawn;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.FixedLayoutImpl#getSpawns <em>Spawns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedLayoutImpl extends SpawnStrategyImpl implements FixedLayout {
	/**
	 * The cached value of the '{@link #getSpawns() <em>Spawns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpawns()
	 * @generated
	 * @ordered
	 */
	protected EList<BallSpawn> spawns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.FIXED_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BallSpawn> getSpawns() {
		if (spawns == null) {
			spawns = new EObjectContainmentEList<BallSpawn>(BallSpawn.class, this, GamemodePackage.FIXED_LAYOUT__SPAWNS);
		}
		return spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.FIXED_LAYOUT__SPAWNS:
				return ((InternalEList<?>)getSpawns()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.FIXED_LAYOUT__SPAWNS:
				return getSpawns();
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
			case GamemodePackage.FIXED_LAYOUT__SPAWNS:
				getSpawns().clear();
				getSpawns().addAll((Collection<? extends BallSpawn>)newValue);
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
			case GamemodePackage.FIXED_LAYOUT__SPAWNS:
				getSpawns().clear();
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
			case GamemodePackage.FIXED_LAYOUT__SPAWNS:
				return spawns != null && !spawns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FixedLayoutImpl
