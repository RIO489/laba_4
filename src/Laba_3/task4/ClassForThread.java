package Laba_3.task4;

public class ClassForThread {
    public static void start1() {
        System.out.println("first has started");
        try{
            Thread.sleep(3000);
        } catch  (final InterruptedException e){
            System.out.println("first Interrupted exception");
        }
        System.out.println("first finished");
    }
    public static void start2() {
        System.out.println("second has started");
        try{
            Thread.sleep(1000);// interrupted = true
        } catch  (final InterruptedException e){
            System.out.println("second Interrupted exception");// interrupted = false
            Thread.currentThread().interrupt();// interrupted = true
        }
        System.out.println("second finished");
    }
    public static void start3() {
        System.out.println("third has started");
        try{
            Thread.sleep(3000);
        } catch  (final InterruptedException e){
            System.out.println("third Interrupted exception");
        }
        System.out.println("third finished");
    }
}
