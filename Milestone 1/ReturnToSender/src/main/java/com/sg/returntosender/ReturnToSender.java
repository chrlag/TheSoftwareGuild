/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.returntosender;

/**
 *
 * @author Chris
 */
public class ReturnToSender {
    public static void main(String[] args){
        
        char aMystery = mystery();
        String totallyUnexpected = unexpected();
        double aSuprise = suprise();
        boolean itsClassified = classified();
        int aSecret = secret();
        
        System.out.println("The methis have returned! Their results...\n");
        System.out.println("Mysterious: " + aMystery);
        System.out.println("    Secret: " + aSecret);
        System.out.println("Suprising: " + aSuprise);
        System.out.println("Classified: " + itsClassified);
        System.out.println("Unexpected: " + totallyUnexpected);
        
    }
    
    public static int secret(){
        return 42;
    }
    
    public static double suprise(){
        return 3.14;
    }
    
    public static char mystery(){
        return 'X';
    }
    
    public static boolean classified(){
        return true;
    }
    
    public static String unexpected(){
        return "Spanish Inquisition";
    }
    
}
