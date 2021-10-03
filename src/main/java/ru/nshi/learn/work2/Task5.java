package ru.nshi.learn.work2;

public class Task5 {
    public static void main(String[] args){
        Task5 task5 = new Task5();
        Task4 task4 = new Task4();
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[] array = task1.createArray(5);
        task1.fillArrayByRandom(array);
        task1.printArray(array);
        task4.IndexMin1(array);
        task4.IndexMax1(array);

        System.out.println("\nМаксимальное значение массива = " + task3.maxValue(array));
        System.out.println("Минимальное значение массива = " + task3.minValue(array));
        System.out.println("индекс максимального значения массива = " + task4.IndexMax1(array));
        System.out.println("индекс минимального значения массива = " + task4.IndexMin1(array));
        float Average = task5.Average(array);
        if (Average != 0);
            System.out.println("среднее значение = " + Average);
    }

    public float Average(int[] array) {
        Task4 task4 = new Task4();
        int min1 = task4.IndexMin1(array);
        int max1 = task4.IndexMax1(array);
        int summa = 0;
        int k = 0;
        float Sr = 0;
        if (min1 < max1){
            for (int i = min1+1; i < max1; i++) {
                summa += array[i];
                k += 1;
            }
        } else if (max1 < min1){
            for (int i = max1 +1 ; i < min1 ; i++) {
                summa += array[i];
                k += 1;
            }
        }
        if (k != 0) {
            Sr = summa/k;
        } else System.out.println("\nнет элеметов между ними");
        return Sr;
    }
}
