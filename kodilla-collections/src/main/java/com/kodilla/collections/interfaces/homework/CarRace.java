package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Opel opel = new Opel(50);
        doRace(opel);

        Volkswagen volkswagen = new Volkswagen(60);
        doRace(volkswagen);

        Audi audi = new Audi(70);
        doRace(audi);
        }

    private static void doRace(Car car){
        for (int i = 0; i < 3; i++) {
            System.out.println(car.getClass().getSimpleName() + " increase speed: " + car.increaseSpeed());
        }
        for (int i = 0; i <2; i++) {
            System.out.println(car.getClass().getSimpleName() + " decrease speed: " + car.decreaseSpeed());
        }
        System.out.println("Start speed: " +car.getSpeed());
    }
}
