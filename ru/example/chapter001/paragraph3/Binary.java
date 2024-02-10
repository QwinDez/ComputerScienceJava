package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), power = 1;
        while (power <= n /2) {
            power *= 2;
        }
        while (power > 0) {
            if (n < power) {
                System.out.print(0);
            } else {
                System.out.print(1);
                n -= power;
            }
            power /= 2;
        }
        System.out.println();
    }
}
