/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть строку состоящую из уникальных символов.
 **/

package ru.nshi.learn.work4;

public class Task5 {
    static String str = "ABCNkk15j35g";

    public static void main(String args[]) {
        System.out.println(Massi(str));
    }

    private static String Massi(String s) {

        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();

        return result;
    }
}
