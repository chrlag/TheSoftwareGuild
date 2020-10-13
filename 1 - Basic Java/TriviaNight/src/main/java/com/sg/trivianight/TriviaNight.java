/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.trivianight;

import java.util.Scanner;
/**
 *
 * @author Chris
 */
public class TriviaNight {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int ans;
        int count = 0;
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the lowest level Programming Language");
        System.out.println("1) Source Code          2) Assemply Language");
        System.out.println("3) C#                   4) Machine Code");
        System.out.println("Type your answer!");
        ans = Integer.parseInt(sc.nextLine());
        System.out.println("YOUR ANSWER IS: " + ans);
        
        if (ans == 4){
            count++;
        }
        
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCAH Forms are descended from the work of?");
        System.out.println("1) Grace Hopper          2) Alan Turing");
        System.out.println("3) Charles Babbage                   4) Larry Page");
        System.out.println("Type your answer!");
        ans = Integer.parseInt(sc.nextLine());
        System.out.println("YOUR ANSWER IS: " + ans);
        
        if (ans == 2){
            count++;
        }
        
        
        
        System.out.println("THIRD QUESTION!");
        System.out.println("Which of these Sci-fi ships was once slated for a full size replica in Las Vegas?");
        System.out.println("1) Serenity          2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise                   4) The Millennium Falcon");
        System.out.println("Type your answer!");
        ans = Integer.parseInt(sc.nextLine());
        System.out.println("YOUR ANSWER IS: " + ans);
        
        if (ans == 3){
            count++;
        }
        
        if (count == 3){
            System.out.println("WOW! You got everything correct! 3/3!");
        } else if (count == 0){
            System.out.println("...You got everything wrond! Study more please! 0/3!");
        } else{
            System.out.println("You got " + count + "/3 correct");
        } 
    }
    
}
