package com.kodilla.optional.homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karolina", new Teacher("Nowak")));
        students.add(new Student("Anna", new Teacher("Nowak")));
        students.add(new Student("Tomek", null));
        students.add(new Student("Piotrek", new Teacher("Nowak")));

        for (Student student :students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + " Teacher: " + teacherName.getName());

        }
    }
}
