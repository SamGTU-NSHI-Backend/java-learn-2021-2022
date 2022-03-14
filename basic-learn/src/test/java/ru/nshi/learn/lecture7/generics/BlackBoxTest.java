package ru.nshi.learn.lecture7.generics;

import org.junit.jupiter.api.Test;
import ru.nshi.learn.lecture7.Animal;
import ru.nshi.learn.lecture7.Dog;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
public class BlackBoxTest {
    @Test
    public void testGenerics() {
        Dog animal1 = new Dog(2.0, 123, new String[]{});
        Dog animal2 = new Dog(2.0, 123, new String[]{});
        Dog animal3 = new Dog(2.0, 123, new String[]{});

        BlackBox<? extends Animal> container = new BlackBox<Dog>(animal1, animal2, animal3);
        Animal actual = container.getItem(2);

        assertInstanceOf(Dog.class, actual);
        assertSame(animal3, actual);
    }
}
