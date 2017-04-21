package com.javatpoint.pack2;

public class MyRunnable5 implements Runnable {

	public void run() {
		MyRunnableMtehod();

	}

	public static synchronized void MyRunnableMtehod() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + Thread.currentThread().getName() + " is now executing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
