package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FruitRunner {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Grapes");
        fruitList.add("Pineapple");

        ListIterator<String> fruitIterator = fruitList.listIterator();

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();

            if (fruit.equals("Banana")) {
                fruitIterator.add("Kiwi");
            }
            if (fruit.equals("Mango")) {
                fruitIterator.remove();
            }
            if (fruit.equals("Orange")) {
                fruitIterator.set("Papaya");
            }

            System.out.println(fruit);
        }

        System.out.println("Final list of fruits: " + fruitList);
    }
}
