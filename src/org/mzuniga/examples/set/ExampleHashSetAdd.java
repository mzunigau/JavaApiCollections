package org.mzuniga.examples.set;

import java.util.*;

public class ExampleHashSetAdd {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");

        List<String> ls = new ArrayList<>(hs);
        Collections.sort(ls);

        System.out.println("Set = " + hs);
        System.out.println("Ordened list = "+ls);

       boolean b =  hs.add("Two");

        System.out.println(hs);
        System.out.println(b);

    }

}
