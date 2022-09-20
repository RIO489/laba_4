package Laba_2.Task_1;

public class Main {
    public static void main(final String[] args) {
        final Quene quene = new Quene();
        quene.setFirst(2);
       quene.setFirst(1);
        quene.setLast(3);
        quene.setLast(4);
        for(final int asd : quene) {
            System.out.println(asd);
        }
    }
}
