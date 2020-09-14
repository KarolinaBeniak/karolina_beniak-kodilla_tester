package com.kodilla.collections.sets.homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Warsaw", 20, true));
        stamps.add(new Stamp("Wroclaw", 10, false));
        stamps.add(new Stamp("Gdansk", 30, true));
        stamps.add(new Stamp("Wroclaw", 10, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
