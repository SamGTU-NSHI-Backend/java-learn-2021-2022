package ru.nshi.learn.lecture4;

import ru.nshi.learn.lecture2.ArraysLecture;

/**
 * @author rassafel
 */
public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();

        Point[] points = {
            new Point(1, 1),
            new Point(1, 4),
            new Point(4, 4),
            new Point(4, 1)
        };

        System.out.println("Исходный массив: ");
        task4.printPoints(points);
        System.out.println();

        double square = task4.square(points);
        System.out.println("Площадь квадрата равна: " + square);
    }

    public void printPoints(Point[] points) {
        for (Point point : points) {
            System.out.printf("Point: x=%d, y=%d\n", point.x, point.y);
        }
    }

    public double square(Point[] points) {
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

    public double[] calculateLengths(Point[] points) {
        double[] lengths = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            Point pointA = points[i];
            Point pointB = points[(i + 1) % points.length];
            lengths[i] = calculateLength(pointA, pointB);
        }
        return lengths;
    }

    public double calculateLength(Point pointA, Point pointB) {
        int diffX = pointA.x - pointB.x;
        int diffY = pointA.y - pointB.y;
        double powDiffX = Math.pow(diffX, 2);
        double powDiffY = Math.pow(diffY, 2);
        return Math.sqrt(powDiffX + powDiffY);
    }
}
