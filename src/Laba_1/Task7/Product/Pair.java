package Laba_1.Task7.Product;

public class Pair {
    private Product product;
    private int count;

    public Pair(final Product product, final int count)
    {
        this.product = product;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }
}
