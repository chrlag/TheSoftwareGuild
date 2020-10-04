/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

/**
 *
 * @author Chris
 */
public class App {
    
        public static void main(String[] args){
            
        LuckySevens ls = new LuckySevens();
        
        int dollars = ls.inputUser("How many dollars you want to play?");
        int count = 0;
        int maxCount = 0;
        int maxDollars = dollars;
        
        while(dollars > 0){
            dollars = ls.play(dollars); 
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
    
}
