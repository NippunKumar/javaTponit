package com.javatpoint.mypkg;

import java.io.IOException;

class CheckedExceptionPropagationTest {
	void C() throws IOException {
		System.out.println("You are in C method and I thorws IOException exception");
		throw new java.io.IOException("device error");// checked exception
	}
	void B() throws IOException {
		System.out.println("You are in B method and I thorws IOException exception");
		C();
	}
	void A() {
		System.out.println("You are in A method and I Catch all Exception exception");
		try {
			B();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}
	public static void main(String args[]) {
		System.out.println("You are in main method ");
		CheckedExceptionPropagationTest obj = new CheckedExceptionPropagationTest();
		obj.A();
		System.out.println("normal flow");
	}
}
