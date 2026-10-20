/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * How the player character plays: their health, speed and tongue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCharacter <em>Character</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getHealth <em>Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getMaxHealth <em>Max Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getSpeed <em>Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getTongueTime <em>Tongue Time</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCooldown <em>Cooldown</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getGraceTime <em>Grace Time</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveHealth healthWithinMaximum positiveSpeed positiveTongueTime nonNegativeTimes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveHealth='health &gt; 0' healthWithinMaximum='maxHealth = 0 or health &lt;= maxHealth' positiveSpeed='speed &gt; 0' positiveTongueTime='tongueTime &gt; 0' nonNegativeTimes='cooldown &gt;= 0 and graceTime &gt;= 0'"
 * @generated
 */
public interface PlayerProfile extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Character</b></em>' attribute.
	 * The default value is <code>"Rango"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The animation set of the character, a folder in the game's assets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Character</em>' attribute.
	 * @see #setCharacter(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_Character()
	 * @model default="Rango"
	 * @generated
	 */
	String getCharacter();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCharacter <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' attribute.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(String value);

	/**
	 * Returns the value of the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hearts at the start of a round.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Health</em>' attribute.
	 * @see #setHealth(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_Health()
	 * @model required="true"
	 * @generated
	 */
	int getHealth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getHealth <em>Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health</em>' attribute.
	 * @see #getHealth()
	 * @generated
	 */
	void setHealth(int value);

	/**
	 * Returns the value of the '<em><b>Max Health</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The most hearts healing can bring the player to. 0 means no limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Health</em>' attribute.
	 * @see #setMaxHealth(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_MaxHealth()
	 * @model default="0"
	 * @generated
	 */
	int getMaxHealth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getMaxHealth <em>Max Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Health</em>' attribute.
	 * @see #getMaxHealth()
	 * @generated
	 */
	void setMaxHealth(int value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Walking speed, in metres per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_Speed()
	 * @model default="5.0"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Tongue Time</b></em>' attribute.
	 * The default value is <code>"0.8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long the tongue stays out, in seconds. The longer it stays out, the higher it reaches.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tongue Time</em>' attribute.
	 * @see #setTongueTime(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_TongueTime()
	 * @model default="0.8"
	 * @generated
	 */
	float getTongueTime();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getTongueTime <em>Tongue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tongue Time</em>' attribute.
	 * @see #getTongueTime()
	 * @generated
	 */
	void setTongueTime(float value);

	/**
	 * Returns the value of the '<em><b>Cooldown</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seconds the player has to wait between two shots.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cooldown</em>' attribute.
	 * @see #setCooldown(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_Cooldown()
	 * @model default="1.0"
	 * @generated
	 */
	float getCooldown();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCooldown <em>Cooldown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooldown</em>' attribute.
	 * @see #getCooldown()
	 * @generated
	 */
	void setCooldown(float value);

	/**
	 * Returns the value of the '<em><b>Grace Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seconds the player cannot be damaged again after taking damage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grace Time</em>' attribute.
	 * @see #setGraceTime(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPlayerProfile_GraceTime()
	 * @model default="0.0"
	 * @generated
	 */
	float getGraceTime();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getGraceTime <em>Grace Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Time</em>' attribute.
	 * @see #getGraceTime()
	 * @generated
	 */
	void setGraceTime(float value);

} // PlayerProfile
