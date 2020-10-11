/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sectionthreeunittests;

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
public class AbbaTest {
    
    private Abba abba = new Abba();
    
    public AbbaTest() {
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
    public void testHiBye() {
        String correctString = "HiByeByeHi";
        assertEquals(correctString, abba.abba("Hi", "Bye"));
    }
    
    @Test
    public void testYoAlice(){
        String correctString = "YoAliceAliceYo";
        assertEquals(correctString, abba.abba("Yo", "Alice"));
    }
    
    @Test
    public void testWhatUp(){
        String correctString = "WhatUpUpWhat";
        assertEquals(correctString, abba.abba("What", "Up"));
    }
    
    @Test
    public void testWhatSpace(){
        String correctString = "What  What";
        assertEquals(correctString, abba.abba("What", " "));
    }
    
    @Test
    public void testWhatEmpty(){
        String correctString = "WhatWhat";
        assertEquals(correctString, abba.abba("What", ""));
    }
    
    @Test
    public void testEmptyEmpty(){
        String correctString = "WhatWhat";
        assertEquals(correctString, abba.abba("What", ""));
    }    
}
