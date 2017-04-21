package com.javatpoint.mypkg;

public class ReverseStringRecursion {
	 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
    	ReverseStringRecursion srr = new ReverseStringRecursion();
        System.out.println("Result: "+srr.reverseString("javatpoint"));
    }
}
