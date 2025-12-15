package com.xworkz.festival.external;

import java.util.Collection;
import java.util.TreeSet;

public class FestivalRunner {
    public static void main(String[] args) {
        Collection<Boolean> collection=new TreeSet<>();
        collection.add(true);
        collection.add(false);
        System.out.println(collection.size());
    }
}
