package no.ntnu.tdt4250.rango.gamemode.dsl.ui.hover;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.util.GamemodeDerivations;

/**
 * Hovers that show what the model implies but does not say: the derived features of the metamodel,
 * such as the pops needed to clear a mode, the points it is worth, and how likely each drop is.
 */
public class RangoModeHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected boolean hasHover(EObject object) {
		return object.eClass().getEPackage() == GamemodePackage.eINSTANCE || super.hasHover(object);
	}

	@Override
	protected String getDocumentation(EObject object) {
		String comment = super.getDocumentation(object);
		List<String> facts = facts(object);
		String details = facts.isEmpty() ? null : String.join("<br/>", facts);
		if (comment == null) {
			return details;
		}
		return details == null ? comment : comment + "<p>" + details + "</p>";
	}

	private List<String> facts(EObject object) {
		List<String> facts = new ArrayList<>();
		if (object instanceof GameMode mode) {
			facts.add("Enemy types (spawned, or produced by popping): " + names(mode.getEnemyTypes()));
			if (mode.getPopsToClear() == GamemodeDerivations.UNBOUNDED) {
				facts.add("The waves loop: the enemies never run out.");
			} else {
				facts.add("Pops to clear everything: " + mode.getPopsToClear());
				facts.add("Points for clearing everything: " + mode.getMaxScore()
						+ (mode.getSpeedBonus() != null
								? " (up to " + factor(mode.getSpeedBonus().getMaxFactor()) + " times as many with the speed bonus)"
								: ""));
			}
			facts.add("Power-ups that can drop: " + (mode.getPowerUps().isEmpty() ? "none" : names(mode.getPowerUps())));
			if (!mode.getDrops().isEmpty() && mode.eContainer() instanceof Edition edition && !edition.getDrops().isEmpty()) {
				facts.add("Its drop tables replace those of the edition.");
			}
			if (mode.getWinConditions().isEmpty()) {
				facts.add("Endless: a round only ends when it is lost.");
			}
		} else if (object instanceof EnemyType type) {
			facts.add("Pops to get rid of a large, medium, small enemy: " + GamemodeDerivations.popsFor(type, 3) + ", "
					+ GamemodeDerivations.popsFor(type, 2) + ", " + GamemodeDerivations.popsFor(type, 1));
			facts.add("Points for a large enemy and all it breaks into: " + GamemodeDerivations.pointsFor(type, 3));
			if (!type.getProducedTypes().isEmpty()) {
				facts.add("Breaks into: " + names(type.getProducedTypes()));
			}
		} else if (object instanceof EnemySpawn spawn) {
			facts.add("Pops to clear: " + spawn.getPopsToClear());
		} else if (object instanceof Wave wave) {
			facts.add("Wave " + wave.getNumber() + ", pops to clear: " + wave.getPopsToClear());
		} else if (object instanceof SpawnStrategy spawning && spawning.getPopsToClear() != GamemodeDerivations.UNBOUNDED) {
			facts.add("Pops to clear: " + spawning.getPopsToClear());
		} else if (object instanceof DropTable table) {
			String enemy = table.getEnemyType() == null ? "this enemy" : table.getEnemyType().getName();
			facts.add(factor(table.getChance()) + "% of " + enemy + " pops drop a power-up");
			for (Drop drop : table.getEntries()) {
				if (drop.getPowerUp() != null) {
					facts.add(drop.getPowerUp().getName() + ": " + percent(drop.getShare()) + "% of drops, "
							+ percent(drop.getProbability()) + "% of pops");
				}
			}
		} else if (object instanceof Drop drop) {
			facts.add(percent(drop.getShare()) + "% of the drops of this table, " + percent(drop.getProbability())
					+ "% of all pops of its enemy type");
		} else if (object instanceof EndCondition condition) {
			facts.add(condition.isWin() ? "Wins the round." : "Loses the round.");
		} else if (object instanceof Teleporter teleporter && teleporter.getTarget() != null) {
			facts.add("Leads to " + teleporter.getTarget().getName());
		} else if (object instanceof PlayerProfile player && player.getCooldown() > 0) {
			facts.add("At most " + Math.round(10 / player.getCooldown()) / 10.0 + " shots per second");
		}
		return facts;
	}

	/** A percentage with at most one decimal. */
	private static String percent(float value) {
		return factor(Math.round(value * 10) / 10f);
	}

	private static String factor(float factor) {
		return factor == Math.rint(factor) ? String.valueOf((int) factor) : String.valueOf(factor);
	}

	private static String names(List<? extends NamedElement> elements) {
		return elements.stream().map(NamedElement::getName).collect(Collectors.joining(", "));
	}
}
