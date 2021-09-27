package ru.nshi.learn.work2;

import ru.nshi.learn.lection2.ArrayLection;

public class Task3 {
    public static void main(String args[]) { 
        // Find the maximum and minimum
        int array[] = new int[10];
        ArrayLection al = new ArrayLection();
        al.randomizeArray(array, 10, 100);
        al.printArray(array);
        int max = array[array_max_id(array)];
        int min = array[array_min_id(array)];

        System.out.println("The minimum element = " + min);
        System.out.println("The maximum element = " + max);
    }
    public static int array_min_id(int array[]) {
        int min = array[0];
        int id = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                id = i;
                min = array[i];
            }
        }
        return id;
    }
    public static int array_max_id(int array[]) {
        int max = array[0];
        int id = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                id = i;
                max = array[i];
            }
        }
        return id;
    }
}
