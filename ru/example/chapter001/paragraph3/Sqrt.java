package ru.example.chapter001.ru.example.chapter001.paragraph3;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        double c = new Scanner(System.in).nextDouble(), EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > EPSILON * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println(t);
    }
}
