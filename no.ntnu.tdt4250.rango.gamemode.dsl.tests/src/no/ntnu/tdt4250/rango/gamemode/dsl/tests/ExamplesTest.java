package no.ntnu.tdt4250.rango.gamemode.dsl.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.google.inject.Inject;
import com.google.inject.Provider;

import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

/**
 * The three example editions: each is valid, they differ in what they configure, and together they
 * use every class, feature and enumeration literal of the metamodel.
 */
@ExtendWith(InjectionExtension.class)
@InjectWith(RangoModeInjectorProvider.class)
public class ExamplesTest {

	static final File EXAMPLES = new File("../no.ntnu.tdt4250.rango.gamemode.examples");
	static final List<String> EDITIONS = List.of("classic", "arcade", "hardcore");

	@Inject
	private Provider<ResourceSet> resourceSets;

	@Inject
	private ValidationTestHelper validation;

	Edition load(String name) {
		Resource resource = resourceSets.get().getResource(
				URI.createFileURI(new File(EXAMPLES, name + ".rango").getAbsolutePath()), true);
		assertTrue(resource.getErrors().isEmpty(), () -> name + ": " + resource.getErrors());
		return (Edition) resource.getContents().get(0);
	}

	@ParameterizedTest
	@ValueSource(strings = { "classic", "arcade", "hardcore" })
	public void exampleIsValid(String name) {
		validation.assertNoErrors(load(name));
	}

	@Test
	public void examplesDiffer() {
		assertEquals(2, load("classic").getModes().size());
		assertEquals(5, load("classic").getModes().get(0).getLevels().size());
		assertEquals(5, load("arcade").getModes().size());
		assertEquals(2, load("arcade").getPlayers().size());
		assertEquals(1, load("hardcore").getModes().size());
		assertTrue(load("hardcore").getDifficulties().isEmpty());
	}

	@Test
	public void examplesUseTheWholeMetamodel() {
		Set<EClass> classes = new HashSet<>();
		Set<EStructuralFeature> features = new HashSet<>();
		Set<EEnumLiteral> literals = new HashSet<>();
		for (String name : EDITIONS) {
			Edition edition = load(name);
			record(edition, classes, features, literals);
			edition.eAllContents().forEachRemaining(object -> record(object, classes, features, literals));
		}
		for (var classifier : GamemodePackage.eINSTANCE.getEClassifiers()) {
			if (classifier instanceof EClass eClass && !eClass.isAbstract()) {
				assertTrue(classes.contains(eClass), "no example has a " + eClass.getName());
			}
			if (classifier instanceof EClass eClass) {
				for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
					assertTrue(feature.isDerived() || features.contains(feature) || !feature.isChangeable(),
							"no example sets " + eClass.getName() + "." + feature.getName());
				}
			}
			if (classifier instanceof org.eclipse.emf.ecore.EEnum eEnum) {
				for (EEnumLiteral literal : eEnum.getELiterals()) {
					assertTrue(literals.contains(literal), "no example uses " + eEnum.getName() + "." + literal.getName());
				}
			}
		}
	}

	/**
	 * Records the class of an object and the features written for it. A feature counts as used when the
	 * model text assigns it, even to its default value (EMF would report such a feature as not set).
	 */
	private static void record(EObject object, Set<EClass> classes, Set<EStructuralFeature> features,
			Set<EEnumLiteral> literals) {
		classes.add(object.eClass());
		for (EStructuralFeature feature : object.eClass().getEAllStructuralFeatures()) {
			boolean written = !NodeModelUtils.findNodesForFeature(object, feature).isEmpty();
			if (!feature.isDerived() && (written || object.eIsSet(feature))) {
				features.add(feature);
				Object value = object.eGet(feature);
				if (value instanceof org.eclipse.emf.common.util.Enumerator enumerator
						&& feature.getEType() instanceof org.eclipse.emf.ecore.EEnum eEnum) {
					literals.add(eEnum.getEEnumLiteral(enumerator.getValue()));
				}
			}
		}
	}
}
