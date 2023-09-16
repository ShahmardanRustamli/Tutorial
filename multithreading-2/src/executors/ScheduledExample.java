package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(100);
        for (int i = 0; i < 100; i++) {
            scheduledExecutorService.execute(new Test());
            scheduledExecutorService.scheduleWithFixedDelay(new Test(), 1, 5, TimeUnit.SECONDS);
            // bir Thread ishe bashlayir digeri ise teyin edilen vaxtdan sonra diger Thread ishe bashlayir.
            scheduledExecutorService.scheduleAtFixedRate(new Test(), 5, 10,TimeUnit.SECONDS);
            // Thread`in ishi bitmemis digeri teyin edilen vaxtdan sonra ishe bashlayir.

        }
        scheduledExecutorService.shutdown();
        // Ishleri dayandirir..
    }
}
