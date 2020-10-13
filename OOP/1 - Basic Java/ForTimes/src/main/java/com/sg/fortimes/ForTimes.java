/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fortimes;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class ForTimes {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type a number");
        int number = Integer.parseInt(sc.nextLine());
        
        for (int i = 1; i <= 15; i++){
            System.out.println(i + " * " + number + " is: " + (i*number));
        }
    }
    
}
