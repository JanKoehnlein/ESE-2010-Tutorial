/*
 * generated by Xtext
 */
package org.eclipse.ese.ui.labeling;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.ese.android.model.android.Activity;
import org.eclipse.ese.android.model.android.Button;
import org.eclipse.ese.android.model.android.Link;
import org.eclipse.ese.android.model.android.Project;
import org.eclipse.ese.android.model.android.Spinner;
import org.eclipse.ese.android.model.android.Text;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class AndroidLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public AndroidLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String image(Text ele) {
		return "Text.gif";
	}
	
	String image(Button ele) {
		return "Button.gif";
	}
	
	String image(Link ele) {
		return "Link.gif";
	}
	
	String image(Spinner ele) {
		return "Spinner.gif";
	}

	String image(Activity ele) {
		return "Activity.gif";
	}
	
	String image(Project ele) {
		return "Project.gif";
	}

}