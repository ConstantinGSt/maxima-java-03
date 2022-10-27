package org.example;

import java.util.ArrayList;

public class StackKitchen<T> extends WaitingList<T> {
    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void feed() {
        animals.remove(animals.size()-1);
    }

}
