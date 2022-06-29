package ru.nshi.learn.work7.models;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class CarMaker implements Comparable<CarMaker>{
    private String name;


    @Override
    public int compareTo(CarMaker o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
