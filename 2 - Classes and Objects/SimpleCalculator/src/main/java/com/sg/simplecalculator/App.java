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
        
        ClassIO reader = new ClassIO();
        int userInput;
        float x = 0, y = 0;
        float result = 0;
        
        do{
            reader.print("Welcome to calculator!");
            userInput = reader.readInt("Press 1/2/3/4 for addition/subtraction/multiplication/division or press 0 to exit");

            if (userInput != 0){
                x = reader.readFloat("Please type your first number");
                y = reader.readFloat("Please type your second number");
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
                    reader.print("Invalid number! Please type again!");
            }
            
            reader.print("Result = " + result);
            
        } while (userInput != 0);

        
        reader.print("Thank you for using our calcluator");

    }
    
}
