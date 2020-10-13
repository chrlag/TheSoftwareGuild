/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.birthstones;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class BirthStones{
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Please enter a number from 1 to 12 inclusive");
        num = Integer.parseInt(sc.nextLine());
        
        if (num == 1){
            System.out.println("Garnet");
        } else if (num == 2){
            System.out.println("Amethyst");
        } else if (num == 3){
            System.out.println("Aquamarine");
        } else if (num == 4){
            System.out.println("Diamond");
        } else if (num == 5){
            System.out.println("Emerald");
        } else if (num == 6){
            System.out.println("Pearl");
        } else if (num == 7){
            System.out.println("Ruby");
        } else if (num == 8){
            System.out.println("Peridot");
        } else if (num == 9){
            System.out.println("Sapphire");
        } else if (num == 10){
            System.out.println("Opal");
        } else if (num == 11){
            System.out.println("Topaz");
        } else if (num == 12){
            System.out.println("Turqoise");
        } else {
            System.out.println("Error");
        }

    }
}
