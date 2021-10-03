//Поменять местами минимальный и максимальный элементы одномерного массива.
package ru.nshi.learn.work2;

public class Task4 {

    public static void main(String[] args){
        Task4 task4 = new Task4();
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();



        int[] array = task1.createArray(5);
        task1.fillArrayByRandom(array);
        task1.printArray(array);

        System.out.println("\nМаксимальное значение массива = " + task3.maxValue(array));
        System.out.println("Минимальное значение массива = " + task3.minValue(array));
        System.out.println("индекс максимального значения массива = " + task4.IndexMax1(array));
        System.out.println("индекс минимального значения массива = " + task4.IndexMin1(array));
        task4.printArray4(array);


    }




    public int maxValue(int[] array) {
        int max = array[0];
        int max1;
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]){
                max = array[i];
                max1 = i;
            }
        }
        return max;
    }

    public int IndexMax1(int[] array) {
        int max = array[0];
        int max1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
                max1 = i;
            }
        }
        return max1;
    }

    public int minValue(int[] array){
        int min = array[0];
        int min1;
        for (int i = 1; i < array.length; i++)
        {
            if (min < array[i]){
                min = array[i];
                min1 = i;
            }
        }
        return min;
    }

    public int IndexMin1(int[] array) {
        int min = array[0];
        int min1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                min1 = i;

            }
        }
        return min1;
    }



    private void printArray4(int[] array) {
        Task4 task4 = new Task4();
        int min1 = task4.IndexMin1(array);
        int max1 = task4.IndexMax1(array);
        int min = task4.minValue(array);
        int max = task4.maxValue(array);
        for (int i = 0; i < array.length; i++) {
            if (i != min1 && i != max1){
                System.out.print(array[i]);
            }
            if (i == min1){
                array[i] = max;
                System.out.print(array[max1]);
            }
            if (i == max1){
                array[i] = min;
                System.out.print(array[min1]);
            }
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
    }

}





