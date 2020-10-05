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
public class House3D {
    private double area;
    private int floors;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    private int rooms;
    
    
    public House3D(double area, int floors, int rooms){
        this.area = area;
        this.floors = floors;
        this.rooms = rooms;
    }
    
    public float calculateAreaOfRoom(double x, double y){
        return 3.0f;
    }
    
}
