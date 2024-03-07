package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1338 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        System.out.println(Math.exp(x));

        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        double term = 1.0;
        double sum = 0.0;
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x/n;
        }

        if (isNegative)
            sum = 1.0 / sum;
        System.out.println(sum);
    }
}
