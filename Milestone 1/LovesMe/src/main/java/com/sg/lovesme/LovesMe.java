/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lovesme;

/**
 *
 * @author Chris
 */
public class LovesMe {
    public static void main(String[] args){
        
        int petals = 34;
        
        while (petals > 0){
            if (petals % 2 == 0){
                System.out.println("It LOVES me NOT!");  
            } else {
                System.out.println("It LOVES me!");
            }
            petals--;
        }
        
        System.out.println("I KNEW IT!");
    }
    
}
