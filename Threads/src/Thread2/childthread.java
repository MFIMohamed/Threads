package Thread2;

public class childthread extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hey THere from child" + i );

            try {
                Thread.sleep(5000);
            }catch ( InterruptedException e) {
                System.out.println("Interrupted Exception Occured  " + e );
            }

        }
    }
}
