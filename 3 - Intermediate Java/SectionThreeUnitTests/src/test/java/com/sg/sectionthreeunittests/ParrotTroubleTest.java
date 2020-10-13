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
public class ParrotTroubleTest {
    
    private ParrotTrouble trouble = new ParrotTrouble();
    
    public ParrotTroubleTest() {
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
    public void test6True() {
        assertTrue(trouble.parrotTrouble(true, 6));
    }
    
    @Test
    public void test7True() {
        assertFalse(trouble.parrotTrouble(true, 7));
    } 

    @Test
    public void test6False() {
        assertFalse(trouble.parrotTrouble(false, 6));
    } 
    
    @Test
    public void test20False() {
        assertFalse(trouble.parrotTrouble(false, 20));
    }
    
    @Test
    public void test20True() {
        assertTrue(trouble.parrotTrouble(true, 20));
    }
    
    @Test
    public void test23True() {
        assertTrue(trouble.parrotTrouble(true, 23));
    }
}
