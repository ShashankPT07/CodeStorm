package com.xworkz.listIterator.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StatusRunner {
    public static void main(String[] args) {
        List<Boolean> statusList = new ArrayList<>();
        statusList.add(true);
        statusList.add(false);
        statusList.add(true);
        statusList.add(false);

        ListIterator<Boolean> iterator = statusList.listIterator();

        while (iterator.hasNext()) {
            Boolean status = iterator.next();

            if (status.equals(true)) {
                iterator.add(false);
            }
            if (status.equals(false)) {
                iterator.set(true);
            }

            System.out.println(status);
        }

        System.out.println("Final status list: " + statusList);
    }
}
