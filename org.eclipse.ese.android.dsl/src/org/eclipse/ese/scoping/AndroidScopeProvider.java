/*
 * generated by Xtext
 */
package org.eclipse.ese.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ese.android.model.android.Activity;
import org.eclipse.ese.android.model.android.Link;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;

import com.google.common.base.Predicate;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 */
public class AndroidScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_Link_activity(Link link, EReference ref) {
		return filteredScope(link, ref, link.eContainer());
	}

	public IScope scope_Link_activity(Activity activity, EReference ref) {
		return filteredScope(activity, ref, activity);
	}

	protected IScope filteredScope(EObject context, EReference ref,
			final EObject filteredElement) {
		if(filteredElement == null)
			return getDelegate().getScope(context, ref);
		final URI filteredElementURI = EcoreUtil.getURI(filteredElement);
		return new FilteringScope(getDelegate().getScope(context, ref), new Predicate<IEObjectDescription>() {
			public boolean apply(IEObjectDescription input) {
				return !filteredElementURI.equals(input.getEObjectURI());
			}
		});
	}
}
