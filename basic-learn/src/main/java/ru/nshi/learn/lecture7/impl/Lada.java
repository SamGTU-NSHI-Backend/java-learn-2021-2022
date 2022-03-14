package ru.nshi.learn.lecture7.impl;

import ru.nshi.learn.lecture7.interfaces.Car;

import java.io.Serializable;

/**
 * @author rassafel
 */
public class Lada implements Car {

    private String model;

    @Override
    public void ride() {
        System.out.println("Lada is riding");
    }

    @Override
    public String getModel() {
        return model;
    }
}
