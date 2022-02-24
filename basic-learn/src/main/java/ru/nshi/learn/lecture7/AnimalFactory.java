package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class AnimalFactory {
    protected Animal getAnimal() {
        return new Animal();
    }
}
