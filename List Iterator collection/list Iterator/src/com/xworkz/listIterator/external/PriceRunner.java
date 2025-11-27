package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PriceRunner {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(99.9);
        priceList.add(149.5);
        priceList.add(200.0);
        priceList.add(349.9);

        ListIterator<Double> iterator = priceList.listIterator();

        while (iterator.hasNext()) {
            Double price = iterator.next();

            if (price.equals(149.5)) {
                iterator.add(175.0);
            }
            if (price.equals(200.0)) {
                iterator.set(210.0);
            }
            if (price.equals(349.9)) {
                iterator.remove();
            }

            System.out.println(price);
        }

        System.out.println("Final price list: " + priceList);
    }
}
