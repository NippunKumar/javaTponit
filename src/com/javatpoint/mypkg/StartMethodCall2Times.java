package com.javatpoint.mypkg;

class MyRunnable2 implements Runnable{
    public void run(){   //overrides Runnable's run() method
           System.out.println("in run() method");
           System.out.println("currentThreadName= "+ Thread.currentThread().getName());
    }
}
 
public class StartMethodCall2Times {
    public static void main(String args[]){
           System.out.println("currentThreadName= "+ Thread.currentThread().getName());
           MyRunnable4 runnable=new MyRunnable4(); 
           Thread thread=new Thread(runnable);
           thread.start();
           thread.start();
           
    }
}
