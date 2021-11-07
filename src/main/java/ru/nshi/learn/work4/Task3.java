package ru.nshi.learn.work4;

import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        String string = "a1b23c4%&50";
        int[] array = task3.getNumbers(string, task3);
        for (int i : array) {
            System.out.println(i);
        }
    }
    public int[] getNumbers(String string, Task3 task3) {
        int[] numbers = task3.getNumbersStream(string)
            .toArray();
        return numbers;

    }
    public IntStream getNumbersStream(String string) {
        IntStream numbers = string
            .chars()
            .mapToObj(c -> (char)c)
            .filter((Character c) -> Character.isDigit(c))
            .mapToInt((Character c) -> Integer.parseInt(c.toString()));
        return numbers;
    }
}
