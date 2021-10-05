package ru.nshi.learn.lecture3;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 * UpperCamelCase - only for class
 * lowerCamelCase - only variables & methods
 *
 */
public class AlgorithmsLecture {

    static final int SERVER_PORT = 8080;

    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();
        int[] array = arraysLecture.createArray(6);
        arraysLecture.fillArrayByRandom(array);
        arraysLecture.printArray(array);

        AlgorithmsLecture algorithmsLecture = new AlgorithmsLecture();
        int index = algorithmsLecture.indexOf(array, 3);
        System.out.println("index = " + index);

        int lastIndex = algorithmsLecture.lastIndexOf(array, 3);
        System.out.println("lastIndex = " + lastIndex);

        arraysLecture.printArray(array);
        if(algorithmsLecture.isSorted(array)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
            algorithmsLecture.bubbleSort(array);
            arraysLecture.printArray(array);
            System.out.println("Now array is sorted.");
        }

        double average = algorithmsLecture.average(array);
        System.out.println("average = " + average);
        System.out.printf("average rounded = %5.1f\n", average);

        System.out.println("Math.floor(1.99999) = " + Math.floor(1.99999));
        System.out.println("Math.ceil(1.0000001) = " + Math.ceil(1.0000001));
        System.out.println("Math.round(1.4) = " + Math.round(1.4));
        System.out.println("Math.round(1.6) = " + Math.round(1.6));

        System.out.println("Math.round(1.019 * 100) / 100d = " + Math.round(1.019 * 100) / 100d);

    }

    /**
     * Find first match by value.
     *
     * @param array
     * @param value
     * @return index in array
     * if value not exist returns -1
     */
    public int indexOf(int[] array, int value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Find last match by value.
     *
     * @param array
     * @param value
     * @return index in array
     * if value not exist returns -1
     */
    public int lastIndexOf(int[] array, int value) {
        for (int index = array.length - 1; index > -1; index--) {
            if (array[index] == value) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Check for sorting in array.
     *
     * @param array
     * @return
     */
    public boolean isSorted(int[] array) {
        boolean isSorted = true;
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                isSorted = false;
            }
        }
        return isSorted;
    }

    /**
     * Sort array using bubble sort.
     *
     * @param array
     */
    public void bubbleSort(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int index = 0; index < array.length - 1; index++) {
                if(array[index] > array[index+1]) {
                    isSorted = false;
                    int buff = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buff;
                }
            }
        }
    }

    public int sum(int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public double average(int[] array) {
        return (double) sum(array) / array.length;
    }
}
