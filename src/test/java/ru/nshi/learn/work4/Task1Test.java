/**
 * Напишите метод, который получает в качестве параметра строку и возвращает массив из следующих элементов:
 * первый символ строки;
 * два первых символа;
 * три первых символа и так далее.
 **/

package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    Task1 task1;

    String[] sr = {"1", "12", "123", "123a", "123ab", "123abc", "123abc*", "123abc*-", "123abc*-+"};

    @BeforeEach
    void setUp() {
        task1 = new Task1();

    }

    @Test
    void main() {
        assertArrayEquals(sr, task1.newStrings("123abc*-+"));
    }
}
