/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.thecount;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class TheCount {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int start;
        int stop;
        int increment;
        int count = 0;
        
        System.out.println("Type the start");
        start = Integer.parseInt(sc.nextLine());
        System.out.println("Type the stop!");
        stop = Integer.parseInt(sc.nextLine());
        System.out.println("Type the increment");
        increment = Integer.parseInt(sc.nextLine());
        
        for (int i = start; i < stop; i += increment){
            if (count == 3){
                System.out.print("- Ah ah ah!");
                System.out.println("");
                count = 0;
            }
            System.out.print(i + ", ");
            count++;
        }
        
    }
    
}
