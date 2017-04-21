package com.javatpoint.pack2;

public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 10D));

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) {
		MyRunnable RunnableInstance = new MyRunnable();

		Thread thread1 = new Thread(RunnableInstance);
		Thread thread2 = new Thread(RunnableInstance);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // wait for thread 1 to terminate
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // wait for thread 2 to terminate
	}

}
