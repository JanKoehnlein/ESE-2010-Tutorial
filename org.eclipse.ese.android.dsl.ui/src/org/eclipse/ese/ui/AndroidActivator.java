package org.eclipse.ese.ui;

import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.google.common.collect.Maps;

public class AndroidActivator extends
		org.eclipse.ese.ui.internal.AndroidActivator {
	
	public static final Map<String, Image> imageMap = Maps.newHashMap();
	
	public static final String BUNDLE_ID = "org.eclipse.ese.android.dsl.ui";
	
	public static Image getImage(String name){
		Image image = imageMap.get(name);
		if(image == null){
			ImageDescriptor imageDescriptor = imageDescriptorFromPlugin(BUNDLE_ID, "icons/" + name);
			if(imageDescriptor != null) {
				image = imageDescriptor.createImage();
				imageMap.put(name, image);
			}
		}
		return image;
	}
}
