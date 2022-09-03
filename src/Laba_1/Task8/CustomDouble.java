package Laba_1.Task8;

import java.util.Objects;

public class CustomDouble {
    private int whole;
    private double fractional;
    public CustomDouble(final int whole,final double doublove)
    {
        this.whole = whole;
        if(doublove<1) {
            this.fractional = doublove;
        }
        else
            System.out.println("Error:Can`t initialized second part");
    }
    public int getWhole() {
        return whole;
    }

    public void setWhole(final int whole) {
        this.whole = whole;
    }

    public double getFractional() {
        return fractional;
    }

    public void setFractional(final double fractional) {
        this.fractional = fractional;
    }

    public  CustomDouble plus(final CustomDouble b) {
        final CustomDouble a = new CustomDouble(0,0);
        a.whole = whole + b.getWhole();
        a.fractional =fractional + b.getFractional();
        final int numberInt;
        if (a.fractional >= 1) {
            numberInt = (int) a.fractional;
           a.fractional = a.fractional - numberInt;
            a.whole = a.whole + numberInt;
        }
        return a;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return whole == that.whole && Double.compare(that.fractional, fractional) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(whole, fractional);
    }

    public CustomDouble minus(final CustomDouble c) {
        final CustomDouble a = new CustomDouble(0,0);
        a.whole = whole - c.getWhole();
        a.fractional = fractional - c.getFractional();
        final int numberInt;
        if (a.fractional < 0.1) {
            numberInt = (int) a.fractional;
            a.fractional = a.fractional + numberInt;
            a.whole = a.whole - numberInt;
        }
        return a;
    }
        public double toDouble()
            {
                return whole + fractional;
            }

            public void Display()
            {
                System.out.println(whole + fractional);
            }
    }

