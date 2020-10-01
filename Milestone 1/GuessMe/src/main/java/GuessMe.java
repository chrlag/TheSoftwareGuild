
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris
 */
public class GuessMe {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = 42;
        int guess;
        
        System.out.println("Please guess my number!");
        guess = Integer.parseInt(sc.nextLine());
        
        if (guess == num){
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < num){
            System.out.println("Ha, nice try - too low! I chose " + num);
        } else if (guess > num){
            System.out.println("Too bad, way too high. I chose " + num);
        }
    }
    
}
