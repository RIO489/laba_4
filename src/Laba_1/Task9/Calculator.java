package Laba_1.Task9;

import Laba_1.Task8.CustomDouble;

public class Calculator {
    private double number;

    public Calculator(final double number)
    {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(final double number) {
        this.number = number;
    }

    public double plus(final double number2) {
        if (number2 % 1 == 0) {
            number += number2;
            return number;//5.4
        }
       final int numberInt = (int)number;//5
        final double numberD = number - numberInt;//0.4
        final CustomDouble a = new CustomDouble(numberInt,numberD);

        final int  number2Int = (int)number2;
        final double number2D = number2 - number2Int;
        final CustomDouble b = new CustomDouble(number2Int,number2D);

        final CustomDouble c = a.plus(b);
        final double result = c.toDouble();

        return result;
    }

    public double minus(final double number2) {
        if (number2 % 1 == 0) {
            number -= number2;
            return number;
        }
        final int numberInt = (int)number;
        final double numberD = number - numberInt;
        final CustomDouble a = new CustomDouble(numberInt,numberD);

        final int  number2Int = (int)number2;
        final double number2D = number2 - number2Int;
        final CustomDouble b = new CustomDouble(number2Int,number2D);

        final CustomDouble c = a.minus(b);
        final double result = c.toDouble();

        return result;
    }
    public double multiply(final double number2) {
        if (number2 % 1 == 0) {
            number *= number2;
            return number;
        }
        final int numberInt = (int) number;
        final double numberD = number - numberInt;
        final CustomDouble a = new CustomDouble(numberInt, numberD);

        final int number2Int = (int) number2;
        final double number2D = number2 - number2Int;
        final CustomDouble b = new CustomDouble(number2Int, number2D);

        final CustomDouble c = new CustomDouble(0, 0);
            c.setIntove( a.getIntove() * b.getIntove());
            c.setDoublove(a.getIntove() * b.getDoublove() + a.getDoublove() * b.getIntove() + a.getDoublove() * b.getDoublove());
        while(c.getDoublove() >= 1)
        {
            c.setDoublove(c.getDoublove() - 1);
            c.setIntove(c.getIntove() + 1);
        }
       final double result = c.toDouble();
        return result;
    }
    public double divide(final double number2) {
        if(number == 0.0 || number2 == 0.0)
        {
            System.out.println("Error:dividing by zero is banned");
            return -1;
        }
        if (number2 % 1 == 0) {
            number /= number2;
            return number;
        }
        final int numberInt = (int) number;
        final double numberD = number - numberInt;
        final CustomDouble a = new CustomDouble(numberInt, numberD);

        final int number2Int = (int) number2;
        final double number2D = number2 - number2Int;
        final CustomDouble b = new CustomDouble(number2Int, number2D);

        //final CustomDouble c = new CustomDouble(0, 0);
        // c.setIntove( a.getIntove() / b.getIntove());
     //  c.setDoublove(a.getIntove() / b.getDoublove() + a.getDoublove() / b.getIntove() + a.getDoublove() / b.getDoublove());
        //a.getIntove()*a.getDoublove()/(b.getIntove()*b.getDoublove());
    //    while(c.getDoublove() >= 1)
   //     {
  //          c.setDoublove(c.getDoublove() - 1);
  //        c.setIntove(c.getIntove() + 1);
  //      }
       // final double result = c.toDouble();
        final double result = a.toDouble() /  b.toDouble();
        return result;
    }
}
