/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.minimadlibs;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MiniMadLibs {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String noun, adjective, secondNoun, secondAdj;
        int num;
        String plurNoun1, plurNoun2, plurNoun3;
        String presentVerb, pastVerb;
        
        System.out.println("I need a noun:");
        noun = sc.nextLine();
        System.out.println("Now an adj:");
        adjective = sc.nextLine();
        System.out.println("Another noun:");
        secondNoun = sc.nextLine();
        System.out.println("And a number");
        num = Integer.parseInt(sc.nextLine());
        System.out.println("Another adjective:");
        secondAdj = sc.nextLine();
        System.out.println("A plural noun:");
        plurNoun1 = sc.nextLine();
        System.out.println("Another one:");
        plurNoun2 = sc.nextLine();
        System.out.println("One more:");
        plurNoun3 = sc.nextLine();
        System.out.println("A verb (present tense):");
        presentVerb = sc.nextLine();
        System.out.println("Same verb (past tense):");
        pastVerb = sc.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (lib) ***");
        System.out.println(noun + ": the " + adjective + " frontier. These are"
                + " the voyages of the starship " + secondNoun + " .Its " + num + 
                "-year mission: to explore strange " + secondAdj + " " + plurNoun1 + 
                ", to seek out " + secondAdj + " " + plurNoun2 + " and " + secondAdj +
                " " + plurNoun3 + ", to boldly " + presentVerb + " where no one has " +
                pastVerb + " before."
        );
        
        
        
        
    }
    
}
