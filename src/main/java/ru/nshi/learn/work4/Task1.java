/**
 * Напишите метод, который получает в качестве параметра строку и возвращает массив из следующих элементов:
 * первый символ строки;
 * два первых символа;
 * три первых символа и так далее.
 **/

package ru.nshi.learn.work4;

public class Task1 {

    public static void main(String[] args) {

        String input = "123abc*-+";

        String[] result = newStrings(input);

        for (String string : result) {
            System.out.println(string);
        }
    }

    private static String[] newStrings(String input) {
        String[] result = new String[input.length()];

        for (int counter = 0; counter < input.length(); counter++) {
            result[counter] = input.substring(0, counter + 1);
        }

        return result;
    }
}
