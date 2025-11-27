package com.xworkz.setcollection.external;



import java.util.Set;
import java.util.TreeSet;

public class ProductWeightRunner {
    public static void main(String[] args) {
        Set<Float> set = new TreeSet<>();
        set.add(1.2f);
        set.add(2.5f);
        set.add(0.8f);
        set.add(3.1f);
        set.add(1.2f);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(4.0f);
        set.add(2.2f);
        set.add(3.8f);
        set.add(1.5f);
        set.add(2.2f);
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}

