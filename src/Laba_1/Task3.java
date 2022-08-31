package Laba_1;

public class Task3 {
    public static void main(final String[] args) {
        final int number = 5;
        final int numberF  = 1;
        System.out.print("Cycle Factorial : "+cycleFactorial(number,numberF)+ " ");
        System.out.print("Recursion Factorial : "+recFactorial(number,numberF,1) + " ");
    }
    public  static int cycleFactorial(final int a, int b){
        for (int i =1;i <= a;i++) {
            b = b*i;
        }
        return b;
    }
    public  static int recFactorial(final int a, int b,final int i) {
        if (i <= a) {
            b = b * i;
            return recFactorial(a, b, i + 1);
        }
        return b;
    }}