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
        int randomCar = random.nextInt(3);
        int randomSpeed = random.nextInt(150)+1;

        if (randomCar == 0)
            return new Opel(randomSpeed);
        else if (randomCar == 1)
            return new Volkswagen(randomSpeed);
        else
            return new Audi(randomSpeed);
    }
}
