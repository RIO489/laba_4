package Laba_1.Task9;

import Laba_1.Task8.CustomDouble;
import java.util.Scanner;

public class Task9_main {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(5,0.5);
        final CustomDouble b= new CustomDouble(5,0);
        System.out.println(a.toDouble());
        System.out.println(b.toDouble());
        System.out.println("Enter arithmetic operation('+','-','*','/') :");
       final  Scanner  sc= new Scanner(System.in);
        final String operation =  sc.nextLine();
switch (operation) {
    case("+"):
        System.out.println(Calculator.plus(a,b));
        break;
    case("-"):
        System.out.println(Calculator.minus(a,b));
        break;
    case("*"):
        System.out.println(Calculator.multiply(a,b));
        break;
    case("/"):
        System.out.println(Calculator.divide(a,b));
        break;
    default:
        System.out.println("Oooops, something wrong !");
}
}}
