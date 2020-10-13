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
public class Rectangle extends Shape{
    
    private float width;
    private float height;
    
    public Rectangle(){
        super();
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(String color, float width, float height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    @Override
    public float area(){
        return (this.width * this.height);
    }
    
    @Override
    public float perimeter(){
        return (this.width + this.height) * 2;
    }
    
    
    
}
