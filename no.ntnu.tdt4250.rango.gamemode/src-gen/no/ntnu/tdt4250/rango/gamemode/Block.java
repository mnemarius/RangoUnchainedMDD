/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A solid rectangle that balls bounce off and the player cannot walk through.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Block#getWidth <em>Width</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Block#getHeight <em>Height</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Block#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getBlock()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveSize'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveSize='width &gt; 0 and height &gt; 0'"
 * @generated
 */
public interface Block extends Obstacle {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getBlock_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Block#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getBlock_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Block#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the block is made of. Without one, it is neutral stone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getBlock_Material()
	 * @model
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Block#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

} // Block
