package com.javatpoint.mypkg;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {


	static Semaphore semaphore = new Semaphore(1);

	static class MyLockerThread extends Thread {

		String name = "";

		MyLockerThread(String name) {
			this.name = name;
		}

		public void run() {

			try {

				System.out.println(name + " : acquiring lock...");
				System.out.println(name + " : No. of available Semaphore permits now: "
								+ semaphore.availablePermits());

				semaphore.acquire();
				System.out.println(name + " : got the permit!");

				try {

					for (int i = 1; i <= 3; i++) {

						System.out.println(name + " : is performing operation " + i
								+ ", available Semaphore permits : "
								+ semaphore.availablePermits());

						// sleep 2 second
						Thread.sleep(2000);

					}

				} finally {

					// calling release() after a successful acquire()
					System.out.println(name + " : releasing lock...");
					semaphore.release();
					System.out.println(name + " : available Semaphore permits now: "
								+ semaphore.availablePermits());

				}

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

	public static void main(String[] args) {

		System.out.println("Total available Semaphore permits : "
				+ semaphore.availablePermits());

		MyLockerThread t1 = new MyLockerThread("Thread 1");
		t1.start();

		MyLockerThread t2 = new MyLockerThread("Thread 2");
		t2.start();

		MyLockerThread t3 = new MyLockerThread("Thread 3");
		t3.start();



	}
}
