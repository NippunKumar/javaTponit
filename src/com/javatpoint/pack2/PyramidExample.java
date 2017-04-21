package com.javatpoint.pack2;

import java.util.Scanner;

public class PyramidExample {
	
	    private static Scanner scanner;

		public static void main(String[] args) {
	           
	           scanner = new Scanner(System.in);
	           System.out.print("Enter n : ");  
	           int n = scanner.nextInt();
	           System.out.println("");
	 
	 
	           for (int i = 1; i <= n; i++) {
	                  int k=i;
	                  for (int j = 1; j <= n; j++) {
	                        System.out.print((j<= n-i  ? " " : k--));                                                 
	                  }
	                  System.out.println();
	           }
	 
	    }
	

}
