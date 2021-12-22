/**
 * Вычислить сумму каждого столбца двумерного массива и записать результаты в одномерный массив.
 **/

package ru.nshi.learn.work3;


public class Task2 {

    public static void main(String[] args) {

// Создаем двумерный массив
        int[][] array = new int[10][10];

        Utils.generateRandomNumbersForArray2D(array);

        Utils.printArray(array);

        int[] arraySums = Utils.sumColumns(array);

        Utils.printSums(arraySums);

    }
}
