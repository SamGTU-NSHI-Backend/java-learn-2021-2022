/**
 * Задания 1 и 2 двумерного массива
 * Вычислить сумму каждой строки двумерного массива и записать результаты в одномерный массив.
 * и
 * Вычислить сумму каждого столбца двумерного массива и записать результаты в одномерный массив.
 **/

package ru.nshi.learn.work3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.work0.work3.Utils;


import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    Utils utils;
    int[][] array = new int[10][10];
    int[] xp = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

    @BeforeEach
    void setUp() {
        utils = new Utils();
        Utils.generatePredeterminedNumbersForArray2D(array);
    }

    @Test
    void sumRows() {

        assertArrayEquals(xp, utils.sumRows(array));
    }

    @Test
    void sumColumns() {
        assertArrayEquals(xp, utils.sumColumns(array));
    }
}
