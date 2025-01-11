/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: TestParkingTicket
Description: Testing the ParkingTicket
 */

package com.parkingticket.simulator;

import java.util.Scanner;

public class TestParkingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new police officer
        System.out.print("Enter Police Officer's name: ");
        String officerName = scanner.nextLine();
        System.out.print("Enter Police Officer's badge number: ");
        String officerBadgeNumber = scanner.nextLine();
        PoliceOfficer officer = new PoliceOfficer(officerName, officerBadgeNumber);

        // Create a new parked car
        System.out.print("Enter car's make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car's model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter car's color: ");
        String carColor = scanner.nextLine();
        System.out.print("Enter car's license number: ");
        String carLicenseNumber = scanner.nextLine();
        System.out.print("Enter car's parking time (in minutes): ");
        int carParkingTime = scanner.nextInt();
        ParkedCar car = new ParkedCar(carMake, carModel, carColor, carLicenseNumber, carParkingTime);

        // Create a new parking meter
        System.out.print("Enter parking meter's purchased time (in minutes): ");
        int meterPurchasedTime = scanner.nextInt();
        ParkingMeter meter = new ParkingMeter(meterPurchasedTime);

        // Check if the car's time has expired
        if (car.getParkingTime() > meter.getPurchasedTime()) {
            // Issue a parking ticket
            double fine = calculateFine(car.getParkingTime(), meter.getPurchasedTime());
            ParkingTicket ticket = new ParkingTicket(fine, officer.getName(), officer.getBadgeNumber(), car);
            System.out.println("Parking ticket issued:");
            System.out.println(ticket.toString());
        } else {
            System.out.println("Car's time has not expired.");
        }

        // Display test cases in a menu
        System.out.println("\nTest Cases:");
//        // Display test cases
//        System.out.println("Test cases:");
        System.out.println("1. Car is within the parking time purchased");
        System.out.println("2. Car is over the parking time purchased");
        System.out.println("3. Car is just barely within the parking time purchased");
        System.out.println("4. Car is just barely over the parking time purchased");
        System.out.println("5. Car is exactly at the parking time purchased");
        System.out.println("6. Car is ticketed for being less than 1 hour over the time purchased");
        System.out.println("7. Car is ticketed for being more than 1 hour over the time purchased");
        System.out.println("8. Car is ticketed for being exactly 1 hour over the time purchased");

        // Ask for a test case
//        System.out.print("\nEnter a test case (1-8): ");
        // Test cases
        System.out.print("Enter a test case (1-8): ");
        int testCase = scanner.nextInt();

        switch (testCase) {
            case 1:
                // Car is within the parking time purchased
                car.setParkingTime(30);
                meter.setPurchasedTime(30);
                break;
            case 2:
                // Car is over the parking time purchased
                car.setParkingTime(60);
                meter.setPurchasedTime(30);
                break;
            case 3:
                // Car is just barely within the parking time purchased
                car.setParkingTime(29);
                meter.setPurchasedTime(30);
                break;
            case 4:
                // Car is just barely over the parking time purchased
                car.setParkingTime(31);
                meter.setPurchasedTime(30);
                break;
            case 5:
                // Car is exactly at the parking time purchased
                car.setParkingTime(30);
                meter.setPurchasedTime(30);
                break;
            case 6:
                // Car is ticketed for being less than 1 hour over the time purchased
                car.setParkingTime(90);
                meter.setPurchasedTime(30);
                break;
            case 7:
                // Car is ticketed for being more than 1 hour over the time purchased
                car.setParkingTime(120);
                meter.setPurchasedTime(30);
                break;
            case 8:
                // Car is ticketed for being exactly 1 hour over the time purchased
                car.setParkingTime(90);
                meter.setPurchasedTime(30);
                break;
            default:
                System.out.println("Invalid test case.");
                break;
        }

        // Check if the car's time has expired again
        if (car.getParkingTime() > meter.getPurchasedTime()) {
            // Issue a parking ticket
            double fine = calculateFine(car.getParkingTime(), meter.getPurchasedTime());
            ParkingTicket ticket = new ParkingTicket(fine, officer.getName(), officer.getBadgeNumber(), car);
            System.out.println("Parking ticket issued:");
            System.out.println(ticket.toString());
        } else {
            System.out.println("Car's time has not expired.");
        }
    }

    private static double calculateFine(int parkingTime, int purchasedTime) {
        double fine = 25.00;
        int additionalHours = (parkingTime - purchasedTime) / 60;
        if (additionalHours > 0) {
            fine += additionalHours * 10.00;
        }
        return fine;
    }
}