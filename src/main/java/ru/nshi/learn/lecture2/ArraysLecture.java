package ru.nshi.learn.lecture2;

import java.util.Scanner;
import java.util.Random;

/**
 * @author rassafel
 */
public class ArraysLecture {
    public static void main(String[] args) {
        ArraysLecture application = new ArraysLecture();
        int[] array = application.createArray(10);
        array = application.fillArrayByRandom(array);
        application.printArray(array);

        System.out.println();

        int[][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = application.createArray(i);
        }
        application.printArray(matrix);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByScanner(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input number: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public int[] fillArrayByRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(90) + 10;
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i+1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public void printArray(int[][] array) {
        for(int[] row: array) {
            printArray(row);
        }
    }
}
