package com.javatpoint.pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializePremitive {
	   public static void main(String[] args) {
		   
           Person2 person = new Person2(8);
 
           try {
                  OutputStream fout = new FileOutputStream("person.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started, serializing person objects...");
                  oout.writeObject(person);
                  fout.close();
         oout.close();
         System.out.println("Object Serialization completed.");
                  
 
                  //DeSerialization process >
                  
                  
                  InputStream fin=new FileInputStream("person.txt");
                  ObjectInput oin=new ObjectInputStream(fin);
                  System.out.println("\nDeSerialization process has started, displaying person objects...");
                  Person2 person1=(Person2)oin.readObject();
                  System.out.println(person1);
                  fin.close();
         oin.close();
         System.out.println("Object DeSerialization completed.");
                  
                  
           } catch (IOException | ClassNotFoundException  e) {
                  e.printStackTrace();
           }
 
    }
 
}
