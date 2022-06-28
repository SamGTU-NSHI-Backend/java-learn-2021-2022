package ru.nshi.learn.work6;

public class Color {
    public int color_red; //0-255
    public int color_green;
    public int color_blue;
    public int hue;  //0-360
    public int saturation; //0-100
    public int brightness;

    public Color() {
    }

    public Color(int color_red, int color_green, int color_blue, int hue, int saturation, int brightness) {
        this.color_red = color_red;
        this.color_green = color_green;
        this.color_blue = color_blue;
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;

        if ((color_red < 0) || (color_red > 255)) {
            System.out.println("Incorrect value: color_red");
            System.exit(0);
        }

        if ((color_red != 0)&&((color_green != 0)) || (color_green < 0) || (color_green > 255)) {
            System.out.println("Incorrect value: color_green");
            System.exit(0);
        }

        if (((color_red != 0) && (color_green == 0) && (color_blue != 0))||((color_red == 0) && (color_green != 0) && (color_blue != 0)) || ((color_blue < 0) || (color_blue > 255))) {
            System.out.println("Incorrect value: color_blue");
            System.exit(0);
        }

        if ((hue < 0) || (hue > 360)) {
            System.out.println("Incorrect value: hue");
            System.exit(0);
        }

        if ((hue != 0)&&((saturation != 0)) || (saturation < 0) || (saturation > 100)) {
            System.out.println("Incorrect value: saturation");
            System.exit(0);
        }

        if (((hue != 0) && (saturation == 0) && (brightness != 0))||((hue == 0) && (saturation != 0) && (brightness != 0)) || ((brightness < 0) || (brightness > 100))) {
            System.out.println("Incorrect value: brightness");
            System.exit(0);
        }

        if ((color_red == 0) && (color_green == 0) && (color_blue == 0) && (hue == 0) && (saturation == 0) && (brightness == 0)) {
            System.out.println("Incorrect value: all values zero");
            System.exit(0);
        }
    }

    public int getColor_red() {
        return color_red;
    }

    public void setColor_red(int color_red) {
        this.color_red = color_red;
    }

    public int getColor_green() {
        return color_green;
    }

    public void setColor_green(int color_green) {
        this.color_green = color_green;
    }

    public int getColor_blue() {
        return color_blue;
    }

    public void setColor_blue(int color_blue) {
        this.color_blue = color_blue;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
            this.hue = hue;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
