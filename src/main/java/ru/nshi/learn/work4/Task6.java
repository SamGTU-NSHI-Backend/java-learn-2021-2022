/**
 * Напишите метод, который принимает массив строк, состоящих из букв, цифр и иных символов.
 * Метод должен вернуть строку с максимальным количеством уникальных символов.
 **/

package ru.nshi.learn.work4;

public class Task6 {
    static String str = "ABCNkk15j35g";
    static String str1 = "sdfbcfbv35g";

    public static void main(String args[]) {
        System.out.println(str);
        System.out.println(str1);
        System.out.println(Massi(str));
    }

    private static String Massi(String s) {
        System.out.print("\n");

        int count = 0;
        int count1 = 0;
        String result2;

        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
        char[] end = result.toCharArray();
        for (int i = 0; i < end.length; i++) {
            count++;
        }

        String result1 = new StringBuilder(str1).reverse().toString();
        result1 = result1.replaceAll("(.)(?=.*\\1)", "");
        result1 = new StringBuilder(result1).reverse().toString();
        System.out.println(result1);
        char[] end1 = result1.toCharArray();

        System.out.print("\n");

        for (int i = 0; i < end1.length; i++) {
            count1++;
        }
        if (count == count1) {
            result2 = result + result1;
        }
        if (count > count1) {
            result2 = result;
        } else {
            result2 = result1;
        }
        return result2;
    }
}
