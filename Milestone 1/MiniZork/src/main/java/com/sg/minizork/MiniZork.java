/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.minizork;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MiniZork {
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        String action;
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");
        action = userInput.nextLine();
        
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")){
                System.out.println("You get your hand inside the mailbox");
                System.out.println("You feel something touching your hand");
                System.out.println("Examine or run away?");
                action = userInput.nextLine();
                
                if (action.equals("examine")){
                    System.out.println("A deadly venomous spider bites your wrist...");
                    System.out.println("The poison quickly runs through your body. You died!");
                } else if (action.equals("run away")){
                    System.out.println("You run away screaming!");
                    System.out.println("You see the bright city lights at the distance...you are alive!");
                }
            }
        } else if (action.equals("go to the house")){
            System.out.println("You approach the house, the door is locked");
            System.out.println("At your right there is an open window");
            System.out.println("Knock the door or go through the window?");
            action = userInput.nextLine();
            
            if (action.equals("knock the door")){
                System.out.println("You knocked the door");
                System.out.println("You hear someone running to the door");
                System.out.println("You run away or stay?");
                action = userInput.nextLine();
                
                if (action.equals("run away")){
                    System.out.println("You are running like the wind away from the house");
                    System.out.println("You are alive");
                } else if (action.equals("stay")){
                    System.out.println("A man quickly opens the door and grabs you inside!");
                    System.out.println("A knife is stabbed in your chest...you died!");
                }
               
            } else if (action.equals("go through the window")){
                System.out.println("You quickly jumped into the house");
                System.out.println("You hear a voice coming from the hall");
                System.out.println("You run back out or go examine");
                action = userInput.nextLine();
                
                if (action.equals("run back")){
                    System.out.println("You jump back out and start running!");
                    System.out.println("You are out of breath, but in safe distance.");
                    System.out.println("You are alive!");
                } else if (action.equals("examine")){
                    System.out.println("You keep walking down the hall.");
                    System.out.println("A man comes from behind and split your throat...you died!");
                }
                   
            }
           
        }
    }
    
}
