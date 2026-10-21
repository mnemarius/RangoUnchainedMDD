package no.ntnu.tdt4250.rango.gamemode.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;

import no.ntnu.tdt4250.rango.gamemode.NamedElement;

/**
 * Names model elements in diagnostic messages the way designers refer to them: "EnemyType Cactus",
 * or "EnemySpawn in GameMode Survival" for elements without a name of their own.
 */
public class GamemodeLabels implements EValidator.SubstitutionLabelProvider {

	private final EValidator.SubstitutionLabelProvider fallback;

	public GamemodeLabels(EValidator.SubstitutionLabelProvider fallback) {
		this.fallback = fallback;
	}

	@Override
	public String getObjectLabel(EObject eObject) {
		if (eObject instanceof NamedElement named && named.getName() != null) {
			return eObject.eClass().getName() + " " + named.getName();
		}
		for (EObject container = eObject.eContainer(); container != null; container = container.eContainer()) {
			if (container instanceof NamedElement named && named.getName() != null) {
				return eObject.eClass().getName() + " in " + container.eClass().getName() + " " + named.getName();
			}
		}
		return eObject.eClass().getName();
	}

	@Override
	public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return fallback != null ? fallback.getFeatureLabel(eStructuralFeature) : eStructuralFeature.getName();
	}

	@Override
	public String getValueLabel(org.eclipse.emf.ecore.EDataType eDataType, Object value) {
		return fallback != null ? fallback.getValueLabel(eDataType, value) : String.valueOf(value);
	}
}
