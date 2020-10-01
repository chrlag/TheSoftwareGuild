/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class InterestCalculator {
    public static void main(String[] args){
       
        double annualRate = inputUser("Please type the annual interest rate");
        
        double amount = inputUser("Please type the initial amount of principal");
        
        int years = inputUser("Please type the number of years the money is to stay in the fund.");
        
        int compoundPeriod = inputUser("Please choose the compound period. "
                + "Type 0,1,2 for quarterly, monthly, daily");
        
        double compoundPeriodFixed = changeCompoundPeriod(compoundPeriod);
        double interest = calculateInterest(compoundPeriodFixed, annualRate);
        outputPerYear(interest, years, amount, compoundPeriodFixed);
        
        
    }
    
    public static int inputUser(String prompt){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(prompt);
        int value = Integer.parseInt(input.nextLine());
        
        return value;
    }
    
    public static double changeCompoundPeriod(int compoundPeriod){
        double value;
        switch (compoundPeriod){
            case 0:
                value = 4.0;
                break;
            case 1:
                value = 12.0;
                break;
            case 2: 
                value = 365.0;
                break;
            default:
                value = compoundPeriod;  
        } 
        return value;
    }
    
    public static double calculateInterest(double compoundPeriod, double annualRate){
        
        double interest = 1.0 + (annualRate/compoundPeriod)/100.0;
        
        return interest;
    }

    
    public static double calculateFinalAmount(double amount, double interest, double compoundPeriod){
        
        double finalAmount;
        
        for (int i = 1; i <= compoundPeriod; i++){
            amount *= interest;
        }
        
        finalAmount = amount;
    
        return finalAmount;
        
    }
    
    public static void outputPerYear(double interest, int years, double amount, double compoundPeriodFixed){
        double finalAmount = amount;
        for (int i = 0; i < years; i++){
            System.out.println("Year number: " + (i + 1));
            System.out.println("The principal at the beginning of the year is: " + finalAmount);
            finalAmount = calculateFinalAmount(finalAmount, interest, compoundPeriodFixed);
            System.out.println("The total amount of interest earned for the year is: " + (finalAmount - amount));
            System.out.println("The principal at the end of the year is: " + finalAmount);
        }

        
    }
    
}
