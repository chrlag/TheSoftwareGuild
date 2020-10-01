/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.yourlifeinmovies;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class YourLifeInMovies {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int year;
        
        System.out.println("Please enter your birth year in #### format");
        year = Integer.parseInt(sc.nextLine());
        
        if (year < 2005){
            System.out.println("Did you know that Pixar's 'UP' came out half a decade ago?");
            if (year < 1995){
                System.out.println("And that the first Harry Potter came out over 15 years ago!");
                if (year < 1985){
                    System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
                    if (year < 1975){
                        System.out.println("Did I mention that the original Jurassic Park release is closer to the lunar landing than today?");
                        if (year < 1965){
                            System.out.println("...MASH has been around for almost half a century");
                        }
                    }
                }
            }
        }
       
        
        
    }
    
}
