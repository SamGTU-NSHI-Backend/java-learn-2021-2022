package ru.nshi.learn.work3;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("The value is ");
        if (!eratosphen_check_simple(number)) System.out.print("not ");
        System.out.println("simple");
        scanner.close();
    }
    // Decide whether or not the value is simple
    public static boolean eratosphen_check_simple(int number) {
        // Pretty much the same as the eratosphen, but may exit early.
        // DRY goes to the trash, yay
        // Rly not sure how to implement this without copy-pasting
        number = Math.abs(number);
        assert(number != 0 && number != 1);
        // Generates an array of numbers from 2 to number
        int [] num_array = new int[number - 1];
        for (int i = 0; i < number - 1; i++) {
            num_array[i] = i + 2;
        }
        for (int y = 0; y < number - 1; y++) {
            if (num_array[y] == 0) continue;
            int square = num_array[y] * num_array[y];
            if (square > number) {
                break;
            }
            if (number == num_array[y]) return true;
            for (int z = square; z <= number; z += num_array[y]) {
                if (num_array[z - 2] != 0) {
                    if (number == z) return false;
                    num_array[z - 2] = 0;
                }
            }
        }
        return true;
    }
    // Generates an array of simple numbers up to a certain number
    public static int[] eratosphen(int number) {
        number = Math.abs(number);
        assert(number != 0 && number != 1);
        // Generates an array of numbers from 2 to number
        int [] num_array = new int[number - 1];
        for (int i = 0; i < number - 1; i++) {
            num_array[i] = i + 2;
        }
        // Track the number of zeros to know the size of the array to allocate
        int zeroes = 0;
        for (int y = 0; y < number - 1; y++) {
            if (num_array[y] == 0) continue;
            int square = num_array[y] * num_array[y];
            if (square > number) {
                break;
            }
            for (int z = square; z <= number; z += num_array[y]) {
                // System.out.println("Deleted a " + z);
                if (num_array[z - 2] != 0) {
                    zeroes++;
                    num_array[z - 2] = 0;
                }
            }
        }
        int simple_size = number - zeroes - 1;
        int simple_array[] = new int[simple_size];
        int is = 0; // Simple counter
        for (int i = 0; i < number - 1; i++) {
            if (num_array[i] == 0) continue;
            simple_array[is] = num_array[i];
            is++;
        }
        return simple_array;
    }
}
