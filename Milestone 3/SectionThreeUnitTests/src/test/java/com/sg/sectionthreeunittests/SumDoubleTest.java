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
public class SumDoubleTest {
    
    private SumDouble sum = new SumDouble();
    
    public SumDoubleTest() {
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
    public void test12() {
        assertEquals(3, sum.sumDouble(1, 2));
    }
    
    @Test
    public void test32(){
        assertEquals(5, sum.sumDouble(3, 2));
    }
    
    @Test
    public void test22(){
        assertEquals(8, sum.sumDouble(2, 2));
    } 
    
    @Test
    public void test00(){
        assertEquals(0, sum.sumDouble(0, 0));
    }     
}
