package ru.nshi.learn.work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 10;
        Task1 task1 = new Task1();
        int[][] mat = task1.genMat(size, 0, 100);
        task1.displayMat(mat, size);
        System.out.printf("%s", "Массив сумм всех строк: ");
        int[] array = task1.arrayOfRowSums(mat, size);
        task1.displayArray(array, size);
    }
    public int[][] genMat(int size, int min, int max) {
        int[][] mat = new int[size][size];
        Random rng = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = rng.nextInt(max - min) + min;
            }
        }
        return mat;
    }
    public void displayMat(int[][] mat, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d, ", mat[i][j]);
            }
            System.out.printf("%c", '\n');
        }
    }
    public void displayArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%c", '\n');
    }
    public int sumArray(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }
    public int[] arrayOfRowSums(int[][] mat, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sumArray(mat[i], size);
        }
        return array;
    }
}
