/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sectionfourunittests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chris
 */
public class InsertWordTest {
    
    private InsertWord word = new InsertWord();
    
    public InsertWordTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testLessGreaterThan() {
        String correctString = "<<Yay>>";
        assertEquals(correctString, word.insertWord("<<>>", "Yay"));
    }
    
    @Test
    public void testLessGreaterThan2(){
        String correctString = "<<WooHoo>>";
        assertEquals(correctString, word.insertWord("<<>>", "WooHoo"));
    }
    
    @Test
    public void testBrackets(){
        String correctString = "[[word]]";
        assertEquals(correctString, word.insertWord("[[]]", "word"));
    }
    
    @Test
    public void testQuotes(){
        String correctString = "\"\"test\"\"";
        assertEquals(correctString, word.insertWord("\"\"\"\"", "test"));
    }
    
}
