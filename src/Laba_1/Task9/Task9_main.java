package Laba_1.Task9;

public class Task9_main {
    public static void main(final String[] args) {
    final Calculator a = new Calculator(0);
        final Calculator b = new Calculator(3.6);
        System.out.println(a.plus(b.getNumber())); //10.1
        System.out.println(a.minus(b.getNumber())); // -0.1
        System.out.println(a.multiply(b.getNumber()));//25.5
        System.out.println(a.divide(b.getNumber()));//
    }
}
