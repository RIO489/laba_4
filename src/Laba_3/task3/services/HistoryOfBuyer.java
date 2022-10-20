package Laba_3.task3.services;

import Laba_2.task_2.Student;
import Laba_3.task1.items.Pair;
import Laba_3.task1.items.Product;
import Laba_3.task1.items.Storage;
import Laba_3.task1.persons.Buyer;
import Laba_3.task1.services.Find;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HistoryOfBuyer {
    public static double spendingForCertainTime(final Buyer buyer, final LocalDate time) {

        if (buyer.getCheck().containsValue(time)) {
            final double totalPrice = buyer
                    .getCheck()
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue().equals(time))
                    .mapToInt(e -> e.getKey().getPriceOfProduct())
                    .sum();
            final double totalAmount = buyer
                    .getCheck()
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue().equals(time))
                    .mapToInt(e -> e.getKey().getCount())
                    .sum();
            return totalPrice * totalAmount;
        }
        System.out.println("Error:Buyer don`t contains data by this time");
        return -1;
    }

   /* public static List<Pair> productsForWholeTime(final Buyer buyer) {

        final List<Pair> newListCheck = new ArrayList<>();
        final List<Pair> toDELETE = new ArrayList<>();
        final List<Pair> toADD = new ArrayList<>();
        System.out.println(buyer.getCheck());
        newListCheck.addAll(buyer.getCheck().keySet());
        newListCheck.stream().reduce((e1, e2) -> {
                    if (e1.getNameOfProduct().equals(e2.getNameOfProduct())) {
                        e1.setCount(e1.getCount() + e2.getCount());
                        toADD.add(e1);
                        toDELETE.add(e2);
                        e1.setCount(e1.getCount() - e2.getCount());
                    }
                    return e1;
                }
        ).stream().collect(Collectors.toList());
        newListCheck.removeAll(toDELETE);
        newListCheck.addAll(toADD);
        return newListCheck;
//
//        System.out.println(newListCheck);
//        Pair toAdd = null;
//        Pair toDelete;
//        final List<Pair> toDELETE = new ArrayList<>();
//        final List<Pair> toADD = new ArrayList<>();
//        for (final Iterator<Pair> iter1 = newListCheck.stream().iterator(); iter1.hasNext(); ) {
//            toDelete = iter1.next();
//            if (toAdd != null && toAdd.getNameOfProduct().equals(toDelete.getNameOfProduct())) {
//                toDELETE.add(toAdd);
//                toDELETE.add(toDelete);
//                toAdd.setCount(toAdd.getCount() + toDelete.getCount());
//                toADD.add(toAdd);
//            }
//            toAdd = toDelete;
//        }
//        newListCheck.removeAll(toDELETE);
//        newListCheck.addAll(toADD);
    }*/
    public static Map<String, Integer> productsForWholeTime(final Buyer buyer,final Storage storage) {

        final List<Pair> newListCheck = new ArrayList<>();
        buyer.getCheck().forEach((p,l)->newListCheck.add(p));
        final Map<String, Integer> newMap = Transform.listPairToMap(newListCheck);
        return newMap;
    }
}

