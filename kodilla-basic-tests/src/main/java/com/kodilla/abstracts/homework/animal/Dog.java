package com.kodilla.abstracts.homework.animal;

import com.kodilla.abstracts.homework.animal.Animal;

public class Dog extends Animal {
    public Dog(){
        super(4);
    }
    @Override
    public void giveVoice() {
        System.out.println("Hau hau");

    }
}
