/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть массив из всех цифр в строке.
 **/

package ru.nshi.learn.work4;

public class Task3 {
    static String str = "ABCNkk15j35g";

    public static void main(String args[]) {
        System.out.println(Massi(str));
    }

    private static char[] Massi(String s) {
        char[] arrive;
        arrive = s.toCharArray();

        int M = 0;
        for (int N = 0; N < arrive.length; N++) {
            if (Character.isDigit(arrive[N]) == true) {
                int y = Character.getNumericValue(arrive[N]);
                //arrive2[M] = arrive[N];
                M++;
            }
        }
        char[] arrive2 = new char[M];
        int cout = 0;
        for (int N = 0; N < arrive.length; N++) {
            if (Character.isDigit(arrive[N]) == true) {
                int y = Character.getNumericValue(arrive[N]);
                arrive2[cout] = arrive[N];
                cout++;
            }

        }
        return arrive2;
    }
}

