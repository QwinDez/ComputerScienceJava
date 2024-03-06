package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class PrimeCounter {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), counter = 0;
        for (int i = 2; i <= n; i++) {
            if (i == 2 || i == 3) {
                counter++;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i * j) % j == 0) {
                    break;
                } else {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
