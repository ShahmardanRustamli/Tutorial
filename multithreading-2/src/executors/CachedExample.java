package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Test());
        }
    }
}
