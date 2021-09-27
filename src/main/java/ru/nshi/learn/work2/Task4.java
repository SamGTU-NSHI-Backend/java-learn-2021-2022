package ru.nshi.learn.work2;

import  ru.nshi.learn.lection2.ArrayLection;
import  ru.nshi.learn.work2.Task3;

public class Task4 {
    public static void main(String args[]) {
        // Switch max and min elements in the array
        int array[] = new int[10];
        ArrayLection al = new ArrayLection();
        al.randomizeArray(array, 10, 100);
        al.printArray(array);
        int max_id = Task3.array_max_id(array);
        int min_id = Task3.array_min_id(array);

        System.out.println("The max = " + array[max_id]);
        System.out.println("The min = " + array[min_id]);

        int max_value = array[max_id];
        array[max_id] = array[min_id];
        array[min_id] = max_value;

        System.out.println("Switched min and max elements");

        al.printArray(array);
    }
}
