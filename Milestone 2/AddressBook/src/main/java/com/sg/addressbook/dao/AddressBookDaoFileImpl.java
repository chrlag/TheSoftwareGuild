/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class AddressBookDaoFileImpl implements AddressBookDao{
    
    private Map<String, Address> addresses = new HashMap<>();
    private final static String ADDRESS_FILE = "address.txt";
    private final static String DELIMITER = "::";

    @Override
    public Address addAddress(Address address) throws AddressBookDaoException{
        Address newAddress= addresses.put(address.getLastName(), address);
        writeAddress();
        return newAddress;
    }

    @Override
    public List<Address> getAllAddressses() throws AddressBookDaoException{
        readAddress();
        return new ArrayList<Address>(addresses.values());
    }

    @Override
    public Address removeAddress(String lastName) throws AddressBookDaoException{
        Address removedAddress = addresses.remove(lastName);
        writeAddress();
        return removedAddress;
    }

    @Override
    public Address getAddress(String lastName) throws AddressBookDaoException{
        Address address = addresses.get(lastName);
        readAddress();
        return address;
    }
    
    @Override
    public int countAddress(List<Address> addressList) throws AddressBookDaoException{
        return addressList.size();
    }
    
    private void readAddress() throws AddressBookDaoException{
        Scanner scanner;
        
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(ADDRESS_FILE)));
        } catch (FileNotFoundException e){
            throw new AddressBookDaoException("Could not load address data", e);
        }
        
        String currentLine;
        String[] currentTokens;
        
        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Address currentAddress = new Address();
            currentAddress.setFirstName(currentTokens[0]);
            currentAddress.setLastName(currentTokens[1]);
            currentAddress.setStreetAddress(currentTokens[2]);
            currentAddress.setCity(currentTokens[3]);
            currentAddress.setPostalCode(Integer.parseInt(currentTokens[4]));
            
            addresses.put(currentAddress.getLastName(), currentAddress);
        }
        
        scanner.close();
    }
    
    private void writeAddress() throws AddressBookDaoException{
        PrintWriter out;
        
        try{
            out = new PrintWriter(new FileWriter(ADDRESS_FILE));
        } catch(IOException e){
            throw new AddressBookDaoException("Could not save file into memory", e);
        }
        
        List<Address> addressList = this.getAllAddressses();
        for (Address currentAddress : addressList){
            out.println(currentAddress.getFirstName() + DELIMITER
            + currentAddress.getLastName() + DELIMITER
            + currentAddress.getStreetAddress() + DELIMITER
            + currentAddress.getCity() + DELIMITER
            + currentAddress.getPostalCode());
            
            out.flush();
        }
        out.close();
    }
    
}
