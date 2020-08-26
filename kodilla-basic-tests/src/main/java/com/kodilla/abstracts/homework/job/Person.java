package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public void displayWorker() {
        System.out.println(this.getFirstName() + " is responsible for " + this.job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person cook = new Person("Tomek",26, new Cook(4000,"tasty cooking"));
        cook.displayWorker();
        Person singer = new Person("Ala",30,(new Singer(10000,"isssue albums")));
        singer.displayWorker();
    }
}
