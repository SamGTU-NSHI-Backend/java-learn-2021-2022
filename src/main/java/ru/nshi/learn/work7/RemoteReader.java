package ru.nshi.learn.work7;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class RemoteReader {
    public static String URL = "https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv";
    static Map<String, Integer> HEADERS = new HashMap<>();
    static String DELIMITER = ",";


    static List<Car> Car(BufferedReader reader, Function<String[], Car> function) throws IOException {
        List<Car> car = new LinkedList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(DELIMITER);
            car.add(function.apply(values));
        }
        return Collections.unmodifiableList(car);
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
        java.net.URL url = new URL(RemoteReader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    private final static Predicate<String> BOOLEAN_PREDICATE = "y"::equalsIgnoreCase;

    private final static Function<String[], Car> CAR_FUNCTION = (String[] values) -> {
        Car car = new Car();
        if ((values[1] != null)||(values[1] != "")) {

            car.setCar_model(values[0]);
            car.setCar_maker(values[1]);
            car.setCar_model_year(values[2]);
            car.setColor(values[3]);
        }
        return car;
    };

    }

