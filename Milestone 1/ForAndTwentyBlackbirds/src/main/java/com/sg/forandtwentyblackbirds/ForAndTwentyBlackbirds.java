/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.forandtwentyblackbirds;

/**
 *
 * @author Chris
 */
public class ForAndTwentyBlackbirds {
    public static void main(String[] args){
        
        int birdsInPie = 0;
        for (int i = 0; i < 24; i++){
            System.out.println("Blacbird #" + (i + 1) + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
    
}