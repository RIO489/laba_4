package Laba_1;

import java.util.Arrays;
import java.util.Comparator;
public class Task1 {
    public static void main(final String[] args) {
        final String str ="[abc aabc aaabv]";
        final char symbol = 'a';
        System.out.println("String before replacing = \"" + str +"\"");

        final String out = sortByA(str,symbol);
        System.out.println("String after replacing = \"" + out +"\"");
    }

   /* public static void sort(final String str,final char symbol) {
        final  char[] chars = str.toCharArray();
        int count = 0;
        for(int i =0;i < chars.length;i++)
        {
            if(chars[i]  == ' ')
            {
                System.out.println(count);
                count = 0;
            }
                if (chars[i] == symbol) {
                    count++;
                }
        }*/
//        Arrays.sort(chars);
//        str = new String(chars);
//        System.out.println(count);
   public static String sortByA(final String arg,final char symbol){

       final String[] result = arg.split(" ");

       final Comparator<String> comp = Comparator.comparing(word -> countALetter(word,symbol));
       Arrays.sort(result, comp.reversed());

       return Arrays.toString(result);
   }

    private static int countALetter(final String word,final char symbol)
    {
        final char someChar = symbol;
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == someChar)
            {
                count++;
            }
        }
        return count;
    }
}
