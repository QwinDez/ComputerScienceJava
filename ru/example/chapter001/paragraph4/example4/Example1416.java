package ru.example.chapter001.ru.example.chapter001.paragraph4.example4;

import java.util.Scanner;

public class Example1416 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= n / i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        for (boolean booleans : isPrime) {
            System.out.print(booleans + " ");
            System.out.println();
        }
    }
}
