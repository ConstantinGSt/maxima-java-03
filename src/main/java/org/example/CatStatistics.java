package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class CatStatistics {
    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        cats.sort(Comparator.comparing(Cat -> Cat.getName()));
        return cats;
        // возвращает список котов, отсортировав по имени по возрастанию.
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        cats.sort(Comparator.comparing(Cat::getWeight).reversed());
        return cats;
        //возвращает список котов, отсортировав по убыванию веса.
    }

    public static ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) {
        cats.remove(cats.size()-1);
        cats.remove(0);
        return cats;
        //возвращает список котов кроме первого и последнего.
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        int i = 0;
        for(; i < cats.size(); i++){
            if(!cats.get(i).isAngry()) {
                break;
            }
        } return cats.get(i);
        //возвращает первого не-сердитого кота в списке.
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        int weight = 0;
        if(onlyAngry) {
            for(int j = 0; j < cats.size(); j++) {
                if(cats.get(j).isAngry()) {
                    weight += cats.get(j).getWeight();
                }
            }
        } else {
            for(int i = 0; i < cats.size(); i++) {
                weight += cats.get(i).getWeight();
                //возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
            }
        }return weight;
    }

//    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
//        //— возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.
//    }
}
