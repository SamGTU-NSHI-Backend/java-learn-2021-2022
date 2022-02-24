package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class DogFactory extends AnimalFactory {
    @Override
    protected Dog getAnimal() {
        return new Dog();
    }
}
