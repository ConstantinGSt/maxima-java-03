package org.example;

import java.io.FileWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzer {

    private int maxFilenameLength;
    private int maxPathLength;

    public FileAnalyzer(int maxPathLength, int maxFilenameLength) {
        this.maxPathLength = maxPathLength;
        this.maxFilenameLength = maxFilenameLength;
    }

    public void createReport(String filepath, String filename) {
        Path path = Paths.get(filepath);
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path);
             FileWriter writer = new FileWriter(filename, true)) {
            for (Path paths : files) {
                if(paths.toString().length() > maxPathLength
                        || paths.getFileName().toString().length() > maxFilenameLength) {
                    System.out.println(paths);
                    writer.write(paths.toString() + "\n");
                }
                if(Files.isDirectory(paths) ) {
                    createReport(paths.toString(), filename);
                }
            } files.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getMaxFilenameLength() {
        return maxFilenameLength;
    }

    public void setMaxFilenameLength(int maxFilenameLength) {
        this.maxFilenameLength = maxFilenameLength;
    }

    public int getMaxPathLength() {
        return maxPathLength;
    }

    public void setMaxPathLength(int maxPathLength) {
        this.maxPathLength = maxPathLength;
    }

}