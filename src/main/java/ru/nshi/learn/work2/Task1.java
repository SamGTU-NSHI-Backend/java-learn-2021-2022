package ru.nshi.learn.work2;

import ru.nshi.learn.lection2.ArrayLection;

public class Task1 {
    public static void main(String main[]) {
        ArrayLection lection = new ArrayLection();
        int array[] = new int[5];
        lection.randomizeArray(array, 10, 100);
        lection.printArray(array);
    }
}
