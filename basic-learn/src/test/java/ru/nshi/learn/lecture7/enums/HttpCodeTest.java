package ru.nshi.learn.lecture7.enums;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author rassafel
 */
class HttpCodeTest {
    @ParameterizedTest
    @EnumSource(value = HttpCode.class, names = {"_200", "_300"})
    void isNotErrorTest(HttpCode code) {
        assertFalse(code.isError());
    }

    @ParameterizedTest
    @EnumSource(value = HttpCode.class, names = {"_400", "_500"})
    void isErrorTest(HttpCode code) {
        assertTrue(code.isError());
    }
}
