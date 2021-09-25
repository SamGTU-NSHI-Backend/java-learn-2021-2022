package ru.nshi.learn.work1;

import java.util.Scanner;

public class Task1 {
    final static int e6 = 100000;
    final static int e5 = 10000;
    final static int e4 = 1000;
    final static int e3 = 100;
    final static int e2 = 10;

    public static void main(String[] args) {
        // Decide whether or not the value is lucky
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("6 digit number: ");
        value = scanner.nextInt();
        boolean lucky = isLucky(value);
        System.out.println("The number is " + ((lucky) ? "lucky" : "not lucky"));
        main(args);

        scanner.close();
    }
    public static boolean isLucky(int number) {
        // Принимаем только 6-значные числа
        assert(number >= 100000 && number < 10e7);
        // По идее это дает нам сотни, тысячи, десятитысичи числа и тд
        int e6s = number / e6;
        number -= e6s * e6;
        int e5s = number / e5;
        number -= e5s * e5;
        int e4s = number / e4;
        number -= e4s * e4;
        int e3s = number / e3;
        number -= e3s * e3;
        int e2s = number / e2;
        number -= e2s * e2;
        int e1s = number;

        System.out.println(e6s + "+" + e5s + "+" + e4s + "=" + e3s + "+" +  e2s + "+" + e1s);
        return ((e6s + e5s + e4s) == (e3s + e2s + e1s));
    }
}
