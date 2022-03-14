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

    @Override
    public String toString() {
        String result = "Person{";

        result += "weight="+ weight;

        return result + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return Double.compare(person.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Delete person object.");
    }
}
