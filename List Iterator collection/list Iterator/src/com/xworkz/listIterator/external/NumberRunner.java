package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberRunner {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        ListIterator<Integer> numberIterator = numberList.listIterator();

        while (numberIterator.hasNext()) {
            Integer num = numberIterator.next();

            if (num.equals(20)) {
                numberIterator.add(25);
            }
            if (num.equals(40)) {
                numberIterator.set(45);
            }
            if (num.equals(50)) {
                numberIterator.remove();
            }

            System.out.println(num);
        }

        System.out.println("Final list of numbers: " + numberList);
    }
}
