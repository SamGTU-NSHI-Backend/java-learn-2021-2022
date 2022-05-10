/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод возвращает строку, составленную только из заглавных букв.
 **/
package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    Task2 task2;

    String sr = "ФSЕEQ";

    @BeforeEach
    void setUp() {
        task2 = new Task2();
    }

    @Test
    void main() {
        assertEquals(sr, task2.newString("ФSва12ЕE_3Q"));
    }
}
