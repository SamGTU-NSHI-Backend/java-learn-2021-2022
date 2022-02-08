package ru.nshi.learn.work0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
public class Task1Test {

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void testIsEven() {
        boolean actual = task1.isEven(2);
        assertTrue(actual);
    }

    @Test
    void testIsNotEven() {
        boolean actual = task1.isEven(1);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsNotEvenParametrized(int number) {
        boolean actual = task1.isEven(number);
        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenParametrized(int number) {
        boolean actual = task1.isEven(number);
        assertTrue(actual);
    }

    @ParameterizedTest
    @CsvSource({"2,true", "1,false", "3,false"})
    void testIsEvenCsv(int number, boolean expected) {
        boolean actual = task1.isEven(number);
        assertTrue(expected == actual);
    }
}
