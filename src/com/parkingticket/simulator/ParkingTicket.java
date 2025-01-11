
/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: ParkingTicket
Description: Represents a parking ticket with its fine, police officer's name and badge number, and parked car's details.
Instance Variables: fine, officerName, officerBadgeNumber, parkedCar
 */

package com.parkingticket.simulator;
public class ParkingTicket {
    private double fine;
    private String officerName;
    private String officerBadgeNumber;
    private ParkedCar parkedCar;

    // Default constructor
    public ParkingTicket() {}

    // Parameterized constructor
    public ParkingTicket(double fine, String officerName, String officerBadgeNumber, ParkedCar parkedCar) {
        this.fine = fine;
        this.officerName = officerName;
        this.officerBadgeNumber = officerBadgeNumber;
        this.parkedCar = parkedCar;
    }

    // Getters and setters
    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerBadgeNumber() {
        return officerBadgeNumber;
    }

    public void setOfficerBadgeNumber(String officerBadgeNumber) {
        this.officerBadgeNumber = officerBadgeNumber;
    }

    public ParkedCar getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(ParkedCar parkedCar) {
        this.parkedCar = parkedCar;
    }

    @Override
    public String toString() {
        return "ParkingTicket{" +
                "fine=" + fine +
                ", officerName='" + officerName + '\'' +
                ", officerBadgeNumber='" + officerBadgeNumber + '\'' +
                ", parkedCar=" + parkedCar +
                '}';
    }
}