/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть строку состоящую из уникальных символов.
 **/

package ru.nshi.learn.work4;

public class Task5 {
    static String str = "qwertyqwerty";

    public static void main(String args[]) {
        System.out.println(Massi(str));
    }

    public static String Massi(String s) {

        str = new StringBuilder(str).reverse().toString();
        str = str.replaceAll("(.)(?=.*\\1)", "");
        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}
