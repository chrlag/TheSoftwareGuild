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
public class CarDealer {
    private float price;
    private String model;
    private String characteristics;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public CarDealer(float price, String model, String characteristics, boolean available) {
        this.price = price;
        this.model = model;
        this.characteristics = characteristics;
        this.available = available; 
    }
    
    public boolean isDeal(int money){
        return true;
    }
    
    public boolean isAvailable(int remainder){
        return true;
    }
    
            
    
}
