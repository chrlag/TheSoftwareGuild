/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class LuckySevens {
    public static void main(String[] args){
        
        int dollars = inputUser("How many dollars you want to play?");
        int count = 0;
        int maxCount = 0;
        int maxDollars = dollars;
        
        while(dollars > 0){
            dollars = play(dollars); 
            count++;
            
            if (dollars > maxDollars){
                maxDollars = dollars;
                maxCount = count;
            }
        }
        
        System.out.println("You are broke after " + count + " rolls.");
        System.out.println("You should have quit after " + maxCount + " rolls when"
                + " you had $" + maxDollars);
    }
    
    public static int inputUser(String prompt){
        
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        int dollars = Integer.parseInt(input.nextLine());
        
        return dollars;
    }
    
    public static int play(int dollars){
        
        Random rd = new Random();
        int firstDice = rd.nextInt(6) + 1;
        int secondDice = rd.nextInt(6) + 1;
        
        if (firstDice + secondDice == 7){
            dollars += 4;
        } else{
            dollars -= 1;
        }
        
        return dollars;
        
    }
    
}
