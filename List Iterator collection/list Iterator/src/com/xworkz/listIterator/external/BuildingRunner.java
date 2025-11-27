package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BuildingRunner {
    public static void main(String[] args) {
        List<Float> heights = new ArrayList<>();
        heights.add(12.5f);
        heights.add(15.0f);
        heights.add(18.2f);
        heights.add(20.0f);

        ListIterator<Float> heightIterator = heights.listIterator();

        while (heightIterator.hasNext()) {
            Float h = heightIterator.next();

            if (h == 15.0f) {
                heightIterator.add(16.5f);
            }

            if (h == 18.2f) {
                heightIterator.add(19.1f);
            }

            if (h == 20.0f) {
                heightIterator.remove();
            }

            System.out.println(h);
        }

        System.out.println("Final heights list: " + heights);
    }
}
