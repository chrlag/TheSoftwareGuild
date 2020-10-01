/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.springforwardfallback;

/**
 *
 * @author Chris
 */
public class SpringForwardFallBack {
    public static void main(String[] args){
        
        System.out.println("It's Sprint...!");
        for (int i = 1; i <= 10; i++){ // goes from 0 to 9 with i=0; i<10
            System.out.print(i + ", ");
            
        }
        
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--){ // goes from 10 to 1
            System.out.print(i + ", ");
        }
    }
    
}
