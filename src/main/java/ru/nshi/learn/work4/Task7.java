package ru.nshi.learn.work4;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        Task6 task6 = new Task6();
        Task5 task5 = new Task5();
        String sentence = "The quick brown fox jumps over the small hill";
        String mostUnique = task7.maxUniqueInSentence(sentence, task5, task6);
        System.out.println(mostUnique);
    }
    public String maxUniqueInSentence(String sentence, Task5 task5, Task6 task6) {
        return task6.maxUnique(sentence.split(" "), task5);
    }
}
