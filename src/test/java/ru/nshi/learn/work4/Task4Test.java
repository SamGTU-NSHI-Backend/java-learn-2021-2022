/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть сумму из всех цифр в строке.
 **/
package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    Task4 task4;

    int summ = 14;

    @BeforeEach
    void setUp() {
        task4 = new Task4();
    }

    @Test
    void main() {
        assertEquals(summ, task4.summ("ABCNkk15j35g"));
    }
}
