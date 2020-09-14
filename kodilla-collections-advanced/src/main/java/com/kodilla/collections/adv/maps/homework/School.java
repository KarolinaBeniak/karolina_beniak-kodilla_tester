package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> schools = new ArrayList<>();

    public School(String name, int... schools) {
        for (int school : schools) {
            this.schools.add(school);
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Student{" + schools.toString();
    }

    public String getName() {
        return name;
    }

    public int getSumStudent() {
        int sum = 0;
        for (int school : schools)
            sum += school;
        return sum;
    }
}
