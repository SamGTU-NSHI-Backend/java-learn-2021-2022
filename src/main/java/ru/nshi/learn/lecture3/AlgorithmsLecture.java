package ru.nshi.learn.lecture3;

import ru.nshi.learn.lecture2.ArraysLecture;

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
}
