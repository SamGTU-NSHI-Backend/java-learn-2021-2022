package ru.nshi.learn.lecture7.abstracts;

import ru.nshi.learn.lecture7.interfaces.AbstractItem;

public abstract class Phone implements AbstractItem {

    private String model;

    public Phone(String model) {
        this.model = model;
    }

    public abstract void item2();

    @Override
    public void item() {
        System.out.println("Item!");
    }

    @Override
    public String toString() {
        return "Phone{" +
            "model='" + model + '\'' +
            '}';
    }
}
