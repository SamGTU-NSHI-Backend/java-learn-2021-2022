package ru.nshi.learn.lecture8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author rassafel
 */
public class ListTest {
    @ParameterizedTest
    @MethodSource("lists")
    void listTest(List<String> strings) {
        System.out.println(strings.getClass());
        System.out.println(strings.size());
        strings.add("test string");
        System.out.println(strings.size());
        System.out.println(strings.get(0));

        strings.remove("test string");
        System.out.println(strings.size());

        strings.add("New string");
        System.out.println(strings.get(0));
        System.out.println(strings.contains("New string"));
        strings.forEach(str -> System.out.println(str));
    }

    static Stream<Arguments> lists(){
        return Arrays.asList(Arguments.of(new ArrayList<String>()),
            Arguments.of(new LinkedList<String>())).stream();
    }
}
