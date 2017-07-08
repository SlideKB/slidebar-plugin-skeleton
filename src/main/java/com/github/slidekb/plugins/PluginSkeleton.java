package com.github.slidekb.plugins;

import com.github.slidekb.api.SlideBarPlugin;
import com.github.slidekb.api.Slider;
import com.google.auto.service.AutoService;

/**
 * This is a skeleton dummy implementation for demonstration on how to implement your own standalone plugins
 * Do not remove the AutoService annotation or your plugin will not be found at runtime!
 * To start developing your own plugin, rename the class to whatever you want to and start implementing the methods.
 * 
 * @author PureSpider
 */
@AutoService(SlideBarPlugin.class)
public class PluginSkeleton implements SlideBarPlugin {

    @Override
    public int getPriority() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getLabelName() {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSlider(Slider slider, int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int numberOfSlidersRequired() {
		// TODO Auto-generated method stub
		return 0;
	}

}
