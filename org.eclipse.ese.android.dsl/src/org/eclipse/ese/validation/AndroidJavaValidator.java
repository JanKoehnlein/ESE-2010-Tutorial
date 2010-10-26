package org.eclipse.ese.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ese.android.model.android.Activity;
import org.eclipse.ese.android.model.android.AndroidPackage;
import org.eclipse.ese.android.model.android.Link;
import org.eclipse.ese.android.model.android.Application;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class AndroidJavaValidator extends AbstractAndroidJavaValidator {

	@Inject
	private IResourceDescriptions index;

	public static final String REMOVE_ELEMENT = "org.eclipse.ese.android.validation.RemoveELEMENT";

	@Check
	public void checkActivityIsContainedOrReference(Activity activity) {
		if (activity.eContainer() instanceof Application) {
			Application application = (Application) activity.eContainer();
			if (application.getActivities().indexOf(activity) == 0)
				return;
		}
		URI activityURI = EcoreUtil.getURI(activity);
		for (IResourceDescription resourceDescription : index
				.getAllResourceDescriptions()) {
			for (IReferenceDescription referenceDescription : resourceDescription
					.getReferenceDescriptions()) {
				if (activityURI.equals(referenceDescription
						.getTargetEObjectUri()))
					return;
			}
		}
		warning("Activity is not used anywhere", activity,
				AndroidPackage.ACTIVITY__NAME, REMOVE_ELEMENT, "activity");
	}

	@Check
	public void checkLinkLinksToContainer(Link link) {
		if (link.eContainer().equals(link.getActivity())) 
			warning("Activity links to itself", link, AndroidPackage.LINK__NAME, REMOVE_ELEMENT, "link");
	}
	
	public static final String CAPITALIZE = "org.eclipse.ese.android.validation.Captalize";
	
	@Check
	public void checkApplicationNameWithCapital(Application project) {
		if (!Character.isUpperCase(project.getName().charAt(0))) {
			warning("Name should start with a capital", project,
					AndroidPackage.APPLICATION__NAME, CAPITALIZE);
		}
	}
}
