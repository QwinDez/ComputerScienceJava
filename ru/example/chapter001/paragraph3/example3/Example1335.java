package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1335 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), sum = 0;
        int rsl = n;
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;
            sum = sum + i * digit;
            n = n / 10;
        }

        System.out.print("The full ISBN number is " + rsl);
        if (sum % 11 == 1) {
            System.out.println("X");
        } else if (sum % 11 == 0) {
            System.out.println("0");
        } else {
            System.out.println(11 - (sum % 11));
        }
    }
}
