package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String address, String name, String phone) {
        this.address = address;
        this.name = name;
        this.phone = phone;

        ArrayList<Vehicle> inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(){

        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(){

        return null;
    }

    public List<Vehicle> getVehiclesByColor(){

        return null;
    }

    public List<Vehicle> getVehiclesByMileage(){

        return null;
    }

    public List<Vehicle> getVehiclesByType(){

        return null;
    }

    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

    }

}
