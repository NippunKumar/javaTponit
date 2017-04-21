package com.javatpoint.mypkg;

class ExceptionPropagation {
	void C() throws ArithmeticException {
		System.out.println("You are in C method and I thorws arithmatic exception");
		int x = 100 / 0;
	}
	void B() {
		System.out.println("You are in B method and I don't catch Arithmatic Exception ");
		C();
	}
	void A() {
		System.out.println("You are in A method and I can catch every runtime Exception ");
		try {
			B();
		} catch (Exception e) {
			System.out.println("Exception handled in A method");
		}
	}
	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		System.out.println("You are in main method");
		obj.A();
	}
}