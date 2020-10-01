/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doordonot;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class DoOrDoNot {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Should I do it? (y/n)");
        // if I type "n" it prints out "I know you said no to... but I did it".
        boolean doIt;
        boolean iDidIt = false;
        
        if (input.next().equals("y")){
            doIt = true;
        } else{
            doIt = false;
        }
        
        /* do{
            iDidIt = true;
            break;
        } while (doIt);
        */
        
        // with the while loop and "n" it prints out "Don't look at me! I didn't do anything".
        while (doIt){
            iDidIt = true;
            break;
        }
        
        if (doIt && iDidIt){
            System.out.println("I did it");
        } else if (!doIt && iDidIt){
            System.out.println("I know you said no to... but I did it");
        } else {
            System.out.println("Don't look at me! I didn't do anything");
        }
    }
}
