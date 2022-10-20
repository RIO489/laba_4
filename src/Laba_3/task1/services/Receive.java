package Laba_3.task1.services;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Storage;

import java.util.List;

public class Receive {
    public static void oneProduct(final Pair newProduct, final Storage storage) {
        storage.getProducts().add(newProduct);
    }


    public static void manyProducts(final List<Pair> newProducts, final Storage storage) {
        newProducts.
                stream().
                distinct().
                forEach(e -> storage.getProducts().add(e));
    }
}
