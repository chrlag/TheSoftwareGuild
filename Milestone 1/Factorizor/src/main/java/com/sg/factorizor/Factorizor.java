/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorizor;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Factorizor {
    public static void main(String[] args){
        
        int num = selectNumber();
        
        factorize(num);

    }
    
    public static int selectNumber(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number");
        int number = Integer.parseInt(input.nextLine());
        
        System.out.println("Your number is: " + number);
        
        return number;
    }
    
    public static void factorize(int num){
        
        int count = 0;
        System.out.println("The factors of " + num + " are");
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                count += i;
                System.out.println(i);
            }
        }
        isPerfect(count, num);
        isPrime(count, num);
    }
    
    public static void isPerfect(int count, int num){
        if (count == num){
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
    
    public static void isPrime(int count, int num){
        if (count == 1){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
    }
    
}


