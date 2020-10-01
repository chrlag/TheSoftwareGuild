/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.knockknock;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class KnockKnock {
    public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Knock Knock! Guess who! ");
            String nameGuess = sc.nextLine();
            
            if (nameGuess.toLowerCase().equals(("Marty McFly").toLowerCase())){
                System.out.println("Hey! That's right! I'm back!");
                System.out.println("... from the Future.");
            } else{
                System.out.println("Dude, do I -look- like " + nameGuess);
            }
            
            // == does not work between Strings! That's because string is an object and unique!
            // it will not find a match!
            
            
    }
}
