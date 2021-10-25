package ru.nshi.learn.lecture5;

/**
 * @author rassafel
 */
public class LectureStrings {
    public static void main(String[] args) {
        char ch = 'C';

        System.out.println("ch = " + ch);

        // Символ верхнего регистра?
        System.out.println("Character.isUpperCase(ch) = " + Character.isUpperCase(ch));

        // Символ нижнего регистра?
        System.out.println("Character.isLowerCase(ch) = " + Character.isLowerCase(ch));

        // Символ цифра?
        System.out.println("Character.isDigit(ch) = " + Character.isDigit(ch));

        // Перевести символ в верхний регистр
        System.out.println("Character.toUpperCase(ch) = " + Character.toUpperCase(ch));

        // Перевести символ в нижний регистр
        System.out.println("Character.toLowerCase(ch) = " + Character.toLowerCase(ch));


        System.out.println("ch = " + ch);

        String str = " hEllo test word";

        // Вывод строки
        System.out.println("str = " + str);

        // Длина строки
        System.out.println("str.length() = " + str.length());

        // Форматирование строки
        String format = String.format("Input str = %10s", str);
        System.out.println("format = " + format);

        // Получение символа по индексу
        System.out.println("str.charAt(0) = " + str.charAt(0));

        // Получение массива символов
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();

        // Сравнение строк
        System.out.println("str.compareTo(\"Hello\") = " + str.compareTo("Hello"));

        // Сравнение строк не учитывая регистр
        System.out.println("str.compareToIgnoreCase(\"Hello\") = "
            + str.compareToIgnoreCase("Hello"));

        System.out.println("\"Hello\".compareTo(str) = " + "Hello".compareTo(str));
        System.out.println("\"short\".compareTo(\"long string\") = "
            + "short".compareTo("long string"));

        // Проверка на равенство строк
        System.out.println("str.equals(\"Hello\") = " + str.equals("Hello"));

        // Проверка на равенство строк не учитывая регистр
        System.out.println("str.equalsIgnoreCase(\"Hello\") = "
            + str.equalsIgnoreCase("Hello"));

        System.out.println("str = " + str);

        // Перевод строки в нижний регистр
        System.out.println("str.toLowerCase() = " + str.toLowerCase());

        // Перевод строки в верхний регистр
        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        System.out.println("str = " + str);

        // Убрать символы пробела в начале и в конце строки
        System.out.println("str.trim() = " + str.trim());

        // Заменить все символы на другие символы
        String replace = str.replace("E", "eeee");
        System.out.println("replace = " + replace);

        // Найти первое совпадение
        System.out.println("str.indexOf(\"l\") = " + str.indexOf("l"));

        // Найти последнее совпадение
        System.out.println("str.lastIndexOf(\"l\") = " + str.lastIndexOf("l"));

        System.out.println("str.indexOf(\"lo\") = " + str.indexOf("lo"));

        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));

        int indexOf = str.indexOf("lo");

        // Получение подстроки
        System.out.println("str.substring(indexOf) = " + str.substring(indexOf));
        System.out.println("str.substring(1, 5) = " + str.substring(1, 5));

        // Проверка на пустоту строки
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("\" \".isEmpty() = " + " ".isEmpty());
        System.out.println("\" \".trim().isEmpty() = " + " ".trim().isEmpty());
        System.out.println("\"\".isEmpty() = " + "".isEmpty());

        // Начинается ли строка с подстроки
        System.out.println("str.startsWith(\" h\") = " + str.startsWith(" h"));

        // Заканчивается ли строка на подстроку
        System.out.println("str.endsWith(\"word\") = " + str.endsWith("word"));
        System.out.println("str.startsWith(\" h\") = " + str.startsWith("h"));
        System.out.println("str.endsWith(\"word\") = " + str.endsWith("word "));

        str = " hello world  test word ";

        System.out.println("Split string");

        str = str.trim();

        // Разделение строки на массив строк, используя разделитель
        // \s - символ пробела
        // + - 1 или более совпадений
        String[] strings = str.split("\\s+");
        System.out.println("strings.length = " + strings.length);
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("Split string with limit");

        // Разделение строки на массив строк, используя разделитель
        // с ограничением на длину массива
        strings = str.split("\\s+", 3);
        System.out.println("strings.length = " + strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
