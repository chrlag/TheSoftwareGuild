/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class InterestCalculator {
    
    private static final BigDecimal ONE = new BigDecimal("1");
    private static final BigDecimal HUNDRED = new BigDecimal("100");

    public String inputUser(String prompt){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(prompt);
        String value = input.nextLine();  
        return value;
    }
    
    public BigDecimal changeCompoundPeriod(int compoundPeriod){
        BigDecimal value;
        switch (compoundPeriod){
            case 0:
                value = new BigDecimal("4");
                break;
            case 1:
                value = new BigDecimal("12");
                break;
            case 2: 
                value = new BigDecimal("365");
                break;
            default:
                value = new BigDecimal(compoundPeriod);  
        } 
        return value;
    }
    
    public BigDecimal calculateInterest(BigDecimal compoundPeriod, BigDecimal annualRate){
        
        BigDecimal interest = ONE.add((annualRate.divide(compoundPeriod, 2, RoundingMode.HALF_UP)).divide(HUNDRED, 2, RoundingMode.HALF_UP));
        
        return interest;
    }

    
    public BigDecimal calculateFinalAmount(BigDecimal amount, BigDecimal interest, BigDecimal compoundPeriod){
        
        BigDecimal finalAmount;
        
        for (int i = 1; i <= compoundPeriod.intValue(); i++){
            //amount *= interest;
            amount = amount.multiply(interest);
        } 
        finalAmount = amount;
    
        return finalAmount;
        
    }
    
    public void outputPerYear(BigDecimal interest, BigDecimal years, BigDecimal amount, BigDecimal compoundPeriodFixed){
        BigDecimal finalAmount = amount;
        for (int i = 0; i < years.intValue(); i++){
            System.out.println("Year number: " + (i + 1));
            System.out.println("The principal at the beginning of the year is: " + finalAmount.setScale(2, RoundingMode.HALF_UP));
            finalAmount = calculateFinalAmount(finalAmount, interest, compoundPeriodFixed);
            System.out.println("The total amount of interest earned for the year is: " 
                    + (finalAmount.subtract(amount)).setScale(2, RoundingMode.HALF_UP));
            System.out.println("The principal at the end of the year is: " + finalAmount.setScale(2, RoundingMode.HALF_UP));
        }

        
    }
    
}
