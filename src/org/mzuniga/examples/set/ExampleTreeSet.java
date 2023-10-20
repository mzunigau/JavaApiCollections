package org.mzuniga.examples.set;


import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Three");
        ts.add("Four");
        ts.add("Five");
        ts.add("Six");

        System.out.println("ts = " + ts);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);

        System.out.println("numbers = " + numbers);




    }
}
