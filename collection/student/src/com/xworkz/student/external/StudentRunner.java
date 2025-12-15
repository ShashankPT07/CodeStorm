package com.xworkz.student.external;

import java.util.ArrayList;
import java.util.Collection;

public class StudentRunner {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();

       collection.add("sha");
       collection.add("aa");
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

    }

}
