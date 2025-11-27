package com.xworkz.setcollection.external;



import java.util.Set;
import java.util.TreeSet;

public class SalaryRunner {
    public static void main(String[] args) {
        Set<Double> set = new TreeSet<>();
        set.add(45000.0);
        set.add(52000.0);
        set.add(61000.0);
        set.add(53000.0);
        set.add(52000.0);
        set.forEach(n -> System.out.println(n));
        set.clear();
        System.out.println(set.size());
        set.add(70000.0);
        set.add(48000.0);
        set.add(65000.0);
        set.add(43000.0);
        set.add(48000.0);
        System.out.println(set.toString());
        set.forEach(n -> System.out.println(n));
    }
}

