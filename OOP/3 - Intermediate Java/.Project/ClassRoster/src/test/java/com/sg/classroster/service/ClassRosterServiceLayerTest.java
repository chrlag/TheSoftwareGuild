/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterAuditDaoStubImpl;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterDaoStubImpl;
import com.sg.classroster.dto.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Chris
 */
public class ClassRosterServiceLayerTest {
    
    private ClassRosterServiceLayer service;
    
    public ClassRosterServiceLayerTest() {
        ClassRosterDao dao = new ClassRosterDaoStubImpl();
        ClassRosterAuditDao  auditDao = new ClassRosterAuditDaoStubImpl();
        service = new ClassRosterServiceLayerImpl(dao, auditDao);
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
     * Test of createStudent method, of class ClassRosterServiceLayer.
     */
    @Test
    public void testCreateStudent() throws Exception {
        Student student = new Student("0002");
        student.setFirstName("Sally");
        student.setLastName("Smith");
        student.setCohort("Java-Jan-2015");
        
        service.createStudent(student);
    }
    
    @Test
    public void testCreateStudentDuplicateId() throws Exception{
        Student student = new Student("0001");
        student.setFirstName("Sally");
        student.setLastName("Smith");
        student.setCohort("Java-Jan-2015");
        
        try{
            service.createStudent(student);
            fail("Expected ClassRosterDuplicateIdException to be thrown");
        } catch (ClassRosterDuplicateIdException e){
            return;
        }
    }
    
    @Test
    public void testCreateStudentInvalidData() throws Exception{
        Student student = new Student("0003");
        student.setFirstName("");
        student.setLastName("Smith");
        student.setCohort("Java-Jan-2015");
        
        try{
            service.createStudent(student);
            fail("Expected ClassRosterDataValidationException to be thrown");
        } catch (ClassRosterDataValidationException e){
            return;
        }
    }

    /**
     * Test of getAllStudents method, of class ClassRosterServiceLayer.
     */
    @Test
    public void testGetAllStudents() throws Exception {
        assertEquals(1, service.getAllStudents().size());
    }

    /**
     * Test of getStudent method, of class ClassRosterServiceLayer.
     */
    @Test
    public void testGetStudent() throws Exception {
        Student student = service.getStudent("0001");
        assertNotNull(student);
        
        student = service.getStudent("9999");
        assertNull(student);
    }

    /**
     * Test of removeStudent method, of class ClassRosterServiceLayer.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        Student student = service.removeStudent("0001");
        assertNotNull(student);
        
        student = service.removeStudent("9999");
        assertNull(student);
    }
    
}