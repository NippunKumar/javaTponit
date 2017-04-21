package com.javatpoint.pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializeDeserializeMain {
	 
    public static void main(String[] args) {
 
           Sub obj = new Sub("INDIA");
 
           try {
                  OutputStream fout = new FileOutputStream("India.txt");
                  ObjectOutput oout = new ObjectOutputStream(fout);
                  System.out.println("Serialization process has started");
                  oout.writeObject(obj);
                  fout.close();
         oout.close();
         System.out.println("Object has Serialized.");
                  
           
           } catch (IOException  e) {
                  e.printStackTrace();
           }
 
    }
 
}
