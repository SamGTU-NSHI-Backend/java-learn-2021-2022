package ru.nshi.learn.lecture7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class DogTest {
    Dog dog = new Dog();

    @Test
    void sayTest() {
        String expected = "I am a dog.";
        String actual = dog.say();

        assertEquals(expected, actual);
    }
}
