package org.example;

import java.io.*;

public class TextTransformer implements Transformable {
    @Override
    public void transform(String fileIn, String fileOut) {

        String stringReader = "";
        String csvSplitBy = (";");
        String isOreAngry = "";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileIn));
                            FileWriter writer = new FileWriter(fileOut, true)) {
            while((stringReader = reader.readLine()) != null) {
                String[] cats = stringReader.split(csvSplitBy);
                for(int i = 0; i < cats.length; ) {
                    isOreAngry = ("true").equals(cats[i + 2].trim()) ? "Добрый" : "Злой и голодный";
                    writer.write("" + isOreAngry + " Cat " + cats[i].trim() + ", Весом " + cats[i + 1].trim() + "кг" + "\n");
                    i += 3;
                }
            }
        } catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
