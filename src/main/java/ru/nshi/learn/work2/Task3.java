/**
 * Найти максимальный и минимальный элемент в одномерном массиве.
 **/

package ru.nshi.learn.work2;

import java.util.Random;

public class Task3 {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(2001) - 1000;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
        }
        System.out.println("Значения массива:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Значения максимума и минимума: " + maximum + ", " + minimum);
    }
}
