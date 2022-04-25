package ru.nshi.learn.lecture10;

import ru.nshi.learn.lecture9.RowGoal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author rassafel
 */
public class StreamAPITutorial {

    static String URL = "https://raw.githubusercontent.com/kjytay/FIFA-world-cup-2018/master/Data/World_cup_2018_goals.csv";


    public static void main(String[] args) throws IOException {
        BufferedReader reader = getReader();
        Stream<String> lines = reader.lines();
        List<RowGoal> goals = lines
            .skip(1)
            .map(raw -> {
                String[] values = raw.split(",");
                RowGoal rowGoal = new RowGoal();
                rowGoal.setDate(values[0]);
                rowGoal.setStage(values[1]);
                rowGoal.setHome(values[2]);
                rowGoal.setAway(values[3]);
                rowGoal.setTeamScored(values[4]);
                rowGoal.setPlayerScored(values[5]);
                rowGoal.setTime(values[6]);
                rowGoal.setOwnGoal(BOOLEAN_PREDICATE.test(values[7]));
                rowGoal.setPenalty(BOOLEAN_PREDICATE.test(values[8]));
                return rowGoal;
            })
//            .filter(goal -> "Russia".equalsIgnoreCase(goal.getTeamScored()))
            .collect(Collectors.toList());

        Optional<RowGoal> first = goals.stream()
            .filter(goal -> "Denis Cheryshdev".equalsIgnoreCase(goal.getPlayerScored()))
            .findFirst();

        Map<String, List<RowGoal>> goalMap = goals.stream().collect(Collectors.groupingBy(
            RowGoal::getTeamScored,
            Collectors.toList()
        ));
        goalMap.forEach((k, v) -> System.out.println("\n" + k + "\t" + v.size()));

        IntSupplier inc1 = increment();
        IntSupplier inc2 = increment();
        IntSupplier inc3 = increment();

        goals.parallelStream()
            .limit(10)
            .peek(g -> System.out.println("First peek:" + inc1.getAsInt() + " " + g))
            .flatMap(g -> Arrays.stream(g.getPlayerScored().split("\\s")))
            .peek(g -> System.out.println("Second peek:" + inc2.getAsInt() + " " + g))
            .distinct()
            .peek(g -> System.out.println("Third peek:" + inc3.getAsInt() + " " + g))
            .forEach(System.out::println);

        //Grouping by country with list of player names
        goals.stream().collect(Collectors.groupingBy(
            RowGoal::getTeamScored,
            Collectors.mapping(
                RowGoal::getPlayerScored,
                Collectors.toList()
            )
        )).forEach((k, v) -> System.out.println(k + "\t" + v));

        goals.stream()
            .collect(Collectors.toMap(
                RowGoal::getTeamScored,
                RowGoal::getPlayerScored,
                (o1, o2) -> o2 + ", " + o1
            )).forEach((k, v) -> System.out.println(k + "\t" + v));
    }

    static IntSupplier increment() {
        return new IntSupplier() {
            int val = 0;

            @Override
            public int getAsInt() {
                return val++;
            }
        };
    }

    static BufferedReader getReader() throws IOException {
        java.net.URL url = new URL(URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    private final static Predicate<String> BOOLEAN_PREDICATE = "y"::equalsIgnoreCase;

}
