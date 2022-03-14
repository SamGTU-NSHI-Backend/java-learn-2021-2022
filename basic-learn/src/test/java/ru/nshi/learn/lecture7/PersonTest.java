package ru.nshi.learn.lecture7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class PersonTest {
    Person person;
    String firstName, secondName, middleName;
    int age;
    double weight;

    @BeforeEach
    void setUp() {
        age = 20;
        weight = 50;
        firstName = "FirstName";
        secondName = "SecondName";
        middleName = "MiddleName";
        firstName = "FirstName";
        person = new Person(firstName,
                secondName,
                middleName,
                age,
                weight);
    }

    @Test
    void toStringTest() {
        String expected = "Person{weight=50.0}";
        String actual = person.toString();

        assertEquals(expected, actual);
    }

    @Test
    void finalizeTest() throws InterruptedException {
        person = null;
        System.gc();
    }
}
