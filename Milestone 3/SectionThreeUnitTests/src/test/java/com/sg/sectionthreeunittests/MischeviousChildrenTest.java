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
public class MischeviousChildrenTest {
    
    private MischeviousChildren children = new MischeviousChildren();
    
    public MischeviousChildrenTest() {
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
    
    
    /**
     * Test of greatParty method, of class GreatParty.
     */
    @Test
    public void testASmile(){
        assertTrue(children.areWeInTrouble(true, false));
    }
    
    @Test
    public void testBSmile(){
        assertTrue(children.areWeInTrouble(true, false));
    }
    
    @Test
    public void testAbSmile(){
        assertFalse(children.areWeInTrouble(true, true));
    }
    
    @Test
    public void testNoSmile(){
        assertFalse(children.areWeInTrouble(false, false));
    }
    
}
