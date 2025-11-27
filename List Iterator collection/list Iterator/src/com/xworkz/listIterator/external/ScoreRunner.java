package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ScoreRunner {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        scores.add(45.5);
        scores.add(60.0);
        scores.add(72.5);
        scores.add(89.0);

        ListIterator<Double> sIterator = scores.listIterator();

        while (sIterator.hasNext()) {
            Double s = sIterator.next();

            if (s == 60.0) {
                sIterator.add(62.0);
            }

            if (s == 72.5) {
                sIterator.add(74.0);
            }

            if (s == 89.0) {
                sIterator.remove();
            }

            System.out.println(s);
        }

        System.out.println("Final scores: " + scores);
    }
}
