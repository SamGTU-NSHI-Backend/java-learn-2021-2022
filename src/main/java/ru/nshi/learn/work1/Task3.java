/**
 * Написать программу, которая определяет, является ли число простым.
 * Число пользователь вводит с клавиатуры.
 **/

package ru.nshi.learn.work1;

import java.util.Scanner;

public class Task3 {

    public boolean FindSimpleNumber(int choise) {
       // System.out.println("Введите число");
       // Scanner in = new Scanner(System.in);
      //  int choise = in.nextInt();
        boolean[] array = new boolean[10000000];
        for (int index = 2; index < array.length; index++) {
            array[index] = true;
        }

        for (int index = 2; index < array.length; index++) {
            if (array[index] == true) {
                for (int newIndex = index * 2; newIndex < array.length; newIndex += index) {
                    array[newIndex] = false;
                }
            }
        }

        if ((array[choise] == true) || (choise == 1)) {
            System.out.print("Ваше число " + choise + " простое");
        } else {
            System.out.print("Ваше число " + choise + " не простое");
        }
        return (array[choise] == true);
    }
}
