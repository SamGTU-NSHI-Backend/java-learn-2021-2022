package ru.nshi.learn.lecture7;

/**
 * @author rassafel
 */
public class MainLecture {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        String[] names = {"Firebird", "Void", "Murka"};

        for (int i = 0; i < animals.length; i++) {
            Animal animal = null;
            if(i % 2 == 0) {
                animal = new Dog(names[i], 1);
            } else {
                animal = new Cat();
                animal.setName(names[i]);
            }
            animals[i] = animal;
        }

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
            System.out.println();
        }
    }
}
