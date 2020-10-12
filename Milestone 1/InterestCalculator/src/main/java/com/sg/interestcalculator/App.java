/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

import java.math.BigDecimal;

/**
 *
 * @author Chris
 */
public class App {
    
        public static void main(String[] args){
            
        InterestCalculator ic = new InterestCalculator();
       
        BigDecimal annualRate = new BigDecimal(ic.inputUser("Please type the annual interest rate"));
        
        BigDecimal amount = new BigDecimal(ic.inputUser("Please type the initial amount of principal"));
        
        BigDecimal years = new BigDecimal(ic.inputUser("Please type the number of years the money is to stay in the fund."));
        
        int compoundPeriod = Integer.parseInt(ic.inputUser("Please choose the compound period. "
                + "Type 0,1,2 for quarterly, monthly, daily"));
        
        BigDecimal compoundPeriodFixed = ic.changeCompoundPeriod(compoundPeriod);
        BigDecimal interest = ic.calculateInterest(compoundPeriodFixed, annualRate);
        ic.outputPerYear(interest, years, amount, compoundPeriodFixed);
        
   
    }
    
}
