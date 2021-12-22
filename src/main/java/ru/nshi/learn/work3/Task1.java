/**
 * Вычислить сумму каждой строки двумерного массива и записать результаты в одномерный массив.
 **/

package ru.nshi.learn.work3;

public class Task1 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        Utils.generateRandomNumbersForArray2D(array);

        Utils.printArray(array);

        int[] arraySums = Utils.sumRows(array);

        Utils.printSums(arraySums);
    }
}
