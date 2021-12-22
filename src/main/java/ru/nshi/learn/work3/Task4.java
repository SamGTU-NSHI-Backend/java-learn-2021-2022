/**
 * Выполнить сортировку двумерного массива по возрастанию в направлении вправо-вниз, используя сортировку выбором.
 **/

package ru.nshi.learn.work3;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        Random randomized = new Random();
        int[][] array = new int[10][10];
        int rows, columns;
        for (rows = 0; rows < 10; rows++) {
            for (columns = 0; columns < 10; columns++) {
                array[rows][columns] = randomized.nextInt(100);
            }
        }

        for (rows = 0; rows < 10; rows++) {
            for (columns = 0; columns < 10; columns++) {
                System.out.printf("%4d", array[rows][columns]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                for (rows = 0; rows < 10; rows++) {
                    for (columns = 0; columns < 10; columns++) {
                        if (array[rows][columns] > array[i][j]) {
                            int temp1 = array[rows][columns];
                            array[rows][columns] = array[i][j];
                            array[i][j]=temp1;
                        }
                    }
                }
            }
        }
        for (rows = 0; rows < 10; rows++) {
            for (columns = 0; columns < 10; columns++) {
                System.out.printf("%4d", array[rows][columns] );
            }
            System.out.println();
        }
        System.out.println();
    }
}
