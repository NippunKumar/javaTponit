package com.javatpoint.mypkg;

public class StartVsRun{

    public static void main(String args[]) {
        
        //creating two threads for start and run method call
        Thread startThread = new Thread(new Task("By_Start"));
        Thread runThread = new Thread(new Task("By_run"));
        
        startThread.start(); //calling start method of Thread - will execute in new Thread
        runThread.run();  //calling run method of Thread - will execute in current Thread

    }

    private static class Task implements Runnable{
        private String call;
        
        public Task(String call){
            this.call = call;
        }
        
        @Override
        public void run() {
            System.out.println("Caller: "+ call + " This Thread is executed by :"
            		+ "" + Thread.currentThread().getName());
            
        }         
    } 
}

