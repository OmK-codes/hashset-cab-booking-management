package com.omkcodes.project.services;

import com.omkcodes.project.model.Driver;

import java.util.HashSet;
import java.util.Scanner;

public class DriverService {

    private HashSet<Driver> driverList = new HashSet<>();
    private Scanner sc = new Scanner(System.in);

    void displayDriverDetails(Driver driver) {
        System.out.println(driver);
    }

    public Driver createNewDriver() {
        Driver driver = new Driver();

        System.out.println("Please Enter Driver ID :");
        String driverId = sc.nextLine();

        System.out.println("Enter the Driver Name:");
        String driverName = sc.nextLine();

        System.out.println("Enter the Driver Phone Number:");
        String phone = sc.nextLine();

        System.out.println("Enter the Driver License Number:");
        String licenseNumber = sc.nextLine();

        System.out.println("Enter the Total Trips Completed by Driver:");
        int totalTrips = Integer.parseInt(sc.nextLine());

        System.out.println("Is the Driver Online? (true/false):");
        boolean onlineStatus = Boolean.parseBoolean(sc.nextLine());

        driver.setDriverId(driverId);
        driver.setDriverName(driverName);
        driver.setPhone(phone);
        driver.setLicenseNumber(licenseNumber);
        driver.setTotalTrips(totalTrips);
        driver.setOnlineStatus(onlineStatus);

        return driver;
    }

    public void showAllDrivers() {
        for (Driver driver : driverList) {
            System.out.println("Driver Information: " + driver);
        }
    }

    public HashSet<Driver> getDriverList() {
        return driverList;
    }
}
