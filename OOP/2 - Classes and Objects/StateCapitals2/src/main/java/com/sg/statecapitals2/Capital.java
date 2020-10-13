/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals2;

/**
 *
 * @author Chris
 */
public class Capital {
    
    private String name;
    private int population;
    private int squareMileage;
    
    public Capital(){
        this.name = null;
        this.population = 0;
        this.squareMileage = 0;
    }
    
    public Capital(String name, int population, int squareMileage){
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquareMilage() {
        return squareMileage;
    }

    public void setSquareMilage(int squareMileage) {
        this.squareMileage = squareMileage;
    }
    
}
