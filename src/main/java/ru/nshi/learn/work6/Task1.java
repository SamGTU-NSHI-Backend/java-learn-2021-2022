package ru.nshi.learn.work6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//Choise
        System.out.println("Hi, which component do you want to create: (1)Square, (2)Circle, (3)Triangle, (4)Rectangle?");
        Scanner in = new Scanner(System.in);
        int choise = 0;
        int x = 0;
        do {
            int choiseComponent = in.nextInt();
            if ((choiseComponent > 4) || (choiseComponent < 1)) {
                System.out.println("There is no component with this number");
            } else {
                choise += 1;
                x = choiseComponent;
            }

        } while (choise != 1);
//Square
        if (x == 1) {
            System.out.println("Square");
            System.out.println("Please, enter side (a), colors RGB, HSB values");

            Square square = new Square(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

            System.out.println("Square's side = " + square.getA_side_length());
            System.out.println("Square's area = " + square.getArea());
            //color
            System.out.println("Square's collor red = " + square.getColor_red());
            System.out.println("Square's collor green = " + square.getColor_green());
            System.out.println("Square's collor blue = " + square.getColor_blue());
            System.out.println("Square's hue = " + square.getHue());
            System.out.println("Square's saturation = " + square.getSaturation());
            System.out.println("Square's brightness = " + square.getBrightness());

            boolean choise_2 = false;
            do {
                System.out.println("Do you want to change the color values?   Yes(1)/No(2)");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Please, enter colors RGB, HSB");
                    square.color_red = in.nextInt();
                    square.color_green = in.nextInt();
                    square.color_blue = in.nextInt();
                    square.hue = in.nextInt();
                    square.saturation = in.nextInt();
                    square.brightness = in.nextInt();
                    System.out.println("Square's collor red = " + square.getColor_red());
                    System.out.println("Square's collor green = " + square.getColor_green());
                    System.out.println("Square's collor blue = " + square.getColor_blue());
                    System.out.println("Square's hue = " + square.getHue());
                    System.out.println("Square's saturation = " + square.getSaturation());
                    System.out.println("Square's brightness = " + square.getBrightness());
                } else if (ch == 2) {
                    System.out.println("Okay");
                    choise_2 = true;

                } else {
                    System.out.println("Please, enter right command.   Yes(1)/No(2)");
                    ch = in.nextInt();
                }
            } while (choise_2 == false);
        }

//Circle

        if (x == 2) {
            System.out.println("Circle");
            System.out.println("Please, enter radius, colors RGB, HSB values");

            Circle сircle = new Circle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

            System.out.println("Circle's radius = " + сircle.getRadius());
            System.out.println("Circle's area = " + сircle.getArea());
            //color
            System.out.println("Circle's collor red = " + сircle.getColor_red());
            System.out.println("Circle's collor green = " + сircle.getColor_green());
            System.out.println("Circle's collor blue = " + сircle.getColor_blue());
            System.out.println("Circle's hue = " + сircle.getHue());
            System.out.println("Circle's saturation = " + сircle.getSaturation());
            System.out.println("Circle's brightness = " + сircle.getBrightness());

            boolean choise_2 = false;
            do {
                System.out.println("Do you want to change the color values?   Yes(1)/No(2)");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Please, enter colors RGB, HSB");
                    сircle.color_red = in.nextInt();
                    сircle.color_green = in.nextInt();
                    сircle.color_blue = in.nextInt();
                    сircle.hue = in.nextInt();
                    сircle.saturation = in.nextInt();
                    сircle.brightness = in.nextInt();
                    System.out.println("Circle's collor red = " + сircle.getColor_red());
                    System.out.println("Circle's collor green = " + сircle.getColor_green());
                    System.out.println("Circle's collor blue = " + сircle.getColor_blue());
                    System.out.println("Circle's hue = " + сircle.getHue());
                    System.out.println("Circle's saturation = " + сircle.getSaturation());
                    System.out.println("Circle's brightness = " + сircle.getBrightness());
                } else if (ch == 2) {
                    System.out.println("Okay");
                    choise_2 = true;

                } else {
                    System.out.println("Please, enter right command.   Yes(1)/No(2)");
                    ch = in.nextInt();
                }
            } while (choise_2 == false);
        }

//Triangle
        if (x == 3) {
            System.out.println("Triangle");
            System.out.println("Please, enter colors side (a, b, c), RGB, HSB values");

            Triangle triangle = new Triangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

            System.out.println("Triangle's side = " + triangle.getA_side_length());
            System.out.println("Triangle's side = " + triangle.getB_side_length());
            System.out.println("Triangle's side = " + triangle.getC_side_length());
            System.out.println("Triangle's area = " + triangle.getArea());
            //color
            System.out.println("Triangle's collor red = " + triangle.getColor_red());
            System.out.println("Triangle's collor green = " + triangle.getColor_green());
            System.out.println("Triangle's collor blue = " + triangle.getColor_blue());
            System.out.println("Triangle's hue = " + triangle.getHue());
            System.out.println("Triangle's saturation = " + triangle.getSaturation());
            System.out.println("Triangle's brightness = " + triangle.getBrightness());

            boolean choise_2 = false;
            do {
                System.out.println("Do you want to change the color values?   Yes(1)/No(2)");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Please, enter colors RGB, HSB");
                    triangle.color_red = in.nextInt();
                    triangle.color_green = in.nextInt();
                    triangle.color_blue = in.nextInt();
                    triangle.hue = in.nextInt();
                    triangle.saturation = in.nextInt();
                    triangle.brightness = in.nextInt();
                    System.out.println("Triangle's collor red = " + triangle.getColor_red());
                    System.out.println("Triangle's collor green = " + triangle.getColor_green());
                    System.out.println("Triangle's collor blue = " + triangle.getColor_blue());
                    System.out.println("Triangle's hue = " + triangle.getHue());
                    System.out.println("Triangle's saturation = " + triangle.getSaturation());
                    System.out.println("Triangle's brightness = " + triangle.getBrightness());

                } else if (ch == 2) {
                    System.out.println("Okay");
                    choise_2 = true;

                } else {
                    System.out.println("Please, enter right command.   Yes(1)/No(2)");
                    ch = in.nextInt();
                }
            } while (choise_2 == false);
        }

//Rectangle
        if (x == 4) {
            System.out.println("Rectangle");
            System.out.println("Please, enter side (a, b), colors RGB, HSB values");

            Rectangle rectangle = new Rectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());

            System.out.println("Rectangle's side = " + rectangle.getA_side_length());
            System.out.println("Rectangle's side = " + rectangle.getB_side_length());
            System.out.println("Rectangle's area = " + rectangle.getArea());
            //color
            System.out.println("Triangle's collor red = " + rectangle.getColor_red());
            System.out.println("Triangle's collor green = " + rectangle.getColor_green());
            System.out.println("Triangle's collor blue = " + rectangle.getColor_blue());
            System.out.println("Triangle's hue = " + rectangle.getHue());
            System.out.println("Triangle's saturation = " + rectangle.getSaturation());
            System.out.println("Triangle's brightness = " + rectangle.getBrightness());

            boolean choise_2 = false;
            do {
                System.out.println("Do you want to change the color values?   Yes(1)/No(2)");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Please, enter colors RGB, HSB");
                    rectangle.color_red = in.nextInt();
                    rectangle.color_green = in.nextInt();
                    rectangle.color_blue = in.nextInt();
                    rectangle.hue = in.nextInt();
                    rectangle.saturation = in.nextInt();
                    rectangle.brightness = in.nextInt();
                    System.out.println("Triangle's collor red = " + rectangle.getColor_red());
                    System.out.println("Triangle's collor green = " + rectangle.getColor_green());
                    System.out.println("Triangle's collor blue = " + rectangle.getColor_blue());
                    System.out.println("Triangle's hue = " + rectangle.getHue());
                    System.out.println("Triangle's saturation = " + rectangle.getSaturation());
                    System.out.println("Triangle's brightness = " + rectangle.getBrightness());

                } else if (ch == 2) {
                    System.out.println("Okay");
                    choise_2 = true;

                } else {
                    System.out.println("Please, enter right command.   Yes(1)/No(2)");
                    ch = in.nextInt();
                }
            } while (choise_2 == false);

        }

    }
}
