/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sectionthreeunittests;


/**
 *
 * @author Chris
 */
public class MakePi {
    // Return an int array length n containing the first n digits of pi.
    //
    // makePi(3) -> {3, 1, 4}

    public int[] makePi(int n) {
        
        int[] arrayPi = new int[n];
        double pi = Math.PI;
        if (n == 0){
            return arrayPi;
        }
  
        int intPi = (int)(pi * Math.pow(10, n - 1));
        System.out.println(intPi);
        String number = String.valueOf(intPi);
        
        for(int i = 0; i < number.length(); i++) {
            arrayPi[i] = Character.digit(number.charAt(i), 10);
            System.out.println("digit: " + arrayPi[i]);
        }
        return arrayPi;
    }    
}
