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
public class CountXXTest {
    
    private CountXX count = new CountXX();
    
    public CountXXTest() {
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
    public void testABCXX() {
        int trueCount = 1;
        assertEquals(trueCount, count.countXX("abcxx"));
    }
    
    @Test
    public void testXXX() {
        int trueCount = 2;
        assertEquals(trueCount, count.countXX("xxx"));
    }    

    @Test
    public void testXXXX() {
        int trueCount = 3;
        assertEquals(trueCount, count.countXX("xxxx"));
    } 

    @Test
    public void testABCDE() {
        int trueCount = 0;
        assertEquals(trueCount, count.countXX("abcde"));
    } 

    @Test
    public void testEmpty() {
        int trueCount = 0;
        assertEquals(trueCount, count.countXX(""));
    }
    
    @Test
    public void testSpace() {
        int trueCount = 0;
        assertEquals(trueCount, count.countXX(" "));
    }  
    
    @Test
    public void testXXXABCXXXX() {
        int trueCount = 5;
        assertEquals(trueCount, count.countXX("XXXABCXXXX"));
    }  
}
