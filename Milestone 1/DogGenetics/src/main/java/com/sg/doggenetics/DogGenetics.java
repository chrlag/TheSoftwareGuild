/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class DogGenetics {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String dogName;
        int percentage;
        int remaining;
        
        System.out.println("What is your dog's name?");
        dogName = sc.nextLine();
        
        percentage = rd.nextInt(100) + 1;
        
        System.out.println(dogName + " is:");
        System.out.println(percentage + "%: St. Bernard");
        
        remaining = 100 - percentage;
        percentage = rd.nextInt(remaining) + 1;
        System.out.println(percentage + "%: Chihuahua");
        
        remaining = remaining - percentage;
        percentage = rd.nextInt(remaining) + 1;
        System.out.println(percentage + "%: Beagle");
        
        remaining = remaining - percentage;
        percentage = rd.nextInt(remaining) + 1;
        System.out.println(percentage + "%: Pug");
        
        remaining = remaining - percentage;
        percentage = rd.nextInt(remaining + 1);
        System.out.println(percentage + "%: Pitbull");
         
    }
    
}
