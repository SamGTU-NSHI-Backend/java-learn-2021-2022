package ru.nshi.learn.work2;

import  ru.nshi.learn.work2.Task3;
import  ru.nshi.learn.lection2.ArrayLection;

public class Task5 {
    public static void main(String main[]) {
        // The sum of elements between the min and max id
        int array[] = new int[10];
        ArrayLection al = new ArrayLection();
        al.randomizeArray(array, 10, 100);
        al.printArray(array);

        int max_id = Task3.array_max_id(array);
        int min_id = Task3.array_min_id(array);
        int sum = 0;
        for (int i = min_id; i < max_id; i++) {
            sum += array[i];
        }
        System.out.println("The sum of all elements from [" + min_id + "] to [" + max_id + "] = " + sum);
    }
}
