package Deadlock;

import static Deadlock.main.t1;
import static Deadlock.main.t2;

public class Thread1 extends Thread {

    public void run() {
        synchronized (t1) {
            System.out.println("THread 1 is holding lock 1");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 : Waiting for lock 2");

        synchronized (t2) {
            System.out.println("Thread 2 is holding lock 1 & 2");
        }

    }
}

