package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class Person {
    private final String firstName, secondName, middleName;
    private final int age;
    private final double weight;

    public static final String STATIC_REF = "static";

    public Person() {
        this("Gregory", null, null, 10, 10.5);
    }

    public Person(String firstName, String secondName, String middleName, int age, double weight) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
