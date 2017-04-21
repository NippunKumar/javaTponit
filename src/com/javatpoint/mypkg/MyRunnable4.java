package com.javatpoint.mypkg;

public class MyRunnable4 implements Runnable {
	
	 @Override
	    public void run(){
		  synchronized (LockOnClass.class) {
		        for(int i=1;i<4;i++){
		               System.out.println(i+" "+Thread.currentThread().getName()+" is now executing");
		               try {
		                     Thread.sleep(500);
		               } catch (InterruptedException e) {e.printStackTrace(); }
		        }
		        
		      }
	    }

}
