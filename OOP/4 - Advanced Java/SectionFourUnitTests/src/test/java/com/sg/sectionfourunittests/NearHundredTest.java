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
public class NearHundredTest {
    
    private NearHundred hundred = new NearHundred();
    
    public NearHundredTest() {
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
    public void test103() {
        assertTrue(hundred.nearHundred(103));
    }
    
    @Test
    public void test90(){
        assertTrue(hundred.nearHundred(90));
    }
    
    @Test
    public void test89(){
        assertFalse(hundred.nearHundred(89));
    }
    
    @Test
    public void test190(){
        assertTrue(hundred.nearHundred(190));
    }
    
    @Test
    public void test195(){
        assertTrue(hundred.nearHundred(195));
    }
    
    @Test
    public void test211(){
        assertFalse(hundred.nearHundred(211));
    }
    
    @Test
    public void test209(){
        assertTrue(hundred.nearHundred(209));
    }

    
}
