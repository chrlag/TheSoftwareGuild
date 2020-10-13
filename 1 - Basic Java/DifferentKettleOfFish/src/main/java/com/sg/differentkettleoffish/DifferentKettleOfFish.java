/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.differentkettleoffish;

/**
 *
 * @author Chris
 */
public class DifferentKettleOfFish {
    public static void main(String[] args){
        
        int fish = 1;
        while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }
            
        // nothing really changed! Just initialized the value inside the for loop.
        
        for(int i = 1; i < 10; i++){
            if (i == 3){
                System.out.println("RED fish!");
            } else if (i == 4){
                System.out.println("BLUE fish!");
            } else {
                System.out.println(i + " fish");
          }
        }
    }
    
}
