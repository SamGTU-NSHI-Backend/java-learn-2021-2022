package ru.nshi.learn.work4;

public class Task6 {
    public static void main(String[] args) {
        String[] strings = {"jdlakf4i2ij0", "kla909j", "jlak"};
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        String maxUnique = task6.maxUnique(strings, task5);
        System.out.println(maxUnique);
    }
    public String maxUnique(String[] strings, Task5 task5) {
        String maxString = strings[0];
        int maxUniqueness = task5.countUnique(maxString);
        for (int i = 1; i < strings.length; i++) {
            String currentString = strings[i];
            int uniqueness = task5.countUnique(currentString);
            if (uniqueness > maxUniqueness) {
                maxUniqueness = uniqueness;
                maxString = currentString;
            }
        }
        return maxString;
    }
}
