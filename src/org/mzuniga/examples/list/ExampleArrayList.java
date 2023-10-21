package org.mzuniga.examples.list;

import org.mzuniga.examples.models.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ExampleArrayList {

    public static void main(String[] args) {

        List<Student> st= new ArrayList<>();
        System.out.println(st + " , size = "+ st.size());
        System.out.println("Empty? ="+ st.isEmpty());
        st.add(new Student("Marco", 10));
        st.add(new Student("George", 5));
        st.add(new Student("Jhon", 8));
        st.add(new Student("Denis", 9));
        st.add(2, new Student("Mike", 2));
        st.set(3, new Student("Andrew", 3));
        st.add(new Student("Lucas", 3));

        System.out.println(st + " , size = "+ st.size());

        //st.remove(new Student("Mike", 3));
        st.remove(2);
        System.out.println(st + " , size = "+ st.size());

        boolean v = st.contains(new Student("Mike", 2));
        System.out.println("Contains Mike? "+ v);

        Object a[] = st.toArray();
        for (int i=0; i < a.length; i++){
            System.out.println("Iterating from array "+a[i] );
        }

    }
}
