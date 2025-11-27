package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarRunner {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        carList.add("Toyota");
        carList.add("Honda");
        carList.add("Ford");
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Tesla");

        ListIterator<String> carIterator = carList.listIterator();

        while (carIterator.hasNext()) {
            String car = carIterator.next();
            if (car=="Honda") {
                carIterator.add("Hyundai");
            }
            if (car=="BMW") {
                carIterator.add("Mercedes");
            }if(car=="Audi")
                carIterator.remove();

            System.out.println(car);
        }

        System.out.println("Final list of car names: " + carList);
    }
}

