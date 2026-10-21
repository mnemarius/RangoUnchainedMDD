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
			request.setToBeFormatted("edition Tiny ball Weed { sprite \"Ball/Plant.png\" points 5 on pop : split into 2 on contact : damage 1 , heal 1 }"
					+ " player P { health 3 } mode M \"M\" { player P speed bonus up to 3 times over 30 s arena { background \"Desert\" } layout { 2 * Weed size 3 at ( 50 % , 70 % ) }"
					+ " win when all balls cleared lose when health depleted or time reaches 60 s }");
			request.setExpectation("""
					edition Tiny

					ball Weed {
						sprite "Ball/Plant.png"
						points 5
						on pop: split into 2
						on contact: damage 1, heal 1
					}

					player P {
						health 3
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
						win when all balls cleared
						lose when health depleted or time reaches 60 s
					}""");
		});
	}
}
