package ru.nshi.learn.work1;

public class Task4 {
    public static void main(String[] args){
        Task4 task4 = new Task4();
        task4.SummaSimpleNumbers();
    }
    public static void SummaSimpleNumbers() {
        int summa = 0;
        for (int i = 1000; i <= 2000; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                summa += i;
            } else
                continue;
        }
        System.out.println("сумма простых чисел :" + summa);
    }
}
