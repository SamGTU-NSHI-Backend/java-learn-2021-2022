package ru.nshi.learn.work0;

/**
 * @author rassafel
 */
public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();

        System.out.println(task.sumEvenNumbers(1, 1000));
    }

    public int sumEvenNumbers(int start, int end) {
        Task1 task1 = new Task1();
        int result = 0;
        for (int number = start; number < end; number++) {
            if (task1.isEven(number)) {
                result += number;
            }
        }
        return result;
    }
}
