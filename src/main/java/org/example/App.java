package org.example;

import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(CatFactory.createCat("Пушок", 120));
        System.out.println(CatFactory.createCat("BARSIK", 0));

        TextTransformer test = new TextTransformer();
        StreamTransformer stream = new StreamTransformer();
        File file = new File("Cat.txt");
        file.createNewFile();
        stream.transform("Cat.csv", "Cat.txt");
        //test.transform("Cat.csv", "Cat.txt");
    }
}


