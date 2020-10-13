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
public class MultipleEndingsTest {
    
    private MultipleEndings multiple = new MultipleEndings();
    
    public MultipleEndingsTest() {
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
    public void testHello() {
        assertEquals("lololo", multiple.multipleEndings("Hello"));
    }
    
    @Test
    public void testAb(){
        assertEquals("ababab", multiple.multipleEndings("ab"));
    }
    
    @Test
    public void testHi(){
        assertEquals("HiHiHi", multiple.multipleEndings("Hi"));
    }
    
}
