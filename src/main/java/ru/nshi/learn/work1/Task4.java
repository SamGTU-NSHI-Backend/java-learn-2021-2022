/**
 * Написать программу, которая определяет сумму всех простых чисел в диапазоне от 1000 до 2000.
 **/

package ru.nshi.learn.work1;

public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        boolean[] array = new boolean[2001];
        task.SummSimpleNumber(array);
    }

    public void SummSimpleNumber(boolean[] array) {
        for (int index = 2; index < array.length; index++) {
            array[index] = true;
        }

        for (int index = 2; index < array.length; index++) {
            if (array[index] == true) {
                for (int newIndex = index * 2; newIndex < array.length; newIndex = newIndex + index) {
                    array[newIndex] = false;
                }
            }
        }

        System.out.println("Все простые числа до 2000: ");
        for (int index = 2; index < array.length; index++) {
            if (array[index] == true) {
                System.out.print(index + " ");
            }
        }
    }
}

