package ru.nshi.learn.work4;

import java.util.Set;
import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        String string = "laslkjldjfajwoxl129$5$%";
        string = task5.filterUnique(string);
        System.out.println(string);
    }
    public String filterUnique(String string) {
        Set<Integer> appeared = new HashSet<>();
        Set<Integer> unique   = new HashSet<>();

        string
            .chars()
            .forEach(c -> {
                if (appeared.contains(c)) {
                    unique.remove(c);
                } else {
                    appeared.add(c);
                    unique.add(c);
                }
            });
        return unique
            .stream()
            .map(c -> ((char) c.intValue() ))
            .map(Object::toString)
            .reduce("", (String a, String b) -> a + b);
    }
    public int countUnique(String string) {
        Set<Integer> appeared = new HashSet<>();
        Set<Integer> unique   = new HashSet<>();

        string
            .chars()
            .forEach(c -> {
                if (appeared.contains(c)) {
                    unique.remove(c);
                } else {
                    appeared.add(c);
                    unique.add(c);
                }
            });
        return unique.size();
    }
}
