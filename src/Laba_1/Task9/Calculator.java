package Laba_1.Task9;

import Laba_1.Task8.CustomDouble;

public class Calculator {
    public static double plus(final CustomDouble number1,final CustomDouble number2) {
            return number1.toDouble() + number2.toDouble();
    }
    public static double minus(final CustomDouble number1,final CustomDouble number2) {
        return number1.toDouble() - number2.toDouble();
    }
    public static double multiply(final CustomDouble number1,final CustomDouble number2) {
       return number1.toDouble() * number2.toDouble();
    }
    public static double divide(final CustomDouble number1,final CustomDouble number2) {
        if (number1.toDouble() == 0 || number2.toDouble() == 0){
            System.out.println("Error:Can`t divide by 0");
        return -1;
    }
        return number1.toDouble() / number2.toDouble();
    }
}
