/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод возвращает строку, составленную только из заглавных букв.
 **/

package ru.nshi.learn.work4;

public class Task2 {
    public static void main(String args[]) {
        String string = "ФSва12ЕE_3Q";

        String result = newString(string);

        System.out.println(result);
    }

    private static String newString(String string) {
        String result = "";

        for (char character : string.toCharArray()) {

            if (Character.isUpperCase(character)) {
                result = result + character;
            }
        }

        return result;
    }
}
