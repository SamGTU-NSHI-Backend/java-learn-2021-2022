package ru.nshi.learn.work6;

import java.lang.Math;

public class Circle extends Color {
    public int radius;
    public double area;

    public Circle(){
        super();
    }

    public Circle(int radius,  int color_red, int color_green, int color_blue, int hue, int saturation, int brightness ) {
        super(color_red, color_green, color_blue, hue, saturation, brightness);
        this.radius = radius;
        this.area = radius * radius * Math.PI;
        if (radius <= 0) {
            System.out.println("Incorrect value: radius");
            System.exit(0);
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(area);
    }

    public void setArea(double area) {
        this.area = radius * radius * Math.PI;
    }

}
