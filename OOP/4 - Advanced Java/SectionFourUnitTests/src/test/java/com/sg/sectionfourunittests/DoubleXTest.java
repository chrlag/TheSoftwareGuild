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
public class DoubleXTest {
    
    private DoubleX x = new DoubleX();
    
    public DoubleXTest() {
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
    public void testFirstX() {
        String string = "axxbb";
        assertTrue(x.doubleX(string));
    }
    
    @Test
    public void testSecondX(){
        String string = "axaxxax";
        assertFalse(x.doubleX(string));
    }
    
    @Test
    public void testAllX(){
        String string = "xxxxx";
        assertTrue(x.doubleX(string));
    }
    
    @Test
    public void testNoX(){
        String string = "aaaaaa";
        assertFalse(x.doubleX(string));
    }
    
    @Test
    public void testEmptyString(){
        String string = "";
        assertFalse(x.doubleX(string));
    }
    
    @Test
    public void testNullString(){
        String string = null;
        assertFalse(x.doubleX(string));
    }
    
    @Test
    public void testCapitalX(){
        String string = "AXXAAAAA";
        assertTrue(x.doubleX(string));
    }
    
}
