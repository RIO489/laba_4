package Laba_1.Task7;

import  Laba_1.Task7.Product.*;
public class check {
    public static void main(final String[] args) {
        Product productArray;
        double  Sum = 0;
       for(int i =0;i < products.length; i++)
       {
           productArray = products[i].getProduct();
           System.out.println("Product "+(i+1)+"\n Name: "+productArray.getName()+" Price "+productArray.getPrice()+" Count: "+products[i].getCount());
           Sum += productArray.getPrice() * products[i].getCount();
       }
       System.out.println("\nSum of the products:"+Sum);
    }
    static final Pair[] products = new Pair[]{
            new Pair(new Product("Juice",10),100),
        new Pair(new Product("Cow",500),1),
            new Pair(new Product("Maks",0.1),1)
    };

}
