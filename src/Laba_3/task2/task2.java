package Laba_3.task2;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Product;
import Laba_3.task1.items.Storage;
import Laba_3.task1.persons.Buyer;
import Laba_3.task1.persons.Seller;
import Laba_3.task1.services.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task2 {
    public static void main(final String[] args) {
        final Long id = 0L;
        final Pair newProduct0 = new Pair(new Product("Milk", 100), 10);
        final Pair newProduct1 = new Pair(new Product("Chocolate", 50), 20);
        final List<Pair> products = Stream.of(newProduct0, newProduct1).collect(Collectors.toList());
        final Storage storage = new Storage(products, new ArrayList<>());

        System.out.println(storage);

        final Pair newProduct2 = new Pair(new Product("Beer", 29), 30);
        final Pair newProduct3 = new Pair(new Product("Honey", 99), 40);
        final List<Pair> newProducts = Stream.of(newProduct2, newProduct3).collect(Collectors.toList());
        final ReceiveProduct receive = new ReceiveProduct(storage);
        receive.manyProducts(newProducts);

        System.out.println(storage);
        final Pair newProduct4 = new Pair(new Product("Marshmallow", 20), 50);
        receive.oneProduct(newProduct4);

        System.out.println(storage);
        Sell.oneProductByName("Milk", 5, storage);
        System.out.println(storage);

        final Seller seller1 = new Seller("Senya", storage);
        final Buyer customer1 = new Buyer("Maksim", new HashMap<>());
        final Buyer customer2 = new Buyer("Roma", new HashMap<>());
        final Pair customerProduct = Find.oneProduct("Chocolate", storage);
        seller1.sellProduct(customerProduct, 4, customer1);
        System.out.println(storage);
        seller1.sellProduct(customerProduct, 10, customer2);
        System.out.println(storage);
        System.out.println(storage.displayHistory());
        System.out.println(customer1.displayCheck());
        System.out.println(customer2.displayCheck());

        System.out.println("\nTask2:\n");

        final Pair newProduct5 = new Pair(new Product("", 29), -30);
        receive.oneProduct(newProduct5);

    }
}
