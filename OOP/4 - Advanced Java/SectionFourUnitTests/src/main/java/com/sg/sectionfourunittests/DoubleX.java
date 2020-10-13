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
public class DoubleX {
    // Given a String, return true if the first instance 
    // of "x" in the String is immediately followed by 
    // another "x". 
    //
    // doubleX("axxbb") -> true
    // doubleX("axaxxax") -> false
    // doubleX("xxxxx") -> true
    public boolean doubleX(String str) {
        
        boolean flag = false;
        
        if ((str == null) || str.length() == 0){
            return flag;
        } else {
            str = str.toLowerCase();
            boolean firstX = true;
            for (int i = 0; i < str.length() - 1; i++){
                char c = str.charAt(i);
                if (c == 'x' && firstX){
                    if (str.charAt(i + 1) == 'x'){
                        flag = true;
                    }
                    firstX = false;
                }
            }
            return flag;
        }
    }    
}
