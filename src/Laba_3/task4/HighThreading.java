package Laba_3.task4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HighThreading {
    public static void main(final String[] args) {
        final ExecutorService executor = Executors.newFixedThreadPool(5);

//        executor.submit(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        });


        try {
            final Future<Double> x = executor.submit(() -> {
                final String threadName = Thread.currentThread().getName();

                System.out.println(threadName + " hit ball to the gates ");

                Thread.sleep(5000);

                if (Math.random()*2 > 1) {
                    return 1.;
                } else
                    return 0.;


            });

            Thread.sleep(1000);
            System.out.println("after 1 sec goalkeeper were prepared to stop the ball");


            Thread.sleep(2000);
            System.out.println("Will he stops the ball?");
            Thread.sleep(2000);
            System.out.println("Or it will be an victory for Spain?");
            Thread.sleep(1000);

            System.out.println("And result is ....");
            if (x.get() == 1) {
                System.out.println(" ...and the ball was stopped by goalkeeper");
            }
            if (x.get() == 0) {
                System.out.println("IT`S GOAL!!! 4:5 FOR SPAIN!!!!");
            }


        } catch (final Exception e) {
            e.printStackTrace();
        }


        try {
            executor.shutdown();
        } catch (final Exception e) {
            executor.shutdown();
        } finally {
            executor.shutdownNow();
        }

    }
}
