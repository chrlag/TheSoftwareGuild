/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lazyteenager;

import java.util.Random;

/**
 *
 * @author Chris
 */
public class LazyTeenager {
    public static void main(String[] args){
        
        Random rd = new Random();
        
        int count = 1;
        int chance;
        
        do{
            if (count == 15){
                System.out.println("YOU ARE GROUNDED! NO XBOX");
                break;
            }
            System.out.println("Clean your room!! (x" + count + ")");
            
            chance = rd.nextInt(100) + 1;
            count++;
        } while(!(chance < 5*count));
    }
    
}
