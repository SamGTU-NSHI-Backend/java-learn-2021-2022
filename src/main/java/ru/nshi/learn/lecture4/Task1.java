package ru.nshi.learn.lecture4;

import java.util.Random;

/**
 * @author rassafel
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] array = new int[1];
        System.out.print("Исходный массив: ");
        task.printArray(array);
        System.out.println();

        System.out.print("Результирующий массив: ");
        task.fillArray(array, 130, 10, 100);
        task.printArray(array);
        System.out.println();
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
    }

    public void fillArray(int[] array, int s, int start, int end) {
        for (int i = 0; i < array.length; i += 2) {
            array[i] = randomInt(start, end);
            if (i + 1 < array.length) {
                array[i + 1] = s - array[i];
            }
        }
    }

    public int randomInt(int start, int end) {
        int diff = end - start;
        return (int)(Math.random() * diff) + start;
    }
}
