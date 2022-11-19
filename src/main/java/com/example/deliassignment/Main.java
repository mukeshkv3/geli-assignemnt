package com.example.deliassignment;

import com.example.deliassignment.entity.Car;
import com.example.deliassignment.entity.Convertible;
import com.example.deliassignment.exception.CustomException;
import com.example.deliassignment.parkinglot.Parking;
import com.example.deliassignment.service.AccelerateCar;
import com.example.deliassignment.service.AccessConvertibleRoof;

public class Main {


    public static void main(String[] args) throws CustomException {

        AccessConvertibleRoof accessConvertibleRoof = new AccessConvertibleRoof();

        Parking parking = new Parking(3);

        Car prius = new Car("prius", 5, "", "PR001", "121hp", "53MPG", false);
        Convertible boxter = new Convertible("boxter", 4, "", "BOX001", "265hp", "32MPG.", true);
        Convertible ferrari = new Convertible("ferrari", 2, "", "FR001", "300hp", "25MPG", true);
        Car honda = new Car("honda", 5, "", "HON001", "130hp", "50MPG", false);
        Car baleno = new Car("baleno", 5, "", "BA001", "120hp", "55MPG", false);

        accessConvertibleRoof.openRoof(boxter); //Method that opens the roof of convertible
        accessConvertibleRoof.openRoof(boxter); //Method to show if the roof is already opened

        accessConvertibleRoof.openRoof(ferrari);
        accessConvertibleRoof.closeRoof(ferrari); // Method to close the roof of convertible

        System.out.println("---------------------------------");

        parking.parkCar(prius); //Calls Method to Park the Car
        parking.parkCar(boxter);
        parking.parkCar(ferrari);

        parking.removeCar(prius); //Calls Method to Remove the Car

        parking.parkCar(honda);

        System.out.println("---------------------------------");
        parking.viewDirectory();    //Calls the Method to View the Current Directory of the Parking Lot

        AccelerateCar accelerateCar = new AccelerateCar();

        System.out.println("---------------------------------");
        accelerateCar.accelerate(20, prius, 1);  //Calls the method to accelerate the Car
        System.out.println("---------------------------------");
        accelerateCar.accelerate(20, boxter, 1);

        parking.parkCar(baleno);    //Method to park the Car but throws exception since the lot is full
    }
}
