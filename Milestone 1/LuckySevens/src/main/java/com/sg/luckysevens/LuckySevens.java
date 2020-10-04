/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class LuckySevens {
    
    public int inputUser(String prompt){
        
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        int dollars = Integer.parseInt(input.nextLine());
        
        return dollars;
    }
    
    public int play(int dollars){
        
        Random rd = new Random();
        int firstDice = rd.nextInt(6) + 1;
        int secondDice = rd.nextInt(6) + 1;
        
        if (firstDice + secondDice == 7){
            dollars += 4;
        } else{
            dollars -= 1;
        }
        
        return dollars;
        
    }
    
}
