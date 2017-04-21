package com.javatpoint.pack2;


public class StringLength {
	
			  public static void main(String[] args) {
				  int[] myIntArray1 = new int[3];
				  int[] myIntArray2 = {1,2,3};
				  int[] myIntArray3 = new int[]{1,2,3};
				  int[] myIntArray4 = {};
				  System.out.println("new int[3] "+myIntArray1.length+" ");
				  System.out.println("{1,2,3} "+myIntArray2.length+" ");
				  System.out.println("  new int[]{1,2,3};"+myIntArray3.length+" ");
				  System.out.println(" {} "+myIntArray4.length+" ");
				  StringLength StringLength = new StringLength();
				  StringLength.lengthofArray();
	
			  }
			  public void lengthofArray(){
				  int[] myIntArray5 = new int[3];
				  int[] myIntArray6 = {1,2,3};
				  int[] myIntArray7 = new int[]{1,2,3};
				  int[] myIntArray8 = {};
				  System.out.println(" new int[3] "+myIntArray5.length+" ");
				  System.out.println(" {1,2,3} "+myIntArray6.length+" ");
				  System.out.println(" new int[]{1,2,3} "+myIntArray7.length+" ");
				  System.out.println(" {} "+myIntArray8.length+" ");
				  
				  
			  }
			 
	

}
