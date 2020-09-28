/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class HealthyHearts {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int age;
        
        System.out.println("Please enter your age");
        age = Integer.parseInt(sc.nextLine());
        
        int max = 220 - age;
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        System.out.println("Your target HR Zone is " + 0.5*max + " - " + 0.85*max + " beats per minute");
        
    }
    
}
