package org.mzuniga.examples.set;

import org.mzuniga.examples.models.Student;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSetComparable {

    public static void main(String[] args) {
       // Set<Student> st= new TreeSet<>((a,b)-> b.getScore().compareTo(a.getScore()));
        Set<Student> st= new TreeSet<>(comparing(Student::getName).reversed());

        st.add(new Student("Marco", 10));
        st.add(new Student("George", 5));
        st.add(new Student("Jhon", 8));
        st.add(new Student("Denis", 9));
        st.add(new Student("Mike", 2));
        st.add(new Student("Lucas", 3));



        System.out.println(st);

    }
}
