package ru.nshi.learn.lecture7.generics;

/**
 * @author rassafel
 */
public class BlackBox<T> {
    private T[] items;

    public BlackBox(T... items) {
        this.items = items;
    }

    public void add(T item) {
        items[0] = item;
    }

    public T getItem(int index) {
        if (index >= items.length) {
            index %= items.length;
        }
        return items[index];
    }
}
