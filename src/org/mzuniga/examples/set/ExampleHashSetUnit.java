package org.mzuniga.examples.set;

import org.mzuniga.examples.models.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleHashSetUnit {

    public static void main(String[] args) {
        Set<Student> st= new HashSet<>();

        st.add(new Student("Marco", 10));
        st.add(new Student("George", 5));
        st.add(new Student("Jhon", 8));
        st.add(new Student("Denis", 9));
        st.add(new Student("Mike", 2));
        st.add(new Student("Mike", 3));
        st.add(new Student("Lucas", 3));

        System.out.println(st);

    }
}
