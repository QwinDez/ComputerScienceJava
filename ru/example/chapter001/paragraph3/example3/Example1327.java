package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1327 {

    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        for (int factor = 2; factor <= n / factor; factor++) {
            int i = 0;
            while (n % factor == 0) {
                n /= factor;
                i++;
                if (i == 1) {
                    System.out.print(factor + " ");
                }
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
        System.out.println();
    }
}
