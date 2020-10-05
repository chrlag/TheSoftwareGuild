/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author Chris
 */
public class AirplanceSimulator {
    private int altitude;

    public AirplanceSimulator(String model) {
        this.altitude = 0;
        this.speed = 0;
        this.model = model;
    }
    private float speed;
    private String model;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public int accelarate(int speed){
        return 1;
        
    }
    
    public void descent(int altidude, int speed){
        
    }
    
    public void ascent(int altidude, int speed){
        
    }
    
    
}
