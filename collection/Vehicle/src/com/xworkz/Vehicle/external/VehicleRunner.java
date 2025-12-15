package com.xworkz.Vehicle.external;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class VehicleRunner {
    public static void main(String[] args) {
        Collection<Integer> it=new LinkedList<>();
        it.add(4);
        it.clear();
        System.out.println(it.size());
    }
}
