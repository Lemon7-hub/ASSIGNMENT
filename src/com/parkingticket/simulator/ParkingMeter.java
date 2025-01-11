/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: ParkingMeter
Description: Represents a parking meter with its purchased parking time.
Instance Variables: purchasedTime (int)
 */

package com.parkingticket.simulator;
public class ParkingMeter {
    private int purchasedTime;

    // Default constructor
    public ParkingMeter() {}

    // Parameterized constructor
    public ParkingMeter(int purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    // Getters and setters
    public int getPurchasedTime() {
        return purchasedTime;
    }

    public void setPurchasedTime(int purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    @Override
    public String toString() {
        return "ParkingMeter{" +
                "purchasedTime=" + purchasedTime +
                '}';
    }
}