package threadPools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        //schedules task after delay of 10 seconds
        scheduledExecutorService.schedule(new Task(), 10 , TimeUnit.SECONDS);
        //schedule taks after initial delay of 3 seconds and it will run repeadtedly after 2 seconds
        scheduledExecutorService.scheduleAtFixedRate(new Task(), 3, 2, TimeUnit.SECONDS);


    }
}
