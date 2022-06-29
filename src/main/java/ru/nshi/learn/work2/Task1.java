/**
 * Создать одномерный массив размером 5 и заполнить его случайными значениями.
 * Вывести массив в строку.
 **/

package ru.nshi.learn.work2;

import java.util.Random;

public class Task1 {
    static Random random = new Random();

    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] array = new int[5];
        task.printArray(array);
    }

    public void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(2001) - 1000;
            System.out.print(array[index] + ", ");
        }
    }
}
