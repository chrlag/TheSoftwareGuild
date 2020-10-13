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
public class FirstLast6Test {
    
    private FirstLast6 six = new FirstLast6();
    
    public FirstLast6Test() {
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
    public void testLast6True() {
        int[] testTable = {1, 2, 6};
        assertTrue(six.firstLast6(testTable));
    }
    
    @Test
    public void testFirst6True() {
        int[] testTable = {6, 1, 2, 3};
        assertTrue(six.firstLast6(testTable));
    }

    @Test
    public void testTable5False() {
        int[] testTable = {13, 6, 1, 2, 3};
        assertFalse(six.firstLast6(testTable));
    }
    
    @Test
    public void testFirstLast6True() {
        int[] testTable = {6, 1, 2, 3, 6};
        assertTrue(six.firstLast6(testTable));
    }
    
    @Test
    public void test6True() {
        int[] testTable = {6};
        assertTrue(six.firstLast6(testTable));
    }       
}
