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
public class Circle extends Shape{
    
    private final static float PI = 3.14f;
    private float radius;
    
    public Circle(){
        super();
        this.radius = 0;
    }
    
    public Circle(String color, float radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    @Override
    public float area(){
        return (float)(PI * Math.pow(radius, 2));
    }
    
    @Override
    public float perimeter(){
        return 2 * PI * radius;
    }
    
    
    
    
    
}
