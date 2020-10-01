/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.coinflipper;

import java.util.Random;

/**
 *
 * @author chris
 */
public class CoinFlipper {
    public static void main(String[] args){
        
        Random rd = new Random();
        
        boolean coinToss;
        
        coinToss = rd.nextBoolean();
        
        if(coinToss){
            System.out.println("Head");
        } else{
            System.out.println("Tails");
        }
    }
    
}
