package org.example;

import java.util.ArrayList;

public class StackKitchen<T> implements AnimalKitchen<T> {
    private int index = 0;
    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(T name) {
        animals.add(name);
    }

    @Override
    public void feed() {
        animals.remove(animals.size()-index);
        index++;
    }

    //LIFO
}
