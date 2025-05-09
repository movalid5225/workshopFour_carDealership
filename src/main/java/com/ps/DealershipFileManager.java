package com.ps;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {
    public static void getDealership(){
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("inventory.txt"));
            String[] dealershipList = buffReader.readLine().split("\\|");

            String dealershipName = dealershipList[0];
            String dealershipAddress = dealershipList[1];
            String dealershipPhoneNumber = dealershipList[2];

            Dealership dealership = new Dealership(dealershipAddress, dealershipName, dealershipPhoneNumber);
            String input;
            while((input=buffReader.readLine()) != null){
                Vehicle vehicle = getVehicle(input);
                dealership.addVehicle(vehicle);
            }


        }
        catch(Exception e){
            System.out.println("FILE NOT READ");
        }
    }

    //helper
    public static Vehicle getVehicle(String input) {
        String[] vehicleList = input.split("\\|");
        int vin = Integer.parseInt(vehicleList[0]);
        int year = Integer.parseInt(vehicleList[1]);
        String make = vehicleList[2];
        String model = vehicleList[3];
        String vehicleType = vehicleList[4];
        String color = vehicleList[5];
        int odometer = Integer.parseInt(vehicleList[6]);
        double price = Double.parseDouble(vehicleList[7]);

        return new Vehicle(color, year, vin, price, vehicleType, odometer, make, model);
    }

    public static void saveDealership(){

    }


}
