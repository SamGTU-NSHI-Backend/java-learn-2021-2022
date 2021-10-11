package ru.nshi.learn.lecture4;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 */
public class Task3 {
    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();
        Task3 task3 = new Task3();

        int[] array = new int[10];
        task3.fillArrayArifProgression(array, 1,1);


        System.out.print("Исходный массив: ");
        arraysLecture.printArray(array);
        System.out.println();

        System.out.print("Результирующий массив: ");
        int[] shiftArray = task3.shift(array, 1);
        arraysLecture.printArray(shiftArray);
        System.out.println();

        System.out.println("Сравнение ссылок на массивы: " + (array == shiftArray));
        System.out.println("Сравнение элементов массивов: " + task3.isArraysEqualsWithOrder(array, shiftArray));
    }

    public boolean isArraysEqualsWithOrder(int[] arrayA, int[] arrayB) {
        if(arrayA.length != arrayB.length) {
            return false;
        }
        for (int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] != arrayB[i]) {
                return false;
            }
        }
        return true;
    }

    public void fillArrayArifProgression(int[] array, int start, int increment) {
        for (int i = 0; i < array.length; i++) {
            array[i] = start + increment * i;
        }
    }

    public int[] shift(int[] array, int shiftValue) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int shiftIndex = Math.floorMod(i + shiftValue, array.length);
            result[shiftIndex] = array[i];
        }
        return result;
    }
}
