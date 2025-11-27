package com.xworkz.setcollection.external;

import java.util.Set;
import java.util.TreeSet;

public class FruitsPriceRunner {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(120);
        set.add(80);
        set.add(150);
        set.add(100);
        set.add(120);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(200);
        set.add(90);
        set.add(180);
        set.add(110);
        set.add(90);
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}
