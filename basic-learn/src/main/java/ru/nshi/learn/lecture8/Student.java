package ru.nshi.learn.lecture8;

import java.util.Comparator;

/**
 * @author rassafel
 */
public class Student implements Comparable<Student> {
    public static final Comparator<Student> COMPARATOR_BY_COURSE =
        Comparator.comparingInt(Student::getCourse);

    private int id;
    private String firstName;
    private int course;
    private Faculity faculity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public Student(int id, String firstName, int course, Faculity faculity) {
        this.id = id;
        this.firstName = firstName;
        this.course = course;
        this.faculity = faculity;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", course=" + course +
            ", faculity=" + faculity +
            '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Faculity getFaculity() {
        return faculity;
    }

    public void setFaculity(Faculity faculity) {
        this.faculity = faculity;
    }

    @Override
    public int compareTo(Student o) {
        return COMPARATOR_BY_COURSE.compare(this, o);
    }
}
