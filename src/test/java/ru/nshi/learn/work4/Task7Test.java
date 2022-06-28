/**
 * Напишите метод, который принимает строку, состоящую из слов, разделенных пробелами.
 * Метод должен вернуть слово с максимальным количеством уникальных символов.
 **/

package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    Task7 task7;
    String maxword = "knowely";

    @BeforeEach
    void setUp() {
        task7 = new Task7();
    }

    @Test
    void main() {
        assertEquals(maxword, task7.Massi("What you knowelly abboobagil"));
    }
}
