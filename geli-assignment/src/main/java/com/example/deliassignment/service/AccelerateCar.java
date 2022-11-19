package com.example.deliassignment.service;

import com.example.deliassignment.entity.Car;
import org.springframework.stereotype.Service;

@Service
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

    public static void main(String[] args) {
        Car prius = new Car("Prius", 3, "", "PR001", "121hp", "53MPG", false);
        Car boxter = new Car("Porsche Boxster", 2, "", "BOX001", "256hp", "32MPG", true);

        AccelerateCar accelerateCar = new AccelerateCar();
        accelerateCar.accelerate(20, prius,1);
        System.out.println("---------------------------------");
        accelerateCar.accelerate(20, boxter, 1);
    }
}
