/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterDao;
import com.sg.classroster.dao.ClassRosterPersistanceException;
import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Chris
 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer{
    
    ClassRosterDao dao;
    private ClassRosterAuditDao auditDao;
    
    public ClassRosterServiceLayerImpl(ClassRosterDao dao, ClassRosterAuditDao auditDao){
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public void createStudent(Student student) throws 
            ClassRosterDuplicateIdException, 
            ClassRosterDataValidationException, 
            ClassRosterPersistanceException {
        
        if (dao.getStudent(student.getStudentId()) != null){
            throw new ClassRosterDuplicateIdException(
            "Error: Could not create Student. Student ID " + student.getStudentId()
            + " already exists");
        }
        
        validateStudentData(student);
        
        dao.addStudent(student.getStudentId(), student);
        
        auditDao.writeAuditEntry("Student " + student.getStudentId() + " CREATED");
        
      
    }

    @Override
    public List<Student> getAllStudents() throws 
            ClassRosterPersistanceException {
        
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws 
            ClassRosterPersistanceException {
        
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws 
            ClassRosterPersistanceException {
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED");
        return dao.removeStudent(studentId);
    }
    
    private void validateStudentData(Student student) throws
            ClassRosterDataValidationException{
        
        if(student.getFirstName() == null
                || student.getFirstName().trim().length() == 0
                || student.getLastName() == null
                || student.getLastName().trim().length() == 0
                || student.getCohort() == null
                || student.getCohort().trim().length() == 0){
            throw new ClassRosterDataValidationException("Error: ALL FIELDS REQUIRED");
        }
    }
    
}