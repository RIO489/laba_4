package Laba_1.Task7;

import  Laba_1.Task7.Product.*;
public class check {
    public static void main(final String[] args) {
        Product productArray;
        double  Sum = 0;
       for(final Pair i : products)
       {
           productArray = i.getProduct();
           System.out.println("Product :"+"\n Name: "+productArray.getName()+"\n Price "+productArray.getPrice()+"\n Count: "+i.getCount());
           Sum += productArray.getPrice() * i.getCount();
       }
       System.out.println("Sum of the products:"+Sum+"\n");
    }
    static final Pair[] products = new Pair[]{
            new Pair(new Product("Juice",10),100),
        new Pair(new Product("Cow",500),1),
            new Pair(new Product("Maks",0.1),1)
    };

}
