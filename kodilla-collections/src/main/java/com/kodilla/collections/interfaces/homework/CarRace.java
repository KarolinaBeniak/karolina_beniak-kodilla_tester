package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(0);
        System.out.println("Opel");
        doRace(opel);

        Volkswagen volkswagen = new Volkswagen(0);
        System.out.println("Volkswagen");
        doRace(volkswagen);

        Audi audi = new Audi(0);
        System.out.println("Audi");
        doRace(audi);
        }

    private static void doRace(Car car){
        for (int i =  0 ; i < 3 ; i ++){
            car.increaseSpeed();
        }
        for (int i =  0 ; i < 2 ; i ++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
