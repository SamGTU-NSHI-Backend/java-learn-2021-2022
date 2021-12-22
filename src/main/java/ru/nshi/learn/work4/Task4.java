/**
 * Напишите метод, который принимает строку, состоящую из букв, цифр и иных символов.
 * Метод должен вернуть сумму из всех цифр в строке.
 **/

package ru.nshi.learn.work4;

public class Task4 {
    public static void main(String args[]) {
        String str = "ABCNkk15j35g";
        System.out.println(str);
        System.out.print(summ(str));
    }

    private static int summ(String s) {
        int summ = 0;
        for (char aChar : s.toCharArray()) {
            if (Character.isDigit(aChar) == true) {
                int y = Character.getNumericValue(aChar);
                summ = summ + y;
            }
        }
        return summ;
    }
}
