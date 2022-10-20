package Laba_3.task1.services;

import Laba_3.task1.items.Product;
import Laba_3.task1.items.Storage;
import Laba_3.task1.items.Pair;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sell {
    public static void oneProduct(final Pair targetPair, final Integer amount, final Storage storage) {
        if (targetPair.getCount() >= amount && targetPair.getCount() > 0) {
            storage
                    .getProducts()
                    .stream()
                    .filter(e -> e.equals(targetPair))
                    .peek(p -> p.setCount(p.getCount() - amount))
                    .collect(Collectors.toList());
        } else if (targetPair.getCount() > 0) {
            storage.
                    getProducts()
                    .removeIf(e -> e.getProduct().getName().equals(targetPair.getProduct().getName()));
        } else
            System.out.println("Error: Product is out of stock");
    }

    public static void oneProductByName(final String name, final Integer amount, final Storage storage) {
        final Pair targetPair = Find.oneProduct(name, storage);
        if (targetPair == null) {
            System.out.println("Sorry,we don`t have this product");
        } else
            Sell.oneProduct(targetPair, amount, storage);

    }
    public static void manyProduct(final List<Pair> list, final Storage storage) {
        final Pair[] product = {null};
        list.forEach(pro->{
           product[0] = Find.oneProduct(pro.getNameOfProduct(),storage);
        if (pro.getCount() <= product[0].getCount() && product[0].getCount() > 0) {
            storage
                    .getProducts()
                    .stream()
                    .filter(e -> e.equals(e))
                    .peek(p -> p.setCount(p.getCount() - pro.getCount()))
                    .collect(Collectors.toList());
        } else if (product[0].getCount() > 0) {
            storage.
                    getProducts()
                    .removeIf(e -> e.getProduct().getName().equals(pro.getProduct().getName()));
        } else
            System.out.println("Error: Product is out of stock");
    });
}}