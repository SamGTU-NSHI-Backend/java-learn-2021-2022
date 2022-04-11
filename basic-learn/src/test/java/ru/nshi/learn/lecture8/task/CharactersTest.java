package ru.nshi.learn.lecture8.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;

/**
 * @author rassafel
 */
public class CharactersTest {
    @ParameterizedTest
    @MethodSource("characters")
    void task2(Collection<Character> setA,
               Collection<Character> setB,
               Collection<Character> expected) {
        setA = new HashSet<>(setA);
        setB = new HashSet<>(setB);

        Collection<Character> all = new HashSet<>(setA);
        all.addAll(setB);
        System.out.println(all);

        Collection<Character> diff = new HashSet<>(setA);
        diff.retainAll(setB);
        System.out.println(diff);

        Collection<Character> actual = new TreeSet<>(all);
        actual.removeAll(diff);

        System.out.println(actual);
        Assertions.assertNotNull(actual);
        Assertions.assertIterableEquals(expected, actual);
    }

    static List<Arguments> characters() {
        return Arrays.asList(
            Arguments.of(
                new ArrayList<>(Arrays.asList('a', 'a', 't', 'e', 'f', 'i', 'j')),
                new ArrayList<>(Arrays.asList('t', 'g', 'g', 'i', 'k', 'f')),
                new ArrayList<>(Arrays.asList('a', 'e', 'g', 'j', 'k'))
            )
        );
    }
}
