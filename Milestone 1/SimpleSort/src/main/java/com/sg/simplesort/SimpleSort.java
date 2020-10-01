/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplesort;

/**
 *
 * @author Chris
 */
public class SimpleSort {
    public static void main(String[] args){
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] wholeNumbers = new int[24];
        
        int j = 0, k = 0;
        
        while (k < firstHalf.length - 1 || j < secondHalf.length - 1){
            if (firstHalf[k] > secondHalf[j]){
                wholeNumbers[k + j] = secondHalf[j];
                System.out.print(wholeNumbers[k + j] + ", ");
                j++;    
            } else if (firstHalf[k] < secondHalf[j]){
                wholeNumbers[k + j] = firstHalf[k];
                System.out.print(wholeNumbers[k + j] + ", ");
                k++;
            }
            
        }
        
        if (firstHalf[j] > secondHalf[k]){
            wholeNumbers[wholeNumbers.length - 1] = firstHalf[k];
        } else{
            wholeNumbers[wholeNumbers.length - 1] = secondHalf[j];
        }
        System.out.print(wholeNumbers[wholeNumbers.length - 1]);
        
        
      
    }
    
}
