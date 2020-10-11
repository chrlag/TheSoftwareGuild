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
public class PlayOutsideTest {
    
    private PlayOutside play = new PlayOutside();
    
    public PlayOutsideTest() {
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
    public void test70False() {
        assertTrue(play.playOutside(70, false));    
    }

    @Test
    public void test95False() {
        assertFalse(play.playOutside(95, false));    
    } 
    
    @Test
    public void test95True() {
        assertTrue(play.playOutside(95, true));    
    }    
    
    @Test
    public void test60False() {
        assertTrue(play.playOutside(60, false));    
    }
    
    @Test
    public void test60True() {
        assertTrue(play.playOutside(60, true));    
    }

    @Test
    public void test91True() {
        assertTrue(play.playOutside(91, true));    
    }

    @Test
    public void test91False() {
        assertFalse(play.playOutside(91, false));    
    }
    
    @Test
    public void test100False() {
        assertFalse(play.playOutside(100, false));    
    }  
    
    @Test
    public void test100True() {
        assertTrue(play.playOutside(100, true));    
    }
}
