/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.highroller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class HighRoller {
    public static void main(String[] args){
        
        Random diceRoller = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many sides does the dice have?");
        int numOfSides = Integer.parseInt(sc.nextLine());
        
        
        int rollResult = diceRoller.nextInt(numOfSides) + 1;
        
        System.out.println("It's time to roll the dice");
        System.out.println("You rolled: " + rollResult);
        
        if (rollResult == 1){
            System.out.println("You rolled a critical failure. Ouch!");
        } else if (rollResult == numOfSides){
            System.out.println("You rolled a critical! Nice job!");
        }
    }
    
}
