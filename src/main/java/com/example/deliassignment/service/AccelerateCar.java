package com.example.deliassignment.service;

import com.example.deliassignment.entity.Car;

public class AccelerateCar {

    public AccelerateCar() {
    }

    public void accelerate(int percentage, Car car, int iteration) {
        String[] horsePower = car.getEngine().getHorsePower().split("hp");
        double speed = iteration * percentage * ((Float.parseFloat(horsePower[0])) / 100);
        if (speed < 200) {
            System.out.println("Acceleration Step " + iteration + ", Car Name :" + car.getCarName() + " Speed :" + speed);

            accelerate(percentage, car, ++iteration);
        }
    }
}
