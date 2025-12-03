package com.xworkz.sortedlist.external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> even=new ArrayList<>(Arrays.asList(5,2,4,8,9,1,7).stream().filter(n-> n%2==0).collect(Collectors.toList()));
        even.forEach(n-> System.out.println(n));
    }
}
