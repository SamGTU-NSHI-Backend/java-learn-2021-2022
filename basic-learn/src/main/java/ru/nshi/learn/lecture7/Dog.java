package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class Dog extends Animal {
    private String[] commands;

    public Dog() {
        super();
    }

    public Dog(double weight, int age, String[] commands) {
        super(weight, age);
        this.commands = commands;
    }

    @Override
    public String say() {
        return "I am a dog.";
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
