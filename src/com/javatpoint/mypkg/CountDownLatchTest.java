package com.javatpoint.mypkg;

import java.util.concurrent.CountDownLatch;

class MyRunnable3 implements Runnable{
    
    CountDownLatch countDownLatch;
    
    MyRunnable3(CountDownLatch countDownLatch){
           this.countDownLatch=countDownLatch;
    }
       
    public void run(){
           
           for(int i=1;i>=0;i--){
                  
                  countDownLatch.countDown();           
                  System.out.println(Thread.currentThread().getName()+
                               " has reduced latch count to : "+ i);
                  
                  try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
           }
                  
    }
    
}
 
public class CountDownLatchTest {
 
    
    public static void main(String[] args) {
           CountDownLatch countDownLatch=new CountDownLatch(3);
           System.out.println("CountDownLatch has been created with count=3");
           
           new Thread(new MyRunnable3(countDownLatch),"Thread-1").start();
           
           try {
                  countDownLatch.await();
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
           System.out.println("count has reached zero, "+
                        Thread.currentThread().getName()+" thread has ended");
 
 
    }
 
}