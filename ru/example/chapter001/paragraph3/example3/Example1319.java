package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1319 {
    public static void main(String[] args) {
        double c = new Scanner(System.in).nextDouble(), EPSILON = 1e-15;
        double t = c, x = 0.5;
        while (Math.abs(t - c / t) > EPSILON * t) {
            t = (c / t + t) / 2.0;
            x = x - (Math.cos(x) - Math.pow(x, 3)) / (- Math.sin(x) - 3 * Math.pow(x, 2));
            System.out.println(x);
        }
    }
}
