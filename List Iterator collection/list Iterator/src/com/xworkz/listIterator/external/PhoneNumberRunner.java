package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PhoneNumberRunner {
    public static void main(String[] args) {
        List<Long> phoneList = new ArrayList<>();
        phoneList.add(9876543210L);
        phoneList.add(9123456789L);
        phoneList.add(9988776655L);
        phoneList.add(9000000000L);

        ListIterator<Long> iterator = phoneList.listIterator();

        while (iterator.hasNext()) {
            Long num = iterator.next();

            if (num.equals(9876543210L)) {
                iterator.add(9111111111L);
            }
            if (num.equals(9988776655L)) {
                iterator.set(9999999999L);
            }
            if (num.equals(9000000000L)) {
                iterator.remove();
            }

            System.out.println(num);
        }

        System.out.println("Final phone number list: " + phoneList);
    }
}
