package ru.nshi.learn.lecture9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * @author rassafel
 */
public class RemoteReader {
    static String url = "https://raw.githubusercontent.com/kjytay/FIFA-world-cup-2018/master/Data/World_cup_2018_goals.csv";

    public static void main(String[] args) throws IOException {
        URL url = new URL(RemoteReader.url);
        URLConnection connection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String header = reader.readLine();
        String[] headersArray = header.split(",");

        Map<String, Integer> headers = new HashMap<>();
        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }

        System.out.println(headers);


        Map<String, Integer> playerGoals = new HashMap<>();

        String line;
        while((line = reader.readLine()) != null){
            String[] values = line.split(",");
            Integer indexRow = headers.get("Player_scored");
            String player = values[indexRow];
            Integer goals = playerGoals.getOrDefault(player, 0);
            playerGoals.put(player, goals+1);
        }

        System.out.println(playerGoals);

        Map.Entry<String, Integer> max = Collections.max(playerGoals.entrySet(), Comparator.comparingInt(Map.Entry::getValue));

        System.out.println(max);
    }

}
