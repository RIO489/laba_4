package Laba_1.Task8;

import java.util.Objects;

public class CustomDouble {
    private int intove;
    private double doublove;
    public CustomDouble(final int intove,final double doublove)
    {
        this.intove = intove;
        this.doublove = doublove;
    }
    public int getIntove() {
        return intove;
    }

    public void setIntove(final int intove) {
        this.intove = intove;
    }

    public double getDoublove() {
        return doublove;
    }

    public void setDoublove(final double doublove) {
        this.doublove = doublove;
    }

    public  CustomDouble plus(final CustomDouble b) {
        final CustomDouble a = new CustomDouble(0,0);
        a.intove = intove + b.getIntove();
        a.doublove =doublove + b.getDoublove();
        while (a.doublove >= 1) {
           a.doublove = a.doublove - 1.0;
            a.intove = a.intove + 1;
        }
        return a;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final CustomDouble that = (CustomDouble) o;
        return intove == that.intove && Double.compare(that.doublove, doublove) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intove, doublove);
    }

    public CustomDouble minus(final CustomDouble c) {
        final CustomDouble a = new CustomDouble(0,0);
        a.intove = intove - c.getIntove();
        a.doublove = doublove - c.getDoublove();
        while (a.doublove < 0.1) {
            a.doublove = a.doublove + 1;
            a.intove =a.intove - 1;
        }
        return a;
    }
        public double toDouble()
            {
              final double a = intove + doublove;
                return a;
            }

            public void Display()
            {
                System.out.println(intove + doublove);
            }
    }
// 5.6
//+
//6.7
//11 1.3 =>  12 0.3 => 12.3
