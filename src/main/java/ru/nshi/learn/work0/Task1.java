package ru.nshi.learn.work0;

/**
 * @author rassafel
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.isEven(1));
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
