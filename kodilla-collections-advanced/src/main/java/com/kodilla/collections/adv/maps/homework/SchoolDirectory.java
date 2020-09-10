package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal adam = new Principal("Adam", " Brown");
        Principal tom = new Principal("Tom", " Schmitd");
        Principal viktor = new Principal("Viktor", " Adams");

        School adamSchools = new School("High School", 30, 40, 51, 24);
        School tomSchools = new School("Technical institute", 15, 22, 22, 19);
        School viktorSchools = new School("Pirmary School", 20, 40, 21, 24);

        school.put(adam, adamSchools);
        school.put(tom, tomSchools);
        school.put(viktor, viktorSchools);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstName() + "" + principalEntry.getKey().getLastName() +
                    " has " + principalEntry.getValue().getSumStudent() + " students in the " + principalEntry.getValue().getName());
        }
    }
}
