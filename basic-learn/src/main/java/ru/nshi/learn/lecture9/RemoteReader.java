package ru.nshi.learn.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rassafel
 */
public class RemoteReader {
    static String URL = "https://raw.githubusercontent.com/kjytay/FIFA-world-cup-2018/master/Data/World_cup_2018_goals.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";

    public static void main(String[] args) throws IOException {
        HEADERS = readHeaders(getReader());
        System.out.println(HEADERS);
        System.out.println("Best Player = " + getBestPlayer(getReader()));
        System.out.println("Team = " + getTeam(getReader()));
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

    static Map.Entry<String, Integer> getBestPlayer(BufferedReader reader) throws IOException {
        reader.readLine();
        Map<String, Integer> playerGoals = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            Integer indexRow = HEADERS.get("Player_scored");
            String player = values[indexRow];
            Integer goals = playerGoals.getOrDefault(player, 0);
            playerGoals.put(player, goals + 1);
        }

        System.out.println(playerGoals);
        return Collections.max(playerGoals.entrySet(),
            Comparator.comparingInt(Map.Entry::getValue));
    }

    static Map.Entry<String, Integer> getTeam(BufferedReader reader) throws IOException {
        reader.readLine();
        Map<String, Integer> teams = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
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
