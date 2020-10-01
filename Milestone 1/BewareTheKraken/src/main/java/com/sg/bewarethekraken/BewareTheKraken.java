/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bewarethekraken;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Chris
 */
public class BewareTheKraken {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String input;
        int random;
        
        System.out.println("Already, get those flipper and wetsuin on - we're going diving!");
        System.out.println("Here we go!");
        
        int depthDivedInFt = 0;
        
        while (depthDivedInFt < 36200){ // if this always goes to true, we are in an infinite loop
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            
            System.out.println("Want to stop?");
            input = sc.nextLine();
            
            if(input.equals("yes")){
                break;
            }
            
            if (depthDivedInFt > 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys...");
                System.out.println("TIME TO GO!");
                break;
            }
            
            depthDivedInFt += 1000;
            random = rd.nextInt(3);
            
            switch (random){
                case 0:
                    System.out.println("Oh Look! A shark");
                    break;
                case 1:
                    System.out.println("A fish...what is this? Oh it's a dolphin");
                    break;
                case 2:
                    System.out.println("We found a whale!");
                    break;
            }
            
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet");
        System.out.println("I bet we can do better next time!");
    }
    
}
