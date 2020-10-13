/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mathoperators;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class App {
    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);
        
        System.out.println("Please type 2 numbers.");
        int number1 = Integer.parseInt(io.nextLine());
        int number2 = Integer.parseInt(io.nextLine());
        
        for (MathOperator op : MathOperator.values()){
            System.out.println(IntMath.calculate(op, number1, number2));
        }
        
    }
}
