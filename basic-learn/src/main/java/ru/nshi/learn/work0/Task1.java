package ru.nshi.learn.work0;

import java.util.Scanner;

/**
 * @author rassafel
 */
public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputValue = input.nextInt();

        System.out.println(task.isEven(inputValue));
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
