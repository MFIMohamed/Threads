package join;

public class threadmain {
    public static void main(String[] args) throws InterruptedException {

        threadchild tc  = new threadchild();
        tc.start();
        tc.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread executing");
        }

    }
}
