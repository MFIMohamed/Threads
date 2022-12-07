package thread3;

public class thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread from child process external");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        }
    }

