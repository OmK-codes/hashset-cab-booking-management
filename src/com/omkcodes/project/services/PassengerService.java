package com.omkcodes.project.services;

import com.omkcodes.project.model.Passenger;

import java.util.HashSet;
import java.util.Scanner;

public class PassengerService {

    // Declare an Hashset to hold Passenger objects
    private HashSet<Passenger> passengerList = new HashSet<>();

    // Declare a Scanner object to take user input from the console
    private Scanner is = new Scanner(System.in);

    /**
     * This method prints the details of a single Passenger object.
     * It accepts a Passenger object as an argument and prints it.
     * passenger the Passenger object to be printed.
     */
    void displayPassengerDetails(Passenger passenger) {
        // Print the passenger object (calls toString() method of the Passenger class)
        System.out.println(passenger);
    }

    /**
     * This method is responsible for creating a new Passenger object.
     * It prompts the user to enter the passenger's details such as ID, name, email, phone number, and address.
     * After collecting the inputs, it sets the values to the Passenger object and returns it.
     * the newly created Passenger object.
     */
    public Passenger createNewPassenger() {
        // Create a new Passenger object
        Passenger passenger = new Passenger();

        // Ask for and capture passenger ID (converting the input to an integer)
        System.out.println("Please Enter Passenger ID :");
        int passengerId = Integer.parseInt(is.nextLine());

        // Ask for and capture passenger's full name
        System.out.println("Enter your full Name:");
        String passengerName = is.nextLine();

        // Ask for and capture passenger's email
        System.out.println("Enter your email:");
        String email = is.nextLine();

        // Ask for and capture phone number (converting the input to an integer)
        System.out.println("Enter your Phone Number :");
        int phoneNumber = Integer.parseInt(is.nextLine());

        // Ask for and capture passenger's address
        System.out.println("Enter your Address :");
        String passengerAddress = is.nextLine();

        // Set the values for the Passenger object using setter methods
        passenger.setPassengerId(String.valueOf(passengerId));  // Store passengerId as a String
        passenger.setPassengerName(passengerName);
        passenger.setEmail(email);
        passenger.setPhone(phoneNumber);
        passenger.setAddress(passengerAddress);

        // Return the newly created Passenger object
        return passenger;
    }

    /**
     * This method iterates over the list of passengers and displays their details.
     * It loops through the passengerList and prints each passenger's information.
     */
    public void showAllPassengers() {
        // Iterate through each passenger in the passengerList
        for (Passenger passenger : passengerList) {
            // Print each passenger's information (implicitly calls toString() method of Passenger class)
            System.out.println("Passenger Information: " + passenger);
        }
    }

    public HashSet<Passenger> getPassengerList() {
        return passengerList;
    }
}
