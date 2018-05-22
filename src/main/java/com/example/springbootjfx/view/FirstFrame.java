/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootjfx.view;

import com.example.springbootjfx.service.FirstService;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Lazy
@Component
public class FirstFrame extends JFrame {
    
    @Autowired
    private FirstService firstService;
    
    public FirstFrame(){
        createGUI();
    }
    
    private void createGUI(){
        System.out.println(firstService == null?"Servicio inyectado en Frame es nulo":firstService.getMessage());
        this.setTitle("Frame uno");
        JButton b=new JButton("Boton 1");  
        b.setBounds(130,100,100, 40);  
        this.add(b);  
        this.setSize(300,400);  
        this.setLayout(null);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
