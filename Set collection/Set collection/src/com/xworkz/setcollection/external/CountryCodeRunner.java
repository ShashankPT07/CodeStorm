package com.xworkz.setcollection.external;

import java.util.Set;
import java.util.TreeSet;

public class CountryCodeRunner {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("IN");
        set.add("US");
        set.add("JP");
        set.add("UK");
        set.add("US");
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add("FR");
        set.add("DE");
        set.add("AU");
        set.add("BR");
        set.add("DE");
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}
