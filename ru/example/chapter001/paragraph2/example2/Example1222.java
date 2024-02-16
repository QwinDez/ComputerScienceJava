package ru.example.chapter001.ru.example.chapter001.paragraph2.example2;

import java.util.Scanner;

public class Example1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = 9.80665;
        double x = sc.nextDouble(), v = sc.nextDouble(), t = sc.nextDouble();
        System.out.println((x + v * t - g * Math.pow(t, 2)) / 2);
    }
}
