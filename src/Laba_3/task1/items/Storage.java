package Laba_3.task1.items;

import Laba_2.task_2.Student;
import Laba_3.task1.persons.Buyer;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Storage {
    private List<Pair> products;
    private List<Buyer> history;

    public Storage(final List<Pair> products, final List<Buyer> history) {
        this.products = products;
        this.history = history;
    }

    public List<Buyer> getHistory() {
        return history;
    }

    public void setHistory(final List<Buyer> history) {
        this.history = history;
    }

    public List<Pair> getProducts() {
        return products;
    }

    public void setProducts(final List<Pair> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "products=" + products +
                ", history=" + history +
                '}';
    }

    public String displayHistory() {
        return "History = " + history;
    }

    public List<Map<Pair, LocalDate>> getAllChecks() {

        final List<Map<Pair, LocalDate>> newListChecks = new ArrayList<>();
        history.forEach(e -> newListChecks.add(e.getCheck()));
        return newListChecks;
    }

    public void addCustomerToHistory(final Buyer customer) {
        if (!CustomerAlreadyInHistory(customer)) {
            history.add(customer);
        }
    }

    public boolean CustomerAlreadyInHistory(final Buyer customer) {
       //return  history.stream().anyMatch(e->e.getName().equals(customer.getName()));
        return history.contains(customer);
    }
}



