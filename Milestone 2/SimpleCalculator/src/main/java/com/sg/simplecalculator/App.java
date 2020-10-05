/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class App {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int userInput;
        float x = 0, y = 0;
        float result = 0;
        
        do{
            System.out.println("Welcome to calculator!");
            System.out.println("Press 1/2/3/4 for addition/subtraction/multiplication/division");
            System.out.println("Press 0 to exit");
            
            userInput = Integer.parseInt(input.nextLine());
            if (userInput != 0){
                System.out.println("Please type your two numbers");
                x = Float.parseFloat(input.nextLine());
                y = Float.parseFloat(input.nextLine());
            }
            
            switch (userInput){
                case 0:
                    continue;
                case 1:
                    result  = SimpleCalculator.addition(x, y); 
                    break;
                case 2:
                    result = SimpleCalculator.subtration(x, y);
                    break;
                case 3:
                    result = SimpleCalculator.multiplication(x, y);
                    break;
                case 4:
                    result = SimpleCalculator.division(x, y);
                    break;
                default:
                    System.out.println("Invalid number! Please type again!");
            }
            
            System.out.println("Result = " + result);
            
        } while (userInput != 0);

        
        System.out.println("Thank you for using our calcluator");

    }
    
}
