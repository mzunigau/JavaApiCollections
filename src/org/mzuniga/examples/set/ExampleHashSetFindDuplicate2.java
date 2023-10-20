package org.mzuniga.examples.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSetFindDuplicate2 {
    public static void main(String[] args) {

        String[] fishes =  {"Marlin","Tuna", "Robalo","Spade", "Tuna"};

        Set<String> unique = new HashSet<>();
        Set<String> duplicated = new HashSet<>();

        for(String fish: fishes){
            if(!unique.add(fish)){
                duplicated.add(fish);
            }
        }

        unique.removeAll(duplicated);

        System.out.println(unique.size() + " elements no duplicated : " + unique);
        System.out.println(duplicated.size() + " elements  duplicated : " + duplicated);

    }
}
