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
public class CommonEndTest {
    
    private CommonEnd common = new CommonEnd();
    
    public CommonEndTest() {
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
    public void testSameFirst() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 3};
        
        assertTrue(common.commonEnd(array1, array2));
    }
    
    @Test
    public void testSameLast(){
        int[] array1 = {2, 3, 5};
        int[] array2 = {1, 2, 4, 5};
        assertTrue(common.commonEnd(array1, array2));
    }
    
    @Test
    public void testOneElement(){
        int[] array1 = {1};
        int[] array2 = {2, 3, 5, 1};
        assertTrue(common.commonEnd(array1, array2));
    }
    
    @Test
    public void testOneElementBoth(){
        int[] array1 = {1};
        int[] array2 = {1};
        assertTrue(common.commonEnd(array1, array2));
    }
    
    @Test
    public void testFalse(){
        int[] array1 = {2, 3, 5};
        int[] array2 = {1, 2, 3};
        assertFalse(common.commonEnd(array1, array2));
    }
    
    
}
