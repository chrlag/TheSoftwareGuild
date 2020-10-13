/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.howmanydaysuntilfriday;

import static com.sg.howmanydaysuntilfriday.DaysOfWeek.*;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class App {
    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);
        int i = 0;
        System.out.println("Please type a day of the week");
        for (DaysOfWeek value : DaysOfWeek.values()){
            System.out.println(++i + " = " + value);
        }
        int input = Integer.parseInt(io.nextLine());
        
        switch (input){
            case 1:
                System.out.println("You selected " + DaysOfWeek.MONDAY);
                System.out.println("Remaining days till Friday: 4");
                break;
            case 2:
                System.out.println("You selected " + DaysOfWeek.TUESDAY);
                System.out.println("Remaining days till Friday: 3");
                break;
            case 3:
                System.out.println("You selected " + DaysOfWeek.WEDNESDAY);
                System.out.println("Remaining days till Friday: 2");
                break;
            case 4:
                System.out.println("You selected " + DaysOfWeek.THURSDAY);
                System.out.println("Remaining days till Friday: 1");
                break;
            case 5:
                System.out.println("You selected " + DaysOfWeek.FRIDAY);
                System.out.println("Remaining days till Friday: 0");
                break;
            case 6:
                System.out.println("You selected " + DaysOfWeek.SATURDAY);
                System.out.println("Remaining days till Friday: 6");
                break;
            case 7:
                System.out.println("You selected " + DaysOfWeek.SUNDAY);
                System.out.println("Remaining days till Friday: 5");
                break;
        }
        
    }
    
}
