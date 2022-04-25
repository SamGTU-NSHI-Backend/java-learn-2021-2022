package ru.nshi.learn;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author rassafel
 */
public class StreamsTest {

    IntSupplier inc = new IntSupplier() {
        int val = 0;

        @Override
        public int getAsInt() {
            return val++;
        }
    };
    IntSupplier fibb = new IntSupplier() {
        int first = 0;
        int second = 1;

        @Override
        public int getAsInt() {
            int result = first + second;
            first = second;
            second = result;
            return result;
        }
    };

    @Test
    void infiniteStream() {
        String val = IntStream.generate(fibb)
            .skip(100)
            .limit(10)
            .boxed()
            .map(Object::toString)
            .collect(Collectors.joining(", ", "{", "}"));

        System.out.println(val);
    }

    @Test
    void fibbStream() {
        Map<Boolean, List<Integer>> collect = IntStream.generate(fibb)
            .limit(100)
            .boxed()
            .collect(Collectors.partitioningBy(o -> (o % 2 == 0)));

        System.out.println(collect);
    }

    @Test
    void noneMatch() {

        boolean collect = IntStream.generate(fibb)
            .boxed()
            .peek(integer -> System.out.println(inc.getAsInt() + " : " + integer))
            .noneMatch(o -> (o % 2 == 0));

        System.out.println(collect);
    }

    @Test
    void anyMatch() {

        boolean collect = IntStream.generate(fibb)
            .boxed()
            .peek(integer -> System.out.println(inc.getAsInt() + " : " + integer))
            .anyMatch(o -> (o % 2 == 0));

        System.out.println(collect);
    }

    @Test
    void allMatch() {
        boolean collect = IntStream.generate(fibb)
            .boxed()
            .peek(integer -> System.out.println(inc.getAsInt() + " : " + integer))
            .allMatch(o -> (o % 2 == 0));

        System.out.println(collect);
    }

    @Test
    void ariph() {
        Supplier<Integer> supplier = new Supplier<Integer>() {
            private int nextValue = 1;
            private int step = 2;
            @Override
            public Integer get() {
                int curVal = nextValue;
                nextValue += step;
                return curVal;
            }
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
