package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Test());
        }
    }
}


class Test implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}