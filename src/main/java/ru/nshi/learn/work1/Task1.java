package ru.nshi.learn.work1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.Lucky();
    }
    public static void Lucky() {
        int left = 0;
        int right = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("введите шестизначное число: ");
        int number = in.nextInt();

        for (int i = 0; i < 3; i++) {
            right += number % 10;
            number /= 10;
        }

        for (int i = 0; i < 3; i++) {
            left += number % 10;
            number /= 10;
        }

        if (left == right) {
            System.out.println("Число счастливое");
        } else
            System.out.println("число не счастливое");
    }
}
