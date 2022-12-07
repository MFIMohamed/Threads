package Threads1;

public class childThread extends Thread{
    public void run(){
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("Hello World from child thread " + i );
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Exception Occured for child chread " + e);
        }
        }
    }
}
