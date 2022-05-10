/**
 * Напишите метод, который принимает массив строк, состоящих из букв, цифр и иных символов.
 * Метод должен вернуть строку с максимальным количеством уникальных символов.
 **/

package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    Task6 task6;
    String xp = "ABCNk15j3g";

    @BeforeEach
    void setUp() {
        task6 = new Task6();
    }

    @Test
    void main() {
        assertEquals(xp, task6.Massi("ABCNkk15j35g"));
    }
}
