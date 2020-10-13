/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sectionfourunittests;


/**
 *
 * @author Chris
 */
public class EveryOther {
    // Given a String, return a new String made of every other 
    // char starting with the first, so "Hello" yields "Hlo". 
    //
    // everyOther("Hello") -> "Hlo"
    // everyOther("Hi") -> "H"
    // everyOther("Heeololeo") -> "Hello"
    public String everyOther(String str) {
        try{
            if (str.length() == 0){
                return "";
            } else{
                String string = "";
                for (int i = 0; i <str.length(); i += 2){
                    string += str.charAt(i);
                }
                return string;
            }
            
        }catch (NullPointerException e){
            return null;
        }
    } 
}
