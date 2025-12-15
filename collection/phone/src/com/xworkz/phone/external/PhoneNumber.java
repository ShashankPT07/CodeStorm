package com.xworkz.phone.external;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedHashSet;

public class PhoneNumber {
    public static void main(String[] args) {
        Collection<Long> collection=new LinkedHashSet<>();
        collection.add(78921588155944L);
        collection.clear();
        collection.add(44654646516433L);
        System.out.println(collection.size());
    }
}
