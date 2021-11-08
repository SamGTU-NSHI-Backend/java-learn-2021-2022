package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class Dog extends AbstractAnimal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog otherDog = (Dog) o;
        if (!this.name.equals(otherDog.name)) {
            return false;
        }
        return this.age == otherDog.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + name +
            "', age = " + age +
            "}";
    }

    @Override
    public void voice() {
        System.out.println("Bark");
    }
}
