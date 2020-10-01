/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fieldday;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class FieldDay {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        String lastName;
        
        System.out.println("Please enter your last name");
        lastName = inputReader.nextLine();
        
        if (lastName.compareTo("Baggins") < 0){
            System.out.println("Red Dragons");
        } else if (lastName.compareTo("Baggins") > 0 && lastName.compareTo("Dresden") < 0){
            System.out.println("Dark Wizards");
        } else if (lastName.compareTo("Dresden") > 0 && lastName.compareTo("Howl") < 0){
            System.out.println("Moving Castles");
        } else if (lastName.compareTo("Howl") > 0 && lastName.compareTo("Potter") < 0){
            System.out.println("Golden Snitches");
        } else if (lastName.compareTo("Potter") > 0 && lastName.compareTo("Vimes") < 0){
            System.out.println("Night Guards");
        } else if (lastName.compareTo("Vimes") > 0){
            System.out.println("Black Holes");
        }
    }
}
