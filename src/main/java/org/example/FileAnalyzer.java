/*
package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.Files.isDirectory;

public class FileAnalyzer {
	private int maxPathLength;
	private int maxFilenameLength;

	public FileAnalyzer(int maxPathLength, int maxFilenameLength) {
		this.maxPathLength = maxPathLength;
		this.maxFilenameLength = maxFilenameLength;
	}

	public  void createReport(String filepath, String filename) {  //обход системы от filepath и запишет filename все результаты нарушевшие

		Path startPath = Path.of(filepath);
		if(isDirectory(startPath)) {

			try(Stream<Path> walk = Files.walk(startPath, Integer.MAX_VALUE); FileOutputStream write = new FileOutputStream((File) walk))  {
				write.write(walk.getBytes()
				for(Path path : walk)
					System.out.println(path);
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public int getMaxPathLength() {
		return maxPathLength;
	}

	public void setMaxPathLength(int maxPathLength) {
		this.maxPathLength = maxPathLength;
	}

	public int getMaxFilenameLength() {
		return maxFilenameLength;
	}

	public void setMaxFilenameLength(int maxFilenameLength) {
		this.maxFilenameLength = maxFilenameLength;
	}


}

*/
