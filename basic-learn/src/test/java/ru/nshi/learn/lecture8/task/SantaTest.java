package ru.nshi.learn.lecture8.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author rassafel
 */
public class SantaTest {
    static List<Arguments> childrens() {
        return Arrays.asList(
            Arguments.of(
                Arrays.asList("Jordan", "Jackson", "Jason", "Johnny"),
                Arrays.asList("Jason", "Jordan", "Jennifer"),
                Arrays.asList("Jason", "Jordan")
            )
        );
    }

    @ParameterizedTest
    @MethodSource("childrens")
    void task3(List<String> santasList,
               List<String> childrens,
               List<String> expected) {
        santasList = new ArrayList<>(santasList);
        childrens = new ArrayList<>(childrens);

        Collection<String> buff = new TreeSet<>(santasList);
        buff.retainAll(childrens);
        List<String> actual = new ArrayList<>(buff);

        Assertions.assertNotNull(buff);
        Assertions.assertEquals(expected.size(), buff.size());

        for (int i = 0; i < buff.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }
    }
}
