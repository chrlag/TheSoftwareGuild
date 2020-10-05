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
public class IceCreamGrocery {
    private boolean available;
    private float cost;
    private String flavor;
    private String typeOfIceCream;

    public IceCreamGrocery(boolean available, float cost, String flavor, String typeOfIceCream) {
        this.available = available;
        this.cost = cost;
        this.flavor = flavor;
        this.typeOfIceCream = typeOfIceCream;
    }
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTypeOfIceCream() {
        return typeOfIceCream;
    }

    public void setTypeOfIceCream(String typeOfIceCream) {
        this.typeOfIceCream = typeOfIceCream;
    }
    
    public void cashing(){
        
    }
    
    public boolean isAvailable(boolean available){
        return true;
    }
    
}
