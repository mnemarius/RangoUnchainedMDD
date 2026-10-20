/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spawn Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.SpawnStrategyImpl#getPopsToClear <em>Pops To Clear</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpawnStrategyImpl extends EObjectImpl implements SpawnStrategy {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpawnStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.SPAWN_STRATEGY;
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamemodePackage.SPAWN_STRATEGY__POPS_TO_CLEAR:
				return getPopsToClear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GamemodePackage.SPAWN_STRATEGY__POPS_TO_CLEAR:
				return getPopsToClear() != POPS_TO_CLEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SpawnStrategyImpl
