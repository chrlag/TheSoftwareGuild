/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author Chris
 */
public interface AddressBookDao {
    
    Address addAddress (Address address) throws AddressBookDaoException;
    
    List<Address> getAllAddressses() throws AddressBookDaoException;
    
    Address removeAddress (String lastName) throws AddressBookDaoException;
    
    Address getAddress (String lastName) throws AddressBookDaoException;
    
    int countAddress(List<Address> addressList) throws AddressBookDaoException;
    
}
