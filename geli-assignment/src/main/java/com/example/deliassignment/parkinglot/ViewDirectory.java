package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;

public class ViewDirectory {

    public static void main(String[] args) {
        Parking parking = new Parking(3);

        Car prius =  new Car("prius",3,"","","","",false);
        Car boxter =  new Car("boxter",3,"","","","",false);
        Car ferrari =  new Car("ferrari",3,"","","","",false);
        Car honda =  new Car("honda",3,"","","","",false);


        parking.parkCar(prius);
        parking.parkCar(boxter);
        parking.parkCar(ferrari);
        parking.removeCar(prius);
        parking.parkCar(honda);

        parking.viewDirectory();

    }
}
