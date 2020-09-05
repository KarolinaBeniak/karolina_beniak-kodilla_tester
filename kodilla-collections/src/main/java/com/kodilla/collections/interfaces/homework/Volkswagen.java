package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {

    private int speed;

    public Volkswagen(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = getSpeed() + 15;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = getSpeed() - 5;
    }

    @Override
    public String toString() {
        return "Volkswagen {" +
                "speed =" + speed +
                '}';
    }
}
