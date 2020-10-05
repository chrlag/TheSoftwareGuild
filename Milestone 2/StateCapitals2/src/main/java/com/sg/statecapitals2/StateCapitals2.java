/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class StateCapitals2 {
    public static void main(String[] args) {
        
        Map<String, Capital> countries = new HashMap<>();
        Scanner input = new Scanner(System.in);
        
        countries.put("Greece", new Capital("Athens", 1000000, 1300));
        countries.put("USA", new Capital("Washington DC", 314000000, 1500));
        countries.put("India", new Capital("New Delhi", 1300000000, 13000));
        countries.put("China", new Capital("Sanghai", 1400000000, 14500));
        countries.put("Germany", new Capital("Berlin", 10000000, 16600));
        countries.put("Italy", new Capital("Rome", 15000000, 1900));
        
        for(String key : countries.keySet()){
            System.out.println(key);
            System.out.println("Population: " + countries.get(key).getPopulation());
            System.out.println("Capital: " + countries.get(key).getName());
            System.out.println("Mileage: " + countries.get(key).getSquareMilage());
        }
        
        System.out.println("Please insert minimum population");
        int userInput = Integer.parseInt(input.nextLine());
        
        for(String key : countries.keySet()){
            
            if (userInput <= countries.get(key).getPopulation()){
                System.out.println(key);
                System.out.println("Population: " + countries.get(key).getPopulation());
                System.out.println("Capital: " + countries.get(key).getName());
                System.out.println("Mileage: " + countries.get(key).getSquareMilage());    
   
            }

        }        
        
    }
    
}
