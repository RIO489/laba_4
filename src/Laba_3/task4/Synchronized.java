package Laba_3.task4;

public class Synchronized {
    public static void main(final String[] args) {
        for (int i = 0; i < 5; i++) {
            final Thread thread = new Thread(new Syns(0));
            thread.start();
        }
    }

    static class Syns implements Runnable {
        Integer integer = 0;

        public Syns(final Integer integer) {
            this.integer = integer;
        }

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    ++integer;
                    System.out.println(Thread.currentThread().getName() + " = " + integer);
                    try {
                        Thread.sleep(100);
                    } catch (final InterruptedException e) { //a
                    }
                }
            }
        }
    }
}
