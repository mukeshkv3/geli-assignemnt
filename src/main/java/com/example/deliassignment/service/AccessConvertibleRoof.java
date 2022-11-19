package com.example.deliassignment.service;

import com.example.deliassignment.entity.Convertible;
import org.springframework.stereotype.Service;

@Service
public class AccessConvertibleRoof {

    public AccessConvertibleRoof() {
    }

    public void openRoof(Convertible convertible) {
        if (convertible.isConvertible() && convertible.isRoofClosed()) {
            System.out.println("Opening The Roof of the Car " + convertible.getCarName());
            convertible.setRoofClosed(false);
        } else
            System.out.println("Roof of " + convertible.getCarName() + " is already open");
    }

    public void closeRoof(Convertible convertible) {
        if (convertible.isConvertible() && !convertible.isRoofClosed()) {
            System.out.println("Closing The Roof of the Car " + convertible.getCarName());
            convertible.setRoofClosed(true);
        } else
            System.out.println("Roof is " + convertible.getCarName() + " already closed");
    }
}
