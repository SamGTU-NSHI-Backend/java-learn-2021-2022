package ru.nshi.learn.lecture7.impl;

import org.junit.jupiter.api.Test;
import ru.nshi.learn.lecture7.interfaces.Car;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * @author rassafel
 */
class LadaTest {

    @Test
    public void testRide() {
        Car ladaCar = new Lada();
        ladaCar.ride();

        Car lambda = () -> "MMODEL";
    }

}
