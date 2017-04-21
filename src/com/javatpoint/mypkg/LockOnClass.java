package com.javatpoint.mypkg;

public class LockOnClass {
	 public static void main(String args[]) throws InterruptedException{
		 
         MyRunnable4 object1 = new MyRunnable4();
         MyRunnable4 object2 = new MyRunnable4();
         
         Thread thread1 = new Thread(object1,"Thread-1");
         Thread thread2 = new Thread(object2,"Thread-2");
         thread1.start();        
         thread2.start();        
         
         
  }
}
