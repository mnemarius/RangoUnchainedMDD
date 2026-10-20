package no.ntnu.tdt4250.rango.gamemode.dsl.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.dsl.validation.RangoModeValidator;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeConstraints;

/**
 * Problems in models written in the DSL: the constraints of the metamodel reach the editor (OCL and
 * Java, with their issue codes for quick fixes), and so do the warnings of the DSL. Scoping keeps
 * teleporters within their arena.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(RangoModeInjectorProvider.class)
public class ValidationTest {

	@Inject
	private ParseHelper<Edition> parser;

	@Inject
	private ValidationTestHelper validation;

	/** A valid edition with one mode, into which a test can put its own mode body and extra elements. */
	private Edition edition(String extra, String modeBody) throws Exception {
		Edition edition = parser.parse("""
				edition Test
				ball Tumbleweed {
					sprite "Ball/Tumbleweed.png"
					on pop: split into 2
					on contact: damage 1
				}
				ball Bomb {
					sprite "Ball/Bomb.png"
					on pop: burst into 4 Tumbleweed
					on contact: damage 2
				}
				player Rango {
					health 3
				}
				%s
				mode Test "Test" {
					player Rango
					%s
				}
				""".formatted(extra, modeBody));
		assertNotNull(edition);
		assertTrue(edition.eResource().getErrors().isEmpty(), edition.eResource().getErrors().toString());
		return edition;
	}

	private static final String VALID_BODY = """
			balls Tumbleweed, Bomb
			arena {
				background "Desert"
			}
			layout {
				Bomb size 3 at (50%, 70%)
			}
			win when all balls cleared
			lose when health depleted
			""";

	@Test
	public void validEditionHasNoIssues() throws Exception {
		validation.assertNoIssues(edition("", VALID_BODY));
	}

	@Test
	public void oclConstraintReachesTheEditor() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("(50%, 70%)", "(50%, 140%)"));
		validation.assertError(edition, GamemodePackage.Literals.BALL_SPAWN, GamemodeConstraints.SOURCE + ".0", "insideArena");
	}

	@Test
	public void fragmentTypesMustBeInTheMode() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("balls Tumbleweed, Bomb", "balls Bomb"));
		validation.assertError(edition, GamemodePackage.Literals.GAME_MODE,
				GamemodeConstraints.ISSUE_FRAGMENT_TYPE_UNAVAILABLE, "produces Tumbleweed");
	}

	@Test
	public void spawnedTypesMustBeInTheMode() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("balls Tumbleweed, Bomb", "balls Tumbleweed"));
		validation.assertError(edition, GamemodePackage.Literals.BALL_SPAWN,
				GamemodeConstraints.ISSUE_SPAWN_TYPE_UNAVAILABLE, "Bomb is not one of the ball types");
	}

	@Test
	public void modeMustEnd() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("win when all balls cleared", ""));
		validation.assertError(edition, GamemodePackage.Literals.GAME_MODE, GamemodeConstraints.ISSUE_NEVER_ENDS);
	}

	@Test
	public void conditionsHaveRoles() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("win when all balls cleared", "win when health depleted"));
		validation.assertError(edition, GamemodePackage.Literals.HEALTH_DEPLETED, GamemodeConstraints.ISSUE_WRONG_ROLE);
	}

	@Test
	public void unusedBuildingBlocksAreReported() throws Exception {
		Edition edition = edition("""
				powerup Shield {
					sprite "Powerup/Shield.png"
					gives: shield for 8 s
				}
				""", VALID_BODY);
		validation.assertWarning(edition, GamemodePackage.Literals.POWER_UP, RangoModeValidator.UNUSED, "Shield");
	}

	@Test
	public void spritesMustBeImages() throws Exception {
		Edition edition = parser.parse("""
				edition Test
				ball Tumbleweed {
					sprite "Ball/Tumbleweed"
					on pop: vanish
					on contact: damage 1
				}
				""");
		validation.assertWarning(edition, GamemodePackage.Literals.BALL_TYPE, RangoModeValidator.NOT_AN_IMAGE);
	}

	@Test
	public void teleportersOnlyReachTheirOwnArena() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("background \"Desert\"", """
				background "Desert"
				teleporter A at (10%, 5%) to B
				teleporter B at (90%, 5%) to A
				teleporter Lonely at (50%, 5%) to Lonely
				"""));
		var teleporters = edition.getModes().get(0).getArena().getObstacles();
		assertEquals("B", ((Teleporter) teleporters.get(0)).getTarget().getName());
		assertEquals("A", ((Teleporter) teleporters.get(1)).getTarget().getName());
		// a teleporter cannot lead to itself: the reference does not resolve
		Teleporter lonely = (Teleporter) teleporters.get(2);
		assertTrue(lonely.getTarget() == null || lonely.getTarget().eIsProxy());
		validation.assertError(edition, GamemodePackage.Literals.TELEPORTER,
				org.eclipse.xtext.diagnostics.Diagnostic.LINKING_DIAGNOSTIC, "Lonely");
	}

	@Test
	public void syntaxErrorsAreReported() throws Exception {
		Edition edition = parser.parse("edition Broken ball { }");
		assertTrue(!edition.eResource().getErrors().isEmpty());
		assertNull(edition.getBallTypes().isEmpty() ? null : edition.getBallTypes().get(0).getSprite());
	}
}
