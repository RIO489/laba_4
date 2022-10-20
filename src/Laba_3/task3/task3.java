package Laba_3.task3;

import Laba_3.task1.items.*;
import Laba_3.task1.persons.*;
import Laba_3.task1.services.*;
import Laba_3.task3.services.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task3 {
    public static void main(final String[] args) {
        final Pair produ = new Pair(new Product("Milk", 100), 15);
        final Pair produ1 = new Pair(new Product("Chocolate", 50), 20);
        final List<Pair> products = Stream.of(produ, produ1).collect(Collectors.toList());
        final Storage storage = new Storage(products, new ArrayList<>());
        System.out.println(storage);
        final Pair produ2 = new Pair(new Product("Beer", 29), 30);
        final Pair produ3 = new Pair(new Product("Honey", 99), 40);
        final List<Pair> newProducts = Stream.of(produ2, produ3).collect(Collectors.toList());
        Receive.manyProducts(newProducts, storage);
        System.out.println(storage);
        final Pair produ4 = new Pair(new Product("Marshmallow", 20), 50);
        Receive.oneProduct(produ4, storage);
        System.out.println(storage);
        Sell.oneProductByName("Milk", 5, storage);
        System.out.println(storage);
        Sort.byAlphabet(storage);
        System.out.println("\n" + storage);
        System.out.println("Average price:" + AveragePrice.byList(storage.getProducts()));
        final Seller seller1 = new Seller("Senya", storage);
        final Buyer customer1 = new Buyer("Maksim", new HashMap<>());
       // final Buyer customer2 = new Buyer("Roma", new HashMap<>());
        final Pair customerProduct = Find.oneProduct("Milk", storage);
        seller1.sellProduct(customerProduct, 3, customer1);
        System.out.println(storage);
        //seller1.sellProduct(customerProduct, 1, customer2);
        System.out.println("History of " + customer1.getName() + " :" + HistoryOfBuyer.spendingForCertainTime(customer1, LocalDate.now()));
        System.out.println("History of all time " + customer1.getName());
        final List<Pair> customerBusket = Stream.of(new Pair(produ.getProduct(), 2), new Pair(produ2.getProduct(), 4)).collect(Collectors.toList());
        seller1.sellListOfProducts(customerBusket, customer1);
        System.out.println("\ncheck:" + customer1.getCheck());
        seller1.sellProduct(customerProduct, 1, customer1);
        System.out.println("newCheckList: \n" + HistoryOfBuyer.productsForWholeTime(customer1,storage));
        System.out.println(storage.getAllChecks());
        final Pair mostPopularProduct = Find.mostPopular(storage);
        System.out.println("Most popular product: name: "+mostPopularProduct.getNameOfProduct() + " amount: " +  mostPopularProduct.getCount());
        System.out.println("Most profitable day: "+Find.mostProfitableDay(storage) + "$");
    }
}
