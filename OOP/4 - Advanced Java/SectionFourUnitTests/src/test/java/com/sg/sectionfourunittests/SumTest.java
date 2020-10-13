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
public class SumTest {

    private Sum sumArray = new Sum();
    
    public SumTest() {
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
    public void testSum1() {
        int[] numbers = {1, 2, 3};
        assertEquals(6, sumArray.sum(numbers));
    }
    
    @Test
    public void testSum2() {
        int[] numbers = {5, 11, 2};
        assertEquals(18, sumArray.sum(numbers));
    }
    
    @Test
    public void testSum3() {
        int[] numbers = {7, 0, 0};
        assertEquals(7, sumArray.sum(numbers));
    }
    
    @Test
    public void testSum4() {
        int[] numbers = {};
        assertEquals(0, sumArray.sum(numbers));
    }
    
    @Test
    public void testSum5() {
        int[] numbers = {0};
        assertEquals(0, sumArray.sum(numbers));
    }
}
