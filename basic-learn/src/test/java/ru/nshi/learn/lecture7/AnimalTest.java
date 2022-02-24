package ru.nshi.learn.lecture7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class AnimalTest {
    Animal animal = new Animal();

    @Test
    void sayTest() {
        String expected = "I am a animal.";
        String actual = animal.say();

        assertEquals(expected, actual);
    }
}
