package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1800);
        operatingSystem.turnOff();

        System2 system2 = new System2(1900);
        system2.turnOn();

        System3 system3 = new System3(2000);
        system3.turnOff();
    }
}