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
public class PosNegTest {
    
    private PosNeg positiveNegative = new PosNeg();
    
    public PosNegTest() {
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
    public void testPosNegFalse() {
        assertTrue(positiveNegative.posNeg(1, -1, false));
    }
    
    @Test
    public void testNegPosFalse(){
        assertTrue(positiveNegative.posNeg(-1, 1, false));
    }
    
    @Test
    public void testNegNegTrue(){
        assertTrue(positiveNegative.posNeg(-4, -5, true));
    }
    
    @Test
    public void testNegNegFalse(){
        assertFalse(positiveNegative.posNeg(-4, -5, false));
    }
    
    @Test
    public void testPosPosFalse(){
        assertFalse(positiveNegative.posNeg(5, 5, false));
    }
    
    @Test
    public void testPosPosTrue(){
        assertFalse(positiveNegative.posNeg(5, 5, true));
    }
    
}
