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

import no.ntnu.tdt4250.rango.gamemode.DifficultyTier;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Modifier;
import no.ntnu.tdt4250.rango.gamemode.ModifierTarget;
import no.ntnu.tdt4250.rango.gamemode.SpeedBonus;
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
				enemy Tumbleweed {
					sprite "Enemy/Tumbleweed.png"
					on pop: split into 2
					on contact: damage 1
				}
				enemy Bomb {
					sprite "Enemy/Bomb.png"
					on pop: split into 4 Tumbleweed
					on contact: damage 2
				}
				powerup Health {
					sprite "Powerup/Health.png"
					gives: heal 1
				}
				drops {
					Tumbleweed 5%% { Health }
					Bomb 20%% { Health }
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
			arena {
				background "Desert"
			}
			layout {
				Bomb size 3 at (50%, 70%)
			}
			win when all enemies cleared
			lose when health depleted
			""";

	@Test
	public void validEditionHasNoIssues() throws Exception {
		validation.assertNoIssues(edition("", VALID_BODY));
	}

	@Test
	public void oclConstraintReachesTheEditor() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("(50%, 70%)", "(50%, 140%)"));
		validation.assertError(edition, GamemodePackage.Literals.ENEMY_SPAWN, GamemodeConstraints.SOURCE + ".0", "insideArena");
	}

	@Test
	public void speedBonusPartsAreOptional() throws Exception {
		assertNull(edition("", VALID_BODY).getModes().get(0).getSpeedBonus());
		SpeedBonus bonus = speedBonus("speed bonus");
		assertEquals(2f, bonus.getMaxFactor());
		assertEquals(60f, bonus.getDuration());
		bonus = speedBonus("speed bonus over 30 s");
		assertEquals(2f, bonus.getMaxFactor());
		assertEquals(30f, bonus.getDuration());
		bonus = speedBonus("speed bonus up to 1.5 times");
		assertEquals(1.5f, bonus.getMaxFactor());
		assertEquals(60f, bonus.getDuration());
	}

	private SpeedBonus speedBonus(String line) throws Exception {
		Edition edition = edition("", line + "\n" + VALID_BODY);
		validation.assertNoIssues(edition);
		return edition.getModes().get(0).getSpeedBonus();
	}

	@Test
	public void speedBonusMustRaiseTheScore() throws Exception {
		Edition edition = edition("", "speed bonus up to 1 times\n" + VALID_BODY);
		validation.assertError(edition, GamemodePackage.Literals.SPEED_BONUS, GamemodeConstraints.SOURCE + ".0",
				"bonusAboveOne");
	}

	@Test
	public void modeMustEnd() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("win when all enemies cleared", ""));
		validation.assertError(edition, GamemodePackage.Literals.GAME_MODE, GamemodeConstraints.ISSUE_NEVER_ENDS);
	}

	@Test
	public void conditionsHaveRoles() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("win when all enemies cleared", "win when health depleted"));
		validation.assertError(edition, GamemodePackage.Literals.HEALTH_DEPLETED, GamemodeConstraints.ISSUE_WRONG_ROLE);
	}

	@Test
	public void everyEnemyOfAModeNeedsADropTable() throws Exception {
		// the mode's own drop tables replace the edition's, and forget the Tumbleweeds the Bomb bursts into
		Edition edition = edition("", VALID_BODY.replace("win when", "drops { Bomb 30% { Health } } win when"));
		validation.assertError(edition, GamemodePackage.Literals.GAME_MODE, GamemodeConstraints.ISSUE_NO_DROP_TABLE,
				"Tumbleweed");
	}

	@Test
	public void dropTablesOfAModeReplaceThoseOfTheEdition() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("win when",
				"drops { Bomb 30% { Health } Tumbleweed 1% { Health } } win when"));
		validation.assertNoErrors(edition);
		assertEquals(30f, edition.getModes().get(0).getEffectiveDrops().get(0).getChance());
		// the only mode has tables of its own, so the edition's apply nowhere
		validation.assertWarning(edition, GamemodePackage.Literals.DROP_TABLE, RangoModeValidator.USELESS_DROP_TABLE,
				"never appears in a mode that uses the edition's drop tables");
	}

	@Test
	public void dropTablesForEnemiesOutsideTheModeHaveNoEffect() throws Exception {
		Edition edition = edition("""
				enemy Cactus {
					sprite "Enemy/Cactus.png"
					on pop: vanish
					on contact: damage 1
				}
				""", VALID_BODY.replace("win when",
				"drops { Bomb 30% { Health } Tumbleweed 1% { Health } Cactus 50% { Health } } win when"));
		validation.assertWarning(edition, GamemodePackage.Literals.DROP_TABLE, RangoModeValidator.USELESS_DROP_TABLE,
				"Cactus never appears in mode Test");
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
				enemy Tumbleweed {
					sprite "Enemy/Tumbleweed"
					on pop: vanish
					on contact: damage 1
				}
				""");
		validation.assertWarning(edition, GamemodePackage.Literals.ENEMY_TYPE, RangoModeValidator.NOT_AN_IMAGE);
	}

	@Test
	public void teleportersOnlyReachTheirOwnArena() throws Exception {
		Edition edition = edition("", VALID_BODY.replace("background \"Desert\"", """
				background "Desert"
				teleporter A at (10%, 5%) to B
				teleporter B at (90%, 5%) to A
				teleporter Lonely at (50%, 5%) to Lonely
				"""));
		var teleporters = edition.getModes().get(0).getLevels().get(0).getArena().getObstacles();
		assertEquals("B", ((Teleporter) teleporters.get(0)).getTarget().getName());
		assertEquals("A", ((Teleporter) teleporters.get(1)).getTarget().getName());
		// a teleporter cannot lead to itself: the reference does not resolve
		Teleporter lonely = (Teleporter) teleporters.get(2);
		assertTrue(lonely.getTarget() == null || lonely.getTarget().eIsProxy());
		validation.assertError(edition, GamemodePackage.Literals.TELEPORTER,
				org.eclipse.xtext.diagnostics.Diagnostic.LINKING_DIAGNOSTIC, "Lonely");
	}

	@Test
	public void levelsAreCheckedOneByOne() throws Exception {
		// the first level can be cleared, but the second loops, so it is never cleared
		Edition edition = edition("", VALID_BODY.replace("""
				arena {
					background "Desert"
				}
				layout {
					Bomb size 3 at (50%, 70%)
				}
				""", """
				level "One" {
					arena {
						background "Desert"
					}
					layout {
						Bomb size 3 at (50%, 70%)
					}
				}
				level {
					arena {
						background "Desert"
					}
					waves looping {
						wave { Bomb size 1 at (50%, 70%) }
					}
				}
				"""));
		assertEquals(2, edition.getModes().get(0).getLevels().size());
		assertEquals("One", edition.getModes().get(0).getLevels().get(0).getTitle());
		validation.assertError(edition, GamemodePackage.Literals.CLEARED, GamemodeConstraints.SOURCE + "." + GamemodeConstraints.CONDITION_UNREACHABLE,
				"In level 2, the waves loop");
	}

	@Test
	public void difficultiesAreParsed() throws Exception {
		Edition edition = edition("""
				difficulty easy {
					enemy.speed * 0.8
					drop.chance * 1.5
				}
				difficulty medium { }
				difficulty hard {
					enemy.speed * 1.3
					player.health * 0.5
				}
				""", VALID_BODY);
		validation.assertNoIssues(edition);
		var difficulties = edition.getDifficulties();
		assertEquals(3, difficulties.size());
		assertEquals(DifficultyTier.EASY, difficulties.get(0).getTier());
		assertEquals(DifficultyTier.MEDIUM, difficulties.get(1).getTier());
		assertTrue(difficulties.get(1).getModifiers().isEmpty());
		Modifier health = difficulties.get(2).getModifiers().get(1);
		assertEquals(ModifierTarget.PLAYER_HEALTH, health.getTarget());
		assertEquals(0.5f, health.getFactor());
	}

	@Test
	public void eachTierIsDefinedOnce() throws Exception {
		Edition edition = edition("difficulty hard { enemy.speed * 1.3 }\ndifficulty hard { enemy.speed * 1.5 }", VALID_BODY);
		validation.assertError(edition, GamemodePackage.Literals.DIFFICULTY,
				GamemodeConstraints.SOURCE + "." + GamemodeConstraints.DUPLICATE_DIFFICULTY, "already defines the hard difficulty");
	}

	@Test
	public void eachValueIsModifiedOncePerLevel() throws Exception {
		Edition edition = edition("difficulty hard { enemy.speed * 1.3 enemy.speed * 1.5 }", VALID_BODY);
		validation.assertError(edition, GamemodePackage.Literals.DIFFICULTY, GamemodeConstraints.SOURCE + ".0", "distinctTargets");
	}

	@Test
	public void factorsArePositive() throws Exception {
		Edition edition = edition("difficulty hard { enemy.speed * 0 }", VALID_BODY);
		validation.assertError(edition, GamemodePackage.Literals.MODIFIER, GamemodeConstraints.SOURCE + ".0", "positiveFactor");
	}

	@Test
	public void harderTiersDoNotMakeTheGameEasier() throws Exception {
		Edition edition = edition("""
				difficulty medium { drop.chance * 0.8 }
				difficulty hard { enemy.speed * 0.9 drop.chance * 0.5 enemy.points * 0.5 }
				""", VALID_BODY);
		validation.assertWarning(edition, GamemodePackage.Literals.MODIFIER, RangoModeValidator.DIFFICULTY_ORDER,
				"The hard difficulty makes enemy.speed easier than the medium one (0.9 against 1)");
		// fewer drops and fewer points on hard are fine
		assertEquals(1, validation.validate(edition).stream()
				.filter(issue -> RangoModeValidator.DIFFICULTY_ORDER.equals(issue.getCode())).count());
	}

	@Test
	public void tiersWithoutModifiersAreComparedAsUnchanged() throws Exception {
		Edition edition = edition("difficulty easy { player.health * 0.5 }\ndifficulty medium { }", VALID_BODY);
		validation.assertWarning(edition, GamemodePackage.Literals.DIFFICULTY, RangoModeValidator.DIFFICULTY_ORDER,
				"The medium difficulty makes player.health easier than the easy one (1 against 0.5)");
	}

	@Test
	public void syntaxErrorsAreReported() throws Exception {
		Edition edition = parser.parse("edition Broken enemy { }");
		assertTrue(!edition.eResource().getErrors().isEmpty());
		assertNull(edition.getEnemyTypes().isEmpty() ? null : edition.getEnemyTypes().get(0).getSprite());
	}
}
