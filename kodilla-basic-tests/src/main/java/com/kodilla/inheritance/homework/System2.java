package com.kodilla.inheritance.homework;

public class System2 extends OperatingSystem{

    public System2(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Turn on System2");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Turn off System2");
    }
}
