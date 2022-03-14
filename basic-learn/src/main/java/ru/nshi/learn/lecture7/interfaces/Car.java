package ru.nshi.learn.lecture7.interfaces;

import java.io.Serializable;

@FunctionalInterface
public interface Car extends AbstractCar, Serializable {

    int WHEELS_COUNT = 4;

    default void ride(){
        System.out.println("Car is riding");
    }

    String getModel();

}
