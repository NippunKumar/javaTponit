package com.javatpoint.mypkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class XmlToProp {
	 public static void main(String[] args) throws IOException
	    {
		 
		  String current = System.getProperty("user.dir");
	        System.out.println("Current working directory in Java : " + current);
	      
	    	Properties props = new Properties();

	    	InputStream is = new FileInputStream("/home/pardeep/NK/Work/Project/JavaTest/A.xml");
	    	//load the xml file into properties format
	    	props.loadFromXML(is);

	    	String name = props.getProperty("Name");
	    	String email = props.getProperty("email");

	    	System.out.println(name);
	      	System.out.println(email);
	    }
	
}
