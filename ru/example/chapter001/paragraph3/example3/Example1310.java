package ru.example.chapter001.ru.example.chapter001.paragraph3.example3;

import java.util.Scanner;

public class Example1310 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            double a = Math.random(), b = Math.random();
            System.out.println(a + " " + b + " максимальное: " + Math.max(a, b) + " среднее арифметическое: " + (a + b) / 2  + " минимальное: " + Math.min(a, b));
        }
    }
}
