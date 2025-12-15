package com.xworkz.task.external;

import java.util.Collection;
import java.util.HashSet;

public class TaskRunner {
    public static void main(String[] args) {
        Collection<Double> collection=new HashSet<>();
        collection.add(56555.55222);
        collection.add(5500.25623);
        System.out.println(collection.size());
        System.out.println(collection);
    }
}
