package org.example;

import java.util.ArrayList;

public class WaitingList<T> implements AnimalKitchen<T> {

    private ArrayList animals;

    @Override
    public void add(T name) {
        animals.add(name);
    }

    @Override
    public void feed() {
        animals.remove(0);
    }
}
