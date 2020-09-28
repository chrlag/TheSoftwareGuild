/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.allthetrivia;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class AllTheTrivia {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1,024 Gigabytes is equal to one what?");
        String answer1 = sc.nextLine();

        System.out.println("In our solar system which is the only planet that rotates clockwise?");
        String answer2 = sc.nextLine();

        System.out.println("The largest volcano ever discovered in our solar system is located on which planet?");
        String answer3 = sc.nextLine();
        
        System.out.println("What is the most abundant element in the earth's atmosphere?");
        String answer4 = sc.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + answer3 + "!");

        System.out.println("I didn't know that the largest ever volcano was discovered on " + answer1 + "!");

        System.out.println("That's amazing that " + answer2 + " is the most abundant element in the atmosphere...");

        System.out.println(answer4 + " is the only planet that rotates clockwise, neat!");
    }
    
}
