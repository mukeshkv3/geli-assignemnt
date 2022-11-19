package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;
import com.example.deliassignment.exception.CustomException;

public class Parking {

    private int numberOfSlots;

    private ParkingLot[] lots;

    public Parking(int noOfSlots) {
        numberOfSlots = noOfSlots;
        lots = new ParkingLot[noOfSlots];
    }

    public boolean parkCar(Car car) throws CustomException {
        for (int i = 0;i<numberOfSlots;i++) {
            if(lots[i]==null) {
                lots[i] = new ParkingLot(i,car);
                System.out.println("The Car " + car.getCarName() + " is parked at the Slot " + (i+1));
                return true;
            }
        }
        throw new CustomException("PARKING IS FULL, There is no space for the car " + car.getCarName());
    }

    public boolean removeCar(Car car) {
        for (int i = 0;i<numberOfSlots;i++) {
            if(lots[i]!=null && car.getCarName().equals(lots[i].getCar().getCarName())) {
                lots[i]= null;
                System.out.println("The Car " + car.getCarName() + " parked at the Slot " + (i+1) +" has left");
                return true;
            }
        }
        System.err.println("No Car found of name " + car.getCarName());
        return false;
    }

    public void viewDirectory() {
        for (int i = 0;i<numberOfSlots;i++) {
            if(lots[i]!=null) {
                System.out.println(lots[i]);
            }
        }
    }
}
