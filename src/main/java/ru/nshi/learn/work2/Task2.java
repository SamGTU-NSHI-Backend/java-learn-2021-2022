package ru.nshi.learn.work2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int[] array = task2.createArray(10);
        array = task2.fillArrayByRandom(array);
        int Summa = task2.SummaArray(array);
        task2.printArray(array);
        System.out.println("\nSumma is " + Summa);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101) - 50 ;
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

    public int SummaArray(int[] array) {
        int Summa=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                Summa += array[i];
            }

        }
        return Summa;
    }
}
