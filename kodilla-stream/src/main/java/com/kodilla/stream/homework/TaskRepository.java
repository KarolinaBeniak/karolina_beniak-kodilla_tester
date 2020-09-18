package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("get cat food", LocalDate.of(2020, 9, 19), LocalDate.of(2020, 9, 19)));
        tasks.add(new Task("do homework", LocalDate.of(2020, 9, 19), LocalDate.of(2020, 9, 21)));
        tasks.add(new Task("sending CV", LocalDate.of(2020, 7, 12), LocalDate.of(2020, 12, 12)));
        tasks.add(new Task("lose weight", LocalDate.of(2020, 1, 1), LocalDate.of(2020, 12, 31)));
        return tasks;
    }
}
