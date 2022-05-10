/**
 * Написать программу, которая определяет, является ли число «счастливым».
 * Осуществить проверку для шестизначных чисел.
 * Число пользователь вводит с клавиатуры.
 **/

package ru.nshi.learn.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    public void equals() {

        assertEquals(false, task1.answer(123124));

    }
}
