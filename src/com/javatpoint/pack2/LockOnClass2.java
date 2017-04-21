package com.javatpoint.pack2;

public class LockOnClass2 {
 public static void main(String args[]) throws InterruptedException{
		 
         MyRunnable5 obj1 = new MyRunnable5();
         MyRunnable5 obj2 = new MyRunnable5();
         
         Thread thread1 = new Thread(obj1,"Thread-1");
         Thread thread2 = new Thread(obj2,"Thread-2");
         thread1.start();        
         thread2.start();        
         
         
  }
 
}
 