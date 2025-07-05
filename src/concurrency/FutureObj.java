package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureObj {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++) {
            final int tasknumber=i;
            Runnable run=new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task number is " +tasknumber);
                }
            };
           Future ftobj=executor.submit(run);

        }
        executor.shutdown();
    }
}
