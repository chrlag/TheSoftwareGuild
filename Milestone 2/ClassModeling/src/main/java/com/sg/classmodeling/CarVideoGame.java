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
public class CarVideoGame {
    private float speed;
    private int level;
    private float cost;
    private String model;
    private int exp;
    private boolean locked;

    public CarVideoGame(float speed, int level, float cost, String model, int exp, boolean locked) {
        this.speed = speed;
        this.level = level;
        this.cost = cost;
        this.model = model;
        this.exp = exp;
        this.locked = locked;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    
    public float accelerate(float speed){
        return 3.0f;
    }
    
    public boolean isAvailable(boolean locked){
        return false;
    }
    
}
