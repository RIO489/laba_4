package Laba_1.Task8;

public class Task8_main {
    public static void main(final String[] args) {
       final CustomDouble a = new CustomDouble(4,0.2);//4.2 + 3.9 = 8.1
        final CustomDouble b = new CustomDouble(3,0.9);
        System.out.println("a plus b:");
        final  CustomDouble c = a.plus(b);
        c.Display();
        System.out.println("a minus b:");
        final  CustomDouble d = a.minus(b);
        d.Display();
        System.out.println("Equals:" + a.equals(b));
        System.out.println("HashCode(a):");
        System.out.println(a.hashCode());
    }
}
