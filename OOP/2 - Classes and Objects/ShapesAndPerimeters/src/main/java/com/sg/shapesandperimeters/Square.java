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
public class Square extends Shape{
    
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    
    public Square(){
        super();
        this.side = 0;
    }
    
    public Square(String color, float side){
        super(color);
        this.side = side;
    }
    
    @Override
    public float area(){
        return (this.side * this.side);
    }
    
    @Override
    public float perimeter(){
        return (4.0f * this.side);
    }
    
}
