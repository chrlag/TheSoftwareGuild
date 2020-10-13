/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fortimesfor;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class ForTimesFor {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type a number");
        int number = Integer.parseInt(sc.nextLine());
        int answer;
        int count = 0;
        
        for (int i = 1; i <= 15; i++){
            System.out.println(i + " * " + number + " is: ");
            answer = Integer.parseInt(sc.nextLine());
            if (answer == i * number){
                System.out.println("Correct!");
                count++;
            } else{
                System.out.println("Sorry no, the answer is: " + i * number);
            }
        }
        
        if (count < 0.5*15){
            System.out.println("You should study more!");
        } else if (count >= 0.90*15){
            System.out.println("Congrats!");
        }
    }
    
    
    
}
