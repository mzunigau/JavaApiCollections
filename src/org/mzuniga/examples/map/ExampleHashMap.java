package org.mzuniga.examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleHashMap {
    public static void main(String[] args) {

        Map<String, String> person = new HashMap<>();
        person.put(null, "12345");
        person.put("name", "Jhon");
        person.put("lastname", "Wilson");
        person.put("email", "Jhon@email.com");
        person.put("age", "30");

        System.out.println("person = " + person);

        String name = person.get("name");
        System.out.println("name = " + name);

        boolean deleted = person.remove("lastname", "Wilson");
        //String deleted = person.remove("lastname");
        System.out.println("Deleted = " + deleted);
        System.out.println("person = " + person);

        boolean b2= person.containsKey("lastname")   ;
        System.out.println("b2 = "+ b2 );

        b2 = person.containsValue("Jhon");
        System.out.println("b2 = "+ b2 );

        System.out.println("===Values===");
        Collection<String> values = person.values();
        for (String value: values){
            System.out.println(value);
        }

        System.out.println("===Keys===");
        Set<String> keys = person.keySet();
        for (String key : keys){
            System.out.println(key);
        }
        System.out.println("_________________________________entrySet");
        for (Map.Entry<String, String> pair: person.entrySet()){
            System.out.println(pair.getKey() + " => " + pair.getValue());
        }
        System.out.println("_________________________________keySet");
        for(String key: person.keySet()){
            String value = person.get(key);
            System.out.println(key + " => " + value);
        }

        System.out.println("_________________________________forEach");

        person.forEach((key, value)->System.out.println(key + " -> " + value));

        System.out.println(" total = " + person.size());
        System.out.println(" empty = " + person.isEmpty());
        boolean b3 = person.replace("name", "Jhon" , "Douglas");
        //person.replace("name" , "Douglas");
        System.out.println("b3 = " + b3);
        System.out.println("person = " + person);

    }
}
