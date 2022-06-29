package ru.nshi.learn.work6;

public class Triangle extends Color {
    public int a_side_length;
    public int b_side_length;
    public int c_side_length;
    public int area;

    public Triangle(){
        super();
    }

    public Triangle(int a_side_length, int b_side_length, int c_side_length, int color_red, int color_green, int color_blue, int hue, int saturation, int brightness ) {
        super(color_red, color_green, color_blue, hue, saturation, brightness);
        this.a_side_length = a_side_length;
        this.b_side_length = b_side_length;
        this.c_side_length = c_side_length;
        this.area = a_side_length * b_side_length;
        if (a_side_length <= 0) {
            System.out.println("Incorrect value: a_side_length");
            System.exit(0);
        }
        if (b_side_length <= 0) {
            System.out.println("Incorrect value: b_side_length");
            System.exit(0);
        }
        if (c_side_length <= 0) {
            System.out.println("Incorrect value: c_side_length");
            System.exit(0);
        }
        if ((a_side_length + b_side_length < c_side_length) || (a_side_length + c_side_length < b_side_length) || (b_side_length + c_side_length < a_side_length)) {
            System.out.println("No such triangle exists");
            System.exit(0);
        }

    }


    public int getA_side_length() {
        return a_side_length;
    }

    public void setA_side_length(int a_side_length) {
        this.a_side_length = a_side_length;
    }

    public int getB_side_length() {
        return b_side_length;
    }

    public void setB_side_length(int b_side_length) {
        this.b_side_length = b_side_length;
    }

    public int getC_side_length() {
        return c_side_length;
    }

    public void setC_side_length(int c_side_length) {
        this.c_side_length = c_side_length;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = (a_side_length * b_side_length) / 2;
    }
}
