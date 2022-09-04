package Laba_1;

public class Task4 {
    public static void main(final String[] args) {
        final  int[] a = new int[101];
        create(a);
        sort(a);
    }
    public  static void create(final int[] a)
    {
        int i =0;
        while (i<100) {
            a[i] = i;
            i++;
        }
    }

    public static void sort(final int[] a)
    {
        int i = 0;
        while (i<100) {
            i++;
            if(a[i] %3 == 0) {
                if (a[i] % 5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                else
                    System.out.println("Fizz");
                continue;
            }
            if(a[i] %5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(a[i]);
        }
    }
}
