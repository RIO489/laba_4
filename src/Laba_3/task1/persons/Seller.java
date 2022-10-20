package Laba_3.task1.persons;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Storage;
import Laba_3.task1.services.Sell;

import java.time.LocalDate;
import java.util.List;

public class Seller {

    private String name;
    private Storage storage;

    public Seller(final String name, final Storage storage) {
        this.name = name;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(final Storage storage) {
        this.storage = storage;
    }

    public void sellProduct(final Pair product, final Integer amount, final Buyer customer) {
        Sell.oneProduct(product, amount, storage);
        customer.getCheck().put(new Pair(product.getProduct(),amount), LocalDate.now());
        storage.addCustomerToHistory(customer);
        //storage.getHistory().add(customer);
    }
    public void sellListOfProducts(final List<Pair> products,final Buyer customer) {
        Sell.manyProduct(products, storage);
        for(final Pair product : products) {
            customer.getCheck().put(new Pair(product.getProduct(), product.getCount()), LocalDate.now());
        }
        storage.addCustomerToHistory(customer);
    }
}

