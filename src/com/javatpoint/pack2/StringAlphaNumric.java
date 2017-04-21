package com.javatpoint.pack2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAlphaNumric {
	 static Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		  public static void main(String[] args) {
		      String str = "abcd123";
		      Matcher matcher = pattern.matcher(str);
		 
		      if (matcher.matches()) {
		           System.out.println("string '"+str + "' is alphanumeric");
		      } else {
		           System.out.println("string '"+str + "' isn't alphanumeric");
		      }	 
		  }	
}
