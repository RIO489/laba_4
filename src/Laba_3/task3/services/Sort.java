package Laba_3.task3.services;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Storage;

import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void byAlphabet(final Storage storage) {
        storage.getProducts().sort(Comparator.comparing(Pair::getNameOfProduct));
    }

    public void byAlphabet(final List<Pair> products) {
        products.sort(Comparator.comparing(Pair::getNameOfProduct));
    }

    public void byAmount(final Storage storage) {
        storage.getProducts().sort(Comparator.comparing(Pair::getCount));
    }

    public void byAmount(final List<Pair> products) {
        products.sort(Comparator.comparing(Pair::getCount));
    }

    public void byPrice(final List<Pair> products) {
        products.sort(Comparator.comparing(Pair::getPriceOfProduct));
    }

    public void byPrice(final Storage storage) {
        storage.getProducts().sort(Comparator.comparing(Pair::getPriceOfProduct));
    }

}
