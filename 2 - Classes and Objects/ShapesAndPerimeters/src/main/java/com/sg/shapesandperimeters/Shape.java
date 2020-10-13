/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapesandperimeters;

/**
 *
 * @author Chris
 */
public abstract class Shape {
    
    protected String color;
    
    public abstract float area();
    public abstract float perimeter();

    
    public Shape(){
        this.color = null;
    }
    
    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    

}
