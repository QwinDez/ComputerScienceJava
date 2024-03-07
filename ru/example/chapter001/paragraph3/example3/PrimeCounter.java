package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class PrimeCounter {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), counter = 0;
        if (n >= 2) {
            counter++;
        }
        for (int i = 3; i <= n; i += 2) {
            boolean isPrime = true;

            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Общее кол-во простых из числа " + n + " - это " + counter);
    }
}
