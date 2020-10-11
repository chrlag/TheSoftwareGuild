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
public class SameFirstLastTest {
    
    private SameFirstLast table = new SameFirstLast();
            
    public SameFirstLastTest() {
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
    public void test4True() {
        int[] testTable = {1, 2, 3, 1};
        assertTrue(table.sameFirstLast(testTable));
    }
    
    @Test
    public void test3True() {
        int[] testTable = {1, 2, 1};
        assertTrue(table.sameFirstLast(testTable));
    }
    
    @Test
    public void test3False() {
        int[] testTable = {1, 2, 3};
        assertFalse(table.sameFirstLast(testTable));
    } 
    
    @Test
    public void test0False() {
        int[] testTable = {};
        assertFalse(table.sameFirstLast(testTable));
    } 
    
    @Test
    public void test1True() {
        int[] testTable = {1};
        assertTrue(table.sameFirstLast(testTable));
    } 
    
    @Test
    public void test2True() {
        int[] testTable = {1, 1};
        assertTrue(table.sameFirstLast(testTable));
    } 
    
    @Test
    public void test2False() {
        int[] testTable = {1, 2};
        assertFalse(table.sameFirstLast(testTable));
    } 
}
