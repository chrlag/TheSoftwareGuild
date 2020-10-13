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
public class MakePiTest {
    
    private MakePi pi = new MakePi();
    
    public MakePiTest() {
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
    public void test3() {
        int[] truePi = {3, 1, 4};
        assertArrayEquals(truePi, pi.makePi(3));
    }

    @Test
    public void test7() {
        int[] truePi = {3, 1, 4, 1, 5, 9, 2};
        assertArrayEquals(truePi, pi.makePi(7));
    }

    @Test
    public void test0() {
        int[] truePi = {};
        assertArrayEquals(truePi, pi.makePi(0));
    }      
}
