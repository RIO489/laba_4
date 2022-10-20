package Laba_3.task3.services;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Storage;

import java.util.List;
import java.util.stream.IntStream;

public class AveragePrice {
    public static double byStorage(final Storage storage) {
        double Sum = 0;
        for (final Pair pair : storage.getProducts())
            Sum += pair.getPriceOfProduct();
        return Sum / storage.getProducts().size();
    }

    public static double byList(final List<Pair> pairs) {
        double Sum = 0;
        for (final Pair pair : pairs){
        //while(pairs.listIterator().hasNext()){
            Sum += pair.getPriceOfProduct();
   // Pair pair =  pairs.listIterator().next();
         // Sum +=  pair.getPriceOfProduct();
           // pairs.listIterator().next();

        }
        return Sum / pairs.size();
    }
}
