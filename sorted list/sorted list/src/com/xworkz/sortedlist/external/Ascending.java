package com.xworkz.sortedlist.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
    public static void main(String[] args) {


        List<Integer> ascending = new ArrayList<>(Arrays.asList(5, 2, 4, 8, 9, 1, 7).stream().sorted().collect(Collectors.toList()));
        ascending.forEach(n -> System.out.println(n));
    }
}
