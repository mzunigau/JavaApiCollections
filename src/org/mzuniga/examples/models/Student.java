package org.mzuniga.examples.models;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return  "name='" + name +", score=" + score;
    }

    @Override
    public int compareTo(Student st) {
//        if(this.name == null) {
//           return 0;
//        }
//        return this.name.compareTo(st.name);
//        if(this.score.equals(st.score)) {
//            return 0;
//        }
//        if(this.score > st.score) {
//            return 1;
//        }else {
//            return -1;
//        }
        if(this.score == null){
            return 0;
        }
        return  this.score.compareTo(st.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
