package Deadlock;

import static Deadlock.main.t1;
import static Deadlock.main.t2;

public class Thread2 extends Thread{

    public void run(){
        synchronized (t2){
            System.out.println("Thread 2 : Holding the lock");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 2 : Waiting for lock");
        synchronized (t1){
            System.out.println("Thread 2 : Holding lock 2 & 1");
        }
    }

}
