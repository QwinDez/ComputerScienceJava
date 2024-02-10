package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        for (int factor = 2; factor <= n / factor; factor++) {
            while (n % factor == 0) {
                n /= factor;
                System.out.print(factor + " ");
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }
}
