package com.github.slidekb.plugins;

import javax.swing.JFrame;

import com.github.slidekb.api.AlphaKeyManager;
import com.github.slidekb.api.HotKeyManager;
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
    public String[] getProcessNames() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean usesProcessNames() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String currentlyUsedSlider() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void attachToProcess(String processName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void detachFromProcess(String processName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void run(String process) {
        // TODO Auto-generated method stub

    }

    @Override
    public JFrame getConfigWindow() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void runFirst(String process) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getLabelName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JFrame getProcessWindow() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void reloadPropFile() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAlphaKeyManager(AlphaKeyManager alphaKeyManager) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setHotKeyManager(HotKeyManager hotKeyManager) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setSlider(Slider slider) {
        // TODO Auto-generated method stub

    }

}
