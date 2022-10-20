package Laba_3.task2;

import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Storage;

import java.util.List;

public class ReceiveProduct {
    private Storage storage;

    public ReceiveProduct(final Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(final Storage storage) {
        this.storage = storage;
    }

    public void oneProduct(final Pair newProduct) {
        if (validate(newProduct)) {
            storage.getProducts().add(newProduct);
        }
    }

    public void manyProducts(final List<Pair> newProducts) {
        newProducts.
                stream().
                distinct().
                filter(this::validate).
                forEach(e -> storage.getProducts().add(e));
    }

    public boolean validate(final Pair product) {
        try {
            if (product.getCount() > 0) {
                if (!(product.getProduct().getName().isEmpty())) {
                    if (product.getProduct().getPrice() > 0) {
                        return true;
                    }
                    throw new CheckedException("Error 400: Unacceptible price");
                }
                throw new CheckedException("Error 400: Unacceptible name");
            }
            throw new CheckedException("Error 400: Unacceptible amount");
        } catch (final CheckedException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return false;
    }

}
