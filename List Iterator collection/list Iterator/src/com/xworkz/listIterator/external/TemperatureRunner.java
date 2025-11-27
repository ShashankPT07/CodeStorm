package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TemperatureRunner {
    public static void main(String[] args) {
        List<Float> tempList = new ArrayList<>();
        tempList.add(32.5f);
        tempList.add(28.0f);
        tempList.add(30.7f);
        tempList.add(35.2f);

        ListIterator<Float> iterator = tempList.listIterator();

        while (iterator.hasNext()) {
            Float temp = iterator.next();

            if (temp.equals(28.0f)) {
                iterator.add(29.0f);
            }
            if (temp.equals(35.2f)) {
                iterator.set(36.0f);
            }
            if (temp.equals(30.7f)) {
                iterator.remove();
            }

            System.out.println(temp);
        }

        System.out.println("Final temperature list: " + tempList);
    }
}
