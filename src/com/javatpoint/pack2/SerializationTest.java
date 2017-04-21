package com.javatpoint.pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {

	public static void main(String[] args) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		String filename = "time.ser";
		Employee e = new Employee("Nippun",5,5000);
		
		System.out.println(e);
		// save the object to file
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		System.out.println("Serialization process begins");
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(e);

			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// read the object from file
		// save the object to file
		System.out.println("Deserialization process begins");
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			e = (Employee) in.readObject();
			in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(e);
	}

}
