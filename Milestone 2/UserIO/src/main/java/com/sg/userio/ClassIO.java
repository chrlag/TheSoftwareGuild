/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.userio;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class ClassIO implements UserIO{
    
    private Scanner input;
    
    
    public ClassIO(){
        this.input = new Scanner(System.in);    
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        return Double.parseDouble(input.nextLine());
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        print(prompt);
        double number = 0;
        do{
            print("The number must be between " + min + " and " + max);
            number = Double.parseDouble(input.nextLine());
        } while(number <= min || number >= max);
        
        return number;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        return Float.parseFloat(input.nextLine());
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        print(prompt);
        float number = 0;
        do{
            print("The number must be between " + min + " and " + max);
            number = Float.parseFloat(input.nextLine());
        } while(number < min || number > max);
        
        return number;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return Integer.parseInt(input.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        print(prompt);
        int number = 0;
        do{
            print("The number must be between " + min + " and " + max);
            number = Integer.parseInt(input.nextLine());
        } while(number < min || number > max);
        
        return number;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        return Long.parseLong(input.nextLine());
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        print(prompt);
        long number = 0;
        do{
            print("The number must be between " + min + " and " + max);
            number = Long.parseLong(input.nextLine());
        } while(number < min || number > max);
        
        return number;
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        return input.nextLine();
    }
    
}
