package ru.nshi.learn.lecture7.exceptions;

import org.junit.jupiter.api.Test;
import ru.nshi.learn.lecture7.interfaces.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author rassafel
 */
public class ExceptionsTest {
    @Test
    void testNullPointerException() {
        Car car = null;
        assertThrows(NullPointerException.class, () -> car.ride());
    }

    @Test
    void testArrayIndexOutOfBoundsException() {
        int[] array = {1, 2};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array[2] = 1);
    }

    @Test
    void defaultValueIfException() {
        int defaultValue = 1;
        int[] array = {1, 2};
        int actual;
        try {
            actual = array[2];
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            actual = defaultValue;
        }
        assertEquals(defaultValue, actual);
    }

    @Test
    void testIOException() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }

    @Test
    void testCarException() {
        try {
            throw new CarException(1);
        } catch (CarException | Error e) {
            e.printStackTrace();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (Throwable th) {
            System.out.println(th.getMessage());
        }
    }
}
