/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.traditionalfizzbuzz;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please insert a number");
        int number = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < number; i++){
            if (i == 0){
                System.out.println(i);
                continue;
            }
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("fizz buzz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            } else if (i % 3 == 0){
                System.out.println("fizz");
            } else{
                System.out.println(i);
            }
            
            if (i == 100){
                break;
            }
        }
        
        System.out.println("TRADITION!!!");
    }
    
}
