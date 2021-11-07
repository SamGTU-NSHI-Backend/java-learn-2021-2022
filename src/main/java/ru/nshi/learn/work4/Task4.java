package ru.nshi.learn.work4;

import  ru.nshi.learn.work4.Task3;

public class Task4 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        String string = "a1b23c4%&50";
        int sum = task4.sumString(string, task3);
        System.out.println("The sum is: " + sum);
    }
    public int sumString(String string, Task3 task3) {
        int sum = task3.getNumbersStream(string)
            .reduce(0, (int a, int b) -> a + b);
        return sum;
    }
}

