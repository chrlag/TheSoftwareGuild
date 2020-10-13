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
public class FrontTimesTest {
    
    private FrontTimes times = new FrontTimes();
    
    public FrontTimesTest() {
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
    public void testChocolate3() {
        String correctString = "ChoChoCho";
        assertEquals(correctString, times.frontTimes("Chocolate", 3));
    }
    @Test
    public void testChocolate2() {
        String correctString = "ChoCho";
        assertEquals(correctString, times.frontTimes("Chocolate", 2));
    }
    
    @Test
    public void testAbc3() {
        String correctString = "AbcAbcAbc";
        assertEquals(correctString, times.frontTimes("Abc", 3));
    }
    
    @Test
    public void testAb3() {
        String correctString = "AbAbAb";
        assertEquals(correctString, times.frontTimes("Ab", 3));
    } 
    
    @Test
    public void testAb0() {
        String correctString = "";
        assertEquals(correctString, times.frontTimes("Ab", 0));
    } 
    
    @Test
    public void test3() {
        String correctString = "";
        assertEquals(correctString, times.frontTimes("", 3));
    } 
    
    @Test
    public void testSpace3() {
        String correctString = "   ";
        assertEquals(correctString, times.frontTimes(" ", 3));
    } 
}
