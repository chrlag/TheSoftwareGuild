/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessmemore;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author chris
 */
public class GuessMeMore {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int randomNum;
        boolean positive;
        int numGuess;
        
        positive = rd.nextBoolean();
        randomNum = rd.nextInt(101);
        
        if (!positive){
            randomNum = - randomNum;
        }
        
        System.out.println("I've chosen a random number between -100 and 100.");
        System.out.println("Can you guess it?");
        
        numGuess = Integer.parseInt(sc.nextLine());
        
        if (numGuess == randomNum){
            System.out.println("WOW! You got it right!");
        } else {
            System.out.println("You have a second chance!");
            numGuess = Integer.parseInt(sc.nextLine());
            if (numGuess == randomNum){
                System.out.println("Correct!");
            } else {
                System.out.println("Bad Luck!");
            }
        }
        
        
    }
    
}
