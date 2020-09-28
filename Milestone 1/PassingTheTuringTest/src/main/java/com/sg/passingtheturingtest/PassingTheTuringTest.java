/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.passingtheturingtest;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class PassingTheTuringTest {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        String name;
        String color;
        String food;
        int number;
        
        System.out.println("What is your name?");
        name = inputReader.nextLine();
        
        System.out.println("Hello " + name + " ! My name is Alex");
        System.out.println("What is your favorite color?");
        color = inputReader.nextLine();
        
        System.out.println("WOW! Really? " + color + " is my favorite color as well!");
        System.out.println("Food? What do you like the most?");
        food = inputReader.nextLine();
        
        System.out.println(food + "... nah...do not like that. Do you have a favorite number?");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(number + " is dumb...bye!");
        
    }
    
}
