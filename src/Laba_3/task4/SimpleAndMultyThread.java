package Laba_3.task4;

public class SimpleAndMultyThread extends Thread {
    public static void main(final String[] args) {
        final SimpleThread1 simpleThread1 = new SimpleThread1();
        final SimpleThread2 simpleThread2 = new SimpleThread2();
        final SimpleThread3 simpleThread3 = new SimpleThread3();

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();

        try {
            Thread.sleep(4000);
        } catch (final Exception e){
            //q
        }
        simpleThread2.interrupt();
    }

    public static class SimpleThread1 extends Thread {
        @Override
        public void run() {
            ClassForThread.start1();
        }
    }

    public static class SimpleThread2 extends Thread {
        private boolean shouldStop = false;

        public void stopThread() {
            this.shouldStop = true;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                ClassForThread.start2();
            }
        }
    }

    public static class SimpleThread3 extends Thread {
        @Override
        public void run() {
            ClassForThread.start3();
        }
    }
}
