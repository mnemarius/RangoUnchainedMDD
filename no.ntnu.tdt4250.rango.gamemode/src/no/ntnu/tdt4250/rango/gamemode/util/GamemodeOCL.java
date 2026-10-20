package no.ntnu.tdt4250.rango.gamemode.util;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;

import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;

/**
 * Makes the OCL constraints of the metamodel work outside a running Eclipse.
 * <p>
 * The simple invariants of the metamodel are written in OCL, in annotations of the Ecore model, and
 * evaluated by the OCL delegates of Eclipse OCL. Inside Eclipse the delegates are registered by the
 * {@code org.eclipse.ocl.ecore} plug-in; standalone code (the command-line generator, plain JUnit tests)
 * must call {@link #initialize()} before validating.
 */
public final class GamemodeOCL {

	/** The delegate URI used by the annotations of {@code gamemode.ecore}. */
	public static final String DELEGATE_URI = "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG";

	private GamemodeOCL() {
	}

	/** Registers the OCL delegates (unless already registered) and the metamodel. Safe to call repeatedly. */
	public static synchronized void initialize() {
		if (!EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.containsKey(DELEGATE_URI)) {
			EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(DELEGATE_URI,
					new OCLInvocationDelegateFactory.Global());
		}
		if (!EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.containsKey(DELEGATE_URI)) {
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(DELEGATE_URI,
					new OCLSettingDelegateFactory.Global());
		}
		if (!EValidator.ValidationDelegate.Registry.INSTANCE.containsKey(DELEGATE_URI)) {
			EValidator.ValidationDelegate.Registry.INSTANCE.put(DELEGATE_URI, new OCLValidationDelegateFactory.Global());
		}
		GamemodePackage.eINSTANCE.eClass();
	}
}
