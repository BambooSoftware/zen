/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.abstractclasses;

import com.java.data.StringConstants;

/**
 *
 * @author michael
 */
public abstract class CommonBeanData {
    
    protected StringConstants stringConstants;

    public StringConstants getStringConstants() {
        return stringConstants;
    }

    public void setStringConstants(StringConstants stringConstants) {
        this.stringConstants = stringConstants;
    }
    
    public String getRatesHeaderText() {
        return stringConstants.getRatesHeaderText();
    }

    public String getAboutUsHeaderText() {
        return stringConstants.getAboutUsHeaderText();
    }

    public String getSkillSetHeaderText() {
        return stringConstants.getSkillSetHeaderText();
    }

    public String getTemplatePrevWorkHeaderText() {
        return stringConstants.getTemplatePrevWorkHeaderText();
    }

    public String getHomeHeaderText() {
        return stringConstants.getHomeHeaderText();
    }
    
}
