package ru.nshi.learn.lecture7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class DogFactoryTest {
    DogFactory factory = new DogFactory();

    @Test
    void getAnimalTest() {
        Dog actual = factory.getAnimal();

        assertInstanceOf(Dog.class, actual);
    }

}
