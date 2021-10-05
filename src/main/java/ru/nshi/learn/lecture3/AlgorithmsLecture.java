package ru.nshi.learn.lecture3;

import ru.nshi.learn.lecture2.ArraysLecture;

import java.util.Random;

/**
 * @author rassafel
 */
public class AlgorithmsLecture {
    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();
        int[] array = arraysLecture.createArray(5);
        arraysLecture.fillArrayByRandom(array);
        arraysLecture.printArray(array);

        AlgorithmsLecture algorithmsLecture = new AlgorithmsLecture();
        int index = algorithmsLecture.indexOf(array, 3);
        System.out.println("index = " + index);

        int lastIndex = algorithmsLecture.lastIndexOf(array, 3);
        System.out.println("lastIndex = " + lastIndex);
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

    public int lastIndexOf(int[] array, int value) {
        for (int index = array.length - 1; index > -1; index--) {
            if (array[index] == value) {
                return index;
            }
        }
        return -1;
    }
}
