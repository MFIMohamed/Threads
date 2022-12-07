package setName;

public class childThreadNew extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from extended child thread");
        }
    }
}
