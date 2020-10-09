/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

/**
 *
 * @author Chris
 */
public class AddressBookDaoException extends Exception{
    
    public AddressBookDaoException(String msg){
        super(msg);
    }
    
    public AddressBookDaoException(String msg, Throwable cause){
        super(msg, cause);
    }
    
}
