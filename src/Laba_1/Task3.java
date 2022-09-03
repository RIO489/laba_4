package Laba_1;

public class Task3 {
    public static void main(final String[] args) {
        final int numberLength = 5;
        final int numberFactorial  = 1;
        System.out.print("Cycle Factorial : "+cycleFactorial(numberLength,numberFactorial)+ " ");
        System.out.print("Recursion Factorial : "+recFactorial(numberLength,numberFactorial,1) + " ");
    }
    public  static int cycleFactorial(final int a, int b){
        for (int i =1;i <= a;i++) {
            b *=i;
        }
        return b;
    }
    public  static int recFactorial(final int a, int b,final int i) {
        if (i <= a) {
            b *=  i;
            return recFactorial(a, b, i + 1);
        }
        return b;
    }}