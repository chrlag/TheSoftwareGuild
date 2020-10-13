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
public class StringTimesTest {
    
    private StringTimes stringTime = new StringTimes();
    
    public StringTimesTest() {
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
    public void test2times() {
        String correctString = "HiHi";
        assertEquals(correctString, stringTime.stringTimes("Hi", 2));
    }
 
    @Test
    public void test3times() {
        String correctString = "HiHiHi";
        assertEquals(correctString, stringTime.stringTimes("Hi", 3));
    }

    @Test
    public void test1times() {
        String correctString = "Hi";
        assertEquals(correctString, stringTime.stringTimes("Hi", 1));
    }

    @Test
    public void test0times() {
        String correctString = "";
        assertEquals(correctString, stringTime.stringTimes("Hi", 0));
    }     
}
