package Laba_1;

public class Task2 {
    public static void main(final String[] args) {
        final String symbol = "a";
        final String str = "abcdeg";
        System.out.println("Before deleting:");
        System.out.println(str);
        final String deletedstr = deleting(str, symbol);
        System.out.println("After deleting:");
        System.out.println(deletedstr);
    }
    public static String deleting(String str, final String symbol) {
        str = str.replace(symbol, "");
        return str;
    }
}

