/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.studentquizgrades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Chris
 */
public class App {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        Map<String, ArrayList> quizGrades = new HashMap<>();
        
        ClassIO reader = new ClassIO();
        Random rd = new Random();
        
        int userInput, age, id;
        String name;
        int numOfQuiz = rd.nextInt(5) + 1;
        
        reader.print("Welcome to the System!");
        
        do{
            userInput = reader.readInt("Press 1 to view student list, 2 to add, 3 "
                + "to remove, 4 to view list of Quiz scores or 5 to check average Quiz score. 0 to exit", 0, 5);
            
            switch (userInput) {
                case 0:
                    reader.print("Bye!");
                    break;
                    
                case 1:
                    if(students.isEmpty()){
                        reader.print("There are no students! Please add!");
                    } else{
                        for (Student stu : students){
                            reader.print("The following Students are in the system");
                            reader.print(stu.getName());
                        }
                    }   
                    break;
                    
                case 2:
                    name = reader.readString("Type the name of the Student");
                    age = reader.readInt("Type the age of the Student");
                    id = reader.readInt("Type the ID of the Student");
                    Student newStudent = new Student(name, age, id);
                    students.add(newStudent);
                    
                    // adds random quiz Scores to Student
                    ArrayList<Integer> grades = new ArrayList<>();
                    for (int i = 0; i < numOfQuiz; i++){
                        grades.add(rd.nextInt(100) + 1);
                    }
                    
                    quizGrades.put(newStudent.getName(), grades);
                    
                    break;
                    
                case 3:
                    if (students.isEmpty()){
                        reader.print("There are no students to remove!");
                    } else{
                        userInput = reader.readInt("Type index of Student to remove");

                        // remove the quiz grades first
                        quizGrades.remove(students.get(userInput).getName());

                        // now remove the student
                        students.remove(userInput);                        
                    }

                    break;
                    
                case 4:
                    if (students.isEmpty()){
                        reader.print("There are no students to see the grades of!");
                    } else{
                        userInput = reader.readInt("Type the index of Student to see");
                        String stuName = students.get(userInput).getName();
                        ArrayList<Integer> stuGrades = quizGrades.get(stuName);

                        Iterator<Integer> it = stuGrades.iterator();

                        while(it.hasNext()){
                            reader.print("The quiz scores are: " + it.next());
                        }                        
                    }

                    break;
                    
                case 5:
                    if(students.isEmpty()){
                        reader.print("There are no students!");
                    } else{
                        userInput = reader.readInt("Type the index of Student to see");
                        ArrayList<Integer> averageStuGrades = 
                                quizGrades.get(students.get(userInput).getName());

                        double average = 0;
                        int count = 0;

                        for (Integer grade : averageStuGrades){
                            count += grade;
                        }

                        average = count / averageStuGrades.size();

                        reader.print("The average grade of " + students.get(userInput).getName() + " "
                                + "is " + average);                        
                    }
                    break;
            }
            
            
            
            
        } while(userInput != 0);         
    }
}