package ru.nshi.learn.lection2;

import java.util.Random;
import java.util.Scanner;

public class ArrayLection {
    public static void main(String main[]) {
        ArrayLection lection = new ArrayLection();
        int array[] = lection.createArray(10);
        lection.randomizeArray(array, -10, 10);
        lection.printArray(array);
    }
    public void inputArray(int array[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }
    public void randomizeArray(int array[], int min_value, int max_value) {
        Random rnd = new Random(69);
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max_value) + min_value;
        }
    }



    public int[] createArray(int length) {
        int array[] = new int[length];
        return array;
    }
    public void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value [" + i + "] = " + array[i]);
        }
    }
}
