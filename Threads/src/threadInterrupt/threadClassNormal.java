package threadInterrupt;

public class threadClassNormal extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread class from the normal");
        }
    }
}
