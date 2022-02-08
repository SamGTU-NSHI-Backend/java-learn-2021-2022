package ru.nshi.learn.lecture4;

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

        long start = System.nanoTime();
        double square = task4.square(points);
        long end = System.nanoTime();

        System.out.println("Площадь квадрата равна: " + square);
        System.out.println("end-start = " + (end - start));
    }

    public void printPoints(Point[] points) {
        // O(N)
        for (Point point : points) {
            System.out.println(point.toString());
        }
    }

    public double square(Point[] points) {
        // O(N)
        double[] lengths = calculateLengths(points);
        if(!isEquals(lengths)) {
            System.err.println("Данный объект не является квадратом");
            return -1;
        }
        double firstLength = lengths[0];
        return Math.pow(firstLength, 2);
    }

    public boolean isEquals(double[] lengths) {
        // O(N)
        double firstLength = lengths[0];
        for (double length : lengths) {
            if(length != firstLength) {
                return false;
            }
        }
        return true;
    }

    public double[] calculateLengths(Point[] points) {
        // O(N)
        double[] lengths = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            Point pointA = points[i];
            Point pointB = points[(i + 1) % points.length];
            lengths[i] = calculateLength(pointA, pointB);
        }
        return lengths;
    }

    public double calculateLength(Point pointA, Point pointB) {
        // O(1)
        int diffX = pointA.x - pointB.x;
        int diffY = pointA.y - pointB.y;
        double powDiffX = Math.pow(diffX, 2);
        double powDiffY = Math.pow(diffY, 2);
        return Math.sqrt(powDiffX + powDiffY);
    }
}
