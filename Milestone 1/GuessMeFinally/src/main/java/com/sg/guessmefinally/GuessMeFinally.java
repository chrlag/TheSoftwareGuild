/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.guessmefinally;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class GuessMeFinally {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        int number = rd.nextInt(101);
        int numGuess;
        boolean sign = rd.nextBoolean();
        boolean isFalse = true;
        
        if (!sign){
            number = -number;
        }
        
        System.out.println("Guess my number");
        numGuess = Integer.parseInt(input.nextLine());
        
        if (numGuess == number){
            isFalse = false;
            System.out.println("Wow, nice guess! That was it!");
        }
        while(isFalse){
            if (numGuess < number){
                System.out.println("Ha, nice try - too low! Try again!");
                numGuess = Integer.parseInt(input.nextLine());
            } else if (numGuess > number){
                System.out.println("Too bad, way too high. Try again!");
                numGuess = Integer.parseInt(input.nextLine());
            } else {
                System.out.println("Finally! It's about time you got it!");
                isFalse = false;
            }
            
        }
        
    }
    
}
