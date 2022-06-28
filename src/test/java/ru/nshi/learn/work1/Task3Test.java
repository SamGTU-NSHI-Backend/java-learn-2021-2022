/**
 * Написать программу, которая определяет, является ли число простым.
 * Число пользователь вводит с клавиатуры.
 **/

package ru.nshi.learn.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 task3;

    @BeforeEach
    void setUp() {
        task3 = new Task3();
    }

    @Test
    void findSimpleNumber() {
        assertEquals(true, task3.FindSimpleNumber(199));
    }
}
