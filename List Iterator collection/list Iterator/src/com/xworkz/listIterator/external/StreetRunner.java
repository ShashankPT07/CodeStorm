package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StreetRunner {
    public static void main(String[] args) {
        List<Double> lengths = new ArrayList<>();
        lengths.add(12.0);
        lengths.add(20.5);
        lengths.add(30.3);
        lengths.add(45.0);

        ListIterator<Double> lenIterator = lengths.listIterator();

        while (lenIterator.hasNext()) {
            Double len = lenIterator.next();

            if (len == 20.5) {
                lenIterator.add(22.2);
            }

            if (len == 30.3) {
                lenIterator.add(31.1);
            }

            if (len == 45.0) {
                lenIterator.remove();
            }

            System.out.println(len);
        }

        System.out.println("Final street lengths: " + lengths);
    }
}
