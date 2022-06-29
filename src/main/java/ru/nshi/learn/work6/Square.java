package ru.nshi.learn.work6;

public class Square extends Color {
    public int a_side_length;
    public int area;

    public Square(){
        super();
    }
    public Square( int a_side_length, int color_red, int color_green, int color_blue, int hue, int saturation, int brightness ) {
        super(color_red, color_green, color_blue, hue, saturation, brightness);
        this.a_side_length = a_side_length;
        this.area = a_side_length * a_side_length;
        if (a_side_length <= 0){
            System.out.println("Incorrect value: a_side_length");
            System.exit(0);
        }
    }


    public int getA_side_length() {
            return a_side_length;
    }

    public void setA_side_length(int a_side_length) {
        this.a_side_length = a_side_length;
    }

    public int getArea() {

        return   area;
    }

    public void setArea(int area) {
        this.area = a_side_length * a_side_length;
    }
}
