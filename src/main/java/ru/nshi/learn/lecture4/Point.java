package ru.nshi.learn.lecture4;

/**
 * @author rassafel
 */
public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: x=" + x + ", y=" + y;
    }
}
