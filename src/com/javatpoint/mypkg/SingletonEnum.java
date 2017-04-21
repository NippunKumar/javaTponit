package com.javatpoint.mypkg;

public enum SingletonEnum {
	 INSTANCE;
	 public SingletonEnum doStuff(){
	     System.out.println("Singleton using Enum");
		return null;
	 }

	
	public static void main(String[] args) {
	        SingletonEnum.INSTANCE.doStuff();
	    }
}