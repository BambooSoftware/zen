/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.beans;

import com.java.abstractclasses.CommonBeanData;
import com.java.data.StringConstants;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Singleton;

/**
 *
 * @author michael
 */
@ManagedBean
@Singleton
public class TechnologiesBean extends CommonBeanData {

    /**
     * Creates a new instance of TechnologiesBean
     */
    public TechnologiesBean() {
        super.stringConstants = new StringConstants();
    }
    
    public List<String> getSkillsList() {
        return super.stringConstants.getSkillsList();
    }
    
}
