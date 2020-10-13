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
public class SkipSumTest {
    
    private SkipSum skip = new SkipSum();
    
    public SkipSumTest() {
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
    public void test7() {
        assertEquals(7, skip.skipSum(3, 4));
    }
    
    @Test
    public void test13(){
        assertEquals(20, skip.skipSum(9, 4));
    }
    
    @Test
    public void test21(){
        assertEquals(21, skip.skipSum(10, 11));
    }
    
    @Test
    public void test10(){
        assertEquals(20, skip.skipSum(0, 10));
    }
    
}
