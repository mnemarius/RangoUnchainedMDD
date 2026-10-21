package no.ntnu.tdt4250.rango.gamemode.dsl.tests;

import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

/** The formatter turns a model written on one line into the layout of the examples. */
@ExtendWith(InjectionExtension.class)
@InjectWith(RangoModeInjectorProvider.class)
public class FormatterTest {

	@Inject
	private FormatterTestHelper formatter;

	@Test
	public void formatsBlocksPositionsAndLists() {
		formatter.assertFormatted(request -> {
			request.preferences(preferences -> preferences.put(FormatterPreferenceKeys.lineSeparator, "\n"));
			request.setToBeFormatted("edition Tiny enemy Weed { sprite \"Enemy/Plant.png\" points 5 on pop : split into 2 on contact : damage 1 , heal 1 }"
					+ " powerup Heart { sprite \"Powerup/Health.png\" gives : heal 1 } player P { health 3 } drops { Weed 10 % { Heart } }"
					+ " difficulty hard { enemy.speed*1.3 player.health  *  0.5 }"
					+ " mode M \"M\" { player P speed bonus up to 3 times over 30 s arena { background \"Desert\" } layout { 2 * Weed size 3 at ( 50 % , 70 % ) }"
					+ " drops { Weed 20 % { Heart weight 2 } } win when all enemies cleared lose when health depleted or time reaches 60 s }");
			request.setExpectation("""
					edition Tiny

					enemy Weed {
						sprite "Enemy/Plant.png"
						points 5
						on pop: split into 2
						on contact: damage 1, heal 1
					}

					powerup Heart {
						sprite "Powerup/Health.png"
						gives: heal 1
					}

					player P {
						health 3
					}

					drops {
						Weed 10% { Heart }
					}

					difficulty hard {
						enemy.speed * 1.3
						player.health * 0.5
					}

					mode M "M" {
						player P
						speed bonus up to 3 times over 30 s
						arena {
							background "Desert"
						}
						layout {
							2 * Weed size 3 at (50%, 70%)
						}
						drops {
							Weed 20% { Heart weight 2 }
						}
						win when all enemies cleared
						lose when health depleted or time reaches 60 s
					}""");
		});
	}

	@Test
	public void formatsLevels() {
		formatter.assertFormatted(request -> {
			request.preferences(preferences -> preferences.put(FormatterPreferenceKeys.lineSeparator, "\n"));
			request.setToBeFormatted("edition Tiny enemy Weed { sprite \"Enemy/Plant.png\" on pop : vanish on contact : damage 1 }"
					+ " player P { health 3 } mode M \"M\" { player P level \"First\" { arena { background \"Desert\" } layout { Weed size 1 at ( 50 % , 70 % ) } }"
					+ " level { arena { background \"Desert\" } layout { Weed size 2 at ( 50 % , 70 % ) } } win when all enemies cleared lose when health depleted }");
			request.setExpectation("""
					edition Tiny

					enemy Weed {
						sprite "Enemy/Plant.png"
						on pop: vanish
						on contact: damage 1
					}

					player P {
						health 3
					}

					mode M "M" {
						player P
						level "First" {
							arena {
								background "Desert"
							}
							layout {
								Weed size 1 at (50%, 70%)
							}
						}
						level {
							arena {
								background "Desert"
							}
							layout {
								Weed size 2 at (50%, 70%)
							}
						}
						win when all enemies cleared
						lose when health depleted
					}""");
		});
	}
}
