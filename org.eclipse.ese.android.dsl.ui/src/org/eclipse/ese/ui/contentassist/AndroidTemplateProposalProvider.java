package org.eclipse.ese.ui.contentassist;

import org.eclipse.ese.ui.AndroidActivator;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.google.inject.Inject;

public class AndroidTemplateProposalProvider extends
		DefaultTemplateProposalProvider {

	@Inject
	public AndroidTemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
	}

	@Override
	public Image getImage(Template template) {
		String contextTypeName = template.getContextTypeId().replace(
				"org.eclipse.ese.Android.", "");
		Image image = AndroidActivator.getImage(contextTypeName + ".gif");
		if (image == null)
			image = super.getImage(template);

		return image;
	}

}
