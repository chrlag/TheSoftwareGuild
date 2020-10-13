/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.maybeitlovesme;

import java.util.Random;

/**
 *
 * @author Chris
 */
public class MaybeItLovesMe {
    public static void main(String[] args){
        
        Random rd = new Random();
        boolean flag = true;
        
        int pedals = rd.nextInt((89 - 13) + 1 + 13);
        
        while (pedals > 0){
            
            if (pedals % 2 == 0){
                System.out.println("It LOVES me NOT!");
                flag = false;
            } else {
                System.out.println("It LOVES ME!");
                flag = true;
            }
            
            pedals--;
        }
        
        if (flag){
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Awwwww, bummer.");
        }
    }
    
}
