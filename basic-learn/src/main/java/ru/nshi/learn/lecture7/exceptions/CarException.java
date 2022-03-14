package ru.nshi.learn.lecture7.exceptions;

/**
 * @author rassafel
 */
public class CarException extends RuntimeException {
    public final int index;

    public CarException(int index) {
        this("Car exception", index);
    }

    public CarException(String message, int index) {
        super(message);
        this.index = index;
    }
}
