package thread3;

public class test extends Thread {
    public static void main(String[] args) {
        test t1 = new test();
        t1.start();

        thread2 t2 = new thread2();
        t2.start();

        test t3 = new test();
        t3.start();

        for (int i = 0; i < 15; i++) {
            System.out.println("Thread in main " + i );
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread from child " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

    }
}
