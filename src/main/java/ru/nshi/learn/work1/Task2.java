/**
 * Написать программу, которая вычисляет, сумму всех шестизначных «счастливых» чисел.
 **/

package ru.nshi.learn.work1;

public class Task2 {
    public static void main(String[] args) {
        Work.some();
    }

    public static class Work {
        public static void some() {
            int Summ = 0;
            for (int i = 100000; i < 1000000; i++) {
                int i1 = i / 100000 % 10;
                int i2 = i / 10000 % 10;
                int i3 = i / 1000 % 10;
                int i4 = i / 100 % 10;
                int i5 = i / 10 % 10;
                int i6 = i % 10;
                if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                    Summ += i;
                }
            }
            System.out.println("Сумма всех шестизначных «счастливых» чисел равна: " + Summ);
        }
    }
}
