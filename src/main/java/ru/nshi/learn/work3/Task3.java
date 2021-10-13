package ru.nshi.learn.work3;

import  ru.nshi.learn.work3.Task1;
import  ru.nshi.learn.work3.Task2;

public class Task3 {
    public static void main(String[] args) {
        final int size = 10;

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        int mat[][] = task1.genMat(size, 0, 100);
        task1.displayMat(mat, size);
        boolean lucky = task3.isMagicSquare(mat, size, task1, task2);
        System.out.printf("%s", "Массив оказался "  + (lucky ? "магических квадратом" : "обычным"));
    }
    public boolean isMagicSquare(int[][] mat, int size, Task1 task1, Task2 task2) {
        int number = task1.sumArray(mat[0], size); // Every sum should be equal to this number
        for (int i = 0; i < size; i++) {
            if (task1.sumArray(mat[i], size) != number) return false;
            if (task2.colSum(mat, size, i)   != number) return false;
        }
        if (reverseDiagSum(mat, size) != number) return false;
        if (diagSum       (mat, size) != number) return false;
        return true;
    }
    public int diagSum(int[][] mat, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += mat[i][i];
        }
        return sum;
    }
    public int reverseDiagSum(int[][] mat, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += mat[i][size - (i + 1)];
        }
        return sum;
    }
}
