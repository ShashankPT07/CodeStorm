package com.xworkz.sortedlist.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Descending {
    public static void main(String[] args) {
        List<Integer> descending=new ArrayList<>(Arrays.asList(5,2,4,8,9,1,7).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        descending.forEach(n-> System.out.println(n));
    }
}
