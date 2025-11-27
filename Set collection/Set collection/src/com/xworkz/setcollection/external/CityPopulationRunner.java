package com.xworkz.setcollection.external;

import java.util.Set;
import java.util.TreeSet;

public class CityPopulationRunner {
    public static void main(String[] args) {
        Set<Long> set = new TreeSet<>();
        set.add(950000L);
        set.add(1200000L);
        set.add(780000L);
        set.add(1500000L);
        set.add(950000L);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(2000000L);
        set.add(1100000L);
        set.add(1750000L);
        set.add(850000L);
        set.add(1100000L);
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}
