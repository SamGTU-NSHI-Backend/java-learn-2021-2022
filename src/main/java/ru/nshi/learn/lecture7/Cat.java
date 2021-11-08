package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class Cat extends AbstractAnimal {
    @Override
    public void voice() {
        System.out.println("Mya");
    }

    @Override
    public String toString() {
        return "I'm a cat";
    }
}
