package threadInterrupt;

public class threadClassSleep extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread form sleep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interuption occured");
            }
        }
    }
}
