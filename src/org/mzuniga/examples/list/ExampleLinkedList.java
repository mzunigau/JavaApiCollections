package org.mzuniga.examples.list;

import org.mzuniga.examples.models.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleLinkedList {

    public static void main(String[] args) {

        LinkedList<Student> st= new LinkedList<>();
        System.out.println(st + " , size = "+ st.size());
        System.out.println("Empty? ="+ st.isEmpty());
        st.add(new Student("Marco", 10));
        st.add(new Student("George", 5));
        st.add(new Student("Jhon", 8));
        st.add(new Student("Denis", 9));
        st.add(new Student("Mike", 2));
        st.add(new Student("Andrew", 3));
        st.add(new Student("Lucas", 3));

        System.out.println(st + " , size = "+ st.size());

        st.addFirst(new Student("Freddy", 10));
        st.addLast(new Student("Vanessa", 10));

        System.out.println(st + " , size = "+ st.size());

        System.out.println("First = " + st.getFirst());
        System.out.println("Last = " + st.getLast());
        System.out.println("Index 2 = " + st.get(2));

        st.removeFirst();
        st.removeLast();
        System.out.println(st + " , size = "+ st.size());

        st.set(3, new Student("Louis",4));
        System.out.println(st + " , size = "+ st.size());

        ListIterator<Student> li= st.listIterator();
        System.out.println("ListIterator >");
        while (li.hasNext()){
            Student stdd = li.next();
            System.out.println(stdd);
        }
        System.out.println("+++++++++++++++++++++");
        while (li.hasPrevious()){
            Student stdd = li.previous();
            System.out.println(stdd);
        }

    }
}
