package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

public class CarUtils {
        public static void describeCar(Car car){
            System.out.println("-------------");
            System.out.println("Car: " + getCarName(car));
            System.out.println("Speed: " + car.getSpeed());
        }
        private static String getCarName(Car car){
            if(car instanceof Opel)
                return "Opel";
            else if (car instanceof Volkswagen)
                return "Volkswagen";
            else if (car instanceof Audi)
                return "Audi";
            else
                return "Unknow Car name";
        }
    }

