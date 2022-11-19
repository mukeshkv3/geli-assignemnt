package com.example.deliassignment.entity;

public class Convertible extends Car {

    private boolean roofClosed = false;

    public Convertible(String carName, int noOfSeats, String speed, String productionNumber, String horsePower, String milesPerGallon, boolean convertible) {
        super(carName, noOfSeats, speed, productionNumber, horsePower, milesPerGallon, convertible);
        roofClosed = true;
    }

    public boolean isRoofClosed() {
        return roofClosed;
    }

    public void setRoofClosed(boolean roofClosed) {
        this.roofClosed = roofClosed;
    }
}
