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
public class StringSplosionTest {
    
    private StringSplosion explosion = new StringSplosion();
    
    public StringSplosionTest() {
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

    /**
     * Test of stringSplosion method, of class StringSplosion.
     */
    @Test
    public void testCode() {
        assertEquals("CCoCodCode", explosion.stringSplosion("Code"));
    }
    
    @Test
    public void testAbc(){
        assertEquals("aababc", explosion.stringSplosion("abc"));
    }
    
    @Test
    public void testAb(){
        assertEquals("aab", explosion.stringSplosion("ab"));
    }
    
}
