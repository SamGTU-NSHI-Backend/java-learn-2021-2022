package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public abstract class AbstractAnimal implements Animal {
    public static final String DEFAULT_NAME = "Undefined";
    public static final int DEFAULT_AGE = -1;

    protected String name;
    protected int age;

    public AbstractAnimal() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name == null) {
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
