/**
 * 
 */
package org.eclipse.ese.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author Dennis Huebner
 *
 */
public class AndroidHighlightingConfiguration extends
		DefaultHighlightingConfiguration {
	public final static String ACTIVITY_REFERENCE = "ActivityReference"; 

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ACTIVITY_REFERENCE, "Activity References", activityReferenceTextStyle());
	}
	
	public TextStyle activityReferenceTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(75, 75, 75));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
