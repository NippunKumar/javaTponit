package com.javatpoint.mypkg;

/*
Skip n bytes while reading the file using FileInputStream
This example shows how to skip n bytes while reading the file using skip method of
Java FileInputStream class.
*/

import java.io.*;

public class ReadFileSkipBytes {

	public static void main(String[] args) {

		// create file object
		File file = new File("/home/pardeep/NK/Work/Project/JavaTest/A.xml");

		try {
			// create FileInputStream object
			FileInputStream fin = new FileInputStream(file);
			int ch;

			fin.skip(15);

			while ((ch = fin.read()) != -1)
				System.out.print((char) ch);
		} catch (FileNotFoundException e) {
			System.out.println("File not found" + e);
		} catch (IOException ioe) {
			System.out.println("Exception while reading the file " + ioe);
		}
	}
}
