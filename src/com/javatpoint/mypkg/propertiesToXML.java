package com.javatpoint.mypkg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesToXML {
	 public static void main(String[] args) throws IOException
	    {
		 
		  String current = System.getProperty("user.dir");
	        System.out.println("Current working directory in Java : " + current);
	      
	    	Properties props = new Properties();
	    	props.setProperty("Name", "javatpoint");
	    	props.setProperty("email", "enquiry@sssit.org");
	    	//where to store?
	    	OutputStream os = new FileOutputStream("/home/pardeep/NK/Work/Project/JavaTest/A.xml");

	    	//store the properties detail into a pre-defined XML file
	    	props.storeToXML(os, "Support","UTF-8");

	    	System.out.println("Ok...");
	    }
}
