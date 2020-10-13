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
public class CanHazTableTest {
    
    private CanHazTable table = new CanHazTable();
    
    public CanHazTableTest() {
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
    public void test510Yes() {
        assertEquals(2, table.canHazTable(5, 10));
    }
    
    @Test
    public void test52No(){
        assertEquals(0, table.canHazTable(5, 2));
    }
    
    @Test
    public void test55Maybe(){
        assertEquals(1, table.canHazTable(5, 5));
    }
    
    @Test
    public void test88Yes(){
        assertEquals(2, table.canHazTable(8,8));
    } 
    
    @Test
    public void test22No(){
        assertEquals(0, table.canHazTable(2,2));
    }    
    
    @Test
    public void test82No(){
        assertEquals(0, table.canHazTable(8,2));
    }        
}
