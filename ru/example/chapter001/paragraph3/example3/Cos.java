package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Cos {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        x = x % (2 * Math.PI);

        double term = 1.0;
        double sum  = 0.0;

        for (int i = 2; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}
