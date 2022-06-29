package ru.nshi.learn.lecture4;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 */
public class Task8 {
    public static final Task1 task1 = new Task1();

    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();

        Task8 task8 = new Task8();

        int[] array = new int[100];
        task8.fillArray(array, 0, 10);

        System.out.print("Исходный массив: ");
        arraysLecture.printArray(array);
        System.out.println();

        int[] countValues = task8.groupByValue(array);

        for (int value = 0; value < countValues.length; value++) {
            int count = countValues[value];
            System.out.printf("Число %d встречалось %d раз\n", value, count);
        }
    }

    public void fillArray(int[] array, int start, int end) {
        for (int i = 0; i < array.length; i++) {
            array[i] = task1.randomInt(start, end);
        }
    }

    public int[] groupByValue(int[] array) {
        int[] result = new int[10];
        for (int value = 0; value < result.length; value++) {
            result[value] = count(array, value);
        }
        return result;
    }

    public int count(int[] array, int number) {
        int count = 0;
        for (int value : array) {
            if (value == number) {
                count++;
            }
        }
        return count;
    }
}
