package Laba_1;

public class Task4 {
    public static void main(final String[] args) {
        final  int[] a = new int[101];
        create(a);
//        display(a);
        sort(a);
    }
    public  static void create(final int[] a)
    {
        for(int i =0;i<100;i++)
            a[i] = i+1;
    }
    public static  void display(final int[] a)
    {
        for(int i = 0;i<100;i++)
            System.out.println(a[i]);
    }
    public static void sort(final int[] a)
    {
        for(int i = 0;i<100;i++)
        {
            if(a[i] %3 == 0 && a[i] %5 == 0)
                System.out.println("FizzBuzz");
            else
            if(a[i] %3 == 0)
                System.out.println("Fizz");
            else
            if(a[i] %5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(a[i]);
        }
    }
}
