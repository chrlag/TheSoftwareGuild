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
public class MakeTagsTest {
    
    private MakeTags tags = new MakeTags();
    
    public MakeTagsTest() {
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
    public void testIYay() {
        String correctString = "<i>Yay</i>";
        assertEquals(correctString, tags.makeTags("i", "Yay"));
    }

    @Test
    public void testIHello() {
        String correctString = "<i>Hello</i>";
        assertEquals(correctString, tags.makeTags("i", "Hello"));
    }  
    
    @Test
    public void testCiteYay() {
        String correctString = "<cite>Yay</cite>";
        assertEquals(correctString, tags.makeTags("cite", "Yay"));
    }

    @Test
    public void testBoldYay() {
        String correctString = "<bold>Yay</bold>";
        assertEquals(correctString, tags.makeTags("bold", "Yay"));
    }
}
