package org.example;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat murzik = new Cat("murzik", 10);
        Cat murka = new Cat("murka", 1);
        Cat pufok = new Cat("pufok", 120);
        cats.add(murzik);
        cats.add(murka);
        cats.add(pufok);
        System.out.println(cats.sort((o1, o2) -> char);
        /*System.out.println(CatFactory.createCat("Пушок", 120));
        System.out.println(CatFactory.createCat("BARSIK", 0)); */

        TextTransformer test = new TextTransformer();
       // StreamTransformer stream = new StreamTransformer();
        File file = new File("Cat.txt");
        file.createNewFile();
        //stream.transform("Cat.csv", "Cat.txt");
        //test.transform("Cat.csv", "Cat.txt");
        File file2 = new File("log.txt");
        file.createNewFile();
        Path testPath = Path.of("D:\\Games");
        String path = "D:\\Games";
       // FileAnalyzer test1 = new FileAnalyzer(25, 7);
        //test1.createReport(path,"log.txt");
    }
}


