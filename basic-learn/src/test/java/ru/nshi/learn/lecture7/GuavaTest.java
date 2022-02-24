package ru.nshi.learn.lecture7;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rassafel
 */
class GuavaTest {
    @Test
    void joinerWithSkipNullsTest() {
        String[] source = {"Test 1", null, "new val"};
        Joiner joiner = Joiner.on(", ").skipNulls();

        String expected = "Test 1, new val";
        String actual = joiner.join(source);

        assertEquals(expected, actual);
    }

    @Test
    void joinerWithDefaultTest() {
        String[] source = {"Test 1", null, "new val"};
        Joiner joiner = Joiner.on(", ").useForNull("default val");

        String expected = "Test 1, default val, new val";
        String actual = joiner.join(source);

        assertEquals(expected, actual);
    }

    @Test
    void splitterTest() {
        String source = " test 1, ,,, , test 2, new val   , t,, , ,,,";
        Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();

        Iterable<String> expected = Arrays.asList("test 1", "test 2", "new val", "t");
        Iterable<String> actual = splitter.split(source);

        assertIterableEquals(expected, actual);
    }
}
