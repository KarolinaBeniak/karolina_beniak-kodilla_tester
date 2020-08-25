package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn(){
        System.out.println("Turn on Operating System");
    }
    public void turnOff(){
        System.out.println("Turn off Operating System");
    }
    public OperatingSystem(int year) {
        this.year = year;
    }
}
