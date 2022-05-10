package ru.nshi.learn.work3;

import java.util.Random;

public class Utils {
    public static Random random = new Random();

    public static void printArray(int[][] array) {
// Распечатываем двумерный массив
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printSums(int[] arraySums) {
// Распечатываем результаты
        for (int currentSum : arraySums) {
            System.out.printf("%4d", currentSum);
        }
        System.out.println();
    }

    public static void generateRandomNumbersForArray2D(int[][] array) {
// Заполняем двумерный массив случайными числами


        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = Utils.random.nextInt(100);

            }
        }
    }

    public static void generatePredeterminedNumbersForArray2D(int[][] array) {


        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                array[row][column] = 1;
            }
        }
    }

    public static int[] sumRows(int[][] array) {
// Сумма чисел на строках

        int[] arraySums = new int[array.length];
        int index = 0;

// Подсчитываем сумму на строках
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int columns = 0; columns < array[row].length; columns++) {
                sum = sum + array[row][columns];
            }
            arraySums[index] = sum;

            index++;
        }
        return arraySums;
    }


    public static int[] sumColumns(int[][] array) {
// Сумма чисел на столбцах
        int[] arraySums = new int[array.length];
        int index = 0;

// Подсчитываем сумму на столбцах
        for (int columns = 0; columns < array[0].length; columns++) {

            int sum = 0;
            for (int row = 0; row < array.length; row++) {
                sum = sum + array[row][columns];
            }
            arraySums[index] = sum;

            index++;
        }
        return arraySums;
    }


    public static int[] sumHomeDiagonal(int[][] array) {
// Сумма чисел на строках
        int[] arraySums = new int[array.length];
        int index = 0;

// Подсчитываем сумму на строках
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int column = 0; column < array[row].length; column++) {
                sum = sum + array[row][row];
            }
            arraySums[index] = sum;

            index++;
        }
        return arraySums;
    }


    public static int[] sumSecondaryDiagonal(int[][] array) {
        int[] arraySums = new int[array.length];
        int index = 0;


// Подсчитываем сумму на строках
        for (int columns = 0; columns < array[0].length; columns++) {

            int sum = 0;
            for (int row = array.length - 1; row >= 0; row--) {
                sum = sum + array[row][row];
            }
            arraySums[index] = sum;

            index++;
        }
        return arraySums;
    }
}
