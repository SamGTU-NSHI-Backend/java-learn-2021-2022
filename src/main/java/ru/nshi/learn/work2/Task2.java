package ru.nshi.learn.work2;

import  ru.nshi.learn.lection2.ArrayLection;

public class Task2 {
    public static void main(String args[]) {
        ArrayLection al = new ArrayLection();
        int array[] = new int[10];
        al.randomizeArray(array, -50, 51);
        al.printArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (array[i] > 0) ? array[i] : 0;
        }
        System.out.println("The sum of all positive numbers in the arary = " + sum);
    }
}
