package executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ThreadExample {
    public static void main(String[] args) {
      //  Thread t = new Thread(new Task());
      //  t.start();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task());
        }
    }
}
