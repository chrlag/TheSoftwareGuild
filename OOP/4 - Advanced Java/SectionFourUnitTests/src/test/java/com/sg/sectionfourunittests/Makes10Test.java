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
public class Makes10Test {
    
    private Makes10 ten = new Makes10();
    
    public Makes10Test() {
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
    public void test910() {
        assertTrue(ten.makes10(9, 10));
    }
    
    @Test
    public void test99(){
        assertFalse(ten.makes10(9, 9));
    }
    
    @Test
    public void test19(){
        assertTrue(ten.makes10(1, 9));
    }
    
    @Test
    public void test11Minus1(){
        assertTrue(ten.makes10(11, -1));
    }
    
}
