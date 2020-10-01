/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.waitawhile;

/**
 *
 * @author chris
 */
public class WaitAWhile {
    public static void main(String[] args){
        
        int timeNow = 5;  // if this is greater than bedTime, there will be no loop.
        
        int bedTime = 10; // by changing this we are increasing/decreasing the times
                          // we are looping.
        
        while (timeNow < bedTime){
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up a bit longer");
            timeNow++; // if we comment out this line, we will have an infinite loop.
        }
        
        System.out.println("Oh! I guess it's " + timeNow + " o'clock...");
        System.out.println("Better go to sleep!");
    }
    
}
