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
public class EveryOtherTest {
    
    private EveryOther other = new EveryOther();
    
    public EveryOtherTest() {
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
        assertEquals("Hlo", other.everyOther("Hello"));
    }
    
    @Test
    public void testHi(){
        assertEquals("H", other.everyOther("Hi"));
    }
    
    @Test
    public void testHeeololeo(){
        assertEquals("Hello", other.everyOther("Heeololeo"));
    }
    
    @Test
    public void testEmpty(){
        assertEquals("", other.everyOther(""));
    }
    
    @Test
    public void testNull(){
        assertNull(other.everyOther(null));
    }
    
}
