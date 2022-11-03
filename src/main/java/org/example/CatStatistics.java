package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
       return cats.stream().skip(1).limit(cats.size()-2).collect(Collectors.toCollection(ArrayList::new));
       //возвращает список котов кроме первого и последнего.
    }

    public static Cat findFirstNonAngryCat (ArrayList<Cat> cats) {
        return cats.stream().dropWhile(Cat::isAngry).findFirst().get();
        //возвращает первого не-сердитого кота в списке.
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        Stream<Cat> newCat = onlyAngry ? cats.stream().filter(Cat::isAngry) : cats.stream();
        return newCat.map(Cat::getWeight).reduce(Integer::sum).orElse(0);
       /* if(onlyAngry) {
            return cats.stream().filter(Cat::isAngry)
                    .map(Cat::getWeight)
                    .reduce(Integer::sum).orElse(0);
        } else return cats.stream()
                .map(Cat::getWeight)
                .reduce(Integer::sum).orElse(0);*/
       /* int weight = 0;

            for(int j = 0; j < cats.size(); j++) {
                if(cats.get(j).isAngry()) {
                    weight += cats.get(j).getWeight();
                }
            }
        } else {
            for(int i = 0; i < cats.size(); i++) {
                weight += cats.get(i).getWeight();*/
                //возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
    }

    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {
        return cats.stream().sorted(Comparator.comparing(Cat::getName)).collect(Collectors.groupingBy(firstChar -> firstChar.getName().substring(0,1)));
        //— возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.
    }
}
