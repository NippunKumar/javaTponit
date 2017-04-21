package com.javatpoint.pack2;

import java.util.Scanner;

public class FloydTriangle {
	 private static Scanner scanner;

	public static void main(String[] args) {
		 
	       
         scanner = new Scanner(System.in);
         System.out.print("Enter rows in Floyd's triangle : ");
         int rows = scanner.nextInt();
         System.out.println("");

         int nextNumber = 1;
         for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    
                      System.out.format("%3d",nextNumber++ ); 
                }
                System.out.println();
         }
         

  }
}
