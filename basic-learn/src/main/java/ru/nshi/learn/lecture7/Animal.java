package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class Animal {
    private double weight;
    private int age;

    public Animal() {}

    public Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public String say() {
        return "I am a animal.";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
