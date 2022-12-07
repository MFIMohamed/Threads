package setName;

import Threads1.childThread;

public class main {
    public static void main(String[] args) {
        Thread t = new Thread(new childThread());
        System.out.println(t.getName());

        t.setName("FirstThread");
        System.out.println(t.getName());

        childThreadNew t1 = new childThreadNew();
        t1.run();

        System.out.println(t1.getName());
        t1.setName("SecondThread");
        System.out.println(t1.getName());


    }
}
