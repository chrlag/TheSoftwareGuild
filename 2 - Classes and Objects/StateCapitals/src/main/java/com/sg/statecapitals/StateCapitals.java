/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chris
 */
public class StateCapitals {
    public static void main(String[] args){
        
        Map<String, String> countries = new HashMap<>();
        
        countries.put("Greece", "Athens");
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("China", "Shanghai");
        countries.put("Germany", "Berlin");
        countries.put("Italy", "Rome");
        
        System.out.println("The countries are:");
        for(String key : countries.keySet()){
            System.out.println(key);
        }
        
        System.out.println("");
        
        System.out.println("The capitals are:");
        Collection<String> values = countries.values();
        
        for(String value : values){
            System.out.println(value);
        }
        
        System.out.println("");
        
        for(String key : countries.keySet()){
            System.out.println("The capital of " + key + " is " + countries.get(key));
        }
        
        
        
    }
      
}
