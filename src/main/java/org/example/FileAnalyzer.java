package org.example;

public class FileAnalyzer {
	private int maxPathLength;
	private int maxFilenameLength;


	public FileAnalyzer(int maxPathLength, int maxFilenameLength) {
		this.maxPathLength = maxPathLength;
		this.maxFilenameLength = maxFilenameLength;
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

