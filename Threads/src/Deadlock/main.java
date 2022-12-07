package Deadlock;

import static Deadlock.main.t1;
import static Deadlock.main.t2;

public class main {
    public static Object t1 = new Object();
    public static Object t2 = new Object();

    public static void main(String[] args) {
        Thread tt1 = new Thread();
        Thread tt2 = new Thread();

        tt1.start();
        tt2.start();
    }
}

