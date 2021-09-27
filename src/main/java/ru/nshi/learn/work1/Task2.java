package ru.nshi.learn.work1;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.SummaAllLuckyNumbers(100000, 999999);
    }
    public static void SummaAllLuckyNumbers(int start, int end) {
        int counter = 0; int summa = 0;
        for (int number = start; start <= end; start++) {
            number = start;
            int left = 0;
            int right = 0;

            for (int j = 0; j < 3; j++) {
                right += number % 10;
                number /= 10;
            }

            for (int j = 0; j < 3; j++) {
                left += number % 10;
                number /= 10;
            }

            if (left == right) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
