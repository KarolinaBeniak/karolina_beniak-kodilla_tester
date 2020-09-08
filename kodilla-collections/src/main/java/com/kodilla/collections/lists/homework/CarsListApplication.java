package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Opel opel = new Opel(50);
        cars.add(opel);
        cars.add(new Volkswagen(100));
        cars.add(new Audi(30));

        cars.remove(2);
        cars.remove(opel);

        System.out.println(cars.size());
        for (Car car: cars){
            CarUtils.describeCar(car);
        }
    }
}
