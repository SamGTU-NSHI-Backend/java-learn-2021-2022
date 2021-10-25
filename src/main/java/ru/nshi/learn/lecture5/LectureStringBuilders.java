package ru.nshi.learn.lecture5;

import java.time.LocalTime;

/**
 * @author rassafel
 */
public class LectureStringBuilders {
    public static void main(String[] args) {
        LectureStringBuilders builders = new LectureStringBuilders();

        int start = 1, end = 2;

        System.out.println("Concat string");
        long startTime = System.nanoTime();
        String result = builders.concatString(start, end);
        long finishTime = System.nanoTime();
        System.out.println(LocalTime.ofNanoOfDay(finishTime - startTime));


        System.out.println("\nAppend builder");
        startTime = System.nanoTime();
        result = builders.concatStringBuilder(start, end);
        finishTime = System.nanoTime();
        System.out.println(LocalTime.ofNanoOfDay(finishTime - startTime));

        System.out.println("\nAppend buffer");
        startTime = System.nanoTime();
        result = builders.concatStringBuffer(start, end);
        finishTime = System.nanoTime();
        System.out.println(LocalTime.ofNanoOfDay(finishTime - startTime));

    }

    public String concatString(int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += i;
        }
        return result;
    }

    public String concatStringBuilder(int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    public String concatStringBuffer(int start, int end) {
        StringBuffer buffer = new StringBuffer();
        for (int i = start; i < end; i++) {
            buffer.append(i);
        }
        return buffer.toString();
    }
}
