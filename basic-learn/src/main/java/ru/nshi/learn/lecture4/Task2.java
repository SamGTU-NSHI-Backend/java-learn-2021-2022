package ru.nshi.learn.lecture4;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 */
public class Task2 {
    public static final Task1 task1 = new Task1();

    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();
        Task2 task2 = new Task2();

        int[] array = new int[10];
        System.out.print("Исходный массив: ");
        arraysLecture.printArray(array);
        System.out.println();

        System.out.print("Результирующий массив: ");
        task2.fillArrayWithDistinctValues(array, 0, 101);
        arraysLecture.printArray(array);
        System.out.println();

        if (task2.containsDistinctValues(array)) {
            System.out.println("Массив состоит из уникальных значений.");
        } else {
            System.out.println("Массив содержит дубликаты.");
        }
    }

    public void fillArrayWithDistinctValues(int[] array, int start, int end) {
        // O(n^2)
        if (array.length > end - start) {
            System.err.println("Невозможно заполнить массив уникальными значениями.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int value = task1.randomInt(start, end);
            while (indexOf(array, value) != -1) {
                value = task1.randomInt(start, end);
            }
            array[i] = value;
        }
    }

    public int indexOf(int[] array, int value) {
        // O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean containsDistinctValues(int[] array) {
        // O(n^2)
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
