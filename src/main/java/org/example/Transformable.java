package org.example;

import java.io.FileNotFoundException;

public interface Transformable {

    public void  transform(String fileIn, String fileOut) throws FileNotFoundException;
}
