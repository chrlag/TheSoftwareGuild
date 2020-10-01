/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fruitsbasket;

/**
 *
 * @author Chris
 */
public class FruitBasket {
    public static void main(String[] args){
        String[] fruits = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", 
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", 
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", 
            "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", 
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", 
            "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", 
            "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", 
            "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", 
            "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        
        int apples = 0, oranges = 0;
        int j = 0, k = 0;
        
        for (String fruit : fruits){
            if (fruit.equals("Apple")){
                apples++;
            } else if (fruit.equals("Orange")){
                oranges++;
            }
        }
        
        System.out.println("Number of apples: " + apples);
        System.out.println("Number of oranges: " + oranges);
        
        String[] appleArray = new String[apples];
        String[] orangeArray = new String[oranges];
        
        for (String fruit : fruits){
            if (fruit.equals("Apple")){
                appleArray[j++] = fruit;
            } else if (fruit.equals("Orange")){
                orangeArray[k++] = fruit;
            }
        }
        
        System.out.println("Number of apples in appleArray: " + appleArray.length);
        System.out.println("Number of oranges in orangeArray " + orangeArray.length);
        System.out.println("Total number of fruits in fruits (array): " + fruits.length);
        
        
    }
    
}
