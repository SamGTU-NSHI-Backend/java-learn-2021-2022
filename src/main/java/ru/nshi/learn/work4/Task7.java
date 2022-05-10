/**
 * Напишите метод, который принимает строку, состоящую из слов, разделенных пробелами.
 * Метод должен вернуть слово с максимальным количеством уникальных символов.
 **/

package ru.nshi.learn.work4;

public class Task7 {

    static String str = "What you knowelly abboobagil";
    static String strin;


    public static void main(String args[]) {
        System.out.println(Massi(strin));
    }

    public static String Massi(String s) {
        int count = 0;
        int count1 = 0;

        String[] strings = str.split("\\s+");

        for (int i = 0; i < strings.length; i++) {
            int res = 0;
            String result = new StringBuilder(strings[i]).reverse().toString();
            result = result.replaceAll("(.)(?=.*\\1)", "");
            result = new StringBuilder(result).reverse().toString();
            char[] end = result.toCharArray();
            for (int j = 0; j < end.length; j++) {
                res++;
            }
            if (res > count) {
                count = res;
                count1 = i;
            }

        }
        String fin = new StringBuilder(strings[count1]).reverse().toString();
        fin = fin.replaceAll("(.)(?=.*\\1)", "");
        fin = new StringBuilder(fin).reverse().toString();

        return fin;
    }
}

