package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LetterRunner {
    public static void main(String[] args) {
        List<Character> letterList = new ArrayList<>();
        letterList.add('A');
        letterList.add('B');
        letterList.add('C');
        letterList.add('D');

        ListIterator<Character> iterator = letterList.listIterator();

        while (iterator.hasNext()) {
            Character letter = iterator.next();

            if (letter.equals('B')) {
                iterator.add('E');
            }
            if (letter.equals('C')) {
                iterator.set('Z');
            }
            if (letter.equals('D')) {
                iterator.remove();
            }

            System.out.println(letter);
        }

        System.out.println("Final letter list: " + letterList);
    }
}
