package Laba_3.task3.services;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Transform {
    public static Map<Product,Integer>  pairToMap(final Pair pair){
        final  Map<Product,Integer> map = new HashMap<>();
        map.put(pair.getProduct(), pair.getCount());
        return map;
    }
    public static Map<String,Integer>  listPairToMap(final List<Pair> pair){
        final Map<String, Integer> sum = pair.stream()
                .collect(Collectors.groupingBy(Pair::getNameOfProduct, Collectors.summingInt(Pair::getCount)));
        return sum;
    }
}
