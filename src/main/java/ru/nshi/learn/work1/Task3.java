package ru.nshi.learn.work1;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.PrimeNumber(17);
    }
    public static void PrimeNumber(int number){
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("простое число");
        } else
            System.out.println("не простое число");
    }
}
