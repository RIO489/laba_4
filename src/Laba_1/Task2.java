package Laba_1;

public class Task2 {
    public static void main(final String[] args) {
        final String symbol = "a";
        final String str = "abcdeg";
        System.out.println("Before deleting:");
        display(str);
        final  String deletedstr = deleting(str,symbol);
        System.out.println("After deleting:");
        display(deletedstr);
    }
    public static String  deleting(String str,final String symbol)
    {
        str = str.replace(symbol,"");
        return str;
    }
    public static void  display(final String str)
    {
        System.out.println(str);
    }
}

