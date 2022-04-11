package ru.nshi.learn.lecture8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author rassafel
 */
public class QueueTest {
    @Test
    void queueTest() {
        // FIFO
        // First In First Out
        Queue<String> queue = new LinkedList<>();
        Assertions.assertEquals(0, queue.size());
        queue.add("Test string");
        Assertions.assertEquals(1, queue.size());
        System.out.println(queue.peek());
        Assertions.assertEquals(1, queue.size());
        System.out.println(queue.poll());
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    void stackTest() {
        // LIFO
        // Last In First Out
        Deque<String> deque = new LinkedList<>();
        deque.addLast();
        deque.getLast();
    }
}
