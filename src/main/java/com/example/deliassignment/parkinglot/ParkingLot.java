package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;

public class ParkingLot {

    private int parkingSlotNumber;
    private Car car;

    public ParkingLot(int parkingSlotNo, Car parkCar)
    {
        this.parkingSlotNumber = parkingSlotNo;
        this.car = parkCar;
    }

    public int getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "ParkingLot {" +
                "Parking Slot Number = " + parkingSlotNumber +
                ", Car Details = " + car +
                '}';
    }
}
