/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.barelycontrolledchaos;

import java.util.Random;

/**
 *
 * @author Chris
 */
public class BarelyControlledChaos {
    public static void main(String[] args){
        
        String color = chooseColor();
        String animal = chooseAnimal();
        String colorAgain = chooseColor();
        int weight = chooseInt(5, 200);
        int distance = chooseInt(10, 20);
        int number = chooseInt(10000, 20000);
        int time = chooseInt(2, 6);
        
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", "
        + weight + "lb miniature " + animal + " for over " + distance + " miles");
        
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain 
        + " poppies for nearly " + time + " hours until it left me alone!");
        
        System.out.println("\nIt was QUITE the experience, let me tell you!");
        
        
    }
    
    public static String chooseColor(){
        Random rd = new Random();
        int num = rd.nextInt(5);
        String color = "";
        
        switch (num){
            case 0:
                color = "Blue";
                break;
            case 1:
                color = "Red";
                break;
            case 2:
                color = "Orange";
                break;
            case 3:
                color = "Brown";
                break;
            case 4:
                color = "Green";
                break;
        }

        return color;
    }
    
    public static String chooseAnimal(){
        Random rd = new Random();
        int num = rd.nextInt(5);
        String animal = "";
        
        switch (num){
            case 0:
                animal = "Dog";
                break;
            case 1:
                animal = "Cat";
                break;
            case 2:
                animal = "Cow";
                break;
            case 3:
                animal = "Snake";
                break;
            case 4:
                animal = "Shark";
                break;
        }
        
        return animal;

    }
    
    public static int chooseInt(int min, int max){
        Random rd = new Random();
        int number = rd.nextInt((max - min) + 1 + min);
        return number;
    }
    
}
