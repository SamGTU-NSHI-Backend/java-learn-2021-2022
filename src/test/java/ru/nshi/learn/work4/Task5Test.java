/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть строку состоящую из уникальных символов.
 **/
package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    Task5 task5;

    String xp = "qwerty";

    @BeforeEach
    void setUp() {
        task5 = new Task5();
    }

    @Test
    void main() {
        assertEquals(xp, task5.Massi("qwertyqwerty"));
    }
}
