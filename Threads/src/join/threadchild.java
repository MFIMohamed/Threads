package join;

public class threadchild extends Thread{
    public void start(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread executing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
