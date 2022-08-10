package com.basic.interview.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Employee> mylist = new ArrayList<>();
        mylist.add(new Employee("Raj kumar", 1, "CSE", "Bangalore", 65000.0));
        mylist.add(new Employee("Sakshi", 2, "Sports", "Ranchi", 125000.0));
        mylist.add(new Employee("Chandrashekar", 3, "Science", "Hyderabad", 45000.0));
        mylist.add(new Employee("Vinayaka", 4, "CSE", "Bangalore", 80000.0));
        mylist.add(new Employee("Ganesh", 5, "Housing", "Kolar", 49000.0));
        mylist.add(new Employee("Dhoni", 6, "Sports", "Ranchi", 2500000.0));


        //Program to get the 3rd highest salary
        Double maplist = mylist.stream().sorted((emp1, emp2) -> Integer.valueOf((int) (emp2.getSalary() - emp1.getSalary()))).skip(2)
                .findFirst().map(Employee::getSalary).get();

        System.out.println(maplist);

        //program to count the number of duplicate numbers
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 8, 3, 4, 1, 9, 3, 8);
        Map<Integer, Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //To uppercase
        mylist.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));


    }
}
