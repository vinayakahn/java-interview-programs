package com.basic.interview.programs.java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,23,5,1,23,5,89,6,8,10,5);
        //By using the Set Interface to print duplicate elements in a list
        Set<Integer> set = new HashSet<>();
        Set duplicates = list.stream().filter(x-> !set.add(x)).collect(Collectors.toSet());
        System.out.println(duplicates);

        //By Using the frequency method to find the duplicate elements
        list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toSet()).forEach(i->System.out.println(i));
    }
}
