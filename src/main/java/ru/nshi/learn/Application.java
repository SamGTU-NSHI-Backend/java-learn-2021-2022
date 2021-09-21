package ru.nshi.learn;

/**
 * @author rassafel
 */
public class Application {
    public static void main(String[] args) {
        Application value = new Application();

        for (int number = 1; number <= 100; number++) {
            value.fizzFuzz(number);
        }
    }

    public void fizzFuzz(int number) {
        boolean div3 = number % 3 == 0;
        boolean div5 = number % 5 == 0;
        if (div3) {
            System.out.print("Fizz");
            if (div5) {
                System.out.print(" Fuzz");
            }
        } else if (div5) {
            System.out.print("Fuzz");
        }
        if (!(div3 | div5)) {
            System.out.print(number);
        }
        System.out.println();
    }
}
