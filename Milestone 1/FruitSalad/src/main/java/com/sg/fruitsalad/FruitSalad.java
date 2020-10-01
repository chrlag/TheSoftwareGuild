/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fruitsalad;

/**
 *
 * @author Chris
 */
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruits = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", 
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[13];
        
        int apples = 0;
        int oranges = 0;
        int i = 0;
        for (String fruit : fruits){
            String[] temp = fruit.split(" ");
            for (String str : temp){
                if (str.equals("Apple")){
                    apples++;
                    if (apples <= 3){
                        fruitSalad[i++] = fruit;
                    }else{
                        System.out.println("Already got 3 Apples");
                    }
                } else if (str.equals("Orange")){
                    oranges++;
                    if (oranges <= 2){
                        fruitSalad[i++] = fruit;
                    } else{
                        System.out.println("Already got 2 Oranges");
                    }
                } else if (str.equals("Tomato")){
                    System.out.println("WE DO NOT LIKE TOMATOES");
                } else if (str.endsWith("berry")){
                    fruitSalad[i++] = fruit;
                    System.out.println("WE LOVE BERRIES");
                }
            } 
        }
        int count = 0;
        for (int j = 0; j < fruitSalad.length; j++){
            
            if (fruitSalad[j] != null){
                System.out.print(fruitSalad[j] + ", ");
                count++;
            }
        }
        
        System.out.println("\nThe salad contains " + count + " fruits.");
        
        
    }    
}
