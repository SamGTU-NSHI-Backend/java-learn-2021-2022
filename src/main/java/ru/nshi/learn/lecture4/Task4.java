package ru.nshi.learn.lecture4;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 */
public class Task4 {
    public static void main(String[] args) {
        ArraysLecture arraysLecture = new ArraysLecture();
        Task4 task4 = new Task4();

        int[][] points = {
            {1, 1},
            {1, 4},
            {4, 4},
            {4, 1}
        };

        System.out.println("Исходный массив: ");
        arraysLecture.printArray(points);
        System.out.println();

        double square = task4.square(points);
        System.out.println("Площадь квадрата равна: " + square);
    }

    public double square(int[][] points) {
        double[] lengths = calculateLengths(points);
        if(!isEquals(lengths)) {
            System.err.println("Данный объект не является квадратом");
            return -1;
        }
        double firstLength = lengths[0];
        return Math.pow(firstLength, 2);
    }

    public boolean isEquals(double[] lengths) {
        double firstLength = lengths[0];
        for (double length : lengths) {
            if(length != firstLength) {
                return false;
            }
        }
        return true;
    }

    public double[] calculateLengths(int[][] points) {
        double[] lengths = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            int[] pointA = points[i];
            int[] pointB = points[(i + 1) % points.length];
            lengths[i] = calculateLength(pointA, pointB);
        }
        return lengths;
    }

    public double calculateLength(int[] pointA, int[] pointB) {
        if(pointA.length != 2 || pointB.length != 2) {
            System.err.println("Точка не содержит двух значений");
            return -1;
        }
        int diffX = pointA[0] - pointB[0];
        int diffY = pointA[1] - pointB[1];
        double powDiffX = Math.pow(diffX, 2);
        double powDiffY = Math.pow(diffY, 2);
        return Math.sqrt(powDiffX + powDiffY);
    }
}
