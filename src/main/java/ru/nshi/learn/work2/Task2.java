/**
 * Найти сумму положительных элементов одномерного массива.
 * Диапазон случайных значений [-50, 51).
 **/

package ru.nshi.learn.work2;

import java.util.Random;

public class Task2 {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] array = new int[5];
        int Summ = 0;
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(101) - 50;
            if (array[index] > 0) {
                Summ += array[index];
            }
        }

        System.out.println("Значения массива:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Сумма положительных значений массива: " + Summ);
    }
}
