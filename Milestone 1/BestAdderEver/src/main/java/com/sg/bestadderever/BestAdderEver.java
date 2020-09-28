/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bestadderever;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class BestAdderEver {
    public static void main(String[] args){
        
        int number1, number2, number3;
        int sum;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please type the first number");
        number1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Please type the second number");
        number2 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Please type the third number");
        number3 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Number 1 is: " + number1);
        System.out.println("Number 2 is: " + number2);
        System.out.println("Number 3 is: " + number3);
        
        sum = number1 + number2 + number3;
        
        System.out.println("The sum is: " + sum);
        System.out.println("One more time " + sum);
        
        
        
        
        
        
    }
    
}
