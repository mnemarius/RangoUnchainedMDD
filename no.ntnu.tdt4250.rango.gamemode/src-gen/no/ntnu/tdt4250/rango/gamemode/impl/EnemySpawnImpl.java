/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;
import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.Direction;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enemy Spawn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl#getSize <em>Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl#getCount <em>Count</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl#getPopsToClear <em>Pops To Clear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnemySpawnImpl extends PositionedImpl implements EnemySpawn {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EnemyType type;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.RIGHT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

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
	protected EnemySpawnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamemodePackage.Literals.ENEMY_SPAWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemyType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EnemyType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamemodePackage.ENEMY_SPAWN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnemyType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EnemyType newType) {
		EnemyType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_SPAWN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_SPAWN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_SPAWN__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamemodePackage.ENEMY_SPAWN__DIRECTION, oldDirection, direction));
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
			case GamemodePackage.ENEMY_SPAWN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case GamemodePackage.ENEMY_SPAWN__SIZE:
				return getSize();
			case GamemodePackage.ENEMY_SPAWN__COUNT:
				return getCount();
			case GamemodePackage.ENEMY_SPAWN__DIRECTION:
				return getDirection();
			case GamemodePackage.ENEMY_SPAWN__POPS_TO_CLEAR:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamemodePackage.ENEMY_SPAWN__TYPE:
				setType((EnemyType)newValue);
				return;
			case GamemodePackage.ENEMY_SPAWN__SIZE:
				setSize((Integer)newValue);
				return;
			case GamemodePackage.ENEMY_SPAWN__COUNT:
				setCount((Integer)newValue);
				return;
			case GamemodePackage.ENEMY_SPAWN__DIRECTION:
				setDirection((Direction)newValue);
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
			case GamemodePackage.ENEMY_SPAWN__TYPE:
				setType((EnemyType)null);
				return;
			case GamemodePackage.ENEMY_SPAWN__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_SPAWN__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GamemodePackage.ENEMY_SPAWN__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case GamemodePackage.ENEMY_SPAWN__TYPE:
				return type != null;
			case GamemodePackage.ENEMY_SPAWN__SIZE:
				return size != SIZE_EDEFAULT;
			case GamemodePackage.ENEMY_SPAWN__COUNT:
				return count != COUNT_EDEFAULT;
			case GamemodePackage.ENEMY_SPAWN__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case GamemodePackage.ENEMY_SPAWN__POPS_TO_CLEAR:
				return getPopsToClear() != POPS_TO_CLEAR_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", count: ");
		result.append(count);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //EnemySpawnImpl
