/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rollercoaster;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class RollerCoaster {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        
        String keepRiding = "y";
        int loopsLooped = 0; // here we declare that is a int variable.
        while (keepRiding.equals("n")){    // (keepRiding.equals("y")){
            System.out.println("WHEEEEEEEEEeeeEEEEEeee.....!!!");
            System.out.println("Want to keep going? (y/n) :");
            keepRiding = sc.nextLine();
            loopsLooped++; // loopsLooped is already assigned at line 23.
        }
        
        System.out.println("Wow! That was fun!");
        System.out.println("We looped that loop " + loopsLooped + " times!");
    }
    
}
