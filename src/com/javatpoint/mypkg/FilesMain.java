package com.javatpoint.mypkg;

import java.io.IOException;


public class FilesMain {
	 public static void main(String[] args) throws IOException {
		    String input = FilesUtils.readTextFile("file.txt");
		    System.out.println(input);
		    FilesUtils.writeToTextFile("copy.txt", input);

		    System.out.println(FilesUtils.readTextFile("copy.txt"));

		    FilesUtils.readTextFileByLines("file.txt");
		  }
}
