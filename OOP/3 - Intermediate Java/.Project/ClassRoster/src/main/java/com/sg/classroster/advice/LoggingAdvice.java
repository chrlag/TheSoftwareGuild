/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.advice;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterPersistanceException;
import org.aspectj.lang.JoinPoint;

/**
 *
 * @author Chris
 */
public class LoggingAdvice {
    
    private ClassRosterAuditDao auditDao;
    
    private LoggingAdvice(ClassRosterAuditDao auditDao){
        this.auditDao = auditDao;
    }
    
    public void createAuditEntry(JoinPoint jp){
        Object[] args = jp.getArgs();
        String auditEntry = jp.getSignature().getName() + ": ";
        for (Object arg : args){
            auditEntry += arg;
        }
        try{
            auditDao.writeAuditEntry(auditEntry);
        } catch (ClassRosterPersistanceException e){
            System.err.println("ERROR: Could not create audit entry in LoggingAdvice");
        }
    }
}
