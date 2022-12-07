package setName;

public class childThread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hellow from child thread");
        }
    }
}
