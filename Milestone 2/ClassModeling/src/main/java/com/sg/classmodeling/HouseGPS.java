/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author Chris
 */
public class HouseGPS {
    private String latitude;
    private String longitude;
    private String address;

    public HouseGPS(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public double calculateDistance(String longitute, String latitude, String myLongidude, String myLatidude){
        
        return 3.0;
    }
    
    public double calculateTime(String longitute, String latitude, String myLongidude, String myLatidude){
        return 3.0;
    }
    
            
}
