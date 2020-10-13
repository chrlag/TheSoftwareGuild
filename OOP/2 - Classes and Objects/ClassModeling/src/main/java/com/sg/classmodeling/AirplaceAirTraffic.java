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
public class AirplaceAirTraffic {
    
    private String model;
    private float altidute;
    private String longitude;

    public AirplaceAirTraffic(String model, String longitude, String latidude) {
        this.model = model;
        this.altidute = 0;
        this.longitude = longitude;
        this.latidude = latidude;
        this.alarm = 0;
    }
    private String latidude;
    private int alarm;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getAltidute() {
        return altidute;
    }

    public void setAltidute(float altidute) {
        this.altidute = altidute;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatidude() {
        return latidude;
    }

    public void setLatidude(String latidude) {
        this.latidude = latidude;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }
    
    public int alarming(int alarm){
        return 1;
    }
   
    
    
}
