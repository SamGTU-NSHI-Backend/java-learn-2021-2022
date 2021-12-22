/**
 * Найти среднее арифметическое элементов, стоящих между первым минимальным и первым максимальным значениями в одномерном массиве.
 **/

package ru.nshi.learn.work2;

import java.util.Random;

public class Task5 {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(2001) - 1000;
        }
        System.out.println("Значения массива:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

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
        int indexMinimum = -1;
        int indexMaximum = -1;
        for (int index = 0; index < array.length; index++) {

            if (array[index] == minimum) {
                indexMinimum = index;
            }
        }

        for (int index = 0; index < array.length; index++) {

            if (array[index] == maximum) {
                indexMaximum = index;
            }
        }

        System.out.println();
        System.out.println("Значения минимума и максимума: " + minimum + ", " + maximum);
        System.out.println();

        int counter = 0;
        int sumForAverage = 0;
        int average = 0;
        for (int index = indexMinimum + 1; index <= indexMaximum - 1; index++) {
            sumForAverage += array[index];
            counter++;
        }

        if (counter == 0) {
            System.out.println("Невозможно найти среднее арифметическое значение между минимумом и максимумом, нет таких элементов.");
        } else {
            average = sumForAverage / counter;
            System.out.println("Среднее арифметическое значение: " + average);
        }
    }
}
