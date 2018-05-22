/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjfx.controller;

import com.example.springbootjfx.service.FirstService;
import com.example.springbootjfx.view.FirstFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

/**
 *
 * @author HP
 */
@Lazy
@Controller
public class FirstController {
    
    @Autowired
    private FirstService firstService;
    @Value("${syst.prop1}")
    private String prop1;
    @Value("${boss.str1}")
    private String str1;
    @Value("${boss.prop2}")
    private String prop2;
    
    private FirstFrame firstFrame;
    
    @Autowired
    public FirstController(FirstFrame firstFrame) {
        this.firstFrame = firstFrame;
    }
    
    public void prepareAndOpenFrame() {
        System.out.println(firstService == null?"Servicio inyectado en Controller es nulo":firstService.getMessage());
        System.out.println("Prop 1: "+prop1+" Boss: "+str1+" Prop 2: "+prop2);
        getFirstFrame().setVisible(true);
    }

    /**
     * @return the firstFrame
     */
    public FirstFrame getFirstFrame() {
        return firstFrame;
    }

    /**
     * @param firstFrame the firstFrame to set
     */
    public void setFirstFrame(FirstFrame firstFrame) {
        this.firstFrame = firstFrame;
    }
}
