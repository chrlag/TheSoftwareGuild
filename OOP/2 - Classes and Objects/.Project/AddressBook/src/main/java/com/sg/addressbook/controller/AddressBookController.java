/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.controller;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoException;
import com.sg.addressbook.dto.Address;
import com.sg.addressbook.ui.AddressBookView;
import java.util.List;

/**
 *
 * @author Chris
 */
public class AddressBookController {
    
    AddressBookView view;
    AddressBookDao dao;
    
    public AddressBookController(AddressBookDao dao, AddressBookView view){
        this.dao = dao;
        this.view = view;
    }
    
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try{
            while(keepGoing){
                menuSelection = view.viewMenuAndGetSelection();
                
                switch (menuSelection){
                    case 1:
                        addAddress();
                        break;
                    case 2:
                        editAddress();
                        break;
                    case 3:
                        removeAddress();
                        break;
                    case 4:
                        countAddresses();
                        break;
                    case 5:
                        listAddress();
                        break;
                    case 6:
                        getAddress();
                        break;
                    case 7:
                        keepGoing = false;
                        break;
                    default:
                        unknownMessage();
                }
            exitMessage();
               
            }
        } catch (AddressBookDaoException e){
                view.displayErrorMessage(e.getMessage());
           }
            
        
    }
    
    public void addAddress() throws AddressBookDaoException{
        view.displayAddAddress();
        Address address = view.getAddressInfo();
        dao.addAddress(address);
        view.displaySuccessfullAddAddress();   
    }
    
    public void listAddress() throws AddressBookDaoException{
        view.displayAllAddressesBanner();
        List<Address> addressList = dao.getAllAddressses();
        view.displayAddressList(addressList);
    }
    
    public void countAddresses() throws AddressBookDaoException{
        view.displayCountAddressBanner();
        int countAddress = dao.countAddress(dao.getAllAddressses());
        view.displayCountAddress(countAddress);
    }
    
    public void getAddress() throws AddressBookDaoException{
        view.displayGetAddressBanner();
        String lastName = view.getLastNameOfAddress();
        Address address = dao.getAddress(lastName);
        view.viewAddress(address);
    }
    
    public void removeAddress() throws AddressBookDaoException{
        view.displayRemoveAddressBanner();
        String lastName = view.getLastNameOfAddress();
        Address removedAddress = dao.removeAddress(lastName);
        view.viewAddress(removedAddress);
    }
    
    public void editAddress() throws AddressBookDaoException{
        view.displayEditedAddress();
        String lastName = view.getLastNameOfAddress();       
        Address address = dao.getAddress(lastName);
        view.viewAddress(address);

        Address editedAddress = view.getEditedAddressInfo(address);
        dao.addAddress(editedAddress);
        view.viewAddress(editedAddress);  
    }
    
    private void exitMessage(){
        view.displayEndingMessage();
    }
    
    private void unknownMessage(){
        view.displayUnknownMessage();
    }
    
    
    
}
