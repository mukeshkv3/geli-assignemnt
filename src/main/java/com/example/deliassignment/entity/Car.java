package com.example.deliassignment.entity;

public class Car {

    private String carName;
    private int noOfSeats;
    private String speed;
    private String productionNumber;
    private Engine engine;
    private boolean convertible;

    public Car(String carName, int noOfSeats, String speed, String productionNumber,String horsePower, String milesPerGallon, boolean convertible) {
        this.carName = carName;
        this.noOfSeats = noOfSeats;
        this.speed = speed;
        this. productionNumber = productionNumber;
        this.engine = new Engine(horsePower, milesPerGallon);
        this.convertible = convertible;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return "{" +
                "carName='" + carName + '\'' +
                ", noOfSeats=" + noOfSeats +
                ", speed='" + speed + '\'' +
                ", productionNumber='" + productionNumber + '\'' +
                "," + engine +
                ", convertible=" + (convertible ? "Yes" : "No") +
                '}';
    }
}
