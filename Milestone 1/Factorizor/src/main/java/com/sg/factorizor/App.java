/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorizor;


/**
 *
 * @author Chris
 */
public class App {
    public static void main(String[] args){
        
        Factorizor fact = new Factorizor();
        
        int num = fact.selectNumber();
        
        fact.factorize(num);

    }
    
    
}
