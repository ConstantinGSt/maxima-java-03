package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return cats.stream().skip(0).limit(cats.size()-1).collect(Collectors.toCollection(ArrayList<Cat>::new));
        //возвращает список котов кроме первого и последнего.
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        return cats.stream().dropWhile(Cat::isAngry).findFirst().get();
//        int i = 0;
//        for(; i < cats.size(); i++){
//            if(!cats.get(i).isAngry()) {
//                break;
//            }
//        } return cats.get(i);
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

    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
        return cats.stream().sorted(Comparator.comparing(Cat::getName)).collect(Collectors.groupingBy(firstChar -> firstChar.getName().substring(0,1)));

        //— возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.
    }
}
