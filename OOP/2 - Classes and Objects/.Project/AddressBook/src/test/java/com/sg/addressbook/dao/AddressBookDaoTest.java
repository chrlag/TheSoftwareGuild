/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.util.List;
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
public class AddressBookDaoTest {
    
    private AddressBookDao dao = new AddressBookDaoFileImpl();
    
    public AddressBookDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws Exception{
        List<Address> addressList = dao.getAllAddressses();
        for (Address address : addressList){
            dao.removeAddress(address.getLastName());
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addAddress method, of class AddressBookDao.
     */
    @Test
    public void testAddGetAddress() throws Exception {
        Address address = new Address();
        address.setFirstName("Chris");
        address.setLastName("Laganas");
        address.setStreetAddress("Mikras Asias 45");
        address.setCity("Kavala");
        address.setPostalCode(65404);
        
        dao.addAddress(address);
        
        Address fromDao = dao.getAddress(address.getLastName());
        
        assertEquals(address, fromDao);
           
    }

    /**
     * Test of getAllAddressses method, of class AddressBookDao.
     */
    @Test
    public void testGetAllAddressses() throws Exception {
        Address address1 = new Address();
        address1.setFirstName("Chris");
        address1.setLastName("Laganas");
        address1.setStreetAddress("Mikras Asias 45");
        address1.setCity("Kavala");
        address1.setPostalCode(65404);
        
        dao.addAddress(address1);

        Address address2 = new Address();
        address2.setFirstName("Katerina");
        address2.setLastName("Lagana");
        address2.setStreetAddress("Litochorou 11");
        address2.setCity("Thessaloniki");
        address2.setPostalCode(65423);
        
        dao.addAddress(address2);        
        
        assertEquals(2, dao.getAllAddressses().size());
    }

    /**
     * Test of removeAddress method, of class AddressBookDao.
     */
    @Test
    public void testRemoveAddress() throws Exception {
        Address address1 = new Address();
        address1.setFirstName("Chris");
        address1.setLastName("Laganas");
        address1.setStreetAddress("Mikras Asias 45");
        address1.setCity("Kavala");
        address1.setPostalCode(65404);
        
        dao.addAddress(address1);

        Address address2 = new Address();
        address2.setFirstName("Katerina");
        address2.setLastName("Lagana");
        address2.setStreetAddress("Litochorou 11");
        address2.setCity("Thessaloniki");
        address2.setPostalCode(65423);
        
        dao.addAddress(address2);        
        
        dao.removeAddress(address1.getLastName());
        assertEquals(1, dao.getAllAddressses().size());  
        assertNull(dao.getAddress(address1.getLastName()));
        
        dao.removeAddress(address2.getLastName());
        assertEquals(0, dao.getAllAddressses().size());
        assertNull(dao.getAddress(address2.getLastName()));
    }

    /**
     * Test of countAddress method, of class AddressBookDao.
     */
    @Test
    public void testCountAddress() throws Exception {
        Address address1 = new Address();
        address1.setFirstName("Chris");
        address1.setLastName("Laganas");
        address1.setStreetAddress("Mikras Asias 45");
        address1.setCity("Kavala");
        address1.setPostalCode(65404);
        
        dao.addAddress(address1);

        Address address2 = new Address();
        address2.setFirstName("Katerina");
        address2.setLastName("Lagana");
        address2.setStreetAddress("Litochorou 11");
        address2.setCity("Thessaloniki");
        address2.setPostalCode(65423);
        
        dao.addAddress(address2);        
        
        assertEquals(2, dao.getAllAddressses().size());
    }
    
}
