package Threads1;

public class myThread {
    public static void main(String[] args) {

        childThread cT = new childThread();
        cT.start();

        for (int i = 0 ; i < 10 ; i ++ ) {
            System.out.println("Hello World from main thread" + i );
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e){
                System.out.println("Exception Occured " + e );
            }
        }
    }
}





