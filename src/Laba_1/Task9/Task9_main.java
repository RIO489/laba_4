package Laba_1.Task9;

import Laba_1.Task8.CustomDouble;

public class Task9_main {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(5,0.5);
        final CustomDouble b= new CustomDouble(5,0);
        System.out.println(Calculator.multiply(a,b));
        System.out.println(Calculator.divide(a,b));
    }
}
