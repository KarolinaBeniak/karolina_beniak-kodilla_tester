package com.kodilla.inheritance.homework;

public class System3 extends OperatingSystem{
    public System3(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Turn on System3");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Turn off System3");
    }
}
