package org.mzuniga.examples.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSetFindDuplicate {
    public static void main(String[] args) {

        String[] fishes =  {"Marlin","Tuna", "Robalo","Spade", "Tuna"};

        Set<String> unique = new HashSet<>();

        for(String fish: fishes){
            if(!unique.add(fish)){
                System.out.println("Duplicated element: " + fish);
            }
        }

        System.out.println(unique.size() + " elements no duplicated : " + unique);
    }
}
