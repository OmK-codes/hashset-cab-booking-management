import com.omkcodes.project.model.Booking;
import com.omkcodes.project.model.Driver;
import com.omkcodes.project.model.Passenger;
import com.omkcodes.project.model.Vehicle;
import com.omkcodes.project.services.BookingService;
import com.omkcodes.project.services.DriverService;
import com.omkcodes.project.services.PassengerService;
import com.omkcodes.project.services.VehicleService;

import java.util.Scanner;

public class CabBookingManagement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        // Created service
        DriverService driverService = new DriverService();
        PassengerService passengerService = new PassengerService();
        VehicleService vehicleService = new VehicleService();
        BookingService bookingService = new BookingService();

        do {
            System.out.println("\n--- Cab Booking Management System ---");
            System.out.println("1. Create Passenger");
            System.out.println("2. Create Driver");
            System.out.println("3. Create Vehicle");
            System.out.println("4. Create Booking");
            System.out.println("5. Show All Passengers");
            System.out.println("6. Show All Drivers");
            System.out.println("7. Show All Vehicles");
            System.out.println("8. Show All Bookings");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    // Create and add a new Passenger
                    Passenger passenger = passengerService.createNewPassenger();
                    passengerService.getPassengerList().add(passenger);
                    System.out.println("Passenger created: " + passenger);
                    break;

                case 2:
                    // Create and add a new Driver
                    Driver driver = driverService.createNewDriver();
                    driverService.getDriverList().add(driver);
                    System.out.println("Driver created: " + driver);
                    break;

                case 3:
                    // Create and add a new Vehicle
                    Vehicle vehicle = vehicleService.createNewVehicle();
                    vehicleService.getVehicleList().add(vehicle);
                    System.out.println("Vehicle created: " + vehicle);
                    break;

                case 4:
                    // Create and add a new Booking
                    Booking booking = bookingService.createNewBooking();
                    bookingService.getBookingList().add(booking);
                    System.out.println("Booking created: " + booking);
                    break;

                case 5:
                    // Show all Passengers
                    passengerService.showAllPassengers();
                    break;

                case 6:
                    // Show all Drivers
                    driverService.showAllDrivers();
                    break;

                case 7:
                    // Show all Vehicles
                    vehicleService.showAllVehicles();
                    break;

                case 8:
                    // Show all Bookings
                    bookingService.showAllBookings();
                    break;

                case 0:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (option != 0);
        System.out.println("THANK YOU!");
    }
}
