package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CountryRunner {
    public static void main(String[] args) {
        List<Long> populations = new ArrayList<>();
        populations.add(1000000L);
        populations.add(2000000L);
        populations.add(3000000L);
        populations.add(4000000L);

        ListIterator<Long> popIterator = populations.listIterator();

        while (popIterator.hasNext()) {
            Long pop = popIterator.next();

            if (pop == 2000000L) {
                popIterator.add(2500000L);
            }

            if (pop == 3000000L) {
                popIterator.add(3500000L);
            }

            if (pop == 4000000L) {
                popIterator.remove();
            }

            System.out.println(pop);
        }

        System.out.println("Final population list: " + populations);
    }
}
