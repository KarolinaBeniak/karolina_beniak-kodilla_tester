package com.kodilla.collections.arrays.homework;



import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarId = random.nextInt(3);
        Car randomCar;

        if (drawCarId == 0)
            randomCar = new Opel(0);
        else if (drawCarId == 1)
           randomCar = new Volkswagen(0);
        else
            randomCar = new Audi(0);

        for (int i=0; i < random.nextInt(3); i++) {
            randomCar.increaseSpeed();
        }
        return randomCar;
    }
}
