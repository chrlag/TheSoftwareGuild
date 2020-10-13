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
public class RotateLeftTest {
    
    private RotateLeft left = new RotateLeft();
    
    public RotateLeftTest() {
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
    public void test123() {
        int[] correctArray = {2, 3, 1};
        int[] inputArray = {1, 2, 3};
        assertArrayEquals(correctArray, left.rotateLeft(inputArray));
    }
    
    @Test
    public void test5119(){
        int[] correctArray = {11, 9, 5};
        int[] inputArray = {5, 11, 9};
        assertArrayEquals(correctArray, left.rotateLeft(inputArray));
    }
    
    @Test
    public void test700(){
        int[] correctArray = {0, 0, 7};
        int[] inputArray = {7, 0, 0};
        assertArrayEquals(correctArray, left.rotateLeft(inputArray));
    }
    
    @Test
    public void test7(){
        int[] correctArray = {7};
        int[] inputArray = {7};
        assertArrayEquals(correctArray, left.rotateLeft(inputArray));
    }
    
}
