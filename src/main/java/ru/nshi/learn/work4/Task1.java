package ru.nshi.learn.work4;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String string = "Hello, world!";
        String[] array_string = task1.stringToArray(string);
        for (String str : array_string) {
            System.out.println(str);
        }
    }
    String[] stringToArray(String string) {
        String[] array = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.substring(0, i + 1);
        }
        return array;
    }
}
