/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.staypositive;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class StayPositive {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        
        System.out.println("Type a number to count down from");
        number = Integer.parseInt(sc.nextLine());
        
        while (number >= 0){
            if (count == 10){
                System.out.println("");
                count = 0;
            }
            System.out.print(number + ", ");
            number--;
            count++;
        }
    }
    
}
