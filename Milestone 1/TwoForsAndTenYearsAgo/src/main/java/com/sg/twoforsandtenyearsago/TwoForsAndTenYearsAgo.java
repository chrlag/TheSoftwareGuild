/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.twoforsandtenyearsago;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class TwoForsAndTenYearsAgo {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("What year would you like to count back from?");
        int year = userInput.nextInt();
        
        for (int i = 0; i <= 10; i++){ // loops from 0 to 10
            System.out.println(i + " years ago would be " + (year - i));
            
            // this loop is clearer! The reason being that there are hardcoded
            // values in the parameters of the for loop. Easier to understand.
        }
        
        System.out.println("\nI can count backwards using a different way too...");
        
        for (int i = year; i >= year - 20; i--){ // loops from user input, till user input - 10
            System.out.println(( year - i) + " years ago would be " + i);
        }
    }
    
}
