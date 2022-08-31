package Laba_1.Task7.Product;

public class Product {
    private String name;
    private double price;

    public Product(final String name, final double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPrice(final double price) {
        this.price = price;
    }
}
