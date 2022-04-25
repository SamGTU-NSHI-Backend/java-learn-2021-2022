package ru.nshi.learn.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author rassafel
 */
public class RemoteReader {
    static String URL = "https://raw.githubusercontent.com/kjytay/FIFA-world-cup-2018/master/Data/World_cup_2018_goals.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);
        List<RowGoal> rowGoals = parseGoals(reader, PARSE_GOAL);
        System.out.println(HEADERS);
        System.out.println(rowGoals);
        System.out.println("Best Player = " + getBestPlayer(rowGoals));
//        System.out.println("Team = " + getTeam(getReader()));
    }

    static Map<String, Integer> readHeaders(BufferedReader reader) throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(DELIMITER);

        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }

    static BufferedReader getReader() throws IOException {
        URL url = new URL(RemoteReader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    private final static Predicate<String> BOOLEAN_PREDICATE = "y"::equalsIgnoreCase;

    private final static Function<String[], RowGoal> PARSE_GOAL = (String[] values) -> {
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
    };

    static List<RowGoal> parseGoals(BufferedReader reader,
                                    Function<String[], RowGoal> function) throws IOException {
        List<RowGoal> rowGoals = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(DELIMITER);
            rowGoals.add(function.apply(values));
        }
        return Collections.unmodifiableList(rowGoals);
    }


    static Map.Entry<String, Integer> getBestPlayer(List<RowGoal> rowGoals) {
        Map<String, Integer> playerGoals = new HashMap<>();
        for (RowGoal rowGoal : rowGoals) {
            String player = rowGoal.getPlayerScored();
            Integer goals = playerGoals.getOrDefault(player, 1);
            playerGoals.put(player, goals+1);
        }
        return Collections.max(playerGoals.entrySet(),
            Comparator.comparingInt(Map.Entry::getValue));
    }

    static Map.Entry<String, Integer> getTeam(BufferedReader reader) throws IOException {
        reader.readLine();
        Map<String, Integer> teams = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(DELIMITER);
            Integer indexRow = HEADERS.get("Own_goal");
            String ownGoal = values[indexRow];
            if (!"Y".equals(ownGoal)) {
                continue;
            }
            indexRow = HEADERS.get("Team_scored");
            String team = values[indexRow];
            Integer goals = teams.getOrDefault(team, 0);
            teams.put(team, goals + 1);
        }

        System.out.println(teams);
        return Collections.max(teams.entrySet(),
            Comparator.comparingInt(Map.Entry::getValue));
    }
}
