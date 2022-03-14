package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class DogFactory extends AnimalFactory {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
