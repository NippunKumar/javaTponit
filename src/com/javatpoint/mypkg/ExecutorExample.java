package com.javatpoint.mypkg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Starting: " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("sorry, being interupted, good bye!");
            System.out.println("Interrupted "+Thread.currentThread().getName());
            e.printStackTrace();    
        }

        System.out.println("Completed: " + id);
    }
}


public class ExecutorExample {

    public static void main(String[] args) {
        Boolean isCompleted=false;

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++) {
            executor.submit(new Processor(i));
        }

        //executor does not accept any more tasks but the submitted tasks continue
        executor.shutdown();

        System.out.println("All tasks submitted.");

        try {
            //wait for the exectutor to terminate normally, which will return true
            //if timeout happens, returns false, but this does NOT interrupt the threads
            isCompleted=executor.awaitTermination(100, TimeUnit.SECONDS);
            //this will interrupt thread it manages. catch the interrupted exception in the threads 
            //If not, threads will run forever and executor will never be able to shutdown.
            executor.shutdownNow();
        } catch (InterruptedException e) {
        }

        if (isCompleted){
        System.out.println("All tasks completed.");
       }
        else {
            System.out.println("Timeout "+Thread.currentThread().getName());
        }
    }
        }