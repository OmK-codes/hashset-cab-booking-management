package com.omkcodes.project.services;

import com.omkcodes.project.model.Vehicle;

import java.util.HashSet;
import java.util.Scanner;

public class VehicleService {

    private HashSet<Vehicle> vehicleList = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void displayVehicleDetails(Vehicle vehicle) {
        System.out.println(vehicle);
    }

    public Vehicle createNewVehicle() {
        Vehicle vehicle = new Vehicle();

        System.out.println("Please Enter Vehicle ID :");
        String vehicleId = sc.nextLine();

        System.out.println("Enter the Vehicle Model:");
        String vehicleModel = sc.nextLine();

        System.out.println("Enter the Vehicle Registration Number:");
        String registrationNumber = sc.nextLine();

        System.out.println("Enter the Vehicle Color:");
        String vehicleColor = sc.nextLine();

        System.out.println("Is the vehicle available? (true/false):");
        boolean availability = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Enter the Vehicle Seat Capacity:");
        int seatCapacity = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the Vehicle's Per KM Rate:");
        double perKmRate = Double.parseDouble(sc.nextLine());

        vehicle.setVehicleId(vehicleId);
        vehicle.setModel(vehicleModel);
        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setColor(vehicleColor);
        vehicle.setAvailable(availability);
        vehicle.setSeatCapacity(seatCapacity);
        vehicle.setPerKmRate(perKmRate);

        return vehicle;
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Vehicle Information: " + vehicle);
        }
    }

    public HashSet<Vehicle> getVehicleList() {
        return vehicleList;
    }

    }
