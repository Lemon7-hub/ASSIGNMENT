
/*
Name: IRATUZI Philemon
RegNumber: 18746/2021
Class: PoliceOfficer
Description: Represents a police officer with their name and badge number.
Instance Variables: name, badgeNumber
 */

package com.parkingticket.simulator;
public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    // Default constructor
    public PoliceOfficer() {}

    // Parameterized constructor
    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    @Override
    public String toString() {
        return "PoliceOfficer{" +
                "name='" + name + '\'' +
                ", badgeNumber='" + badgeNumber + '\'' +
                '}';
    }
}