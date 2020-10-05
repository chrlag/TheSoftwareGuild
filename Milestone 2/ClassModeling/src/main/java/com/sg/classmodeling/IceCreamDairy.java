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
public class IceCreamDairy {
    private String flavor;
    private String cost;
    private int galonsOfMilk;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getGalonsOfMilk() {
        return galonsOfMilk;
    }

    public void setGalonsOfMilk(int galonsOfMilk) {
        this.galonsOfMilk = galonsOfMilk;
    }

    public IceCreamDairy(String flavor, String cost, int galonsOfMilk) {
        this.flavor = flavor;
        this.cost = cost;
        this.galonsOfMilk = galonsOfMilk;
    }
    
    public void production(){
        
    }
    
}
