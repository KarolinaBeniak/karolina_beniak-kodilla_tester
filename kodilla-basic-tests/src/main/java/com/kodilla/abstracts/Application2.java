package com.kodilla.abstracts;

public class Application2 {
    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
