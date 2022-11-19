package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;

public class ParkCar {

    public static void main(String[] args) {
        Parking parking = new Parking(2);

        Car prius =  new Car("prius",3,"","","","",false);
        Car boxter =  new Car("boxter",3,"","","","",false);
        Car ferrari =  new Car("boxter",3,"","","","",false);

        parking.parkCar(prius);
        parking.parkCar(boxter);
        parking.parkCar(ferrari);

    }
}
