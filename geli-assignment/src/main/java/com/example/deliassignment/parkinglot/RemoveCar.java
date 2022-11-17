package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;

public class RemoveCar {

    public static void main(String[] args) {
        Parking parking = new Parking(1);

        Car prius =  new Car("prius",3,"","","","",false);
        Car boxter =  new Car("boxter",3,"","","","",false);

        parking.parkCar(prius);
        parking.removeCar(prius);
        parking.parkCar(boxter);
    }
}
