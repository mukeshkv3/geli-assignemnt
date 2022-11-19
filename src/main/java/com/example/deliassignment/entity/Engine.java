package com.example.deliassignment.entity;

public class Engine {

    private String horsePower;
    private String milesPerGallon;

    public Engine(String horsePower, String milesPerGallon){
        this.horsePower = horsePower;
        this.milesPerGallon = milesPerGallon;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(String milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
        return "Engine = {" +
                "horsePower='" + horsePower + '\'' +
                ", milesPerGallon='" + milesPerGallon + '\'' +
                '}';
    }
}
