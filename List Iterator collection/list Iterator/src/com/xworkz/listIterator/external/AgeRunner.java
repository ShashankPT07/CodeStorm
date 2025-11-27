package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AgeRunner {
    public static void main(String[] args) {
        List<Integer> ageList = new ArrayList<>();
        ageList.add(18);
        ageList.add(25);
        ageList.add(30);
        ageList.add(40);
        ageList.add(50);

        ListIterator<Integer> ageIterator = ageList.listIterator();

        while (ageIterator.hasNext()) {
            Integer age = ageIterator.next();

            if (age == 25) {
                ageIterator.add(27);
            }

            if (age == 40) {
                ageIterator.add(45);
            }

            if (age == 50) {
                ageIterator.remove();
            }

            System.out.println(age);
        }

        System.out.println("Final age list: " + ageList);
    }
}
