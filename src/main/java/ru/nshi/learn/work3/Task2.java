package ru.nshi.learn.work3;

import  ru.nshi.learn.work3.Task1;

public class Task2 {
    public static void main(String[] args) {
        final int size = 10;
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        int mat[][] = task1.genMat(size, 0, 100);
        task1.displayMat(mat, size);
        System.out.printf("%s", "Массив сумм всех столбцов: ");
        int[] array = task2.arrayOfColSums(mat, size);
        task1.displayArray(array, size);

    }
    public int[] arrayOfColSums(int[][] mat, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = colSum(mat, size, i);
        }
        return array;
    }
    public int colSum(int[][] mat, int size, int col) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += mat[i][col];
        }
        return sum;
    }
}
