package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlanetRunner {
    public static void main(String[] args) {
        List<Character> codes = new ArrayList<>();
        codes.add('A');
        codes.add('B');
        codes.add('C');
        codes.add('D');

        ListIterator<Character> codeIterator = codes.listIterator();

        while (codeIterator.hasNext()) {
            Character c = codeIterator.next();

            if (c == 'B') {
                codeIterator.add('X');
            }

            if (c == 'C') {
                codeIterator.add('Y');
            }

            if (c == 'D') {
                codeIterator.remove();
            }

            System.out.println(c);
        }

        System.out.println("Final code list: " + codes);
    }
}
