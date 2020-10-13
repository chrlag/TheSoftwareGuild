/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doitbetter;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class DoItBetter {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int miles, hotdog, languages;
        
        System.out.println("How many miles can you run?");
        miles = Integer.parseInt(sc.nextLine());
        System.out.println("HA! I can run for " + (miles*2 + 1) + " miles!");
        
        System.out.println("How many hotdogs can you eat?");
        hotdog = Integer.parseInt(sc.nextLine());
        System.out.println("HA! I can eat " + (hotdog*2 + 1) + " hotdogs!");
        
        System.out.println("How many languages do you speak?");
        languages = Integer.parseInt(sc.nextLine());
        System.out.println("HA! I speak " + (languages*2 + 1) + " lanugages!");
                
        
        
    }
    
}
