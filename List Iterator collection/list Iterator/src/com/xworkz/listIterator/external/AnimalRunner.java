package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AnimalRunner {
    public static void main(String[] args) {
        List<Boolean> flags = new ArrayList<>();
        flags.add(true);
        flags.add(false);
        flags.add(true);
        flags.add(false);

        ListIterator<Boolean> flagIterator = flags.listIterator();

        while (flagIterator.hasNext()) {
            Boolean flag = flagIterator.next();

            if (flag == true) {
                flagIterator.add(false);
            }

            if (flag == false) {
                flagIterator.add(true);
            }

            if (flag == false) {
                flagIterator.remove();
            }

            System.out.println(flag);
        }

        System.out.println("Final flags list: " + flags);
    }
}
