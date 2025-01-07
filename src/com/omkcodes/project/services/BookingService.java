package com.omkcodes.project.services;

import com.omkcodes.project.model.Booking;

import java.util.HashSet;
import java.util.Scanner;

public class BookingService {

    private HashSet<Booking> bookingList = new HashSet<>();
    private Scanner is = new Scanner(System.in);

    void displayBookingDetails(Booking booking) {
        System.out.println(booking);
    }

    public Booking createNewBooking() {
        Booking booking = new Booking();

        System.out.println("Please Enter Booking ID :");
        String bookingId = is.nextLine();

        System.out.println("Enter Passenger ID:");
        String passengerId = is.nextLine();

        System.out.println("Enter Passenger Name:");
        String passengerName = is.nextLine();

        System.out.println("Enter Driver ID:");
        String driverId = is.nextLine();

        System.out.println("Enter Driver Name:");
        String driverName = is.nextLine();

        System.out.println("Enter Vehicle ID:");
        String vehicleId = is.nextLine();

        System.out.println("Enter Pickup Location:");
        String pickupLocation = is.nextLine();

        System.out.println("Enter Drop Location:");
        String dropLocation = is.nextLine();

        System.out.println("Enter Fare:");
        double fare = Double.parseDouble(is.nextLine());

        System.out.println("Enter Distance:");
        double distance = Double.parseDouble(is.nextLine());

        booking.setBookingId(bookingId);
        booking.setPassengerId(passengerId);
        booking.setPassengerName(passengerName);
        booking.setDriverId(driverId);
        booking.setDriverName(driverName);
        booking.setVehicleId(vehicleId);
        booking.setPickupLocation(pickupLocation);
        booking.setDropLocation(dropLocation);
        booking.setFare(fare);
        booking.setDistance(distance);

        return booking;
    }

    public void showAllBookings() {
        for (Booking booking : bookingList) {
            System.out.println("Booking Information: " + booking);
        }
    }

    public HashSet<Booking> getBookingList() {
        return bookingList;
    }
}
