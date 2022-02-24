package ru.nshi.learn.lecture7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class AnimalFactoryTest {
    AnimalFactory factory = new AnimalFactory();

    @Test
    void getAnimalTest() {
        Animal actual = factory.getAnimal();

        assertInstanceOf(Animal.class, actual);
    }
}
