package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class BinaryWithFor {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), power = 1;
        while (power <= n/2) {
            power *= 2;
        }
        for (int i = power; i <= power; i++) {
            if (n > power) {
                System.out.print(1);
                n -= power;
            } else {
                System.out.print(0);
            }
            power /= 2;
        }
    }
}
