/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: ParkedCar
Description:Represents a parked car with its make, model, color, license number, and parking time.
Instance Variables: make, model, color, licenseNumber, parkingTime
 */

package com.parkingticket.simulator;

import java.util.Objects;
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int parkingTime;

    // Default constructor
    public ParkedCar() {}

    // Parameterized constructor
    public ParkedCar(String make, String model, String color, String licenseNumber, int parkingTime) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.parkingTime = parkingTime;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }

    @Override
    public String toString() {
        return "ParkedCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", parkingTime=" + parkingTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkedCar parkedCar = (ParkedCar) o;
        return parkingTime == parkedCar.parkingTime &&
                Objects.equals(make, parkedCar.make) &&
                Objects.equals(model, parkedCar.model) &&
                Objects.equals(color, parkedCar.color) &&
                Objects.equals(licenseNumber, parkedCar.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, color, licenseNumber, parkingTime);
    }
}