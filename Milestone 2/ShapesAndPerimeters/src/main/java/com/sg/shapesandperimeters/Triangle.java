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
public class Triangle extends Shape{
    
    private float height;
    private float a_side;
    private float b_side;
    private float c_side;
    
    public Triangle(){
        super();
        this.height = 0;
        this.a_side = 0;
        this.b_side = 0;
        this.c_side = 0;
    }
    
    public Triangle(String color, float a, float b, float c, float height){
        super(color);
        this.a_side = a;
        this.b_side = b;
        this.c_side = c;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getA_side() {
        return a_side;
    }

    public void setA_side(float a_side) {
        this.a_side = a_side;
    }

    public float getB_side() {
        return b_side;
    }

    public void setB_side(float b_side) {
        this.b_side = b_side;
    }

    public float getC_side() {
        return c_side;
    }

    public void setC_side(float c_side) {
        this.c_side = c_side;
    }
    
    @Override
    public float area(){
        float p = perimeter();
        p /= 2;
        return (float)Math.sqrt(p * (p - this.a_side) * (p - this.b_side) * (p - this.c_side));
    }
    
    @Override
    public float perimeter(){
        return this.a_side + this.b_side + this.c_side;
    }
    
   
}
