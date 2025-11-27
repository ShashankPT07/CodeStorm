package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlayerRunner {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        scores.add(9.5);
        scores.add(7.2);
        scores.add(8.8);
        scores.add(6.0);

        ListIterator<Double> scoreIterator = scores.listIterator();

        while (scoreIterator.hasNext()) {
            Double score = scoreIterator.next();

            if (score == 7.2) {
                scoreIterator.add(7.5);
            }

            if (score == 8.8) {
                scoreIterator.add(9.0);
            }

            if (score == 6.0) {
                scoreIterator.remove();
            }

            System.out.println(score);
        }

        System.out.println("Final scores: " + scores);
    }
}
