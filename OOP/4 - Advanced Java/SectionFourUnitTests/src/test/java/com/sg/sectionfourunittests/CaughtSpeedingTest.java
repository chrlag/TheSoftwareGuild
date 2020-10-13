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
public class CaughtSpeedingTest {
    
    private CaughtSpeeding speeding = new CaughtSpeeding();            
    
    public CaughtSpeedingTest() {
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
    public void test60False() {
        assertEquals(0, speeding.caughtSpeeding(60, false));
    }
    
    @Test
    public void test0False(){
        assertEquals(0, speeding.caughtSpeeding(0, false));
    }
    
    @Test
    public void test0True(){
        assertEquals(0, speeding.caughtSpeeding(0, true));
    }
    
    @Test
    public void test65False(){
        assertEquals(1, speeding.caughtSpeeding(65, false));
    }
    
    @Test
    public void test65True(){
        assertEquals(0, speeding.caughtSpeeding(65, true));
    }
    
    @Test
    public void test80False(){
        assertEquals(1, speeding.caughtSpeeding(80, false));
    }
    
    @Test
    public void test81True(){
        assertEquals(1, speeding.caughtSpeeding(81, true));
    }
    
    @Test
    public void test81False(){
        assertEquals(2, speeding.caughtSpeeding(81, false));
    }
    
    @Test
    public void test85True(){
        assertEquals(1, speeding.caughtSpeeding(85, true));
    }
    
    @Test
    public void test85False(){
        assertEquals(2, speeding.caughtSpeeding(85, false));
    }
    
}
