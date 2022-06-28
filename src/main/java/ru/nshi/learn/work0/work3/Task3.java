/**
 * Осуществить проверку двумерного массива на "магический квадрат".
 **/

package ru.nshi.learn.work0.work3;

public class Task3 {

    public static void main(String[] args) {


// Создаем двумерный массив
        int[][] array = new int[10][10];

        Utils.generateRandomNumbersForArray2D(array);

        Utils.printArray(array);

        int[] sumRows = Utils.sumRows(array);

        Utils.printSums(sumRows);

        int[] sumColumns = Utils.sumColumns(array);

        Utils.printSums(sumColumns);


        int[] sumHomeDiagonal = Utils.sumHomeDiagonal(array);
        Utils.printSums(sumHomeDiagonal);

        int[] sumSecondaryDiagonal = Utils.sumSecondaryDiagonal(array);
        Utils.printSums(sumSecondaryDiagonal);

        boolean isMagicSquare = true;

        for (int index = 0; index < sumRows.length; index++) {
            if (sumRows[index] != sumColumns[index]) {
                isMagicSquare = false;
                break;
            }
        }

        for (int index = 0; index < sumRows.length; index++) {
            if (sumRows[index] != sumColumns[index]) {
                isMagicSquare = false;
                break;
            }
        }

        for (int index = 0; index < sumRows.length; index++) {
            if (sumColumns[index] != sumHomeDiagonal[index]) {
                isMagicSquare = false;
                break;
            }
        }
        for (int index = 0; index < sumRows.length; index++) {
            if (sumHomeDiagonal[index] != sumSecondaryDiagonal[index]) {
                isMagicSquare = false;
                break;
            }
        }
        System.out.println();
        if (isMagicSquare)
            System.out.println("Двоичный массив является магическим квадратом");
        else
            System.out.println("Двоичный массив не является магическим квадратом");
    }
}

