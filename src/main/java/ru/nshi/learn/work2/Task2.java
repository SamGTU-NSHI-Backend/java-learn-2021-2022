package ru.nshi.learn.work2;

import ru.nshi.learn.work1.Task1;

public class Task2 {
    public static void main(String args[]) {
        int firstNumber = 100000;
        int lastNumber  = 999999;
        int sum = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            if (!Task1.isLucky(i)) continue;
            sum += i;
        }
        System.out.println("The total sum is " + sum);
    }
}
