/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть массив из всех цифр в строке.
 **/
package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3;

    char[] XP = {'1', '5', '3', '5'};

    @BeforeAll
    void setUp() {
        task3 = new Task3();
    }

    @Test
    void main() {
        assertArrayEquals(XP, task3.Massi("ABCNkk15j35g"));
    }
}
