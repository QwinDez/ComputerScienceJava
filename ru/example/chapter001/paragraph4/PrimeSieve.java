package ru.example.chapter001.ru.example.chapter001.paragraph4;

import java.util.Scanner;

public class PrimeSieve {
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
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }
        System.out.println(primes);
    }
}
