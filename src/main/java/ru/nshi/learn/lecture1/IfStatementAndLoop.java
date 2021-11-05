package ru.nshi.learn.lecture1;

/**
 * @author rassafel
 */
public class IfStatementAndLoop {
    public static void main(String[] args) {
        IfStatementAndLoop value = new IfStatementAndLoop();

        for (int number = 1; number <= 100; number++) {
            value.fizzBuzz(number);
        }
    }

    public void fizzBuzz(int number) {
        boolean div3 = number % 3 == 0;
        boolean div5 = number % 5 == 0;
        if (div3) {
            System.out.print("Fizz");
            if (div5) {
                System.out.print(" Buzz");
            }
        } else if (div5) {
            System.out.print("Buzz");
        }
        if (!(div3 | div5)) {
            System.out.print(number);
        }
        System.out.println();
    }
}
