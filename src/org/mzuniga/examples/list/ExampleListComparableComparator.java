package org.mzuniga.examples.list;

import org.mzuniga.examples.models.Student;

import java.util.*;

public class ExampleListComparableComparator {

    public static void main(String[] args) {

        List<Student> st= new ArrayList<>();

        st.add(new Student("Marco", 10));
        st.add(new Student("George", 5));
        st.add(new Student("Jhon", 8));
        st.add(new Student("Denis", 9));
        st.add(new Student("Mike", 2));
        st.add(new Student("Mike", 3));
        st.add(new Student("Lucas", 3));
        //Collections.sort(st, (a,b) -> b.getScore().compareTo(a.getScore()));
        //st.sort((a, b) -> a.getName().compareTo(b.getName()));
        st.sort(Comparator.comparing(Student::getScore).reversed());
        System.out.println(st);


        System.out.println("ForEach Lambda");
        st.forEach(System.out::println);

    }
}
