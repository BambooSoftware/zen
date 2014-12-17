/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.beans;

import com.java.abstractclasses.CommonBeanData;
import com.java.data.StringConstants;
import javax.faces.bean.ManagedBean;
import javax.inject.Singleton;

/**
 *
 * @author michael
 */
@ManagedBean
@Singleton
public class HomeBean extends CommonBeanData {
    
    /**
     * Creates a new instance of HomeBean
     */
    public HomeBean() {
        super.stringConstants = new StringConstants();
    }
            
    public String getHomePageLeftColumn() {
        return stringConstants.getHomePageLeftColumn();
    }
    
    public String getHomePageRightColumn() {
        return stringConstants.getHomePageRightColumn();
    }
    
}
