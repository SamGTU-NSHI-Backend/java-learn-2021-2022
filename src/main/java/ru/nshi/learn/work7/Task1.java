package ru.nshi.learn.work7;

import ru.nshi.learn.work7.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ru.nshi.learn.work7.WriteFile.newFile;


public class Task1 {



    public static void main(String[] args) throws Exception {
        BufferedReader reader = getReader();
        Stream<String> lines = reader.lines();
        List<Car> cars_tabs = lines.skip(1)
            .map(raw -> {
                String[] values = raw.split(",");
                Car car = new Car();
                car.setCar_model(values[0]);
                car.setCar_maker(values[1]);
                car.setCar_model_year(values[2]);
                car.setColor(values[3]);
                return car;
            })
            .collect(Collectors.toList());

        newFile(cars_tabs, "TASK1.CSV");
        Map<String, List<Car>> ColorTAB = cars_tabs.stream().collect(Collectors.groupingBy(Car::getColor, Collectors.toList()));


        Map<String, List<Car>> CarMakerTAB = cars_tabs.stream().collect(Collectors.groupingBy(Car::getCar_maker, Collectors.toList()));
    }


        static BufferedReader getReader() throws IOException {
        URL url = new URL(RemoteReader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }





}

