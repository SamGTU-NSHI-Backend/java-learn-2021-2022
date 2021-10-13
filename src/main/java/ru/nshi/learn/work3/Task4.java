package ru.nshi.learn.work3;

import  ru.nshi.learn.work3.Task1;

public class Task4 {
    public static void main(String[] args) {
        final int size = 10;
        Task1 task1 = new Task1();
        Task4 task4 = new Task4();
        int[][] mat = task1.genMat(size, 0, 100);
        task1.displayMat(mat, size);
        task4.sortMat(mat, size);
        System.out.printf("%s", "Массив после сортировки: \n");
        task1.displayMat(mat, size);
    }
    // Swaps the value in the specified minRow and minCol with the smallest value in the array
    public void swapFirstMin(int[][] mat, int size, int minRow, int minCol) {
        int firstRow = minRow;
        int firstCol = minCol;
        int minVal = mat[minRow][minCol];
        int minValRow = minRow;
        int minValCol = minCol;
        for (int row = minRow; row < size; row++) {
            for (int col = minCol; col < size; col++) {
                int currentValue = mat[row][col];
                if (minVal > currentValue) {
                    minVal = currentValue;
                    minValRow = row;
                    minValCol = col;
                }
            }
            minCol = 0;
        }
        swap(mat, firstRow, firstCol, minValRow, minValCol);
    }
    public void sortMat(int[][] mat, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                swapFirstMin(mat, size, row, col);
            }
        }
    }
    public void swap(int[][] mat, int row1, int col1, int row2, int col2) {
        int temp = mat[row1][col1];
        mat[row1][col1] = mat[row2][col2];
        mat[row2][col2] = temp;
    }
}
