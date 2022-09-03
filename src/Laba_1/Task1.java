package Laba_1;

import java.util.Arrays;
import java.util.Comparator;
public class Task1 {
    public static void main(final String[] args) {
        final String str ="aabc aaabv abc ";
        final char symbol = 'a';
        System.out.println("Before replacing = \n" + str);
        final String result = sort(str,symbol);
        System.out.println("After replacing = \n" + result);
    }
   public static String sort(final String str,final char symbol){

       final String[] result = str.split(" ");
       final Comparator<String> comp = Comparator.comparing(word -> count(word,symbol));
       Arrays.sort(result, comp.reversed());
       return Arrays.toString(result);
   }
    private static int count(final String word,final char symbol)
    {
        int count = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == symbol)
            {
                count++;
            }
        }
        return count;
    }
}
