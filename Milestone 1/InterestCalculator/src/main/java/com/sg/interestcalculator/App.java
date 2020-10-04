/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

/**
 *
 * @author Chris
 */
public class App {
    
        public static void main(String[] args){
            
        InterestCalculator ic = new InterestCalculator();
       
        double annualRate = ic.inputUser("Please type the annual interest rate");
        
        double amount = ic.inputUser("Please type the initial amount of principal");
        
        int years = ic.inputUser("Please type the number of years the money is to stay in the fund.");
        
        int compoundPeriod = ic.inputUser("Please choose the compound period. "
                + "Type 0,1,2 for quarterly, monthly, daily");
        
        double compoundPeriodFixed = ic.changeCompoundPeriod(compoundPeriod);
        double interest = ic.calculateInterest(compoundPeriodFixed, annualRate);
        ic.outputPerYear(interest, years, amount, compoundPeriodFixed);
        
   
    }
    
}
