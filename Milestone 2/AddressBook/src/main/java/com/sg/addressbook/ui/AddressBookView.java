/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.ui;

import com.sg.addressbook.dto.Address;
import java.util.List;

/**
 *
 * @author Chris
 */
public class AddressBookView {
    UserIO io;
    
    public AddressBookView(UserIO io){
        this.io = io;
    }
    
    public int viewMenuAndGetSelection(){
        io.print("1. Add an Address");
        io.print("2. Edit an Address");
        io.print("3. Remove an Address");
        io.print("4. See the number of Addresses");
        io.print("5. List all Addresses");
        io.print("6. Search an Address");
        io.print("7. Exit");
        
        return io.readInt("Please type a number from the above", 1, 7);
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
    public void displayEndingMessage(){
        io.print("Good Bye!!!");
    }
    
    public void displayUnknownMessage(){
        io.print("Unknown Command");
    }
    
    public void displayAddAddress(){
        io.print("=== Adding Address ===");
    }
    
    public Address getAddressInfo(){
        String firstName = io.readString("Enter the first name");
        String lastName = io.readString("Enter the last name");
        String streetAddress = io.readString("Enter the address");
        String city = io.readString("Enter the city name");
        int postalCode = io.readInt("Enter the postal code");
        
        Address newAddress = new Address();
        newAddress.setFirstName(firstName);
        newAddress.setLastName(lastName);
        newAddress.setCity(city);
        newAddress.setStreetAddress(streetAddress);
        newAddress.setPostalCode(postalCode);      
        
        return newAddress;
    }
    
    public void displaySuccessfullAddAddress(){
        io.readString("Successfully added! Press enter to continue");
    }
    
    public void displayAllAddressesBanner(){
        io.print("=== All Addresses ===");
    }
    
    public void displayAddressList(List<Address> addressList){
        for (Address currentAddress : addressList){
            io.print(currentAddress.getFirstName() + " " +
                    currentAddress.getLastName());
            io.print(currentAddress.getStreetAddress());
            io.print(currentAddress.getCity() + ", " + currentAddress.getPostalCode());
        }
        
        io.readString("Press enter to continue");
    }
    
    public void displayCountAddressBanner(){
        io.print("=== Number of Addresses ===");
    }
    public void displayCountAddress(int count){
        io.print("" + count);
        io.readString("Press enter to continue");
    }
    
    public void displayGetAddressBanner(){
        io.print("=== Address ===");
    }
    
    public String getLastNameOfAddress(){
        return io.readString("Please enter the last name.");
    }
    
    public void viewAddress(Address address){
        if (address != null){
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreetAddress());
            io.print(address.getCity() + ", " + address.getPostalCode());
        } else {
            io.print("There is no such address");
        }
        
        io.readString("Press enter to continue.");
    }
    
    public Address getEditedAddressInfo(Address address){
        String streetAddress = io.readString("Enter new street address");
        String city = io.readString("Enter new city");
        int postalCode = io.readInt("Enter new postal code");
        
        Address editAddress = new Address();
        editAddress.setFirstName(address.getFirstName());
        editAddress.setLastName(address.getLastName());
        editAddress.setCity(city);
        editAddress.setPostalCode(postalCode);
        editAddress.setStreetAddress(streetAddress);
        
        return editAddress;
    }
    
    public void displayRemoveAddressBanner(){
        io.print("=== Removed Address ===");
    }
    
    public void displayEditedAddress(){
        io.print("=== Edited Address ===");
    }

}
