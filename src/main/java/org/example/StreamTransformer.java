package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StreamTransformer implements Transformable {

    @Override
    public void transform(String fileIn, String fileOut) {
        String strBuffer = "";
        String strWriter = "";
        String CONST = "%s Cat %s Весом %s кг.\n";
        String csvSplitBy = (";");
        String isOreAngry = "";
        StringBuilder result = new StringBuilder();

        try(FileInputStream reader = new FileInputStream(fileIn); FileOutputStream write = new FileOutputStream(fileOut)) {
            int r;
            do {
                r = reader.read();
                result.append((char) r);
            } while(r != -1);
            strBuffer = String.valueOf(result);
            strBuffer = strBuffer.replace("\n", "").replace("\r", "");
            String[] cats = strBuffer.split(csvSplitBy);
            for(int i = 0; i < cats.length; ) {
                isOreAngry = ("true").equals(cats[i + 2].trim()) ? "Добрый" : "Злой и голодный";
                strWriter = strWriter.format("%s Cat %s Весом %s кг.\n", isOreAngry, cats[i].trim(), cats[i + 1].trim());
                
               write.write(strWriter.getBytes());

             String strEncoding = new String(strWriter.getBytes());
              System.out.println(strWriter + "\n" + strEncoding);
              i += 3;
            }
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}






