package ru.nshi.learn.work2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array);
        task1.printArray(array);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(9)+1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
    }
}
