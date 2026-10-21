/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import java.util.Collection;

import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl#getChance <em>Chance</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl#getEnemyType <em>Enemy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropTableImpl extends EObjectImpl implements DropTable {
	/**
	 * The default value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected static final float CHANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected float chance = CHANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Drop> entries;

	/**
	 * The default value of the '{@link #getTotalWeight() <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnemyType() <em>Enemy Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemyType()
	 * @generated
	 * @ordered
	 */
	protected EnemyType enemyType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.DROP_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getChance() {
		return chance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChance(float newChance) {
		float oldChance = chance;
		chance = newChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.DROP_TABLE__CHANCE, oldChance, chance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Drop> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<Drop>(Drop.class, this, GamemodePackage.DROP_TABLE__ENTRIES, GamemodePackage.DROP__TABLE);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getTotalWeight() {
		return GamemodeDerivations.totalWeight(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemyType getEnemyType() {
		if (enemyType != null && enemyType.eIsProxy()) {
			InternalEObject oldEnemyType = (InternalEObject)enemyType;
			enemyType = (EnemyType)eResolveProxy(oldEnemyType);
			if (enemyType != oldEnemyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamemodePackage.DROP_TABLE__ENEMY_TYPE, oldEnemyType, enemyType));
			}
		}
		return enemyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnemyType basicGetEnemyType() {
		return enemyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnemyType(EnemyType newEnemyType) {
		EnemyType oldEnemyType = enemyType;
		enemyType = newEnemyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.DROP_TABLE__ENEMY_TYPE, oldEnemyType, enemyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.DROP_TABLE__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamemodePackage.DROP_TABLE__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case GamemodePackage.DROP_TABLE__CHANCE:
				return getChance();
			case GamemodePackage.DROP_TABLE__ENTRIES:
				return getEntries();
			case GamemodePackage.DROP_TABLE__TOTAL_WEIGHT:
				return getTotalWeight();
			case GamemodePackage.DROP_TABLE__ENEMY_TYPE:
				if (resolve) return getEnemyType();
				return basicGetEnemyType();
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
			case GamemodePackage.DROP_TABLE__CHANCE:
				setChance((Float)newValue);
				return;
			case GamemodePackage.DROP_TABLE__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Drop>)newValue);
				return;
			case GamemodePackage.DROP_TABLE__ENEMY_TYPE:
				setEnemyType((EnemyType)newValue);
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
			case GamemodePackage.DROP_TABLE__CHANCE:
				setChance(CHANCE_EDEFAULT);
				return;
			case GamemodePackage.DROP_TABLE__ENTRIES:
				getEntries().clear();
				return;
			case GamemodePackage.DROP_TABLE__ENEMY_TYPE:
				setEnemyType((EnemyType)null);
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
			case GamemodePackage.DROP_TABLE__CHANCE:
				return chance != CHANCE_EDEFAULT;
			case GamemodePackage.DROP_TABLE__ENTRIES:
				return entries != null && !entries.isEmpty();
			case GamemodePackage.DROP_TABLE__TOTAL_WEIGHT:
				return getTotalWeight() != TOTAL_WEIGHT_EDEFAULT;
			case GamemodePackage.DROP_TABLE__ENEMY_TYPE:
				return enemyType != null;
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
		result.append(" (chance: ");
		result.append(chance);
		result.append(')');
		return result.toString();
	}

} //DropTableImpl
