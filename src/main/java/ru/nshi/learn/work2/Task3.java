//Найти максимальный и минимальный элемент в одномерном массиве.
package ru.nshi.learn.work2;

public class Task3 {
    public static void main(String[] args){
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(10);
        task1.fillArrayByRandom(array);
        task1.printArray(array);
        System.out.println("\nМаксимальное значение массива = " + task3.maxValue(array));
        System.out.println("Минимальное значение массива = " + task3.minValue(array));

    }
    public int maxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public int minValue(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

}
