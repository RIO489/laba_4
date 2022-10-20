package Laba_3.task1.services;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Product;
import Laba_3.task1.items.Storage;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Find {
    public static Pair oneProduct(final String name, final Storage storage) {
        for (final Pair pair : storage.getProducts()) {
            if (pair.getProduct().getName().equals(name)) {
                return pair;
            }
        }
        System.out.println("Can`t find any matches");
        return null;
    }


    public static Pair oneProduct(final String name, final List<Pair> products) {
        for (final Pair pair : products) {
            if (pair.getProduct().getName().equals(name)) {
                return pair;
            }
        }
        System.out.println("Can`t find any matches");
        return null;
    }

    public static Pair oneProduct(final Pair product, final List<Pair> products) {
        for (final Pair pair : products) {
            if (pair.getProduct().equals(product.getProduct())) {
                return pair;
            }
        }
        System.out.println("Can`t find any matches");
        return null;
    }

    public static Pair oneProductWithCount(final Pair product, final List<Pair> products, final Integer count) {
        for (final Pair pair : products) {
            if (pair.getProduct().equals(product.getProduct()) && pair.getCount().equals(count)) {
                return pair;
            }
        }
        System.out.println("Can`t find any matches");
        return null;
    }

    public static Pair oneProductWithCount(final String name, final Storage storage, final Integer count) {
        for (final Pair pair : storage.getProducts()) {
            if (pair.getProduct().getName().equals(name) && pair.getCount().equals(count)) {
                return pair;
            }
        }
        System.out.println("Can`t find any matches");
        return null;
    }

    //Task3:
    public static Pair mostPopular(final Storage storage) {

        final List<Pair> newListCheck = new ArrayList<>();
        storage.getAllChecks()
                .stream()
                .peek(e -> e.keySet()
                        .stream()
                        .peek(newListCheck::add)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(newListCheck);

        final Map<Product, Integer> sum = newListCheck.stream()
                .collect(Collectors.groupingBy(Pair::getProduct, Collectors.summingInt(Pair::getCount)));
//        final List<Pair> toDELETE = new ArrayList<>();
//        final List<Pair> toADD = new ArrayList<>();
//        newListCheck.stream().reduce((e1, e2) -> {
//                    if (e1.getNameOfProduct().equals(e2.getNameOfProduct())) {
//                        e1.setCount(e1.getCount() + e2.getCount());
//                        toADD.add(e1);
//                        toDELETE.add(e2);
//                    }
//                    return e1;
//                }
//        ).stream().collect(Collectors.toList());
//        newListCheck.removeAll(toDELETE);
//        newListCheck.addAll(toADD);
        sum.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        return mostPopularFromList(sum, storage);
    }

    public static Pair mostPopularFromList(final Map<Product, Integer> list, final Storage storage) {

        final Map.Entry<Product, Integer> product = list
                .entrySet()
                .stream()
                .findFirst()
                .get();
        final Pair pair = Find.oneProduct(product.getKey().getName(), storage);
        pair.setCount(product.getValue());
        return pair;
    }

    public static Map<LocalDate, Integer> mostProfitableDay(final Storage storage) {
        final List<Map.Entry<Pair, LocalDate>> listPair = new ArrayList<>();
        storage
                .getAllChecks()
                .forEach(e -> listPair.addAll(e.entrySet()));
        final Map<LocalDate, List<Map.Entry<Pair, LocalDate>>> a = listPair.stream().collect(Collectors.groupingBy(Map.Entry::getValue));
        final Map<LocalDate, Integer> dailyProfit =
                a.entrySet()
                        .stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, e -> e.getValue()
                                        .stream()
                                        .mapToInt(pair -> pair.getKey().getAllPriceOfProduct())
                                        .sum()));

        return dailyProfit;
    }
}
